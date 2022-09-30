package com.L3_1team.health.dao.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.Diary_diary_Dto;
import com.L3_1team.health.dto.client.menu.Diary_diarymenu_Dto;

@Repository
public class Diary_Dao {
	@Inject
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<Diary_diary_Dto> Datelist(HashMap<String, String> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.diaryMapper.selectdate", map);
	}

	public Diary_diary_Dto info(int d_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.diaryMapper.info", d_num);
	}

	public List<Diary_diarymenu_Dto> menu_list(int d_num) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.diaryMapper.menu_list", d_num);
	}

	public int insert(Diary_diary_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.diaryMapper.diary_insert", dto);
	}

	public int menu_insert(Diary_diarymenu_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.diaryMapper.menu_insert", dto);
	}

	public int num_info(HashMap<String, String> hashmap) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.diaryMapper.num_info", hashmap);
	}

	public int diary_delete(int d_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.diaryMapper.diary_delete", d_num);
	}

	public int menu_delete(int d_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.diaryMapper.menu_delete", d_num);
	}

	public int reple_delete(int d_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.diaryMapper.reple_delete", d_num);
	}

	public int diary_update(Diary_diary_Dto dto) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.diaryMapper.diary_update", dto);
	}

}
