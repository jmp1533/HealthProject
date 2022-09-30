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
import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_reple_Dto;
import com.L3_1team.health.service.admin.admin_mboard_free_Service;

@Controller
public class admin_mboard_free_Controller {
	@Inject
	private admin_mboard_free_Service free_Service;

	public void setFree_Service(admin_mboard_free_Service free_Service) {
		this.free_Service = free_Service;
	}

	public admin_mboard_free_Service getFree_Service() {
		return free_Service;
	}

	// �����Խ��� ����Ʈ
	@RequestMapping(value = "/admin/mboard/free/list", method = RequestMethod.GET)
	public ModelAndView freeborder_list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword) {

		HashMap<String, String> map = new HashMap<String, String>();
		ModelAndView mv = new ModelAndView(".admin.mboard.free.list");
		PageUtil pu = null;
		List<Community_border_free_Dto> list = null;
		int totalRowCount = 0;
		
		if (field == null && keyword == null) {
			field = "id";
			keyword = "";
		}
		
		map.put("field", field);
		map.put("keyword", keyword);
		
		totalRowCount = free_Service.getCount(map);
		pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		
		map.put("startRow", Integer.toString(pu.getStartRow()));
		map.put("endRow", Integer.toString(pu.getEndRow()));

		list = free_Service.list(map);

		mv.addObject("pu", pu);
		mv.addObject("list", list);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		
		return mv;
	}

	// �����Խ��� �󼼺���
	@RequestMapping(value = "/admin/mboard/free/view", method = RequestMethod.GET)
	public ModelAndView freeborder_view(@RequestParam(value = "free_num") int free_num) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ModelAndView mv = new ModelAndView(".admin.mboard.free.view");
		PageUtil pu = null;
		List<Community_border_free_reple_Dto> list = null;
		int totalRowCount = 0;
		
		Community_border_free_Dto dto = free_Service.getinfo(free_num);
		Community_border_free_Dto prev = free_Service.prev(free_num);
		Community_border_free_Dto next = free_Service.next(free_num);
		
		mv.addObject("dto", dto);
		mv.addObject("prev", prev);
		mv.addObject("next", next);

		totalRowCount = free_Service.getCount_reple(free_num);
		pu = new PageUtil(1, totalRowCount, 10, 10);
		
		map.put("free_num", free_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());

		list = free_Service.reple_list(map);
		
		mv.addObject("reple", list);
		mv.addObject("pu", pu);
		
		return mv;
	}

	/*
	 * //�����Խ��� updatefom
	 * 
	 * @RequestMapping(value =
	 * "/client/menu/insert/comunity/border/free/updateform", method =
	 * RequestMethod.POST)
	 * 
	 * @ModelAttribute("dto") public ModelAndView
	 * freeborder_updatefom(@ModelAttribute("dto") Community_border_free_Dto dto){
	 * ModelAndView mv=new
	 * ModelAndView(".client.menu.comunity.border.free.updateform");
	 * 
	 * return mv; }
	 * 
	 * //�����Խ��� update
	 * 
	 * @RequestMapping(value = "/client/menu/insert/comunity/border/free/update",
	 * method = RequestMethod.POST) public String
	 * freeborder_update(Community_border_free_Dto dto){
	 * 
	 * service.update(dto);
	 * 
	 * return
	 * "redirect:/client/menu/insert/comunity/border/free/view?free_num="+dto.
	 * getFree_num(); }
	 */

	// ���� ��
	@RequestMapping(value = "/admin/mboard/free/Reples", method = RequestMethod.GET)
	@ResponseBody
	public String repleview(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "freenum", defaultValue = "1") int free_num) {
				
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		List<Community_border_free_reple_Dto> list = null;
		PageUtil pu = null;
		JSONArray ob_list = new JSONArray();
		JSONObject ob_pu = new JSONObject();
		int totalRowCount = 0;
		
		totalRowCount = free_Service.getCount_reple(free_num);
		pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		
		map.put("free_num", free_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());
		
		list = free_Service.reple_list(map);
		
		for (Community_border_free_reple_Dto vo : list) {
			JSONObject ob = new JSONObject();
			
			ob.put("fr_num", vo.getFr_num());
			ob.put("id", vo.getId());
			ob.put("fr_content", vo.getFr_content());
			ob.put("fr_date", vo.getFr_date().toString());
			
			ob_list.add(ob);
		}
		
		return ob_list.toString();
	}

	// ����
	@RequestMapping(value = "/admin/mboard/free/delete", method = RequestMethod.POST)
	public String freeborder_delete(HttpServletRequest request, HttpSession session) {
		try {
			HashMap<String, String> map = new HashMap<String, String>();

			String delck[] = request.getParameterValues("delck");

			for (int i = 0; i < delck.length; i++) {
				String free_num = delck[i].toString();
				map.put("free_num", free_num);

				int n = free_Service.delete(map);
			}
		} catch (Exception e) {			
		}
		
		return "redirect:/admin/mboard/free/list";
	}
}
