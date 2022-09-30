package com.L3_1team.health.service.client.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.L3_1team.health.dao.client.menu.Diary_Dao;
import com.L3_1team.health.dto.client.menu.Diary_diary_Dto;
import com.L3_1team.health.dto.client.menu.Diary_diarymenu_Dto;

@Service
public class Diary_Service {
	@Inject
	private Diary_Dao dao;

	public List<Diary_diary_Dto> datelist(HashMap<String, String> map) {
		return dao.Datelist(map);
	}

	public Diary_diary_Dto info(int d_num) {
		return dao.info(d_num);
	}

	public List<Diary_diarymenu_Dto> menu_list(int d_num) {
		return dao.menu_list(d_num);
	}

	@Transactional
	public int insert(Diary_diary_Dto dto, ArrayList<Diary_diarymenu_Dto> list, HashMap<String, String> hashMap) {
		dao.insert(dto);
		int num = dao.num_info(hashMap);
		for (int i = 0; i < list.size(); i++) {
			Diary_diarymenu_Dto menu_dto = list.get(i);
			menu_dto.setD_num(num);
			dao.menu_insert(menu_dto);
		}

		return num;
	}

	@Transactional
	public int delete(int d_num) {
		dao.reple_delete(d_num);
		dao.menu_delete(d_num);
		int i = dao.diary_delete(d_num);
		return i;
	}

	@Transactional
	public int update(Diary_diary_Dto dto, ArrayList<Diary_diarymenu_Dto> list) {
		dao.menu_delete(dto.getD_num());
		int c = dao.diary_update(dto);
		for (int i = 0; i < list.size(); i++) {
			Diary_diarymenu_Dto menu_dto = list.get(i);
			dao.menu_insert(menu_dto);
		}
		return c;
	}

}
