package com.L3_1team.health.service.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.L3_1team.health.dao.client.menu.Join_Dao;
import com.L3_1team.health.dto.client.menu.management_Dto;
import com.L3_1team.health.dto.client.menu.userinfo_Dto;
import com.L3_1team.health.dto.client.user.UserDto;

@Service
public class Join_Service {
	@Inject
	Join_Dao dao;

	public void setDao(Join_Dao dao) {
		this.dao = dao;
	}

	public int getCount(HashMap<String, Object> map) {
		return dao.getCount(map);
	}

	public List<management_Dto> list(HashMap<String, Object> map) {
		return dao.list(map);
	}

	public UserDto search(String u_id) {
		return dao.search(u_id);
	}

	public int delete(String u_id) {
		return dao.delete(u_id);
	}

	public userinfo_Dto userinfo(String u_id) {
		return dao.userinfo(u_id);
	}

	public int applyCount(HashMap<String, Object> map) {
		return dao.applyCount(map);
	}

	public List<management_Dto> applylist(HashMap<String, Object> map) {
		return dao.applylist(map);
	}

	@Transactional
	public int joindelete(HashMap<String, String> map) {
		dao.joindelete(map.get("u_id"));
		int n = dao.minsert(map);
		return n;
	}
}
