package com.L3_1team.health.dao.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.service_notice_Dto;

@Repository
public class admin_service_notice_Dao {
	@Inject
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<service_notice_Dto> noticelist() {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.service_noticeMapper.listall");
	}

	public List<service_notice_Dto> list(HashMap<String, Object> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.service_noticeMapper.list", map);
	}

	public int getCount() {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_noticeMapper.getCount");
	}

	public service_notice_Dto getinfo(int noti_num) {// 상세보기
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_noticeMapper.getinfo", noti_num);
	}

	public int addhit(int noti_num) {// 조회수증가
		return sqlSession.update("com.L3_1team.health.mybatis.menu.service_noticeMapper.addhit", noti_num);
	}

	public service_notice_Dto prev(int noti_num) {// 이전글
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_noticeMapper.prev", noti_num);
	}

	public service_notice_Dto next(int noti_num) {// 다음글
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_noticeMapper.next", noti_num);
	}

	public int insert(service_notice_Dto dto) {// 글쓰기
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.service_noticeMapper.insert", dto);
	}

	public int update(service_notice_Dto dto) {// 수정
		return sqlSession.update("com.L3_1team.health.mybatis.menu.service_noticeMapper.update", dto);
	}

	public int delete(int noti_num) {// 삭제
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.service_noticeMapper.delete", noti_num);
	}

	public int search(HashMap<String, Object> map) {// 검색
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_noticeMapper.search", map);
	}

}
