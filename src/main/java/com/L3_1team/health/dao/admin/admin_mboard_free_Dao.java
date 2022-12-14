package com.L3_1team.health.dao.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.category.commend_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_reple_Dto;

@Repository
public class admin_mboard_free_Dao {
	@Inject
	private SqlSession sqlSession;

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<Community_border_free_Dto> list(HashMap<String, String> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.community_border_freeMapper.list", map);
	}

	public Community_border_free_Dto prev(int free_num) {// 이전글
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_freeMapper.prev", free_num);
	}

	public Community_border_free_Dto next(int free_num) {// 다음글
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_freeMapper.next", free_num);
	}

	public int insert(Community_border_free_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.community_border_freeMapper.insert", dto);
	}

	public int update(Community_border_free_Dto dto) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.community_border_freeMapper.update", dto);
	}

	public int getCount(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_freeMapper.getCount", map);
	}

	public int getCount_reple(int free_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_freeMapper.getCount_reple",
				free_num);
	}

	public Community_border_free_Dto getinfo(int free_num) {

		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_freeMapper.getinfo", free_num);
	}

	public int addhits(int free_num) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.community_border_freeMapper.hitupdate", free_num);
	}

	public List<Community_border_free_reple_Dto> reple_list(HashMap<String, Integer> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.community_border_freeMapper.reple_list", map);
	}

	public int reple_insert(Community_border_free_reple_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.community_border_freeMapper.reple_insert", dto);
	}

	public int free_delete(HashMap<String, String> hashmap) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.community_border_freeMapper.free_delete", hashmap);
	}

	public int reple_delete(int free_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.community_border_freeMapper.reple_delete", free_num);
	}

	public int commend_insert(HashMap<String, String> map) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.community_border_freeMapper.commend_insert", map);
	}

	public int commend_count(int free_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_freeMapper.commend_count",
				free_num);
	}

	public commend_Dto commend_check(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_freeMapper.commend_check", map);
	}

	public int commend_delete(int free_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.community_border_freeMapper.commend_delete",
				free_num);
	}

}
