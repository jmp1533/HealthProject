package com.L3_1team.health.service.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.client.menu.People_traner_Dao;
import com.L3_1team.health.dto.client.menu.People_traner_Dto;

@Service
public class People_traner_Service {
	@Inject
	private People_traner_Dao tranerDao;

	public void setTranerDao(People_traner_Dao tranerDao) {
		this.tranerDao = tranerDao;
	}

	public List<People_traner_Dto> listall() {
		return tranerDao.listall();
	}

	public People_traner_Dto getinfo(String id) {
		return tranerDao.getinfo(id);
	}

	public int getCount(HashMap<String, Integer> map) {
		return tranerDao.getCount(map);
	}

	public List<People_traner_Dto> list(HashMap<String, Integer> map) {
		return tranerDao.list(map);
	}

	public int joincount(String u_id) {
		return tranerDao.joincount(u_id);
	}

	public int joinsearch(HashMap<String, String> map) {
		return tranerDao.joinsearch(map);
	}

	public int joininsert(HashMap<String, String> map) {
		return tranerDao.joininsert(map);
	}

	public int joindelete(String u_id) {
		return tranerDao.joindelete(u_id);
	}

	public int managecount(String u_id) {
		return tranerDao.managecount(u_id);
	}
}
