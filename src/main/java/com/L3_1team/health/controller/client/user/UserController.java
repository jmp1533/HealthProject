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

import com.L3_1team.health.dto.client.user.UserDto;
import com.L3_1team.health.dto.client.user.UserValDto;
import com.L3_1team.health.service.client.user.UserService;
import com.L3_1team.health.validation.UserSignupValidator;

@Controller
public class UserController {
	@Inject
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/client/user/insert/Choice", method = RequestMethod.GET)
	public String choiceForm() {
		return ".client.user.insert.Choice";
	}

	@RequestMapping(value = "/client/user/insert/user/User_sign_up", method = RequestMethod.GET)
	public String usign_upForm() {
		return ".client.user.insert.user.User_sign_up";
	}

	@RequestMapping(value = "/client/user/insert/user/User_sign_up", method = RequestMethod.POST)
	public String sign_upInsert(@ModelAttribute("uservalDto") UserValDto uservalDto, BindingResult result,
			HttpSession session, MultipartFile file1) {

		FileOutputStream fos = null;
		InputStream is = null;
		UserDto userDto = null;
		
		String viewReturn = ".client.user.insert.user.User_sign_up";
		String orgfilename = "";
		String savefilename = "";
		String path = "";
		
		try {
			new UserSignupValidator().validate(uservalDto, result);
			
			if (result.hasErrors()) {
				return viewReturn;
			}

			orgfilename = file1.getOriginalFilename();
			savefilename = UUID.randomUUID() + "_" + orgfilename;
			path = session.getServletContext().getRealPath("/resources/upload");
						
			fos = new FileOutputStream(path + "/" + savefilename);
			is = file1.getInputStream();
			FileCopyUtils.copy(is, fos);

			userDto = temp(uservalDto, savefilename);
			int n = userService.insert(userDto);

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

	public UserDto temp(UserValDto uservalDto, String savefilename) {
		String uid = uservalDto.getId1();
		String upwd = uservalDto.getPwd1();
		int uquestion = uservalDto.getQuestion1();
		String uanswer = uservalDto.getAnswer1();
		String uname = uservalDto.getName1();
		String uimg = savefilename;
		String uphone = uservalDto.getPhone1() + "-" + uservalDto.getPhone2() + "-" + uservalDto.getPhone3();
		String uemail = uservalDto.getEmail1() + "@" + uservalDto.getEmail2();
		String uzipcode = uservalDto.getZipcode1();
		String uaddr = uservalDto.getAddr1() + "#" + uservalDto.getAddr2();
		String ubirth = uservalDto.getBirth1();
		int ugender = uservalDto.getGender1();
		float utargetweight = uservalDto.getTargetweight1();

		return new UserDto(uid, upwd, uquestion, uanswer, uname, uimg, uphone, uemail, uzipcode, uaddr, ubirth, ugender,
				utargetweight, null, 1);
	}
}
