package com.L3_1team.health.controller.client.menu;

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
import com.L3_1team.health.dto.category.commend_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_reple_Dto;
import com.L3_1team.health.dto.client.menu.ReviewDto;
import com.L3_1team.health.dto.client.menu.Review_reple_Dto;
import com.L3_1team.health.service.client.menu.ReviewService;

@Controller
public class ReviewController {
	@Inject
	private ReviewService reviewService;

	public ReviewService getService() {
		return reviewService;
	}

	public void setReviewSerview(ReviewService reviewService) {
		this.reviewService = reviewService;
	}

	@RequestMapping(value = "/client/menu/insert/comunity/border/Review/list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "keyword", required = false) String keyword) {
		ModelAndView mv = new ModelAndView(".client.menu.comunity.border.Review.list");
		if (field == null && keyword == null) {
			field = "id";
			keyword = "";
		}
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("field", field);
		map.put("keyword", keyword);
		int totalRowCount = reviewService.getCount(map);
		PageUtil pu = new PageUtil(pageNum, totalRowCount, 10, 10);

		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("startRow", Integer.toString(pu.getStartRow()));
		map1.put("endRow", Integer.toString(pu.getEndRow()));
		map1.put("field", field);
		map1.put("keyword", keyword);

		List<ReviewDto> list = reviewService.list(map1);

		mv.addObject("list", list);
		mv.addObject("pu", pu);
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		return mv;
	}

	@RequestMapping(value = "/client/menu/insert/comunity/border/Review/view", method = RequestMethod.GET)
	public ModelAndView contentView(@RequestParam("r_num") int r_num) {
		ModelAndView mv = new ModelAndView(".client.menu.comunity.border.Review.view");
		ReviewDto dto = reviewService.contentView(r_num);
		ReviewDto prev = reviewService.prev(r_num);
		ReviewDto next = reviewService.next(r_num);

		mv.addObject("dto", dto);
		mv.addObject("prev", prev);
		mv.addObject("next", next);

		int totalRowCount = reviewService.getCount_reple(r_num);
		PageUtil pu = new PageUtil(1, totalRowCount, 5, 5);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("r_num", r_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());

		List<Review_reple_Dto> list = reviewService.reple_list(map);
		mv.addObject("reple", list);
		mv.addObject("pu", pu);
		return mv;
	}

	@RequestMapping(value = "/client/menu/insert/comunity/border/Review/write", method = RequestMethod.GET)
	public String insertForm() {
		return ".client.menu.comunity.border.Review.write";
	}

	@RequestMapping(value = "/client/menu/insert/comunity/border/Review/write", method = RequestMethod.POST)
	public ModelAndView insert(@RequestParam(value = "r_title", defaultValue = "0") String r_title,
			@RequestParam(value = "r_content", defaultValue = "0") String r_content,
			@RequestParam(value = "r_before_img", defaultValue = "0") String r_before_img,
			@RequestParam(value = "r_after_img", defaultValue = "0") String r_after_img, HttpSession session) {
		String id = (String) session.getAttribute("id");
		ModelAndView mv = new ModelAndView("redirect:/client/menu/insert/comunity/border/Review/list");
		ReviewDto dto = new ReviewDto(0, id, r_title, null, r_before_img, r_after_img, r_content, 0, 0);
		reviewService.insert(dto);
		return mv;
	}

	@RequestMapping(value = "/client/menu/insert/comunity/border/Review/delete", method = RequestMethod.GET)
	public String review_delete(@RequestParam(value = "r_num") int r_num, HttpSession session) {
		try {
			String id = (String) session.getAttribute("id");
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("r_num", Integer.toString(r_num));
			map.put("id", id);
			reviewService.delete(map);
			return "redirect:/client/menu/insert/comunity/border/Review/list";
		} catch (Exception e) {
			return "redirect:/client/menu/insert/comunity/border/Review/list";
		}
	}

	// �����Խ��� updatefom
	@RequestMapping(value = "/client/menu/insert/comunity/border/Review/updateform", method = RequestMethod.POST)
	@ModelAttribute("dto")
	public ModelAndView review_updatefrom(@ModelAttribute("dto") ReviewDto dto) {
		ModelAndView mv = new ModelAndView(".client.menu.comunity.border.Review.updateform");

		return mv;
	}

	// �����Խ��� update
	@RequestMapping(value = "/client/menu/insert/comunity/border/Review/update", method = RequestMethod.POST)
	public String review_update(ReviewDto dto) {
		reviewService.update(dto);

		return "redirect:/client/menu/insert/comunity/border/Review/view?r_num=" + dto.getR_num();
	}

	// ���� ��
	@RequestMapping(value = "/client/menu/insert/comunity/border/Review/Reples", method = RequestMethod.GET)
	@ResponseBody
	public String repleview(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "r_num", defaultValue = "1") int r_num) {
		int totalRowCount = reviewService.getCount_reple(r_num);
		PageUtil pu = new PageUtil(pageNum, totalRowCount, 5, 5);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("r_num", r_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());
		List<Review_reple_Dto> list = reviewService.reple_list(map);

		JSONArray ob_list = new JSONArray();
		JSONObject ob_pu = new JSONObject();
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

	// ���� insert
	@RequestMapping(value = "/client/menu/insert/comunity/border/Review/Reple", method = RequestMethod.POST)
	public String review(@RequestParam(value = "content") String content, @RequestParam(value = "r_num") int r_num,
			@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, HttpSession session) {
		String id = (String) session.getAttribute("id");
		Review_reple_Dto dto = new Review_reple_Dto(0, r_num, id, content, null);
		int suc = reviewService.reple_insert(dto);

		/*
		 * int totalRowCount=service.getCount_reple(free_num); PageUtil pu=new
		 * PageUtil(pageNum,totalRowCount,10,10); HashMap<String, Integer> map=new
		 * HashMap<String, Integer>(); map.put("free_num",free_num);
		 * map.put("startRow",pu.getStartRow()); map.put("endRow", pu.getEndRow());
		 * 
		 * List<Community_border_free_reple_Dto> list2=service.reple_list(map);
		 * 
		 * JSONArray ob_list =new JSONArray();
		 * 
		 * for(Community_border_free_reple_Dto vo:list2){ JSONObject ob=new
		 * JSONObject(); ob.put("fr_num",vo.getFr_num()); ob.put("id",vo.getId());
		 * ob.put("fr_content",vo.getFr_content());
		 * ob.put("fr_date",vo.getFr_date().toString()); ob_list.add(ob); }
		 * 
		 * 
		 * return ob_list.toString();
		 */

		return "redirect:/client/menu/insert/comunity/border/Review/view?r_num=" + r_num;

	}

	@RequestMapping(value = "/client/menu/insert/comunity/border/Review/commend", method = RequestMethod.GET)
	public ModelAndView commend(@RequestParam(value = "r_num") int r_num, HttpSession session) {
		ModelAndView mv = new ModelAndView("redirect:/client/menu/insert/comunity/border/Review/view?r_num=" + r_num);
		String id = (String) session.getAttribute("id");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("r_num", Integer.toString(r_num));
		commend_Dto dto = reviewService.commend_check(map);
		if (dto != null) {
			mv.addObject("check", "��õ�̹� �ϼ̱���");
		} else {
			reviewService.commend_insert(map);
			mv.addObject("check", "��õ����!");
		}
		return mv;
	}
}
