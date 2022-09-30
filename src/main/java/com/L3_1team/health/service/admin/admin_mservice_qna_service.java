package com.L3_1team.health.service.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.admin.admin_mservice_qna_Dao;
import com.L3_1team.health.dto.admin.admin_mservice_qna_Dto;
import com.L3_1team.health.dto.admin.admin_mservice_qna_reple_Dto;

@Service
public class admin_mservice_qna_service {
	@Inject
	admin_mservice_qna_Dao qna_Dao;

	public void setQna_Dao(admin_mservice_qna_Dao qna_Dao) {
		this.qna_Dao = qna_Dao;
	}

	// list
	public List<admin_mservice_qna_Dto> list(HashMap<String, Object> map) {
		return qna_Dao.list(map);
	}

	public int getCount() {
		return qna_Dao.getCount();
	}

	// �˻�
	public int search(HashMap<String, Object> map) {
		return qna_Dao.search(map);
	}

	// �󼼺���
	public admin_mservice_qna_Dto getinfo(int q_num) {
		return qna_Dao.getinfo(q_num);
	}

	// ��۾���
	public int reple(admin_mservice_qna_reple_Dto dto) {
		return qna_Dao.reple(dto);
	}

	public List<admin_mservice_qna_reple_Dto> repleinfo(int q_num) {
		return qna_Dao.repleinfo(q_num);
	}

}