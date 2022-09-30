package com.L3_1team.health.controller.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.category.Health_Category_Dto;
import com.L3_1team.health.dto.client.menu.Health_movie_Dto;
import com.L3_1team.health.service.client.menu.Health_movie_service;

@Controller
public class Health_movie_Controller {
	@Inject
	private Health_movie_service serv;

	public void setMyBoardService(Health_movie_service serv) {
		this.serv = serv;
	}

	@RequestMapping("/client/menu/information/movie/health_movie_view")
	public ModelAndView detail(@RequestParam("num") int num) {
		Health_movie_Dto dto = serv.view(num);
		ModelAndView mv = new ModelAndView(".client.menu.information.movie.health_movie_view");
		mv.addObject("dto", dto);
		return mv;
	}

	@RequestMapping(value = "/client/menu/information/movie/health_movie_list", method = RequestMethod.GET)
	public ModelAndView serach_list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "cateNum", defaultValue = "0") int cateNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword) {
		if (field == null && keyword == null) {
			field = "admin_id";
			keyword = "";
		}
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("vcate_num", Integer.toString(cateNum));
		map1.put("field", field);
		map1.put("keyword", keyword);
		int totalRowCount = serv.getCount(map1);
		PageUtil pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("startRow", Integer.toString(pu.getStartRow()));
		map.put("endRow", Integer.toString(pu.getEndRow()));
		map.put("vcate_num", Integer.toString(cateNum));
		map.put("field", field);
		map.put("keyword", keyword);
		List<Health_movie_Dto> list = serv.search_list(map);
		List<Health_Category_Dto> vcate = serv.vcate();
		ModelAndView mv = new ModelAndView(".client.menu.information.movie.health_movie_list");
		mv.addObject("list", list);
		mv.addObject("vcate", vcate);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		mv.addObject("pu", pu);
		mv.addObject("cateNum", cateNum);
		return mv;
	}
}
