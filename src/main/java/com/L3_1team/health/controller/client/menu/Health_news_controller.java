package com.L3_1team.health.controller.client.menu;

import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.client.menu.Health_news_Dto;
import com.L3_1team.health.service.client.menu.Health_news_service;

@Controller
public class Health_news_controller {
	@Inject
	private Health_news_service serv;

	public void setServ(Health_news_service serv) {
		this.serv = serv;
	}

	@RequestMapping(value = "/client/menu/information/news/healthsNews", method = RequestMethod.GET)
	public ModelAndView news(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "sort", defaultValue = "date") String sort) {
		
		ModelAndView mv = new ModelAndView(".client.menu.information.news.healthsNews");
		ArrayList<Health_news_Dto> list = serv.list(pageNum, sort);
		PageUtil pu = new PageUtil(pageNum, 1000, 10, 10);
		
		mv.addObject("pu", pu);
		mv.addObject("sort", sort);
		mv.addObject("dto", list);
		
		return mv;
	}
}
