package com.L3_1team.health.dao.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.management_Dto;
import com.L3_1team.health.dto.client.menu.userinfo_Dto;
import com.L3_1team.health.dto.client.user.UserDto;

@Repository
public class Join_Dao {
	@Inject
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int getCount(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.joinMapper.getCount", map);
	}

	public List<management_Dto> list(HashMap<String, Object> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.joinMapper.list", map);
	}

	public UserDto search(String u_id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.joinMapper.search", u_id);
	}

	public int delete(String u_id) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.joinMapper.delete", u_id);
	}

	public userinfo_Dto userinfo(String u_id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.joinMapper.userinfo", u_id);
	}

	public int applyCount(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.joinMapper.applyCount", map);
	}

	public List<management_Dto> applylist(HashMap<String, Object> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.joinMapper.applylist", map);
	}

	public int joindelete(String u_id) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.joinMapper.joindelete", u_id);
	}

	public int minsert(HashMap<String, String> map) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.joinMapper.minsert", map);
	}
}
