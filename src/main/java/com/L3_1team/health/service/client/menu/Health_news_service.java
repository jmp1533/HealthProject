package com.L3_1team.health.service.client.menu;

import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.client.menu.Health_news_Dao;
import com.L3_1team.health.dto.client.menu.Health_news_Dto;

@Service
public class Health_news_service {
	@Inject
	private Health_news_Dao dao;

	public void setDao(Health_news_Dao dao) {
		this.dao = dao;
	}

	public ArrayList<Health_news_Dto> list(int pageNum, String serach) {
		return dao.list(pageNum, serach);
	}
}
