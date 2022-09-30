package com.L3_1team.health.service.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.admin.admin_mtrainer_Dao;
import com.L3_1team.health.dto.admin.admin_trainerslog_Dto;
import com.L3_1team.health.dto.client.menu.People_traner_Dto;

@Service
public class admin_mtrainer_Service {
	@Inject
	private admin_mtrainer_Dao mtrainer_Dao;

	public void setMtrainer_Dao(admin_mtrainer_Dao mtrainer_Dao) {
		this.mtrainer_Dao = mtrainer_Dao;
	}

	public List<People_traner_Dto> listall(int t_condition) {
		return mtrainer_Dao.listall(t_condition);
	}

	public People_traner_Dto getinfo(String id) {
		return mtrainer_Dao.getinfo(id);
	}

	public int getCount(HashMap<String, Object> map) {
		return mtrainer_Dao.getCount(map);
	}

	public List<People_traner_Dto> list(HashMap<String, Object> map) {
		return mtrainer_Dao.list(map);
	}

	public List<admin_trainerslog_Dto> recordlist(HashMap<String, Object> map) {
		return mtrainer_Dao.recordlist(map);
	}

	public int recordCount(HashMap<String, Object> map) {
		return mtrainer_Dao.recordCount(map);
	}

	public int tupdate(HashMap<String, Object> map) {
		return mtrainer_Dao.tupdate(map);
	}

	// °Ë»ö
	public int search(HashMap<String, Object> map) {
		return mtrainer_Dao.search(map);
	}

	public int out(String t_id) {
		return mtrainer_Dao.out(t_id);
	}

}
