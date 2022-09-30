package com.L3_1team.health;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_tip_Dto;
import com.L3_1team.health.dto.client.menu.Health_news_Dto;
import com.L3_1team.health.dto.client.menu.People_user_Dto;
import com.L3_1team.health.dto.client.menu.service_notice_Dto;
import com.L3_1team.health.service.client.menu.Health_news_service;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject private HomeService homeService;
	@Inject private Health_news_service newsService;
	
	public void setHomeService(HomeService homeService) {
		this.homeService = homeService;
	}
	
	public void setNewsService(Health_news_service newsService){
		this.newsService=newsService;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model,HttpSession se) {
		List<People_user_Dto> people = homeService.UserBoard();
		List<Community_border_tip_Dto> tip = homeService.TipBoard();
		List<Community_border_free_Dto> free = homeService.FreeBoard();
		List<service_notice_Dto> notice = homeService.NoticeBoard();

		List<Health_news_Dto> news=newsService.list(1,"date");

		model.addAttribute("notice", notice);
		model.addAttribute("people", people);
		model.addAttribute("tip", tip);
		model.addAttribute("free", free);
		model.addAttribute("news", news);
		
		return ".user.main";
	}
	
	@RequestMapping("do")
	public String d(){
		return ".user.main";
	}	
}
