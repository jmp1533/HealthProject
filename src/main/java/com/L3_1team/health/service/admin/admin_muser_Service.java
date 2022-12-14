package com.L3_1team.health.service.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.admin.admin_muser_Dao;
import com.L3_1team.health.dto.admin.admin_muser_list_Dto;
import com.L3_1team.health.dto.admin.admin_trainerslog_Dto;
import com.L3_1team.health.dto.admin.admin_userslog_Dto;

@Service
public class admin_muser_Service {
	@Inject
	private admin_muser_Dao muser_list_Dao;

	public void setMuser_list_Dao(admin_muser_Dao muser_list_Dao) {
		this.muser_list_Dao = muser_list_Dao;
	}

	// 회원목록
	public List<admin_muser_list_Dto> listall() {
		return muser_list_Dao.listall();
	}

	public List<admin_muser_list_Dto> list(HashMap<String, String> map) {
		return muser_list_Dao.list(map);
	}

	public int getCount() {
		return muser_list_Dao.getCount();
	}

	// 검색
	public int search(HashMap<String, Object> map) {
		return muser_list_Dao.search(map);
	}

	// 회원상세보기
	public admin_muser_list_Dto getinfo(String u_id) {
		return muser_list_Dao.getinfo(u_id);
	}

	// 탈퇴처리
	public int out(String u_id) {
		return muser_list_Dao.out(u_id);
	}

	// userlog
	public List<admin_userslog_Dto> recordlist(HashMap<String, Object> map) {
		return muser_list_Dao.recordlist(map);
	}

	public int recordCount() {
		return muser_list_Dao.recordCount();
	}

	public int logsearch(HashMap<String, Object> map) {
		return muser_list_Dao.logsearch(map);
	}
}
