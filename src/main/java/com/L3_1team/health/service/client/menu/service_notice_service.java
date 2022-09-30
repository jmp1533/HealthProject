package com.L3_1team.health.service.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.client.menu.service_notice_Dao;
import com.L3_1team.health.dto.client.menu.service_notice_Dto;

@Service
public class service_notice_service {
	@Inject
	service_notice_Dao notice_Dao;

	public void setNotice_Dao(service_notice_Dao notice_Dao) {
		this.notice_Dao = notice_Dao;
	}

	public List<service_notice_Dto> noticelist() {
		return notice_Dao.noticelist();
	}

	public int getCount() {
		return notice_Dao.getCount();
	}

	public List<service_notice_Dto> list(HashMap<String, Integer> map) {
		return notice_Dao.list(map);
	}

	public service_notice_Dto getinfo(int noti_num) {// �󼼺���,��ȸ������
		notice_Dao.addhit(noti_num);
		return notice_Dao.getinfo(noti_num);
	}

	public service_notice_Dto prev(int noti_num) {// ������
		service_notice_Dto dto = notice_Dao.prev(noti_num);
		return dto;
	}

	public service_notice_Dto next(int noti_num) {// ������
		service_notice_Dto dto = notice_Dao.next(noti_num);
		return dto;
	}

	public int insert(service_notice_Dto dto) {// ����
		return notice_Dao.insert(dto);
	}

	public int update(service_notice_Dto dto) {// ����
		return notice_Dao.update(dto);
	}

	public int delete(int noti_num) {// ����
		return notice_Dao.delete(noti_num);
	}

}