package com.L3_1team.health.controller.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.client.menu.service_notice_Dto;
import com.L3_1team.health.service.admin.admin_service_notice_service;

@Controller
public class admin_service_notice_Controller {
	@Inject
	admin_service_notice_service notice_service;

	public void setNotice_service(admin_service_notice_service notice_service) {
		this.notice_service = notice_service;
	}

	// 공지사항 목록
	@RequestMapping(value = "/admin/mservice/notice/Noticelist", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword) {
		
		ModelAndView mv = new ModelAndView(".admin.mservice.notice.Noticelist");
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<service_notice_Dto> list = null;
		PageUtil pu = null;
		int totalRowCount = 0;
		
		if (field == null && keyword == null) {
			field = "noti_title";
			keyword = "";
		}
		
		map.put("field", field);
		map.put("keyword", keyword);
		
		totalRowCount = notice_service.search(map);

		pu = new PageUtil(pageNum, totalRowCount, 10, 10);

		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());

		list = notice_service.list(map);

		mv.addObject("list", list);
		mv.addObject("pu", pu);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		
		return mv;
	}

	// 공지사항 상세보기
	@RequestMapping(value = "/admin/mservice/notice/view", method = RequestMethod.GET)
	public String getinfo(@RequestParam("noti_num") int noti_num, Model model) {
		service_notice_Dto dto = notice_service.getinfo(noti_num);
		service_notice_Dto prev = notice_service.prev(noti_num);
		service_notice_Dto next = notice_service.next(noti_num);

		model.addAttribute("dto", dto);
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);
		
		return ".admin.mservice.notice.view";
	}

	// 글쓰기 Form
	@RequestMapping(value = "/admin/mservice/notice/write", method = RequestMethod.GET)
	public String insertForm() {
		return ".admin.mservice.notice.write";
	}

	// 글쓰기
	@RequestMapping(value = "/admin/mservice/notice/write", method = RequestMethod.POST)
	public String insert(@RequestParam("noti_title") String noti_title,
			@RequestParam("noti_content") String noti_content, @RequestParam("admin_id") String admin_id,
			service_notice_Dto dto) {
		notice_service.insert(dto);
		return "redirect:/admin/mservice/notice/Noticelist";
	}

	// 수정 Form
	@RequestMapping(value = "/admin/mservice/notice/update", method = RequestMethod.GET)
	public String update(@ModelAttribute("dto") service_notice_Dto dto, Model model) {
		service_notice_Dto dto1 = notice_service.getinfo(dto.getNoti_num());
		model.addAttribute("dto", dto1);
		return ".admin.mservice.notice.update";
	}

	// 수정
	@RequestMapping(value = "/admin/mservice/notice/update", method = RequestMethod.POST)
	public String update(@RequestParam("noti_num") int noti_num, service_notice_Dto dto) {
		notice_service.update(dto);
		return "redirect:/admin/mservice/notice/Noticelist";
	}

	// 삭제
	@RequestMapping(value = "/admin/mservice/notice/delete", method = RequestMethod.POST)
	public String delete(HttpServletRequest request) {
		String delck[] = request.getParameterValues("delck");

		for (int i = 0; i < delck.length; i++) {
			int noti_num = Integer.parseInt(delck[i].toString());

			notice_service.delete(noti_num);
		}
		return "redirect:/admin/mservice/notice/Noticelist";
	}
}
