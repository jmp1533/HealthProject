package com.L3_1team.health.service.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.L3_1team.health.dao.client.menu.Community_freeBorder_Dao;
import com.L3_1team.health.dto.category.commend_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_reple_Dto;
import com.L3_1team.health.interfac.free_trans_inter;

@Service
public class Community_freeBorder_Service implements free_trans_inter {
	@Inject
	private Community_freeBorder_Dao dao;

	public Community_freeBorder_Dao getDao() {
		return dao;
	}

	public void setDao(Community_freeBorder_Dao dao) {
		this.dao = dao;
	}

	public List<Community_border_free_Dto> list(HashMap<String, String> map) {
		return dao.list(map);
	}

	public Community_border_free_Dto prev(int free_num) {// 이전글
		Community_border_free_Dto dto = dao.prev(free_num);
		return dto;
	}

	public Community_border_free_Dto next(int free_num) {// 다음글
		Community_border_free_Dto dto = dao.next(free_num);
		return dto;
	}

	public int getCount(HashMap<String, String> map) {
		return dao.getCount(map);
	}

	public Community_border_free_Dto getinfo(int free_num, int suc) {
		Community_border_free_Dto dto = dao.getinfo(free_num);
		if (suc == 1) {
			dao.addhits(free_num);
		}
		return dto;
	}

	@Override
	public int insert(Community_border_free_Dto dto) {
		return dao.insert(dto);
	}

	public int getCount_reple(int free_num) {
		return dao.getCount_reple(free_num);
	}

	public List<Community_border_free_reple_Dto> reple_list(HashMap<String, Integer> map) {
		return dao.reple_list(map);
	}

	public int reple_insert(Community_border_free_reple_Dto dto) {
		return dao.reple_insert(dto);
	}

	public int commend_insert(HashMap<String, String> map) {
		return dao.commend_insert(map);
	}

	public commend_Dto commend_check(HashMap<String, String> map) {
		return dao.commend_check(map);
	}

	public int update(Community_border_free_Dto dto) {
		return dao.update(dto);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int delete(HashMap<String, String> map) {
		int free_num = Integer.parseInt(map.get("free_num").toString());
		dao.reple_delete(free_num);
		dao.commend_delete(free_num);
		int i = dao.free_delete(map);
		return i;
	}

}
