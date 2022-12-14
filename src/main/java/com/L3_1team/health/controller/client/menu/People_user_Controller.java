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
import com.L3_1team.health.dto.client.menu.People_user_Dto;
import com.L3_1team.health.dto.client.menu.People_user_reple_Dto;
import com.L3_1team.health.service.client.menu.People_user_Service;

@Controller
public class People_user_Controller {
	@Inject
	private People_user_Service userService;

	public void setUser_Service(People_user_Service userService) {
		this.userService = userService;
	}

	// ����Ʈ
	@RequestMapping(value = "/client/menu/people/user/list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum) {
		ModelAndView mv = new ModelAndView(".client.menu.people.user.list");
		int totalRowCount = userService.getCount();
		PageUtil pu = new PageUtil(pageNum, totalRowCount, 9, 10);
		List<People_user_Dto> listall = userService.listall();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());
		List<People_user_Dto> list = userService.list(map);
		mv.addObject("list", list);
		mv.addObject("pu", pu);
		return mv;
	}

	// �󼼱ۺ���
	@RequestMapping(value = "/client/menu/people/user/view", method = RequestMethod.GET)
	public String getinfo(@RequestParam("p_num") int p_num, Model model) {
		People_user_Dto dto = userService.getinfo(p_num);// ��
		People_user_Dto prev = userService.prev(p_num);// ������
		People_user_Dto next = userService.next(p_num);// ������

		int totalRowCount = userService.getCount_reple(p_num);
		PageUtil pu = new PageUtil(1, totalRowCount, 10, 10);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("p_num", p_num);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());

		List<People_user_reple_Dto> list = userService.reple_list(map);
		model.addAttribute("reple", list);
		model.addAttribute("pu", pu);

		model.addAttribute("dto", dto);
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);

		return ".client.menu.people.user.view";
	}

	// �۾��� ��
	@RequestMapping(value = "/client/menu/people/user/write", method = RequestMethod.GET)
	public String insertForm() {

		return ".client.menu.people.user.write";

	}

	@RequestMapping(value = "/client/menu/people/user/write", method = RequestMethod.POST)
	public String insert(@RequestParam(value = "p_sportsdate", defaultValue = "0") String p_sportsdate,
			@RequestParam(value = "p_sportstime1", defaultValue = "0") String p_sportstime1,
			@RequestParam(value = "p_sportstime2", defaultValue = "0") String p_sportstime2,
			@RequestParam(value = "p_title", required = false) String p_title,
			@RequestParam(value = "p_content", required = false) String p_content,
			@RequestParam(value = "p_img", defaultValue = "0") String p_img,
			@RequestParam(value = "addr1", defaultValue = "0") String addr1,
			@RequestParam(value = "addr2", defaultValue = "0") String addr2, HttpSession session) {

		String p_sportstime = p_sportstime1 + p_sportstime2;
		String p_zone = addr1 + addr2;
		String id = (String) session.getAttribute("id");
		People_user_Dto dto = new People_user_Dto(0, id, p_img, p_sportsdate, p_sportstime, p_title, p_content, p_zone,
				0);

		userService.insert(dto);

		return "redirect:/client/menu/people/user/list";
	}

	// �۾���

	// �ۻ����ϱ�
	@RequestMapping("/client/menu/people/user/delete")
	public String delete(@RequestParam("p_num") int p_num) {
		userService.delete(p_num);
		return "redirect:/client/menu/people/user/list";
	}

	// ���� Form
	@RequestMapping(value = "/client/menu/people/user/update", method = RequestMethod.POST)
	public String updateForm(@ModelAttribute("dto") People_user_Dto dto) {

		return ".client.menu.people.user.update";
	}

	// ����
	@RequestMapping(value = "/client/menu/people/user/updates", method = RequestMethod.POST)
	public String update(@RequestParam(value = "p_sportsdate", defaultValue = "0") String p_sportsdate,
			@RequestParam(value = "p_sportstime1", defaultValue = "0") String p_sportstime1,
			@RequestParam(value = "p_sportstime2", defaultValue = "0") String p_sportstime2,
			@RequestParam(value = "p_title", required = false) String p_title,
			@RequestParam(value = "p_content", required = false) String p_content,
			@RequestParam(value = "p_img", defaultValue = "0") String p_img,
			@RequestParam(value = "addr1", defaultValue = "0") String addr1,
			@RequestParam(value = "addr2", defaultValue = "0") String addr2,
			@RequestParam(value = "p_num", defaultValue = "0") int p_num, HttpSession session) {
		String p_sportstime = p_sportstime1 + p_sportstime2;
		String p_zone = addr1 + addr2;
		String id = (String) session.getAttribute("id");
		People_user_Dto dto = new People_user_Dto(p_num, id, p_img, p_sportsdate, p_sportstime, p_title, p_content,
				p_zone, 0);

		userService.update(dto);
		return "redirect:/client/menu/people/user/list";
	}

	// ���� ��
	@RequestMapping(value = "/client/menu/peple/user/reple", method = RequestMethod.GET)
	@ResponseBody
	public String prepleview(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "pnum", defaultValue = "1") int pnum) {

		int totalRowCount = userService.getCount_reple(pnum);

		PageUtil pu = new PageUtil(pageNum, totalRowCount, 10, 10);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("p_num", pnum);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());
		List<People_user_reple_Dto> list = userService.reple_list(map);

		JSONArray ob_list = new JSONArray();
		JSONObject ob_pu = new JSONObject();
		for (People_user_reple_Dto vo : list) {
			JSONObject ob = new JSONObject();
			ob.put("pr_num", vo.getPr_num());
			ob.put("id", vo.getId());
			ob.put("pr_content", vo.getPr_content());
			ob.put("pr_date", vo.getPr_date().toString());
			ob_list.add(ob);
		}
		return ob_list.toString();

	}

//���� insert
	@RequestMapping(value = "/client/menu/peple/user/reple", method = RequestMethod.POST)
	public String p_review(@RequestParam(value = "content") String content, @RequestParam(value = "p_num") int p_num,
			@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, HttpSession session) {
		String id = (String) session.getAttribute("id");
		People_user_reple_Dto dto = new People_user_reple_Dto(0, p_num, id, content, null);
		int suc = userService.reple_insert(dto);

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

		return "redirect:/client/menu/people/user/view?p_num=" + p_num;

	}
	// ����¡ó��

}
