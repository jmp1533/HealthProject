package com.L3_1team.health.controller.client.menu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.L3_1team.health.dto.admin.Health_Dto;
import com.L3_1team.health.dto.client.menu.Finder_company_Dto;
import com.L3_1team.health.dto.client.user.Mypage_outDto;
import com.L3_1team.health.dto.client.user.TrainerDto;
import com.L3_1team.health.dto.client.user.TrainerValDto;
import com.L3_1team.health.service.client.menu.Mypage_trainer_Service;
import com.L3_1team.health.validation.TrainerSignupValidator;

@Controller
public class Mypage_trainer_Controller {
	@Inject
	Mypage_trainer_Service trainer_Service;

	public void setTrainer_Service(Mypage_trainer_Service trainer_Service) {
		this.trainer_Service = trainer_Service;
	}

	@RequestMapping(value = "/client/menu/mypage/traner/Trainer_info", method = RequestMethod.GET)
	public String info(HttpServletRequest request, Model model) {
		String t_id = (String) request.getSession().getAttribute("tlogid");
		TrainerDto dto = trainer_Service.getinfo(t_id);
		model.addAttribute("dto", dto);
		
		return ".client.menu.mypage.traner.Trainer_info";
	}

	@RequestMapping(value = "/client/menu/mypage/Trainer_update", method = RequestMethod.POST)
	public String updatesearch(@Param("pwd") String pwd, HttpServletRequest request, Model model) {
		HashMap<String, String> map = new HashMap<String, String>();

		String viewReturn = ".client.menu.mypage.Update";
		String tlogid = (String) request.getSession().getAttribute("tlogid");
			
		try {
			if (tlogid != null) {
				map.put("t_id", tlogid);
				map.put("t_pwd", pwd);

				TrainerDto trainerDto = trainer_Service.search(map);				
				TrainerValDto valDto = temp(trainerDto);
				
				model.addAttribute("valDto", valDto);
				
				viewReturn = ".client.menu.mypage.traner.Trainer_update";	
			}			
		} catch (Exception e) {
		}
		
		return viewReturn;
	}

	public TrainerValDto temp(TrainerDto trainerDto) {
		String addr[] = trainerDto.getT_addr().split("#");
		String phone[] = trainerDto.getT_phone().split("-");
		String email[] = trainerDto.getT_email().split("@");

		return new TrainerValDto(trainerDto.getT_id(), null, null, trainerDto.getT_question(), trainerDto.getT_answer(),
				trainerDto.getT_name(), trainerDto.getT_birth(), trainerDto.getT_gender(), trainerDto.getT_company(),
				trainerDto.getZipcode(), addr[0], addr[1], phone[0], phone[1], phone[2], email[0], email[1],
				trainerDto.getT_height(), trainerDto.getT_weight(), null, trainerDto.getT_img());
	}

	@RequestMapping(value = "/client/menu/mypage/Trainer_updateOk", method = RequestMethod.POST)
	public String sign_upInsert(@ModelAttribute("trainerValDto") TrainerValDto trainerValDto, BindingResult result,
			HttpSession session, MultipartFile file1) {
		
		FileOutputStream fos = null;
		InputStream is = null;
		String orgfilename = "";
		String savefilename = "";
		String path = "";
		String viewReturn = ".client.menu.mypage.traner.Trainer_update";
		
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

			TrainerDto trainerDto = temp(trainerValDto, savefilename);
			
			int n = trainer_Service.update(trainerDto);
			if (n > 0) {
				viewReturn = ".client.menu.mypage.Mypage";
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
				t_question, t_answer, t_gender, t_weight, t_height, t_introduction, null, 0);
	}

	// ȸ��Ż��
	@RequestMapping(value = "/client/menu/mypage/traner/Trainer_out_pwd", method = RequestMethod.GET)
	public String outForm() {
		return ".client.menu.mypage.traner.Trainer_out_pwd";
	}

	@RequestMapping(value = "/client/menu/mypage/traner/Trainer_out_pwd", method = RequestMethod.POST)
	public String out(@RequestParam("pwd") String t_pwd,
			@RequestParam(value = "out_reason", defaultValue = "0") String out_reason, HttpServletRequest request) {

		HashMap<String, String> map = new HashMap<String, String>();
		String t_id = "";
		String viewReturn = "/client/menu/mypage/traner/Trainer_out_pwd";
		
		if (out_reason.equals("0")) {
			return viewReturn;
		}
		
		t_id = (String) request.getSession().getAttribute("tlogid");
		
		map.put("t_id", t_id);
		map.put("t_pwd", t_pwd);

		int n = trainer_Service.search1(map);
		if (n == 1) {
			Mypage_outDto outDto = new Mypage_outDto(0, t_id, out_reason, null);

			trainer_Service.out(outDto, t_id);

			request.getSession().invalidate();
			
			viewReturn = ".user.main";
		}

		return viewReturn;
	}

	@RequestMapping(value = "/client/menu/mypage/traner/Trainer_health_register", method = RequestMethod.GET)
	public String registerForm(HttpServletRequest request, Model model) {

		Finder_company_Dto company_Dto = null;
		Health_Dto dto = null;
		
		String t_id = "";
		String viewReturn = ".client.menu.mypage.traner.Trainer_health_register";
				
		try {
			t_id = (String) request.getSession().getAttribute("tlogid");			
			company_Dto = trainer_Service.rs(t_id);
			dto = temp(company_Dto);
			
			if (company_Dto != null) {
				model.addAttribute("dto", dto);
				List<String> img = trainer_Service.bs(dto.getB_num());
				model.addAttribute("img", img);
				
				viewReturn = ".client.menu.mypage.traner.health_view";
			}
		} catch (Exception e) {			
		}
		
		return viewReturn;
	}

