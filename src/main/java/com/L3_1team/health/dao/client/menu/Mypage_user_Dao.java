package com.L3_1team.health.dao.client.menu;

import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.Mypage_management_Dto;
import com.L3_1team.health.dto.client.user.Mypage_outDto;
import com.L3_1team.health.dto.client.user.UserDto;

@Repository
public class Mypage_user_Dao {
	@Inject
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public UserDto search(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.mypage_userMapper.search", map);
	}

	public int search1(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.mypage_userMapper.search1", map);
	}

	public int update(UserDto userDto) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.mypage_userMapper.update", userDto);
	}

	// ȸ??Ż??
	public int out(String u_id) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.mypage_userMapper.out", u_id);
	}

	public int outreason(Mypage_outDto outDto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.mypage_userMapper.outreason", outDto);
	}

	public UserDto getinfo(String u_id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.mypage_userMapper.getinfo", u_id);
	}

	public Mypage_management_Dto mytrainer(String u_id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.mypage_userMapper.mytrainer", u_id);
	}

}
