package com.L3_1team.health.service.client.menu;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.L3_1team.health.dao.client.menu.Mypage_user_Dao;
import com.L3_1team.health.dto.client.menu.Mypage_management_Dto;
import com.L3_1team.health.dto.client.user.Mypage_outDto;
import com.L3_1team.health.dto.client.user.UserDto;

@Service
public class Mypage_user_Service {
	@Inject
	Mypage_user_Dao user_Dao;

	public void setUser_Dao(Mypage_user_Dao user_Dao) {
		this.user_Dao = user_Dao;
	}

	public UserDto search(HashMap<String, String> map) {
		return user_Dao.search(map);
	}

	public int search1(HashMap<String, String> map) {
		return user_Dao.search1(map);
	}

	public int update(UserDto userDto) {
		return user_Dao.update(userDto);
	}

	// È¸¿øÅ»Åð
	@Transactional
	public int out(Mypage_outDto outDto, String u_id) {
		user_Dao.out(u_id);
		int n = user_Dao.outreason(outDto);
		return n;
	}

	public UserDto getinfo(String u_id) {
		return user_Dao.getinfo(u_id);
	}

	public Mypage_management_Dto mytrainer(String u_id) {
		return user_Dao.mytrainer(u_id);
	}
}
