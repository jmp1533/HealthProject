package com.L3_1team.health.controller.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.admin.admin_muser_list_Dto;
import com.L3_1team.health.dto.admin.admin_userslog_Dto;
import com.L3_1team.health.service.admin.admin_muser_Service;

@Controller
public class admin_muser_Controller {
	@Inject
	private admin_muser_Service muser_list_Service;

	public void setMuser_list_Service(admin_muser_Service muser_list_Service) {
		this.muser_list_Service = muser_list_Service;
	}

	// 회원 리스트
	@RequestMapping(value = "/admin/muser/list/list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword,
			@RequestParam(value = "u_out", defaultValue = "0") int u_out) {

		ModelAndView mv = new ModelAndView(".admin.muser.list.list");
		HashMap<String, Object> map = new HashMap<String, Object>();
		HashMap<String, String> searchMap = new HashMap<String, String>();
		PageUtil pu = null;
		List<admin_muser_list_Dto> list = null;
		int totalRowCount = 0;
		
		if (field == null && keyword == null) {
			field = "u_id";
			keyword = "";
		}
		
		map.put("field", field);
		map.put("keyword", keyword);
		map.put("u_out", u_out);
		totalRowCount = muser_list_Service.search(map);

		pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		
		searchMap.put("startRow", Integer.toString(pu.getStartRow()));
		searchMap.put("endRow", Integer.toString(pu.getEndRow()));
		searchMap.put("field", field);
		searchMap.put("keyword", keyword);
		searchMap.put("u_out", Integer.toString(u_out));

		list = muser_list_Service.list(searchMap);

		mv.addObject("pu", pu);
		mv.addObject("list", list);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		mv.addObject("u_out", u_out);
		
		return mv;
	}

	// 회원상세보기
	@RequestMapping(value = "/admin/muser/list/view", method = RequestMethod.GET)
	public String getinfo(@RequestParam("u_id") String u_id, Model model) {
		admin_muser_list_Dto dto = muser_list_Service.getinfo(u_id);
		model.addAttribute("dto", dto);
		return ".admin.muser.list.view";
	}

	// 탈퇴처리
	@RequestMapping(value = "/admin/muser/list/delete", method = RequestMethod.GET)
	public String out(HttpServletRequest request) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		String delck[] = request.getParameterValues("delck");

		for (int i = 0; i < delck.length; i++) {
			String u_id = delck[i].toString();

			map.put("u_id", u_id);

			muser_list_Service.out(u_id);
		}

		return "redirect:/admin/muser/list/list";

	}

	// users log
	@RequestMapping(value = "/admin/muser/record/list", method = RequestMethod.GET)
	public ModelAndView recordlist(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword) {
		
		ModelAndView mv = new ModelAndView(".admin.muser.record.list");
		HashMap<String, Object> map = new HashMap<String, Object>();
		HashMap<String, Object> searchMap = new HashMap<String, Object>();
		PageUtil pu = null;
		List<admin_userslog_Dto> list = null;
		int totalRowCount = 0;
		
		if (field == null && keyword == null) {
			field = "u_id";
			keyword = "";
		}

		
		map.put("field", field);
		map.put("keyword", keyword);
		totalRowCount = muser_list_Service.logsearch(map);

		pu = new PageUtil(pageNum, totalRowCount, 10, 10);
	
		searchMap.put("startRow", pu.getStartRow());
		searchMap.put("endRow", pu.getEndRow());
		searchMap.put("field", field);
		searchMap.put("keyword", keyword);

		list = muser_list_Service.recordlist(searchMap);

		mv.addObject("list", list);
		mv.addObject("pu", pu);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		
		return mv;
	}
}
