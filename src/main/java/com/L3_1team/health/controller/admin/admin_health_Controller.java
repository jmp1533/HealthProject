package com.L3_1team.health.controller.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.client.menu.Finder_company_Dto;
import com.L3_1team.health.service.admin.admin_health_Service;

@Controller
public class admin_health_Controller {
	@Inject
	admin_health_Service health_Service;

	public void setHealth_Service(admin_health_Service health_Service) {
		this.health_Service = health_Service;
	}

	@RequestMapping(value = "/admin/mhealth/list/CompanyList", method = RequestMethod.GET)
	public String companyForm(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "companyname", defaultValue = "null") String companyname, Model model) {

		list(companyname, pageNum, model);

		return ".admin.mhealth.list.CompanyList";
	}

	@RequestMapping(value = "/admin/mhealth/list/CompanyList", method = RequestMethod.POST)
	public String companyList(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "companyname", defaultValue = "null") String companyname, Model model) {

		list(companyname, pageNum, model);

		return ".admin.mhealth.list.CompanyList";
	}

	@RequestMapping(value = "/admin/mhealth/list/Companydelete", method = RequestMethod.POST)
	public String companydelete(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "companyname", defaultValue = "null") String companyname, HttpServletRequest request,
			Model model) {

		String delck[] = request.getParameterValues("delck");

		for (int i = 0; i < delck.length; i++) {
			int b_num = Integer.parseInt(delck[i].toString());
			health_Service.delete(b_num);
		}

		list(companyname, pageNum, model);

		return ".admin.mhealth.list.CompanyList";
	}

	public void list(String companyname, int pageNum, Model model) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		PageUtil page = null;
		List<Finder_company_Dto> list = null;
		int count = 0;
		
		map.put("companyname", companyname);

		count = health_Service.getCount(map);
		page = new PageUtil(pageNum, count, 10, 10);

		map.put("startRow", page.getStartRow());
		map.put("endRow", page.getEndRow());

		list = health_Service.getlist(map);

		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("companyname", companyname);
	}

	@RequestMapping(value = "/admin/mhealth/list/Companyview", method = RequestMethod.GET)
	public String parkViewForm(@Param("b_num") int b_num, Model model) {
		Finder_company_Dto company_Dto = health_Service.search(b_num);
		List<String> imglist = health_Service.img(b_num);
		String[] img = new String[8];

		for (int i = 0; i < 8; i++) {
			if (imglist.size() > i) {
				img[i] = imglist.get(i);
			} else {
				img[i] = null;
			}
		}

		model.addAttribute("company_Dto", company_Dto);
		model.addAttribute("img", img);
		
		return ".admin.mhealth.list.Companyview";
	}
}
