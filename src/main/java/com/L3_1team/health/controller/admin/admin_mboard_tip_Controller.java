package com.L3_1team.health.controller.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.category.Health_Category_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_tip_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_tip_reple_Dto;
import com.L3_1team.health.service.admin.admin_mboard_tip_Service;

@Controller
public class admin_mboard_tip_Controller {
	@Inject
	private admin_mboard_tip_Service service;

	public admin_mboard_tip_Service getService() {
		return service;
	}

	public void setService(admin_mboard_tip_Service service) {
		this.service = service;
	}

	// 자유게시판 리스트
	@RequestMapping(value = "/admin/mboard/tip/list", method = RequestMethod.GET)
	public ModelAndView tipborder_list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "cateNum", defaultValue = "0") int cateNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword) {
		
		ModelAndView mv = new ModelAndView(".admin.mboard.tip.list");
		HashMap<String, String> map = new HashMap<String, String>();
		PageUtil pu = null;
		List<Community_border_tip_Dto> list = null;
		List<Health_Category_Dto> cate = null;
		int totalRowCount = 0;
		
		if (field == null && keyword == null) {
			field = "id";
			keyword = "";
		}
		
		map.put("tcate_num", Integer.toString(cateNum));
		map.put("field", field);
		map.put("keyword", keyword);
		
		totalRowCount = service.getCount(map);
		pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		
		map.put("startRow", Integer.toString(pu.getStartRow()));
		map.put("endRow", Integer.toString(pu.getEndRow()));
		
		list = service.list(map);
		cate = service.cate();
		
		mv.addObject("list", list);
		mv.addObject("cate", cate);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		mv.addObject("pu", pu);
		mv.addObject("cateNum", cateNum);
		
		return mv;
	}

	// 자유게시판 상세보기
	@RequestMapping(value = "/admin/mboard/tip/view", method = RequestMethod.GET)
	public ModelAndView tipborder_view(@RequestParam(value = "tip_num") int tip_num) {
		ModelAndView mv = new ModelAndView(".admin.mboard.tip.view");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		PageUtil pu = null;
		List<Community_border_tip_reple_Dto> list = null;
		int totalRowCount, commend = 0;
		
		Community_border_tip_Dto dto = service.getinfo(tip_num);
		Community_border_tip_Dto prev = service.prev(tip_num);
		Community_border_tip_Dto next = service.next(tip_num);
		
		mv.addObject("dto", dto);
		mv.addObject("prev", prev);
		mv.addObject("next", next);

		totalRowCount = service.getCount_reple(tip_num);
		pu = new PageUtil(1, totalRowCount, 10, 10);
		
		map.put("tip_num", tip_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());

		list = service.reple_list(map);

		commend = service.commend_count(tip_num);
		
		mv.addObject("commend", commend);
		mv.addObject("reple", list);
		mv.addObject("pu", pu);
		
		return mv;
	}

	@RequestMapping(value = "/admin/mboard/tip/Reples", method = RequestMethod.GET)
	@ResponseBody
	public String repleview(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "tipnum", defaultValue = "1") int tip_num) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		List<Community_border_tip_reple_Dto> list = service.reple_list(map);
		JSONArray ob_list = new JSONArray();
		PageUtil pu = null;
		int totalRowCount = 0;
		
		totalRowCount = service.getCount_reple(tip_num);
		pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		
		map.put("tip_num", tip_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());
				
		for (Community_border_tip_reple_Dto vo : list) {
			JSONObject ob = new JSONObject();
			
			ob.put("fr_num", vo.getTr_num());
			ob.put("id", vo.getId());
			ob.put("fr_content", vo.getTr_content());
			ob.put("fr_date", vo.getTr_date().toString());
			
			ob_list.add(ob);
		}
		
		return ob_list.toString();
	}

	@RequestMapping(value = "/admin/mboard/tip/Reples", method = RequestMethod.POST)
	public @ResponseBody String review(@RequestParam(value = "content") String content,
			@RequestParam(value = "tip_num") int tip_num,
			@RequestParam(value = "pageNum", defaultValue = "1") int pageNum) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		JSONArray ob_list = new JSONArray();
		Community_border_tip_reple_Dto dto = null;
		PageUtil pu = null;
		List<Community_border_tip_reple_Dto> list = null;
		int suc, totalRowCount = 0;
		
		dto = new Community_border_tip_reple_Dto(0, tip_num, "user", content, null);
		suc = service.reple_insert(dto);
		totalRowCount = service.getCount_reple(tip_num);
		
		pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		
		map.put("tip_num", tip_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());

		list = service.reple_list(map);

		for (Community_border_tip_reple_Dto vo : list) {
			JSONObject ob = new JSONObject();
			ob.put("fr_num", vo.getTr_num());
			ob.put("id", vo.getId());
			ob.put("fr_content", vo.getTr_content());
			ob.put("fr_date", vo.getTr_date().toString());

			ob_list.add(ob);
		}
		
		return ob_list.toString();
	}

	@RequestMapping(value = "/admin/mboard/tip/delete", method = RequestMethod.POST)
	public String tipborder_delete(HttpServletRequest request) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		String delck[];
		try {
			
			delck = request.getParameterValues("delck");

			for (int i = 0; i < delck.length; i++) {
				String tip_num = delck[i].toString();
				map.put("tip_num", tip_num);

				int n = service.delete(map);
			}
		} catch (Exception e) {			
		}
		
		return "redirect:/admin/mboard/tip/list";
	}
}
