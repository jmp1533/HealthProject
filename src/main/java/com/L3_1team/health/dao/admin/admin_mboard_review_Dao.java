package com.L3_1team.health.dao.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.ReviewDto;
import com.L3_1team.health.dto.client.menu.Review_reple_Dto;

@Repository
public class admin_mboard_review_Dao {
	@Inject
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int insert(ReviewDto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.insert", dto);
	}

	public int getCount(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.getCount", map);
	}

	public List<ReviewDto> list(HashMap<String, String> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.list", map);
	}

	public ReviewDto getInfo(int r_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.getInfo", r_num);
	}

	// 삭제부분
	public int r_delete(HashMap<String, String> hashmap) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.r_delete", hashmap);
	}

	public int reple_delete(int r_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.reple_delete", r_num);
	}

	public int commend_delete(int r_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.commend_delete", r_num);
	}

	// 댓글부분
	public int getCount_reple(int r_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.getCount_reple", r_num);
	}

	public List<Review_reple_Dto> reple_list(HashMap<String, Integer> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.reple_list", map);
	}

	// 유틸부분
	public ReviewDto prev(int r_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.prev", r_num);
	}

	public ReviewDto next(int r_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.next", r_num);
	}
}
