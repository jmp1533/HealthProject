package com.L3_1team.health.controller.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.client.menu.ReviewDto;
import com.L3_1team.health.dto.client.menu.Review_reple_Dto;
import com.L3_1team.health.service.admin.admin_mboard_review_Service;

@Controller
public class admin_mboard_review_Controller {
	@Inject
	private admin_mboard_review_Service service;

	public admin_mboard_review_Service getService() {
		return service;
	}

	public void setService(admin_mboard_review_Service service) {
		this.service = service;
	}

	@RequestMapping(value = "/admin/mboard/review/list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword) {
		
		ModelAndView mv = new ModelAndView(".admin.mboard.review.list");
		HashMap<String, String> map = new HashMap<String, String>();
		List<ReviewDto> list = null;
		PageUtil pu = null;
		int totalRowCount = 0;
		
		if (field == null && keyword == null) {
			field = "id";
			keyword = "";
		}
		
		map.put("field", field);
		map.put("keyword", keyword);
		
		totalRowCount = service.getCount(map);
		
		pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		
		map.put("startRow", Integer.toString(pu.getStartRow()));
		map.put("endRow", Integer.toString(pu.getEndRow()));
		map.put("field", field);
		map.put("keyword", keyword);

		list = service.list(map);

		mv.addObject("list", list);
		mv.addObject("pu", pu);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		
		return mv;
	}

	@RequestMapping(value = "/admin/mboard/review/view", method = RequestMethod.GET)
	public ModelAndView contentView(@RequestParam("r_num") int r_num) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ModelAndView mv = new ModelAndView(".admin.mboard.review.view");
		PageUtil pu = null;
		int totalRowCount = 0;
		
		ReviewDto dto = service.contentView(r_num);
		ReviewDto prev = service.prev(r_num);
		ReviewDto next = service.next(r_num);

		mv.addObject("dto", dto);
		mv.addObject("prev", prev);
		mv.addObject("next", next);

		totalRowCount = service.getCount_reple(r_num);
		pu = new PageUtil(1, totalRowCount, 10, 10);
		
		map.put("r_num", r_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());

		List<Review_reple_Dto> list = service.reple_list(map);
		
		mv.addObject("reple", list);
		mv.addObject("pu", pu);
		
		return mv;
	}

	@RequestMapping(value = "/admin/mboard/review/delete", method = RequestMethod.POST)
	public String review_delete(HttpSession session, HttpServletRequest request) {
		try {
			String delck[] = request.getParameterValues("delck");

			for (int i = 0; i < delck.length; i++) {
				String r_num = delck[i].toString();

				HashMap<String, String> map = new HashMap<String, String>();
				
				map.put("r_num", r_num);

				service.delete(map);
			}
		} catch (Exception e) {		
		}
		
		return "redirect:/admin/mboard/review/list";
	}

	// ???? ??
	@RequestMapping(value = "/admin/mboard/review/Reples", method = RequestMethod.GET)
	@ResponseBody
	public String repleview(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "r_num", defaultValue = "1") int r_num) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		PageUtil pu = null;
		List<Review_reple_Dto> list = null;
		JSONArray ob_list = new JSONArray();
		int totalRowCount = 0;
		
		totalRowCount = service.getCount_reple(r_num);
		pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		
		map.put("r_num", r_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());
		
		list = service.reple_list(map);
		
		for (Review_reple_Dto vo : list) {
			JSONObject ob = new JSONObject();
			
			ob.put("rre_num", vo.getRre_num());
			ob.put("id", vo.getId());
			ob.put("rre_content", vo.getRre_content());
			ob.put("rre_date", vo.getRre_date().toString());
			ob_list.add(ob);
		}
		
		return ob_list.toString();
	}
}
