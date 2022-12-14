package com.L3_1team.health.service.client.menu;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.client.menu.Service_qna_Dao;
import com.L3_1team.health.dto.admin.admin_mservice_qna_Dto;
import com.L3_1team.health.dto.admin.admin_mservice_qna_reple_Dto;

@Service
public class Service_qna_Service {
	@Inject
	private Service_qna_Dao qna_Dao;

	public void setQna_Dao(Service_qna_Dao qna_Dao) {
		this.qna_Dao = qna_Dao;
	}

	// ?۾???
	public int insert(admin_mservice_qna_Dto dto) {
		return qna_Dao.insert(dto);
	}

	public List<admin_mservice_qna_Dto> list(String id) {
		return qna_Dao.list(id);
	}

	public admin_mservice_qna_Dto getinfo(int q_num) {
		return qna_Dao.getinfo(q_num);
	}

	public int count(String id) {
		return qna_Dao.count(id);
	}

	public List<admin_mservice_qna_reple_Dto> repleinfo(int q_num) {
		return qna_Dao.repleinfo(q_num);
	}
}
