package com.L3_1team.health.controller.client.user;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.L3_1team.health.dto.client.user.TrainerDto;
import com.L3_1team.health.dto.client.user.TrainerValDto;
import com.L3_1team.health.service.client.user.TrainerService;
import com.L3_1team.health.validation.TrainerSignupValidator;

@Controller
public class TrainerController {

	@Inject
	private TrainerService trainerService;

	public void setTrainerService(TrainerService trainerService) {
		this.trainerService = trainerService;
	}

	@RequestMapping(value = "/client/user/insert/trainer/Trainer_sign_up", method = RequestMethod.GET)
	public String usign_upForm() {
		return ".client.user.insert.trainer.Trainer_sign_up";
	}

	@RequestMapping(value = "/client/user/insert/trainer/Trainer_sign_up", method = RequestMethod.POST)
	public String sign_upInsert(@ModelAttribute("trainerValDto") TrainerValDto trainerValDto, BindingResult result,
			HttpSession session, MultipartFile file1) {

		FileOutputStream fos = null;
		InputStream is = null;
		TrainerDto trainerDto = null;
		
		String viewReturn = ".client.user.insert.trainer.Trainer_sign_up";
		String orgfilename = "";
		String savefilename = "";
		String path = "";

		try {
			new TrainerSignupValidator().validate(trainerValDto, result);
			
			if (result.hasErrors()) {
				return viewReturn;
			}

			orgfilename = file1.getOriginalFilename();
			savefilename = UUID.randomUUID() + "_" + orgfilename;
			path = session.getServletContext().getRealPath("/resources/upload");
			
			fos = new FileOutputStream(path + "/" + savefilename);
			is = file1.getInputStream();
			FileCopyUtils.copy(is, fos);

			trainerDto = temp(trainerValDto, savefilename);
			int n = trainerService.insert(trainerDto);

			if (n > 0) {
				viewReturn = ".user.main";
			}
			
			if (is != null)
				is.close();
			if (fos != null)
				fos.close();
		} catch (Exception ie) {
		}
		
		return viewReturn;
	}

	public TrainerDto temp(TrainerValDto trainerValDto, String savefilename) {
		String t_id = trainerValDto.getId1();
		String t_pwd = trainerValDto.getPwd1();
		String t_name = trainerValDto.getName1();
		String zipcode = trainerValDto.getZipcode1();
		String t_addr = trainerValDto.getAddr1() + "#" + trainerValDto.getAddr2();
		String t_company = trainerValDto.getCompany1();
		String t_phone = trainerValDto.getPhone1() + "-" + trainerValDto.getPhone2() + "-" + trainerValDto.getPhone3();
		String t_birth = trainerValDto.getBirth1();
		String t_email = trainerValDto.getEmail1() + "@" + trainerValDto.getEmail2();
		String t_img = savefilename;
		int t_question = trainerValDto.getQuestion1();
		String t_answer = trainerValDto.getAnswer1();
		int t_gender = trainerValDto.getGender1();
		float t_weight = trainerValDto.getWeight1();
		float t_height = trainerValDto.getHeight1();
		String t_introduction = trainerValDto.getIntroduction1();

		return new TrainerDto(t_id, t_pwd, t_name, zipcode, t_addr, t_company, t_phone, t_birth, t_email, t_img,
				t_question, t_answer, t_gender, t_weight, t_height, t_introduction, null, 2);
	}
}
