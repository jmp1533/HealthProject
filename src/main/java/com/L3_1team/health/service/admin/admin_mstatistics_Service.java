package com.L3_1team.health.service.admin;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.admin.admin_mstatistics_Dao;

@Service
public class admin_mstatistics_Service {
	@Inject
	admin_mstatistics_Dao dao;

	public void setDao(admin_mstatistics_Dao dao) {
		this.dao = dao;
	}

	public int gender(int gender) {
		return dao.gender(gender);
	}

	public int age(HashMap<String, Integer> map) {
		return dao.age(map);
	}

	public int trainergender(int gender) {
		return dao.trainergender(gender);
	}

	public int trainerage(HashMap<String, Integer> map) {
		return dao.trainerage(map);
	}

	public int out(String out_reason) {
		return dao.out(out_reason);
	}
}
