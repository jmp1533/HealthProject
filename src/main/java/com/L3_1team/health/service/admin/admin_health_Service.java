package com.L3_1team.health.service.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.admin.admin_health_Dao;
import com.L3_1team.health.dto.client.menu.Finder_company_Dto;

@Service
public class admin_health_Service {
	@Inject
	admin_health_Dao health_Dao;

	public void setHealth_Dao(admin_health_Dao health_Dao) {
		this.health_Dao = health_Dao;
	}

	public List<Finder_company_Dto> getlist(HashMap<String, Object> map) {
		return health_Dao.getlist(map);
	}

	public Finder_company_Dto search(int b_num) {
		return health_Dao.search(b_num);
	}

	public List<String> img(int b_num) {
		return health_Dao.img(b_num);
	}

	public int getCount(HashMap<String, Object> map) {
		return health_Dao.getCount(map);
	}

	public int delete(int b_num) {
		return health_Dao.delete(b_num);
	}
}
