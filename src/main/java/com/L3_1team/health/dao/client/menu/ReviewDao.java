package com.L3_1team.health.dao.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.category.commend_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_free_reple_Dto;
import com.L3_1team.health.dto.client.menu.ReviewDto;
import com.L3_1team.health.dto.client.menu.Review_reple_Dto;

@Repository
public class ReviewDao {
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

	public int update(ReviewDto dto) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.update", dto);
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

	// 추천하기부분
	public int commend_insert(HashMap<String, String> map) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.commend_insert", map);
	}

	public int commend_count(int free_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.commend_count", free_num);
	}

	public commend_Dto commend_check(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.commend_check", map);
	}

	// 댓글부분
	public int getCount_reple(int r_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.getCount_reple", r_num);
	}

	public int reple_insert(Review_reple_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.reple_insert", dto);
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

	public int addHit(int r_num) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.ReviewBoardMapper.addHit", r_num);
	}
}
