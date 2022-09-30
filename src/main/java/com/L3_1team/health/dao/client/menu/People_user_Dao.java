package com.L3_1team.health.dao.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.People_user_Dto;
import com.L3_1team.health.dto.client.menu.People_user_reple_Dto;

@Repository
public class People_user_Dao {
	@Inject
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<People_user_Dto> listall() {// 리스트
		List<People_user_Dto> listall = sqlSession
				.selectList("com.L3_1team.health.mybatis.menu.People_userMapper.listall");
		return listall;
	}

	public List<People_user_Dto> list(HashMap<String, Integer> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.People_userMapper.list", map);
	}

	public int getCount() {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_userMapper.getCount");
	}

	public People_user_Dto getinfo(int p_num) {// 상세보기
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_userMapper.getinfo", p_num);
	}

	public int addhit(int p_num) {// 조회수증가
		return sqlSession.update("com.L3_1team.health.mybatis.menu.People_userMapper.addhit", p_num);
	}

	public People_user_Dto prev(int p_num) {// 이전글
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_userMapper.prev", p_num);
	}

	public People_user_Dto next(int p_num) {// 다음글
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_userMapper.next", p_num);
	}

	public int insert(People_user_Dto dto) {// 글쓰기
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.People_userMapper.insert", dto);
	}

	public int update(People_user_Dto dto) {// 수정
		return sqlSession.update("com.L3_1team.health.mybatis.menu.People_userMapper.update", dto);
	}

	public int delete(int p_num) {// 글삭제
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.People_userMapper.delete", p_num);
	}

	public List<People_user_reple_Dto> reple_list(HashMap<String, Integer> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.People_userMapper.reple_list", map);
	}

	public int reple_insert(People_user_reple_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.People_userMapper.reple_insert", dto);
	}

	public int getCount_reple(int p_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.People_userMapper.getCount_reple", p_num);
	}

	public int reple_delete(int p_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.People_userMapper.reple_delete", p_num);
	}

}
