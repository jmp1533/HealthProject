package com.L3_1team.health.dao.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Diary_chart_Dto;
import com.L3_1team.health.dto.client.menu.Diary_diarymenu_Dto;

@Repository
public class Diary_chart_Dao {
	@Inject
	private SqlSession sqlSession;

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<Diary_chart_Dto> list(HashMap<String, String> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.diary_chartMapper.chart_list", map);
	}

	public int u_targetweight(String id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.diary_chartMapper.wight", id);
	}

	public Diary_diarymenu_Dto food_chart(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.diary_chartMapper.food_chart", map);
	}

}
