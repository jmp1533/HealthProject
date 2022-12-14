package com.L3_1team.health.controller.admin;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.L3_1team.health.service.admin.admin_mstatistics_Service;

@Controller
public class admin_mstatistics_Controller {
	@Inject
	admin_mstatistics_Service service;

	public void setService(admin_mstatistics_Service service) {
		this.service = service;
	}

	@RequestMapping(value = "/admin/mstatistics/user/age", method = RequestMethod.GET)
	public String userview(Model model) {
		
		Calendar calendar = Calendar.getInstance();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 유저 성별
		int man = service.gender(1);
		int woman = service.gender(2);

		model.addAttribute("total", man + woman);
		model.addAttribute("man", man);
		model.addAttribute("woman", woman);

		// 유저 나이		
		for (int i = 0; i < 8; i++) {
			int age1 = calendar.get(Calendar.YEAR) - 9 - (i * 10);
			int age2 = calendar.get(Calendar.YEAR) - 18 - (i * 10);

			map.put("age1", age1 * 10000 + 9999);
			map.put("age2", age2 * 10000);

			int age = service.age(map);
			
			list.add(age);
		}

		model.addAttribute("list", list);
		// String y = String.valueOf(calendar.get(Calendar.YEAR));
		// int year = Integer.parseInt(y.substring(0, 3));
		/*
		 * 10대 05~96 20대 95~86 30대 85~76 40대 75~66 50대 65~56 60대 55~46 70대 45~36
		 */
		return ".admin.mstatistics.user.age";
	}

	@RequestMapping(value = "/admin/mstatistics/trainer/age", method = RequestMethod.GET)
	public String trainerview(Model model) {
		Calendar calendar = Calendar.getInstance();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 트레이너 성별
		int man = service.trainergender(1);
		int woman = service.trainergender(2);

		model.addAttribute("total", man + woman);
		model.addAttribute("man", man);
		model.addAttribute("woman", woman);

		// 트레이너 나이		
		for (int i = 0; i < 8; i++) {
			int age1 = calendar.get(Calendar.YEAR) - 9 - (i * 10);
			int age2 = calendar.get(Calendar.YEAR) - 18 - (i * 10);

			map.put("age1", age1 * 10000 + 9999);
			map.put("age2", age2 * 10000);

			int age = service.trainerage(map);
			list.add(age);
		}

		model.addAttribute("list", list);
		
		return ".admin.mstatistics.trainer.age";
	}

	@RequestMapping(value = "/admin/mstatistics/all/all", method = RequestMethod.GET)
	public String allview(Model model) {
		Calendar calendar = Calendar.getInstance();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> outlist = new ArrayList<Integer>();
		String[] out_reason = { "개인정보 변경으로 인한 재가입", "자주 이용하지 않음", "찾고자 하는 정보가 없음", "타 사이트의 유사서비스 이용", "속도가 느림",
				"개인정보/사생활 침해 사례 경험", "기타" };
		
		// 전체 성별
		int man = service.trainergender(1) + service.gender(1);
		int woman = service.trainergender(2) + service.gender(2);

		model.addAttribute("total", man + woman);
		model.addAttribute("man", man);
		model.addAttribute("woman", woman);

		// 전체 나이		
		for (int i = 0; i < 8; i++) {
			int age1 = calendar.get(Calendar.YEAR) - 9 - (i * 10);
			int age2 = calendar.get(Calendar.YEAR) - 18 - (i * 10);

			map.put("age1", age1 * 10000 + 9999);
			map.put("age2", age2 * 10000);

			int age = service.trainerage(map) + service.age(map);
			list.add(age);
		}
		
		model.addAttribute("list", list);
		
		for (int i = 0; i < 7; i++) {
			int out = service.out(out_reason[i]);
			outlist.add(out);
		}
		
		model.addAttribute("outlist", outlist);

		return ".admin.mstatistics.all.all";
	}
}
