package com.L3_1team.health.controller.client.menu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.L3_1team.health.dto.client.menu.Diary_diary_Dto;
import com.L3_1team.health.dto.client.menu.Diary_diarymenu_Dto;
import com.L3_1team.health.service.client.menu.Diary_Service;

@Controller
public class diary_date_Controller {
	@Inject
	private Diary_Service service;

	@RequestMapping(value = "/client/menu/diary/date", method = RequestMethod.GET)
	public ModelAndView date(@RequestParam(value = "month", defaultValue = "-4") int month,
			@RequestParam(value = "year", defaultValue = "0") int year, HttpSession session) {
		ModelAndView mv = new ModelAndView(".client.menu.diary.date");

		Calendar c = Calendar.getInstance();
		int w, i, ld, d, t, today_year, to_month;

		t = c.get((Calendar.DAY_OF_MONTH));
		today_year = c.get(Calendar.YEAR);
		to_month = c.get(Calendar.MONTH);
		if (month != -4) {
			if (month < 0) {
				month = 11;
				year--;
			} else if (month > 11) {
				year++;
				month = 0;
			}
		} else {
			month = c.get(Calendar.MONTH);
			year = c.get(Calendar.YEAR);
		}

		String id = (String) session.getAttribute("id");
		String startday2;
		String endday2;

		c.set(year, month, 1);
		d = c.getActualMaximum(Calendar.DATE);
		if (month >= 9) {
			startday2 = year + "" + Integer.toString(month + 1) + "01";
			endday2 = year + "" + Integer.toString(month + 1) + d;
		} else {
			startday2 = year + "" + 0 + Integer.toString(month + 1) + "01";
			endday2 = year + "" + 0 + Integer.toString(month + 1) + d;
		}

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("startday2", startday2);
		map.put("endday2", endday2);
		map.put("id", id);

		List<Diary_diary_Dto> list2 = service.datelist(map);

		ArrayList<Diary_diary_Dto> list3 = new ArrayList<Diary_diary_Dto>();

		w = c.get(Calendar.DAY_OF_WEEK);
		ld = c.getActualMaximum(Calendar.DATE);

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		for (i = 1; i < w; i++) {

			list.add(0);
		}
		for (i = 1; i <= d; i++) {
			boolean tf = false;
			w++;
			list.add(i);
			for (int z = 0; z < list2.size(); z++) {
				if (i - 1 == list2.get(z).getD_date().getDate()) {
					tf = true;
					list3.add(list2.get(z));
				}
			}
			if (!tf) {
				list3.add(null);
			}
		}
		mv.addObject("list", list3);
		mv.addObject("month", month);
		mv.addObject("year", year);
		mv.addObject("today", t);
		mv.addObject("tomonth", to_month);
		mv.addObject("toyear", today_year);
		mv.addObject("date", list);
		return mv;
	}

	@RequestMapping(value = "/client/menu/diary/view", method = RequestMethod.GET)
	public ModelAndView view(@RequestParam(value = "d_num", defaultValue = "no") int d_num) {

		ModelAndView mv = new ModelAndView(".client.menu.diary.view");
		Diary_diary_Dto dto = service.info(d_num);
		List<Diary_diarymenu_Dto> list2 = service.menu_list(d_num);
		mv.addObject("diary", dto);
		mv.addObject("list", list2);
		return mv;
	}

	@RequestMapping(value = "/client/menu/diary/writer", method = RequestMethod.GET)
	public ModelAndView writer(@RequestParam(value = "year") int year, @RequestParam(value = "month") int month,
			@RequestParam(value = "day") int day) {
		if (month < 10) {

		}
		String smonth = month + "";
		String sday = day + "";
		if (month < 10) {
			smonth = "0" + month;
		}
		if (day < 10) {
			sday = "0" + day;
		}
		String date = year + "" + smonth + "" + sday;

		ModelAndView mv = new ModelAndView(".client.menu.diary.writerform");
		mv.addObject("date", date);
		return mv;
	}

