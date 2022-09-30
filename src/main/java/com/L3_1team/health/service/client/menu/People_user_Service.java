package com.L3_1team.health.service.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.L3_1team.health.dao.client.menu.People_user_Dao;
import com.L3_1team.health.dto.client.menu.Community_border_free_reple_Dto;
import com.L3_1team.health.dto.client.menu.People_user_Dto;
import com.L3_1team.health.dto.client.menu.People_user_reple_Dto;

@Service
public class People_user_Service {
	@Inject
	private People_user_Dao userDao;

	public void setUserDao(People_user_Dao userDao) {
		this.userDao = userDao;
	}

	public List<People_user_Dto> listall() {// 리스트
		return userDao.listall();
	}

	public int getCount() {
		return userDao.getCount();
	}

	public List<People_user_Dto> list(HashMap<String, Integer> map) {
		return userDao.list(map);
	}

	public People_user_Dto getinfo(int p_num) {// 상세보기,조회수증가
		userDao.addhit(p_num);
		return userDao.getinfo(p_num);
	}

	public People_user_Dto prev(int p_num) {// 이전글
		People_user_Dto dto = userDao.prev(p_num);
		return dto;
	}

	public People_user_Dto next(int p_num) {// 다음글
		People_user_Dto dto = userDao.next(p_num);
		return dto;
	}

	public int insert(People_user_Dto dto) {// 글쓰기
		return userDao.insert(dto);
	}

	public int update(People_user_Dto dto) {// 글수정
		return userDao.update(dto);
	}

	@Transactional
	public int delete(int p_num) {// 글삭제
		userDao.reple_delete(p_num);
		return userDao.delete(p_num);
	}

	public int getCount_reple(int p_num) {
		return userDao.getCount_reple(p_num);
	}

	public List<People_user_reple_Dto> reple_list(HashMap<String, Integer> map) {
		return userDao.reple_list(map);
	}

	public int reple_insert(People_user_reple_Dto dto) {
		return userDao.reple_insert(dto);
	}

}
