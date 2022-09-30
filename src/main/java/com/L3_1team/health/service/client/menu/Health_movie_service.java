package com.L3_1team.health.service.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.client.menu.Health_movie_Dao;
import com.L3_1team.health.dto.category.Health_Category_Dto;
import com.L3_1team.health.dto.client.menu.Health_movie_Dto;

@Service
public class Health_movie_service {
	@Inject
	private Health_movie_Dao myBoardDao;

	public void setMyBoardDao(Health_movie_Dao myBoardDao) {
		this.myBoardDao = myBoardDao;
	}

	public int insert(Health_movie_Dto dto) {
		return myBoardDao.insert(dto);
	}

	public int getCount(HashMap<String, String> map) {
		return myBoardDao.getCount(map);
	}

	public List<Health_movie_Dto> search_list(HashMap<String, String> map) {
		return myBoardDao.search_list(map);
	}

	public List<Health_movie_Dto> cate_list(HashMap<String, Integer> map) {
		return myBoardDao.cate_list(map);
	}

	public Health_movie_Dto view(int num) {
		Health_movie_Dto dto = myBoardDao.view(num);
		myBoardDao.addHit(num);
		return dto;
	}

	public List<Health_Category_Dto> vcate() {
		return myBoardDao.vcate();
	}
	/*
	 * public Health_movie_Dto prev(int num){ Health_movie_Dto
	 * dto=myBoardDao.prev(num); return dto; } public Health_movie_Dto next(int
	 * num){ Health_movie_Dto dto=myBoardDao.next(num); return dto; }
	 */
}
