package com.L3_1team.health.dao.admin;

import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class admin_mstatistics_Dao {
	@Inject
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	/*
	 * public int userage(int u_gender){ return
	 * sqlSession.selectOne("com.L3_1team.health.mybatis.admin.age", u_gender); }
	 */
	public int gender(int gender) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_mstatistics_userMapper.gender", gender);
	}

	public int age(HashMap<String, Integer> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_mstatistics_userMapper.age", map);
	}

	public int trainergender(int gender) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_mstatistics_userMapper.trainergender",
				gender);
	}

	public int trainerage(HashMap<String, Integer> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_mstatistics_userMapper.trainerage", map);
	}

	public int out(String out_reason) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_mstatistics_userMapper.out", out_reason);
	}
}
