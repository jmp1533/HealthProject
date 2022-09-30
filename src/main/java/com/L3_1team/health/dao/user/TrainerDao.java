package com.L3_1team.health.dao.user;

import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.user.TrainerDto;

@Repository
public class TrainerDao {
	@Inject
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int insert(TrainerDto trainerDto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.user.insert_trainer.insert", trainerDto);
	}

	public String login(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.user.insert_trainer.login", map);
	}

	public int trainerlog(String trainerlogid) {
		return sqlSession.insert("com.L3_1team.health.mybatis.user.insert_trainer.log", trainerlogid);
	}
}
