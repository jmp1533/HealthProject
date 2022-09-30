package com.L3_1team.health.controller.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Service_faq_Dto;
import com.L3_1team.health.service.client.menu.Service_faq_Service;

@Controller
public class Service_faq_Controller {
	@Inject
	private Service_faq_Service service;

	public void setService(Service_faq_Service service) {
		this.service = service;
	}

	// faq목록(페이징)
	@RequestMapping(value = "/client/menu/service/faq/list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum) {
		ModelAndView mv = new ModelAndView(".client.menu.service.faq.list");
		int totalRowCount = service.getCount();
		PageUtil pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		List<Service_faq_Dto> listall = service.listall();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());
		List<Service_faq_Dto> list = service.list(map);
		mv.addObject("list", list);
		mv.addObject("pu", pu);
		return mv;
	}

	// 글쓰기 Form
	@RequestMapping(value = "/client/menu/service/faq/write", method = RequestMethod.GET)
	public String insertForm() {
		return ".client.menu.service.faq.write";
	}

	// 글쓰기
	@RequestMapping(value = "/client/menu/service/faq/write", method = RequestMethod.POST)
	public String insert(@RequestParam("faq_question") String faq_question,
			@RequestParam("faq_answer") String faq_answer, Service_faq_Dto dto) {
		service.insert(dto);
		return "redirect:/client/menu/service/faq/list";
	}

	// 수정 Form
	@RequestMapping(value = "/client/menu/service/faq/update", method = RequestMethod.GET)
	public String updateForm(@ModelAttribute("dto") Service_faq_Dto dto) {
		return ".client.menu.service.faq.update";
	}

	// 수정
	@RequestMapping(value = "/client/menu/service/faq/update", method = RequestMethod.POST)
	public String update(@RequestParam("faq_num") int faq_num, Service_faq_Dto dto) {
		System.out.println(faq_num);
		service.update(dto);
		return "redirect:/client/menu/service/faq/list";
	}

	// 삭제
	@RequestMapping("/client/menu/service/faq/delete")
	public String delete(@RequestParam("faq_num") int faq_num) {
		service.delete(faq_num);
		return "redirect:/client/menu/service/faq/list";
	}
}
