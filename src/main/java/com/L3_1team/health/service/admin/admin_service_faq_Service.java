package com.L3_1team.health.service.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.admin.admin_service_faq_Dao;
import com.L3_1team.health.dto.client.menu.Service_faq_Dto;

@Service
public class admin_service_faq_Service {
	@Inject
	private admin_service_faq_Dao dao;

	public void setDao(admin_service_faq_Dao dao) {
		this.dao = dao;
	}

	public List<Service_faq_Dto> listall() {
		return dao.listall();
	}

	public int getCount() {
		return dao.getCount();
	}

	public List<Service_faq_Dto> list(HashMap<String, Object> map) {
		return dao.list(map);
	}

	public Service_faq_Dto getinfo(int faq_num) {
		return dao.getinfo(faq_num);
	}

	public Service_faq_Dto prev(int faq_num) {// 이전글
		return dao.prev(faq_num);
	}

	public Service_faq_Dto next(int faq_num) {// 다음글
		return dao.next(faq_num);
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

	// 검색
	public int search(HashMap<String, Object> map) {
		return dao.search(map);
	}

}
