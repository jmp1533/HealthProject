package com.L3_1team.health.dao.user;

import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.user.UserDto;

@Repository
public class UserDao {
	@Inject
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int insert(UserDto userDto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.user.insert_user.insert", userDto);
	}

	public String login(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.user.insert_user.login", map);
	}

	public int userlog(String userlogid) {
		return sqlSession.insert("com.L3_1team.health.mybatis.user.insert_user.log", userlogid);
	}

	public int infoinsert(HashMap<String, Object> map) {
		return sqlSession.insert("com.L3_1team.health.mybatis.user.insert_user.info", map);
	}

	public int infoselect(String u_id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.user.insert_user.infoselect", u_id);
	}

}
