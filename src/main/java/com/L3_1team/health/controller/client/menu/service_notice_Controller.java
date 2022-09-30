package com.L3_1team.health.controller.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.client.menu.service_notice_Dto;
import com.L3_1team.health.service.client.menu.service_notice_service;

@Controller
public class service_notice_Controller {
	@Inject
	service_notice_service notice_service;

	public void setNotice_service(service_notice_service notice_service) {
		this.notice_service = notice_service;
	}

	// 공지사항 목록
	@RequestMapping(value = "/client/menu/service/notice/Noticelist", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum) {
		ModelAndView mv = new ModelAndView(".client.menu.service.notice.Noticelist");
		int totalRowCount = notice_service.getCount();
		PageUtil pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		List<service_notice_Dto> listall = notice_service.noticelist();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());
		List<service_notice_Dto> list = notice_service.list(map);
		mv.addObject("count", (totalRowCount - (pageNum - 1) * 10) + 1);
		mv.addObject("list", list);
		mv.addObject("pu", pu);
		return mv;
	}

	// 공지사항 상세보기
	@RequestMapping(value = "/client/menu/service/notice/view", method = RequestMethod.GET)
	public String getinfo(@RequestParam("noti_num") int noti_num, Model model) {
		service_notice_Dto dto = notice_service.getinfo(noti_num);
		service_notice_Dto prev = notice_service.prev(noti_num);
		service_notice_Dto next = notice_service.next(noti_num);

		model.addAttribute("dto", dto);
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);
		return ".client.menu.service.notice.view";
	}
	/*
	 * //글쓰기 Form
	 * 
	 * @RequestMapping(value="/client/menu/service/notice/write",method=
	 * RequestMethod.GET) public String insertForm(){ return
	 * ".client.menu.service.notice.write"; }
	 * 
	 * //글쓰기
	 * 
	 * @RequestMapping(value="/client/menu/service/notice/write",method=
	 * RequestMethod.POST) public String insert(@RequestParam("noti_title")String
	 * noti_title,@RequestParam("noti_content")String
	 * noti_content,@RequestParam("admin_id")String admin_id,service_notice_Dto
	 * dto){ notice_service.insert(dto); return
	 * "redirect:/client/menu/service/notice/Noticelist"; }
	 * 
	 * 
	 * //수정 Form
	 * 
	 * @RequestMapping(value="/client/menu/service/notice/update",method=
	 * RequestMethod.GET) public String update(@ModelAttribute("dto")
	 * service_notice_Dto dto){ return ".client.menu.service.notice.update"; }
	 * 
	 * //수정
	 * 
	 * @RequestMapping(value="/client/menu/service/notice/update",method=
	 * RequestMethod.POST) public String update(@RequestParam("noti_num")int
	 * noti_num,service_notice_Dto dto){ notice_service.update(dto); return
	 * "redirect:/client/menu/service/notice/Noticelist"; }
	 * 
	 * 
	 * //삭제
	 * 
	 * @RequestMapping(value="/client/menu/service/notice/delete",method=
	 * RequestMethod.GET) public String delete(@RequestParam("noti_num")int
	 * noti_num){ notice_service.delete(noti_num); return
	 * "redirect:/client/menu/service/notice/Noticelist"; }
	 */
}
