package com.L3_1team.health.service.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.L3_1team.health.dao.client.menu.ReviewDao;
import com.L3_1team.health.dto.category.commend_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_reple_Dto;
import com.L3_1team.health.dto.client.menu.ReviewDto;
import com.L3_1team.health.dto.client.menu.Review_reple_Dto;

@Service
public class ReviewService {
	@Inject
	private ReviewDao reviewDao;

	public int insert(ReviewDto dto) {
		return reviewDao.insert(dto);
	}

	public int update(ReviewDto dto) {
		return reviewDao.update(dto);
	}

	public int getCount(HashMap<String, String> map) {
		return reviewDao.getCount(map);
	}

	public List<ReviewDto> list(HashMap<String, String> map) {
		return reviewDao.list(map);
	}

	public ReviewDto contentView(int r_num) {
		reviewDao.addHit(r_num);
		return reviewDao.getInfo(r_num);
	}

	public ReviewDto prev(int r_num) {
		ReviewDto dto = reviewDao.prev(r_num);
		return dto;
	}

	public ReviewDto next(int r_num) {
		ReviewDto dto = reviewDao.next(r_num);
		return dto;
	}

	public int getCount_reple(int r_num) {
		return reviewDao.getCount_reple(r_num);
	}

	public List<Review_reple_Dto> reple_list(HashMap<String, Integer> map) {
		return reviewDao.reple_list(map);
	}

	public int reple_insert(Review_reple_Dto dto) {
		return reviewDao.reple_insert(dto);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public int delete(HashMap<String, String> map) {
		int r_num = Integer.parseInt(map.get("r_num").toString());
		reviewDao.reple_delete(r_num);
		reviewDao.commend_delete(r_num);
		int i = reviewDao.r_delete(map);
		return i;
	}

	public int commend_insert(HashMap<String, String> map) {
		return reviewDao.commend_insert(map);
	}

	public commend_Dto commend_check(HashMap<String, String> map) {
		return reviewDao.commend_check(map);
	}
}
