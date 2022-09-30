package com.L3_1team.health.dao.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.category.Health_Category_Dto;
import com.L3_1team.health.dto.category.commend_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_tip_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_tip_reple_Dto;

@Repository
public class Community_tipBorder_Dao {
	@Inject
	private SqlSession sqlSession;

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<Community_border_tip_Dto> list(HashMap<String, String> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.community_border_tipMapper.list", map);
	}

	public Community_border_tip_Dto prev(int tip_num) {// 이전글
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_tipMapper.prev", tip_num);
	}

	public Community_border_tip_Dto next(int tip_num) {// 다음글
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_tipMapper.next", tip_num);
	}

	public int insert(Community_border_tip_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.community_border_tipMapper.insert", dto);
	}

	public int update(Community_border_tip_Dto dto) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.community_border_tipMapper.update", dto);
	}

	public int getCount(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_tipMapper.getCount", map);
	}

	public int getCount_reple(int tip_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_tipMapper.getCount_reple",
				tip_num);
	}

	public Community_border_tip_Dto getinfo(int tip_num) {

		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_tipMapper.getinfo", tip_num);
	}

	public int addhits(int tip_num) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.community_border_tipMapper.hitupdate", tip_num);
	}

	public List<Health_Category_Dto> cate() {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.community_border_tipMapper.cate");
	}

	public List<Community_border_tip_reple_Dto> reple_list(HashMap<String, Integer> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.community_border_tipMapper.reple_list", map);
	}

	public int reple_insert(Community_border_tip_reple_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.community_border_tipMapper.reple_insert", dto);
	}

	public int tip_delete(HashMap<String, String> hashmap) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.community_border_tipMapper.tip_delete", hashmap);
	}

	public int reple_delete(int tip_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.community_border_tipMapper.reple_delete", tip_num);
	}

	public commend_Dto commend_check(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_tipMapper.commend_check", map);
	}

	public int commend_insert(HashMap<String, String> map) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.community_border_tipMapper.commend_insert", map);
	}

	public int commend_count(int tip_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.community_border_tipMapper.commend_count",
				tip_num);
	}

	public int commend_delete(int tip_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.community_border_tipMapper.commend_delete", tip_num);
	}

}
