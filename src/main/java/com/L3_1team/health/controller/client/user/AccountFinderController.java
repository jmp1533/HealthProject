package com.L3_1team.health.controller.client.user;

import java.util.HashMap;
import java.util.Random;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.L3_1team.health.Utility.Page.OtpMailSender;
import com.L3_1team.health.dto.client.user.TrainerDto;
import com.L3_1team.health.dto.client.user.UserDto;
import com.L3_1team.health.service.client.user.AccountFinderService;

@Controller
public class AccountFinderController {
	@Inject
	private AccountFinderService accountFinderService;
	@Inject
	private OtpMailSender sender;

	public void setAccountFinderService(AccountFinderService accountFinderService) {
		this.accountFinderService = accountFinderService;
	}

	public void setSender(OtpMailSender sender) {
		this.sender = sender;
	}

	// 아이디/비번찾기
	@RequestMapping(value = "/client/user/finder/search/searchmain", method = RequestMethod.GET)
	public String searchMain() {
		return ".client.user.finder.searchmain";
	}

	// 아이디 찾기
	@RequestMapping(value = "/client/user/finder/search/idSearch", method = RequestMethod.POST)
	public String user_idSearch(@RequestParam("name") String name, @RequestParam("email") String email, Model model) {		
		HashMap<String, String> map = new HashMap<String, String>();
		String u_id = "";
		String t_id = "";
		String viewReturn = "redirect:/client/user/finder/search/searchmain";
		
		try {		
			map.put("name", name);
			map.put("email", email);

			u_id = accountFinderService.getUserId(map);
			t_id = accountFinderService.getTrainerId(map);

			if (u_id != null) {
				model.addAttribute("u_id", u_id);
				viewReturn = ".client.user.finder.idSearch";
			} else if (t_id != null) {
				model.addAttribute("t_id", t_id);
				viewReturn = ".client.user.finder.idSearch";
			}
		} catch (Exception e) {
		}
		
		return viewReturn;
	}

	// 비밀번호 찾기
	@RequestMapping(value = "/client/user/finder/search/pwdSearch", method = RequestMethod.POST)
	public String user_pwdSearch(@RequestParam("id") String id, @RequestParam("email2") String email2, Model model) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		String u_id = "";
		String t_id = "";
		String viewReturn = "redirect:/client/user/finder/search/searchmain";
				
		try {		
			map.put("id", id);
			map.put("email2", email2);

			u_id = accountFinderService.getUserInfo(map);
			t_id = accountFinderService.getTrainerInfo(map);

			if (u_id != null) {
				model.addAttribute("u_id", u_id);
				viewReturn = ".client.user.finder.pwdSearch";
			} else if (t_id != null) {
				model.addAttribute("t_id", t_id);
				viewReturn = ".client.user.finder.pwdSearch";
			}
		} catch (Exception e) {
		}
		