	@RequestMapping(value = "/client/menu/diary/writer", method = RequestMethod.POST)
	public ModelAndView insert(@RequestParam(value = "d_date") String date,
			@RequestParam(value = "d_title", defaultValue = "0") String title,
			@RequestParam(value = "d_content", defaultValue = "0") String content,
			@RequestParam(value = "dm_time", required = false) String dm_time[],
			@RequestParam(value = "dm_img", required = false) String dm_img[],
			@RequestParam(value = "calorie", defaultValue = "0") int calorie[],
			@RequestParam(value = "fat", defaultValue = "0") int fat[],
			@RequestParam(value = "cardohydrate", defaultValue = "0") int cardohydrate[],
			@RequestParam(value = "cholesterol", defaultValue = "0") int cholesterol[],
			@RequestParam(value = "protein", defaultValue = "0") int protein[], HttpSession session) {
		String id = (String) session.getAttribute("id");

		ModelAndView mv = new ModelAndView("redirect:/client/menu/diary/date");
		ArrayList<Diary_diarymenu_Dto> menulist = new ArrayList<Diary_diarymenu_Dto>();
		if (dm_time != null) {
			for (int i = 0; i < dm_time.length; i++) {
				menulist.add(new Diary_diarymenu_Dto(0, 0, dm_time[i], dm_img[i], calorie[i], fat[i], cardohydrate[i],
						cholesterol[i], protein[i]));
			}
		}
		Diary_diary_Dto dto = new Diary_diary_Dto(0, id, title, content, null);
		dto.setD(date);
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("logid", id);
		hashMap.put("date", date);
		service.insert(dto, menulist, hashMap);
		return mv;
	}

	@RequestMapping(value = "/client/menu/diary/delete", method = RequestMethod.GET)
	public String delete(@RequestParam(value = "d_num") int d_num) {

		service.delete(d_num);

		return "redirect:/client/menu/diary/date";
	}

	@RequestMapping(value = "/client/menu/diary/update", method = RequestMethod.GET)
	public ModelAndView updateform(@RequestParam(value = "d_num", required = false) int d_num) {

		ModelAndView mv = new ModelAndView(".client.menu.diary.updateform");

		Diary_diary_Dto dto = service.info(d_num);
		List<Diary_diarymenu_Dto> list2 = service.menu_list(d_num);

		mv.addObject("diary", dto);
		mv.addObject("list", list2);

		return mv;
	}

	@RequestMapping(value = "/client/menu/diary/update", method = RequestMethod.POST)
	public ModelAndView update(@RequestParam(value = "d_num") int d_num,
			@RequestParam(value = "d_title", defaultValue = "0") String title,
			@RequestParam(value = "d_content", defaultValue = "0") String content,
			@RequestParam(value = "dm_time", required = false) String dm_time[],
			@RequestParam(value = "dm_img", defaultValue = "0") String dm_img[],
			@RequestParam(value = "calorie", defaultValue = "0") int calorie[],
			@RequestParam(value = "fat", defaultValue = "0") int fat[],
			@RequestParam(value = "cardohydrate", defaultValue = "0") int cardohydrate[],
			@RequestParam(value = "cholesterol", defaultValue = "0") int cholesterol[],
			@RequestParam(value = "protein", defaultValue = "0") int protein[], HttpSession session) {
		String id = (String) session.getAttribute("id");

		ModelAndView mv = new ModelAndView("redirect:/client/menu/diary/date");
		ArrayList<Diary_diarymenu_Dto> menulist = new ArrayList<Diary_diarymenu_Dto>();
		if (dm_time != null) {
			for (int i = 0; i < dm_time.length; i++) {
				menulist.add(new Diary_diarymenu_Dto(0, d_num, dm_time[i], dm_img[i], calorie[i], fat[i],
						cardohydrate[i], cholesterol[i], protein[i]));
			}
		}

		Diary_diary_Dto dto = new Diary_diary_Dto(d_num, id, title, content, null);
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("logid", id);
		service.update(dto, menulist);
		return mv;
	}

}
