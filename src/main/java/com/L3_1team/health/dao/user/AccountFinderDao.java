package com.L3_1team.health.dao.user;

import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.user.TrainerDto;
import com.L3_1team.health.dto.client.user.UserDto;

@Repository
public class AccountFinderDao {
	@Inject
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	// 아이디 찾기
	public String getUserId(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.user.AccountFindMapper.user_findId", map);
	}

	public String getTrainerId(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.user.AccountFindMapper.trainer_findId", map);
	}

	// 조회
	public String getUserInfo(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.user.AccountFindMapper.userInfo", map);
	}

	public String getTrainerInfo(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.user.AccountFindMapper.trainerInfo", map);
	}

	// 비밀번호 바꾸기
	public int userChangePwd(HashMap<String, Object> map) {
		return sqlSession.update("com.L3_1team.health.mybatis.user.AccountFindMapper.user_changePwd", map);
	}

	public int TraineruserChangePwd(HashMap<String, Object> map) {
		return sqlSession.update("com.L3_1team.health.mybatis.user.AccountFindMapper.trainer_changePwd", map);
	}

	public UserDto getUser(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.user.AccountFindMapper.user", map);
	}

	public TrainerDto getTrainer(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.user.AccountFindMapper.trainer", map);
	}
}