		return viewReturn;
	}

	// 질문답변 체크
	@RequestMapping(value = "/client/user/finder/search/hintCompare", method = RequestMethod.POST)
	public String user_hint_compare(@RequestParam("id") String id, @RequestParam("choice_question") int choice_question,
			@RequestParam("choice_answer") String choice_answer, Model model) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		Random rnd = new Random();
		
		UserDto u_dto = null;
		TrainerDto t_dto = null;
		String otpset = "";
		String viewReturn = ".client.user.finder.searchmain";
		
		try {			
			map.put("id", id);
			map.put("choice_question", choice_question);
			map.put("choice_answer", choice_answer);

			u_dto = accountFinderService.getUser(map);
			t_dto = accountFinderService.getTrainer(map);
			
			otpset = String.valueOf("lk" + rnd.nextInt(99) + "sjgf" + rnd.nextInt(99) + "lh3d");
			model.addAttribute("otpset", otpset);

			if (u_dto == null && t_dto == null) {
				model.addAttribute("id", id);
				viewReturn = ".client.user.finder.pwdSearch";
			} else if (u_dto != null) {
				model.addAttribute("u_dto", u_dto);
				viewReturn = ".client.user.finder.search.otpcheck";
			} else if (t_dto != null) {
				model.addAttribute("t_dto", t_dto);
				viewReturn = ".client.user.finder.search.otpcheck";
			} else {
				model.addAttribute("id", id);
			}
		} catch (Exception e) {
			model.addAttribute("id", id);
		}
		
		return viewReturn;
	}

	@RequestMapping(value = "/client/user/finder/search/otpcheck", method = RequestMethod.POST)
	public String otpcheck(@RequestParam("id") String id, @RequestParam("otpset") String otpset,
			@RequestParam("otpcheck") String otpcheck, Model model) {

		String viewReturn = ".client.user.finder.search.otpcheck";
		
		if (otpset.equals(otpcheck)) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("id", id);

			String u_id = accountFinderService.getUserInfo(map);
			String t_id = accountFinderService.getTrainerInfo(map);

			if (u_id == null && t_id == null) {
				model.addAttribute("id", id);
				viewReturn = ".client.user.finder.searchmain";
			} else if (u_id != null) {
				model.addAttribute("u_id", u_id);
				viewReturn = ".client.user.finder.changePwd";
			} else if (t_id != null) {
				model.addAttribute("t_id", t_id);
				viewReturn = ".client.user.finder.changePwd";
			} else {
				model.addAttribute("id", id);
				viewReturn = ".client.user.finder.searchmain";
			}
		} else {
			Random rnd = new Random();
			String os = String.valueOf("lk" + rnd.nextInt(99) + "sjgf" + rnd.nextInt(99) + "lh3d");
			model.addAttribute("otpset", os);

			model.addAttribute("id", id);
		}
		
		return viewReturn;
	}

	@RequestMapping(value = "/client/user/finder/search/otpcheck", method = RequestMethod.GET)
	public String otpcheckfrom(@RequestParam("id") String id, Model model) {

		model.addAttribute("id", id);
		return ".client.user.finder.changePwd";
	}

	@RequestMapping(value = "/client/user/finder/search/changePwd", method = RequestMethod.POST)
	public String user_change_pwd(@RequestParam("id") String id, @RequestParam("changePwd") String changePwd,
			@RequestParam("changePwd2") String changePwd2, Model model) {

		String viewReturn = "redirect:/client/user/finder/search/otpcheck";
		
		if (changePwd.equals(changePwd2)) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("id", id);
			map.put("changePwd", changePwd);

			String u_id = accountFinderService.getUserInfo(map);
			String t_id = accountFinderService.getTrainerInfo(map);

			if (u_id == null && t_id == null) {
				model.addAttribute("id", id);
			} else if (u_id != null) {
				int n = accountFinderService.userChangePwd(map);
				if (n > 0) {
					viewReturn = ".client.user.finder.changeOk";
				}
			} else if (t_id != null) {
				int n = accountFinderService.TraineruserChangePwd(map);
				if (n > 0) {
					viewReturn = ".client.user.finder.changeOk";
				}
			} else {
				model.addAttribute("id", id);
			}
		} else {
			model.addAttribute("id", id);
		}
		
		return viewReturn;
	}

	@RequestMapping(value = "/authentication", method = RequestMethod.GET)
	@ResponseBody
	public String sendMail(String msg, String toEmail, HttpServletRequest request) {
		Random rnd = new Random();
		String otpset = String.valueOf(rnd.nextInt(9999) + 1000);
		StringBuffer sb = new StringBuffer();
		
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		sb.append("<mail>");

		String title = "[Health Club] 인증번호가 발송되었습니다.";
		String fromEmail = "admin@gmail.com";
		msg = "비밀번호 재설정 인증코드 : " + otpset;

		sender.sendMail(title, msg, fromEmail, toEmail);

		sb.append("<otpset>" + otpset + "</otpset>");
		sb.append("</mail>");
		return sb.toString();
	}
}
