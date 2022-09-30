package com.L3_1team.health.controller.client.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.client.menu.management_Dto;
import com.L3_1team.health.dto.client.menu.userinfo_Dto;
import com.L3_1team.health.dto.client.user.UserDto;
import com.L3_1team.health.service.client.menu.Join_Service;

@Controller
public class Join_Controller {
	@Inject
	Join_Service join_Service;

	public void setJoin_Service(Join_Service join_Service) {
		this.join_Service = join_Service;
	}

	@RequestMapping(value = "/client/menu/mypage/traner/joinlist", method = RequestMethod.GET)
	public ModelAndView joinForm(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword, HttpServletRequest request) {

		ModelAndView mv = new ModelAndView(".client.menu.mypage.traner.joinlist");
		if (field == null && keyword == null) {
			field = "u_id";
			keyword = "";
		}

		String tlogid = (String) request.getSession().getAttribute("tlogid");

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("field", field);
		map.put("keyword", keyword);
		map.put("t_id", tlogid);
		int totalRowCount = join_Service.getCount(map);

		PageUtil pu = new PageUtil(pageNum, totalRowCount, 10, 10);

		map.put("startRow", Integer.toString(pu.getStartRow()));
		map.put("endRow", Integer.toString(pu.getEndRow()));

		List<management_Dto> list = join_Service.list(map);

		ArrayList<userinfo_Dto> info = new ArrayList<userinfo_Dto>();
		for (int i = 0; i < list.size(); i++) {
			String u_id = list.get(i).getU_id();
			userinfo_Dto dto = join_Service.userinfo(u_id);
			if (dto == null) {
				dto = new userinfo_Dto();
				dto.setUi_weight(0);
				dto.setUi_height(0);
			}
			dto.setU_id(u_id);
			dto.setUi_date(list.get(i).getUm_date());

			info.add(dto);
		}
		mv.addObject("info", info);
		mv.addObject("pu", pu);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		return mv;
	}

	@RequestMapping(value = "/client/menu/mypage/traner/view", method = RequestMethod.GET)
	public ModelAndView view(@RequestParam("u_id") String u_id, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView(".client.menu.mypage.traner.view");

		UserDto dto = join_Service.search(u_id);
		mv.addObject("dto", dto);
		return mv;
	}

	@RequestMapping(value = "/client/menu/mypage/traner/delete", method = RequestMethod.POST)
	public String joindelete(HttpServletRequest request) {

		String delck[] = request.getParameterValues("delck");

		for (int i = 0; i < delck.length; i++) {
			String u_id = delck[i].toString();

			join_Service.delete(u_id);
		}
		return "redirect:/client/menu/mypage/traner/joinlist";
	}

	@RequestMapping(value = "/client/menu/mypage/traner/joinapplylist", method = RequestMethod.GET)
	public ModelAndView applyForm(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView(".client.menu.mypage.traner.joinapplylist");
		if (field == null && keyword == null) {
			field = "u_id";
			keyword = "";
		}
		String tlogid = (String) request.getSession().getAttribute("tlogid");

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("field", field);
		map.put("keyword", keyword);
		map.put("t_id", tlogid);
		int totalRowCount = join_Service.applyCount(map);
		PageUtil page = new PageUtil(pageNum, totalRowCount, 10, 10);

		map.put("startRow", Integer.toString(page.getStartRow()));
		map.put("endRow", Integer.toString(page.getEndRow()));
		List<management_Dto> list = join_Service.applylist(map);

		mv.addObject("list", list);
		mv.addObject("page", page);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		return mv;
	}

	@RequestMapping(value = "/client/menu/mypage/traner/applyview", method = RequestMethod.GET)
	public ModelAndView applyview(@RequestParam("u_id") String u_id, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView(".client.menu.mypage.traner.applyview");

		UserDto dto = join_Service.search(u_id);
		mv.addObject("dto", dto);
		return mv;
	}

	@RequestMapping(value = "/client/menu/mypage/traner/applyupdate", method = RequestMethod.POST)
	public String applyupdate(@RequestParam(value = "tid", defaultValue = "null") String tid,
			HttpServletRequest request) {
		HashMap<String, String> map = new HashMap<String, String>();
		String delck[] = request.getParameterValues("delck");

		try {
			for (int i = 0; i < delck.length; i++) {
				String u_id = delck[i];

				map.put("u_id", u_id);
				map.put("t_id", tid);
				join_Service.joindelete(map);
			}
			return "redirect:/client/menu/mypage/traner/joinapplylist";
		} catch (Exception e) {
			return "redirect:/client/menu/mypage/traner/joinapplylist";
		}
	}

}
