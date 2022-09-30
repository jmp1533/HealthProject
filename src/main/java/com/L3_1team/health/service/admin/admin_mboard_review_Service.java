package com.L3_1team.health.service.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.L3_1team.health.dao.admin.admin_mboard_review_Dao;
import com.L3_1team.health.dao.client.menu.ReviewDao;
import com.L3_1team.health.dto.category.commend_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_reple_Dto;
import com.L3_1team.health.dto.client.menu.ReviewDto;
import com.L3_1team.health.dto.client.menu.Review_reple_Dto;

@Service
public class admin_mboard_review_Service {
	@Inject
	private admin_mboard_review_Dao dao;

	public admin_mboard_review_Dao getDao() {
		return dao;
	}

	public void setDao(admin_mboard_review_Dao dao) {
		this.dao = dao;
	}

	public int insert(ReviewDto dto) {
		return dao.insert(dto);
	}

	public int getCount(HashMap<String, String> map) {
		return dao.getCount(map);
	}

	public List<ReviewDto> list(HashMap<String, String> map) {
		return dao.list(map);
	}

	public ReviewDto contentView(int r_num) {
		return dao.getInfo(r_num);
	}

	public ReviewDto prev(int r_num) {
		ReviewDto dto = dao.prev(r_num);
		return dto;
	}

	public ReviewDto next(int r_num) {
		ReviewDto dto = dao.next(r_num);
		return dto;
	}

	public int getCount_reple(int r_num) {
		return dao.getCount_reple(r_num);
	}

	public List<Review_reple_Dto> reple_list(HashMap<String, Integer> map) {
		return dao.reple_list(map);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public int delete(HashMap<String, String> map) {
		int r_num = Integer.parseInt(map.get("r_num").toString());
		dao.reple_delete(r_num);
		dao.commend_delete(r_num);
		int i = dao.r_delete(map);
		return i;
	}
}
