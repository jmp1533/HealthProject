package com.L3_1team.health.service.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.client.menu.Finder_company_Dao;
import com.L3_1team.health.dto.client.menu.Finder_company_Dto;

@Service
public class Finder_company_Service {
	@Inject
	Finder_company_Dao company_Dao;

	public void setCompany_Dao(Finder_company_Dao company_Dao) {
		this.company_Dao = company_Dao;
	}

	public List<Finder_company_Dto> getlist(HashMap<String, Object> map) {
		return company_Dao.getlist(map);
	}

	public Finder_company_Dto search(int b_num) {
		return company_Dao.search(b_num);
	}

	public List<String> img(int b_num) {
		return company_Dao.img(b_num);
	}

	public int getCount(HashMap<String, Object> map) {
		return company_Dao.getCount(map);
	}
}
