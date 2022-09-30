package com.L3_1team.health.service.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.client.menu.Service_faq_Dao;
import com.L3_1team.health.dto.client.menu.Service_faq_Dto;

@Service
public class Service_faq_Service {
	@Inject
	private Service_faq_Dao dao;

	public void setDao(Service_faq_Dao dao) {
		this.dao = dao;
	}

	public List<Service_faq_Dto> listall() {
		return dao.listall();
	}

	public int getCount() {
		return dao.getCount();
	}

	public List<Service_faq_Dto> list(HashMap<String, Integer> map) {
		return dao.list(map);
	}

	// 글등록
	public int insert(Service_faq_Dto dto) {
		return dao.insert(dto);
	}

	// 글수정
	public int update(Service_faq_Dto dto) {
		return dao.update(dto);
	}

	// 글삭제
	public int delete(int faq_num) {
		return dao.delete(faq_num);
	}
}
