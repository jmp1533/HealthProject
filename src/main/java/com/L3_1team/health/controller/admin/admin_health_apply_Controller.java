package com.L3_1team.health.controller.admin;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.admin.admin_mhealth_business_Dto;
import com.L3_1team.health.service.admin.admin_health_apply_Service;

@Controller
public class admin_health_apply_Controller {
	@Inject
	admin_health_apply_Service admin_health_apply_Service;

	public void setAdmin_health_apply_Service(admin_health_apply_Service admin_health_apply_Service) {
		this.admin_health_apply_Service = admin_health_apply_Service;
	}

	@RequestMapping(value = "/admin/mhealth/apply/applylist", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		ModelAndView mv = new ModelAndView(".admin.mhealth.apply.applylist");
		PageUtil pu = null;
		List<admin_mhealth_business_Dto> list = null;
		int totalRowCount = 0;
		
		if (field == null && keyword == null) {
			field = "b_name";
			keyword = "";
		}
		
		map.put("field", field);
		map.put("keyword", keyword);
		totalRowCount = admin_health_apply_Service.search(map);

		pu = new PageUtil(pageNum, totalRowCount, 10, 10);

		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());

		list = admin_health_apply_Service.list(map);

		mv.addObject("pu", pu);
		mv.addObject("list", list);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);

		return mv;
	}

	// ??????????????????
	@RequestMapping(value = "/admin/mhealth/apply/applydelete", method = RequestMethod.GET)
	public String delete(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword, HttpServletRequest request,
			HttpSession session, Model model) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		String delck[] = request.getParameterValues("delck");

		for (int i = 0; i < delck.length; i++) {
			int b_num = Integer.parseInt(delck[i]);
			List<String> img = admin_health_apply_Service.getinfoimg(b_num);
			map.put("b_num", b_num);

			for (int j = 0; j < img.size(); j++) {
				String path = session.getServletContext().getRealPath("/resources/upload/");
				File file = new File(path + "/" + img.get(j));
				file.delete();
			}

			admin_health_apply_Service.imgdel(b_num);
			admin_health_apply_Service.delete(b_num);
		}
		
		return "redirect:/admin/mhealth/apply/applylist";
	}

	// ????????????????????????
	@RequestMapping(value = "/admin/mhealth/apply/applyview", method = RequestMethod.GET)
	public String applyview(@RequestParam("b_num") int b_num, Model model) {
		admin_mhealth_business_Dto dto = admin_health_apply_Service.getinfo(b_num);
		List<String> imglist = admin_health_apply_Service.getinfoimg(b_num);

		String[] img = new String[8];

		for (int i = 0; i < 8; i++) {
			if (imglist.size() > i) {
				img[i] = imglist.get(i);
			} else {
				img[i] = null;
			}
		}

		model.addAttribute("dto", dto);
		model.addAttribute("img", img);

		return ".admin.mhealth.apply.applyview";
	}

	// ???????????????
	@RequestMapping(value = "/admin/mhealth/apply/applyupdate", method = RequestMethod.GET)
	public String applyupdate(@RequestParam("b_num") int b_num, admin_mhealth_business_Dto dto) {
		admin_health_apply_Service.update(dto);
		return "redirect:/admin/mhealth/apply/applylist";
	}
}
