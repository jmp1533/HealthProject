package com.L3_1team.health.service.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.admin.admin_health_apply_Dao;
import com.L3_1team.health.dto.admin.admin_mhealth_business_Dto;

@Service
public class admin_health_apply_Service {
	@Inject
	private admin_health_apply_Dao admin_health_apply_Dao;

	public void setAdmin_health_apply_Dao(admin_health_apply_Dao admin_health_apply_Dao) {
		this.admin_health_apply_Dao = admin_health_apply_Dao;
	}

	public int getCount(HashMap<String, Object> map) {
		return admin_health_apply_Dao.getCount(map);
	}

	public List<admin_mhealth_business_Dto> list(HashMap<String, Object> map) {
		return admin_health_apply_Dao.list(map);
	}

	// 검색
	public int search(HashMap<String, Object> map) {
		return admin_health_apply_Dao.search(map);
	}

	// 삭제
	public int delete(int b_num) {
		return admin_health_apply_Dao.delete(b_num);
	}

	public List<String> img(int b_num) {
		return admin_health_apply_Dao.getinfoimg(b_num);
	}

	// 상세보기
	public admin_mhealth_business_Dto getinfo(int b_num) {
		return admin_health_apply_Dao.getinfo(b_num);
	}

	public List<String> getinfoimg(int b_num) {
		return admin_health_apply_Dao.getinfoimg(b_num);
	}

	public int imgdel(int b_num) {
		return admin_health_apply_Dao.imgdel(b_num);
	}

	// 등록
	public int update(admin_mhealth_business_Dto dto) {
		return admin_health_apply_Dao.update(dto);
	}
}
