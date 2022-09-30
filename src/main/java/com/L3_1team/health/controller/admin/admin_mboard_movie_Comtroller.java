package com.L3_1team.health.controller.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.category.Health_Category_Dto;
import com.L3_1team.health.dto.client.menu.Health_movie_Dto;
import com.L3_1team.health.service.admin.admin_mboard_movie_Service;

@Controller
public class admin_mboard_movie_Comtroller {
	@Inject
	private admin_mboard_movie_Service service;

	public void setService(admin_mboard_movie_Service service) {
		this.service = service;
	}

	@RequestMapping(value = "/admin/mboard/movie/health_movie_insert", method = RequestMethod.GET)
	public ModelAndView insertForm() {
		ModelAndView mv = new ModelAndView(".admin.mboard.movie.health_movie_insert");
		return mv;
	}

	@RequestMapping(value = "/admin/mboard/movie/health_movie_insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute("movie_dto") Health_movie_Dto movie_dto, Model model,
			HttpServletRequest request, HttpSession session, MultipartFile file1) {

		FileOutputStream fos = null;
		InputStream is = null;
		
		String orgfilename = "";
		String savefilename = "";
		String path = "";
		String link = "";
		String viewReturn = ".admin.mboard.movie.health_movie_insert";
		
		try {
			orgfilename = file1.getOriginalFilename();
			savefilename = UUID.randomUUID() + "_" + orgfilename;
			path = session.getServletContext().getRealPath("/resources/upload");
						
			fos = new FileOutputStream(path + "/" + savefilename);
			is = file1.getInputStream();
			FileCopyUtils.copy(is, fos);

			movie_dto.setAdmin_id("admin");

			link = movie_dto.getV_link().split("\\=")[1];
			
			movie_dto.setV_link("http://www.youtube.com/embed/" + link);
			movie_dto.setV_image(savefilename);

			int n = service.insert(movie_dto);
			if (n > 0) {
				viewReturn = "redirect:/admin/mboard/movie/health_movie_list";
			} else {
				File file = new File(path + "/" + savefilename);
				file.delete();
			}
			
			if (is != null)
				is.close();
			if (fos != null)
				fos.close();			
		} catch (Exception ie) {
		}
		
		return viewReturn;
	}

	@RequestMapping(value = "/admin/mboard/movie/update", method = RequestMethod.GET)
	public ModelAndView updateForm(@RequestParam("v_num") int v_num) {
		ModelAndView mv = new ModelAndView(".admin.mboard.movie.update");
		Health_movie_Dto movie_Dto = service.view(v_num);
		
		mv.addObject("movie_Dto", movie_Dto);
		
		return mv;
	}

	@RequestMapping(value = "/admin/mboard/movie/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("movie_dto") Health_movie_Dto movie_dto, Model model,
			HttpServletRequest request, HttpSession session, MultipartFile file1) {
		
		FileOutputStream fos = null;
		InputStream is = null;
		
		String orgfilename = "";
		String savefilename = "";
		String path = "";
		String link = "";
		String viewReturn = ".admin.mboard.movie.health_movie_insert";
		try {
			orgfilename = file1.getOriginalFilename();
			savefilename = UUID.randomUUID() + "_" + orgfilename;
			path = session.getServletContext().getRealPath("/resources/upload");
			
			fos = new FileOutputStream(path + "/" + savefilename);
			is = file1.getInputStream();
			
			FileCopyUtils.copy(is, fos);
			
			movie_dto.setAdmin_id("admin");

			link = movie_dto.getV_link().split("\\=")[1];

			movie_dto.setV_link("http://www.youtube.com/embed/" + link);
			movie_dto.setV_image(savefilename);
			
			int n = service.update(movie_dto);
			if (n > 0) {
				viewReturn = "redirect:/admin/mboard/movie/health_movie_list";
			} else {
				File file = new File(path + "/" + savefilename);
				file.delete();
			}
			
			if (is != null)
				is.close();
			if (fos != null)
				fos.close();
		} catch (Exception ie) {
		}
		
		return viewReturn;
	}

	@RequestMapping("/admin/mboard/movie/health_movie_view")
	public ModelAndView detail(@RequestParam("num") int num) {
		Health_movie_Dto dto = service.view(num);
		ModelAndView mv = new ModelAndView(".admin.mboard.movie.health_movie_view");
		
		mv.addObject("dto", dto);
		
		return mv;
	}

	@RequestMapping(value = "/admin/mboard/movie/health_movie_list", method = RequestMethod.GET)
	public ModelAndView serach_list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "cateNum", defaultValue = "0") int cateNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword) {
		
		ModelAndView mv = new ModelAndView(".admin.mboard.movie.health_movie_list");
		HashMap<String, String> map = new HashMap<String, String>();
		List<Health_movie_Dto> list = null;
		List<Health_Category_Dto> vcate = null;
		PageUtil pu = null;
		int totalRowCount = 0;
		
		if (field == null && keyword == null) {
			field = "admin_id";
			keyword = "";
		}
		
		map.put("vcate_num", Integer.toString(cateNum));
		map.put("field", field);
		map.put("keyword", keyword);
		
		totalRowCount = service.getCount(map);
		pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		
		map.put("startRow", Integer.toString(pu.getStartRow()));
		map.put("endRow", Integer.toString(pu.getEndRow()));

		list = service.search_list(map);
		vcate = service.vcate();
		
		mv.addObject("list", list);
		mv.addObject("vcate", vcate);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		mv.addObject("pu", pu);
		mv.addObject("cateNum", cateNum);
		
		return mv;
	}

	@RequestMapping(value = "/admin/mboard/movie/delete", method = RequestMethod.POST)
	public String applyupdate(HttpServletRequest request, Model model) {
		String delck[] = request.getParameterValues("delck");

		for (int i = 0; i < delck.length; i++) {
			int v_num = Integer.parseInt(delck[i].toString());
			service.delete(v_num);
		}
		
		return "redirect:/admin/mboard/movie/health_movie_list";
	}
}