	public Health_Dto temp(Finder_company_Dto company_Dto) {
		String[] corporatenum = company_Dto.getB_corporatenum().split("-");
		String[] addr = company_Dto.getB_addr().split("#");
		String[] phone = company_Dto.getB_phone().split("-");		
		String[] email = company_Dto.getB_email().split("@");

		return new Health_Dto(company_Dto.getB_num(), corporatenum[0], corporatenum[1], corporatenum[2],
				company_Dto.getB_name(), addr[0], addr[1], company_Dto.getZipcode(), phone[0], phone[1], phone[2], email[0],
				email[1], company_Dto.getB_content(), 0, 0);
	}

	@RequestMapping(value = "/client/menu/mypage/traner/Trainer_health_register", method = RequestMethod.POST)
	public String register(@ModelAttribute("dto") Health_Dto dto, HttpSession session, HttpServletRequest request,
			Model model) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		String viewReturn = ".client.menu.mypage.traner.Trainer_health_register";
		
		String t_id = (String) request.getSession().getAttribute("tlogid");
		Finder_company_Dto company_Dto = temp(dto);
		company_Dto.setT_id(t_id);

		int n = trainer_Service.ri(company_Dto);
		if (n == 1) {
			model.addAttribute("dto", dto);

			Finder_company_Dto dto2 = trainer_Service.rs(t_id);
			int b_num = dto2.getB_num();
			
			map.put("b_num", b_num);

			for (int i = 0; i < 8; i++) {
				String imgname = request.getParameter("im" + i);

				if (imgname != null) {
					String savefilename = imgname.split("/")[3];
					map.put("savefilename", savefilename);
					trainer_Service.bi(map);
				}
			}

			viewReturn =  ".client.menu.mypage.Mypage";
		}

		return viewReturn;
	}

	public Finder_company_Dto temp(Health_Dto dto) {
		String b_corporatenum = dto.getB_corporatenum1() + "-" + dto.getB_corporatenum2() + "-"
				+ dto.getB_corporatenum3();
		String b_addr = dto.getAddr1() + "#" + dto.getAddr2();
		String b_phone = dto.getB_phone1() + "-" + dto.getB_phone2() + "-" + dto.getB_phone3();
		String b_email = dto.getB_email1() + "@" + dto.getB_email2();

		return new Finder_company_Dto(0, null, b_corporatenum, dto.getB_name(), b_addr, dto.getZipcode1(), b_phone,
				b_email, dto.getB_content(), 0, 0, 2, null);
	}

	@RequestMapping(value = "/client/menu/mypage/traner/health_update", method = RequestMethod.GET)
	public String UpdateForm(HttpServletRequest request, Model model) {
		String t_id = (String) request.getSession().getAttribute("tlogid");
		Finder_company_Dto company_Dto = trainer_Service.rs(t_id);

		Health_Dto dto = temp(company_Dto);
		dto.setB_num(company_Dto.getB_num());

		model.addAttribute("dto", dto);
		
		return ".client.menu.mypage.traner.health_update";
	}

	@RequestMapping(value = "/client/menu/mypage/traner/health_update", method = RequestMethod.POST)
	public String update(@ModelAttribute("dto") Health_Dto dto, HttpServletRequest request, Model model) {

		String viewReturn = ".client.menu.mypage.traner.health_update";
		String t_id = (String) request.getSession().getAttribute("tlogid");
		Finder_company_Dto company_Dto = temp(dto);
		company_Dto.setT_id(t_id);
		company_Dto.setB_num(dto.getB_num());
		
		int n = trainer_Service.ru(company_Dto);
		model.addAttribute("dto", dto);
		
		if (n == 1) {
			Finder_company_Dto dto2 = trainer_Service.rs(t_id);
			int b_num = dto2.getB_num();

			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("b_num", b_num);

			trainer_Service.bd(map);

			for (int i = 0; i < 8; i++) {
				String imgname = request.getParameter("im" + i);
				if (imgname != null) {
					String savefilename = imgname.split("/")[3];
					map.put("savefilename", savefilename);
					trainer_Service.bi(map);
				}
			}
			
			viewReturn = ".client.menu.mypage.Mypage";
		}

		return viewReturn;
	}

	@RequestMapping(value = "/healthimg", method = RequestMethod.POST)
	@ResponseBody
	public String healthimg(HttpServletRequest request, HttpSession session) {

		MultipartHttpServletRequest multi = null;
		MultipartFile file1 = null;
		FileOutputStream fos = null;
		InputStream is = null;
		
		StringBuffer sb = new StringBuffer();		
		String orgfilename = "";
		String savefilename = "";
		String path = "";
		
		try {
			multi = (MultipartHttpServletRequest) request;
			file1 = multi.getFile("file1");

			orgfilename = file1.getOriginalFilename();
			savefilename = UUID.randomUUID() + "_" + orgfilename;
			path = session.getServletContext().getRealPath("/resources/uploadG");
			
			
			fos = new FileOutputStream(path + "/" + savefilename);
			is = file1.getInputStream();
			FileCopyUtils.copy(is, fos);
		
			sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			sb.append("<business></business>");
			
			if (is != null)
				is.close();
			if (fos != null)
				fos.close();
		} catch (Exception ie) {
		}

		return sb.toString();
	}
}
