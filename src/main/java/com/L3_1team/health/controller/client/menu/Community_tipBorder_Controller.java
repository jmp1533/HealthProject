package com.L3_1team.health.controller.client.menu;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.category.Health_Category_Dto;
import com.L3_1team.health.dto.category.commend_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_tip_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_tip_reple_Dto;

import com.L3_1team.health.service.client.menu.Community_tipBorder_Service;

@Controller
public class Community_tipBorder_Controller {
	@Inject
	private Community_tipBorder_Service service;

	public Community_tipBorder_Service getService() {
		return service;
	}

	public void setService(Community_tipBorder_Service service) {
		this.service = service;
	}

	// �����Խ��� ����Ʈ
	@RequestMapping(value = "/client/menu/insert/comunity/border/tip/list", method = RequestMethod.GET)
	public ModelAndView tipborder_list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "cateNum", defaultValue = "0") int cateNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword) {
		ModelAndView mv = new ModelAndView(".client.menu.comunity.border.tip.list");
		if (field == null && keyword == null) {
			field = "id";
			keyword = "";
		}
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("tcate_num", Integer.toString(cateNum));
		map1.put("field", field);
		map1.put("keyword", keyword);
		int totalRowCount = service.getCount(map1);
		PageUtil pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("startRow", Integer.toString(pu.getStartRow()));
		map.put("endRow", Integer.toString(pu.getEndRow()));
		map.put("tcate_num", Integer.toString(cateNum));
		map.put("field", field);
		map.put("keyword", keyword);
		List<Community_border_tip_Dto> list = service.list(map);
		List<Health_Category_Dto> cate = service.cate();
		mv.addObject("list", list);
		mv.addObject("cate", cate);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		mv.addObject("pu", pu);
		mv.addObject("cateNum", cateNum);
		return mv;
	}

	// �����Խ��� �۾�����
	@RequestMapping(value = "/client/menu/insert/comunity/border/tip/write", method = RequestMethod.GET)
	public String tipborder_write() {

		return ".client.menu.comunity.border.tip.write";

	}

	// �����Խ��� �۾��� insert
	@RequestMapping(value = "/client/menu/insert/comunity/border/tip/write", method = RequestMethod.POST)
	public String tipborder_writefrom(@RequestParam(value = "tip_content") String content,
			@RequestParam(value = "tcate_num") String tcate_num, @RequestParam(value = "tip_title") String title,
			@RequestParam(value = "id") String id, HttpSession session) {

		Community_border_tip_Dto dto = new Community_border_tip_Dto(0, Integer.parseInt(tcate_num), id, title, content,
				null, 0);
		service.insert(dto);

		return "redirect:/client/menu/insert/comunity/border/tip/list";
	}

	@RequestMapping(value = "/client/menu/insert/comunity/border/tip/updateform", method = RequestMethod.POST)
	@ModelAttribute("dto")
	public ModelAndView tip_updateform(@ModelAttribute("dto") Community_border_tip_Dto dto) {
		ModelAndView mv = new ModelAndView(".client.menu.comunity.border.tip.updateform");
		return mv;
	}

	@RequestMapping(value = "/client/menu/insert/comunity/border/tip/update", method = RequestMethod.POST)
	@ModelAttribute("dto")
	public ModelAndView tip_update(@ModelAttribute("dto") Community_border_tip_Dto dto) {
		ModelAndView mv = new ModelAndView("redirect:/client/menu/insert/comunity/border/tip/list");
		service.update(dto);
		return mv;
	}

	// �����Խ��� �󼼺���
	@RequestMapping(value = "/client/menu/insert/comunity/border/tip/view", method = RequestMethod.GET)
	public ModelAndView tipborder_view(@RequestParam(value = "tip_num") int tip_num) {
		ModelAndView mv = new ModelAndView(".client.menu.comunity.border.tip.view");
		Community_border_tip_Dto dto = service.getinfo(tip_num);
		Community_border_tip_Dto prev = service.prev(tip_num);
		Community_border_tip_Dto next = service.next(tip_num);
		mv.addObject("dto", dto);
		mv.addObject("prev", prev);
		mv.addObject("next", next);

		int totalRowCount = service.getCount_reple(tip_num);
		PageUtil pu = new PageUtil(1, totalRowCount, 5, 5);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("tip_num", tip_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());

		List<Community_border_tip_reple_Dto> list = service.reple_list(map);

		int commend = service.commend_count(tip_num);
		mv.addObject("commend", commend);
		mv.addObject("reple", list);
		mv.addObject("pu", pu);
		return mv;
	}

	@RequestMapping(value = "/client/menu/insert/comunity/border/tip/Reples", method = RequestMethod.GET)
	@ResponseBody
	public String repleview(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "tipnum", defaultValue = "1") int tip_num) {
		int totalRowCount = service.getCount_reple(tip_num);
		PageUtil pu = new PageUtil(pageNum, totalRowCount, 5, 5);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("tip_num", tip_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());
		List<Community_border_tip_reple_Dto> list = service.reple_list(map);

		JSONArray ob_list = new JSONArray();
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

	@RequestMapping(value = "/client/menu/insert/comunity/border/tip/Reple", method = RequestMethod.POST)
	public String review(@RequestParam(value = "content") String content, @RequestParam(value = "tip_num") int tip_num,
			@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, HttpSession session) {
		String id = (String) session.getAttribute("id");
		Community_border_tip_reple_Dto dto = new Community_border_tip_reple_Dto(0, tip_num, id, content, null);
		int suc = service.reple_insert(dto);

		return "redirect:/client/menu/insert/comunity/border/tip/view?tip_num=" + tip_num;

	}

	@RequestMapping(value = "/client/menu/insert/comunity/border/tip/delete", method = RequestMethod.GET)
	public String tipborder_delete(@RequestParam(value = "tip_num") int tip_num) {
		try {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("tip_num", Integer.toString(tip_num));
			map.put("id", "user1");

			int i = service.delete(map);
			return "redirect:/client/menu/insert/comunity/border/tip/list";
		} catch (Exception e) {
			return "redirect:/client/menu/insert/comunity/border/tip/list";
		}

	}

	@RequestMapping(value = "/client/menu/insert/comunity/border/tip/commend", method = RequestMethod.GET)
	public ModelAndView commend(@RequestParam(value = "tip_num") int tip_num, HttpSession session) {
		String id = (String) session.getAttribute("id");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("tip_num", Integer.toString(tip_num));
		ModelAndView mv = new ModelAndView("redirect:/client/menu/insert/comunity/border/tip/view?tip_num=" + tip_num);

		commend_Dto dto = service.commend_check(map);
		if (dto != null) {
			mv.addObject("check", "��õ�̹� �ϼ̱���");
		} else {

			service.commend_insert(map);
			mv.addObject("check", "��õ����!");
		}
		return mv;
	}

}
