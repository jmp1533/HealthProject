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

import com.L3_1team.health.dto.client.menu.Diary_chart_Dto;
import com.L3_1team.health.dto.client.menu.Diary_diary_Dto;
import com.L3_1team.health.dto.client.menu.Diary_diarymenu_Dto;
import com.L3_1team.health.service.client.menu.Diary_Service;
import com.L3_1team.health.service.client.menu.Diary_chart_Service;

@Controller
public class diary_chart_Controller {
	@Inject
	private Diary_chart_Service service;

	public Diary_chart_Service getService() {
		return service;
	}

	public void setService(Diary_chart_Service service) {
		this.service = service;
	}

	@RequestMapping(value = "/client/menu/diary/chart", method = RequestMethod.GET)
	public ModelAndView charts(@RequestParam(value = "month", defaultValue = "-4") int month,
			@RequestParam(value = "year", defaultValue = "0") int year, HttpSession session) {
		ModelAndView mv = new ModelAndView(".client.menu.diary.chart.chart");
		Calendar c = Calendar.getInstance();
		int i, ld, d, t, today_year, to_month;

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

		List<Diary_chart_Dto> list = service.list(map);
		Diary_diarymenu_Dto food_chart = service.food_chart(map);

		c.set(year, month, 1);
		int wight = service.wight(id);
		mv.addObject("wight", wight);
		mv.addObject("list", list);
		mv.addObject("month", month);
		mv.addObject("year", year);
		mv.addObject("d", d);
		mv.addObject("type", "day");
		mv.addObject("food_chart", food_chart);
		return mv;
	}

	@RequestMapping(value = "/client/menu/diary/chart/month", method = RequestMethod.GET)
	public ModelAndView charts_yrar(@RequestParam(value = "year", defaultValue = "0") int year, HttpSession session) {
		ModelAndView mv = new ModelAndView(".client.menu.diary.chart.chart_year");
		Calendar c = Calendar.getInstance();
		int i, ld, d, t, today_year, to_month;
		if (year == 0) {
			year = c.get(Calendar.YEAR);
		}
		String id = (String) session.getAttribute("id");
		String startday2;
		String endday2;
		d = c.getActualMaximum(Calendar.DATE);
		startday2 = year + "0101";
		endday2 = year + "1234";
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("startday2", startday2);
		map.put("endday2", endday2);
		map.put("id", id);

		List<Diary_chart_Dto> list = service.list(map);

		mv.addObject("list", list);
		mv.addObject("year", year);

		return mv;
	}

	@RequestMapping(value = "/client/menu/diary/chart_traner", method = RequestMethod.GET)
	public ModelAndView c_list() {
		ModelAndView mv = new ModelAndView(".client.menu.diary.chart.traner_member");

		return mv;
	}

}
