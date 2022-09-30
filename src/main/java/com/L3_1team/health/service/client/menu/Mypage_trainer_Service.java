package com.L3_1team.health.service.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.L3_1team.health.dao.client.menu.Mypage_trainer_Dao;
import com.L3_1team.health.dto.client.menu.Finder_company_Dto;
import com.L3_1team.health.dto.client.user.Mypage_outDto;
import com.L3_1team.health.dto.client.user.TrainerDto;

@Service
public class Mypage_trainer_Service {
	@Inject
	Mypage_trainer_Dao trainer_Dao;

	public void setTrainer_Dao(Mypage_trainer_Dao trainer_Dao) {
		this.trainer_Dao = trainer_Dao;
	}

	public TrainerDto search(HashMap<String, String> map) {
		return trainer_Dao.search(map);
	}

	public int update(TrainerDto trainerDto) {
		return trainer_Dao.update(trainerDto);
	}

	public int search1(HashMap<String, String> map) {
		return trainer_Dao.search1(map);
	}

	public Finder_company_Dto rs(String id) {
		return trainer_Dao.rs(id);
	}

	public int ri(Finder_company_Dto company_Dto) {
		return trainer_Dao.ri(company_Dto);
	}

	public int ru(Finder_company_Dto company_Dto) {
		return trainer_Dao.ru(company_Dto);
	}

	@Transactional
	public int out(Mypage_outDto outDto, String t_id) {
		trainer_Dao.out(t_id);
		int n = trainer_Dao.outreason(outDto);
		return n;
	}

	public TrainerDto getinfo(String t_id) {
		return trainer_Dao.getinfo(t_id);
	}

	public int bi(HashMap<String, Object> map) {
		return trainer_Dao.bi(map);
	}

	public List<String> bs(int b_num) {
		return trainer_Dao.bs(b_num);
	}

	public int bd(HashMap<String, Object> map) {
		return trainer_Dao.bd(map);
	}
}
