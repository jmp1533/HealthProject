package com.L3_1team.health.dao.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.admin.admin_trainerslog_Dto;
import com.L3_1team.health.dto.client.menu.People_traner_Dto;

@Repository
public class admin_mtrainer_Dao {
	@Inject
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<People_traner_Dto> listall(int t_condition) {
		List<People_traner_Dto> list = sqlSession
				.selectList("com.L3_1team.health.mybatis.menu.People_tranerMapper.listall", t_condition);
		return list;
	}

	public People_traner_Dto getinfo(String id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_tranerMapper.getinfo", id);
	}

	public List<People_traner_Dto> list(HashMap<String, Object> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.People_tranerMapper.list", map);
	}

	public int getCount(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_tranerMapper.getCount", map);
	}

	public List<admin_trainerslog_Dto> recordlist(HashMap<String, Object> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.People_tranerMapper.record", map);
	}

	public int recordCount(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_tranerMapper.recordCount", map);
	}

	public int tupdate(HashMap<String, Object> map) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.People_tranerMapper.tupdate", map);
	}

	// ?˻?
	public int search(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_tranerMapper.search", map);
	}

	public int out(String t_id) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.People_tranerMapper.out", t_id);
	}
}
