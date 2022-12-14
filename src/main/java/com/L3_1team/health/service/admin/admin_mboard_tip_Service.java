package com.L3_1team.health.service.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.L3_1team.health.dao.admin.admin_mboard_tip_Dao;
import com.L3_1team.health.dto.category.Health_Category_Dto;
import com.L3_1team.health.dto.category.commend_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_tip_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_tip_reple_Dto;
import com.L3_1team.health.interfac.tip_trans_inter;

@Service
public class admin_mboard_tip_Service implements tip_trans_inter {
	@Inject
	private admin_mboard_tip_Dao dao;

	public admin_mboard_tip_Dao getDao() {
		return dao;
	}

	public void setDao(admin_mboard_tip_Dao dao) {
		this.dao = dao;
	}

	public List<Community_border_tip_Dto> list(HashMap<String, String> map) {
		return dao.list(map);
	}

	public int getCount(HashMap<String, String> map) {
		return dao.getCount(map);
	}

	public Community_border_tip_Dto getinfo(int tip_num) {
		Community_border_tip_Dto dto = dao.getinfo(tip_num);
		return dto;
	}

	public int insert(Community_border_tip_Dto dto) {
		return dao.insert(dto);
	}

	public int update(Community_border_tip_Dto dto) {
		return dao.update(dto);
	}

	public List<Health_Category_Dto> cate() {
		return dao.cate();
	}

	public Community_border_tip_Dto prev(int tip_num) {// 이전글
		Community_border_tip_Dto dto = dao.prev(tip_num);
		return dto;
	}

	public Community_border_tip_Dto next(int tip_num) {// 다음글
		Community_border_tip_Dto dto = dao.next(tip_num);
		return dto;
	}

	public int getCount_reple(int tip_num) {
		return dao.getCount_reple(tip_num);
	}

	public List<Community_border_tip_reple_Dto> reple_list(HashMap<String, Integer> map) {
		return dao.reple_list(map);
	}

	public int reple_insert(Community_border_tip_reple_Dto dto) {
		return dao.reple_insert(dto);
	}

	public int commend_insert(HashMap<String, String> map) {
		return dao.commend_insert(map);
	}

	public int commend_count(int tip_num) {
		return dao.commend_count(tip_num);
	}

	public commend_Dto commend_check(HashMap<String, String> map) {
		return dao.commend_check(map);
	}

	@Transactional
	public int delete(HashMap<String, String> map) {
		int tip_num = Integer.parseInt(map.get("tip_num").toString());
		dao.reple_delete(tip_num);
		dao.commend_delete(tip_num);
		int i = dao.tip_delete(map);
		return i;
	}
}
