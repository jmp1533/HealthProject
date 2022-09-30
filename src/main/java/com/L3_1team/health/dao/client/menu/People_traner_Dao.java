package com.L3_1team.health.dao.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.People_traner_Dto;

@Repository
public class People_traner_Dao {
	@Inject
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<People_traner_Dto> listall() {
		List<People_traner_Dto> list = sqlSession
				.selectList("com.L3_1team.health.mybatis.menu.People_tranerMapper.listall");
		return list;
	}

	public People_traner_Dto getinfo(String id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_tranerMapper.getinfo", id);
	}

	public List<People_traner_Dto> list(HashMap<String, Integer> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.People_tranerMapper.list", map);
	}

	public int getCount(HashMap<String, Integer> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_tranerMapper.getCount", map);
	}

	public int joincount(String u_id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_tranerMapper.joincount", u_id);
	}

	public int joinsearch(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_tranerMapper.joinsearch", map);
	}

	public int joininsert(HashMap<String, String> map) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.People_tranerMapper.joininsert", map);
	}

	public int joindelete(String u_id) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.People_tranerMapper.joindelete", u_id);
	}

	public int managecount(String u_id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_tranerMapper.managecount", u_id);
	}

}
