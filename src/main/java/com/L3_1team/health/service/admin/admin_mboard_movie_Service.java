package com.L3_1team.health.service.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.admin.admin_mboard_movie_Dao;
import com.L3_1team.health.dto.category.Health_Category_Dto;
import com.L3_1team.health.dto.client.menu.Health_movie_Dto;

@Service
public class admin_mboard_movie_Service {
	@Inject
	private admin_mboard_movie_Dao dao;

	public void setDao(admin_mboard_movie_Dao dao) {
		this.dao = dao;
	}

	public int insert(Health_movie_Dto dto) {
		return dao.insert(dto);
	}

	public int update(Health_movie_Dto dto) {
		return dao.update(dto);
	}

	public int getCount(HashMap<String, String> map) {
		return dao.getCount(map);
	}

	public List<Health_movie_Dto> search_list(HashMap<String, String> map) {
		return dao.search_list(map);
	}

	public List<Health_movie_Dto> cate_list(HashMap<String, Integer> map) {
		return dao.cate_list(map);
	}

	public Health_movie_Dto view(int num) {
		Health_movie_Dto dto = dao.view(num);
		return dto;
	}

	public List<Health_Category_Dto> vcate() {
		return dao.vcate();
	}

	public int delete(int v_num) {
		return dao.delete(v_num);
	}
	/*
	 * public Health_movie_Dto prev(int num){ Health_movie_Dto
	 * dto=myBoardDao.prev(num); return dto; } public Health_movie_Dto next(int
	 * num){ Health_movie_Dto dto=myBoardDao.next(num); return dto; }
	 */
}
