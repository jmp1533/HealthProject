package com.L3_1team.health.dao.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.admin.admin_muser_list_Dto;
import com.L3_1team.health.dto.admin.admin_trainerslog_Dto;
import com.L3_1team.health.dto.admin.admin_userslog_Dto;

@Repository
public class admin_muser_Dao {
	@Inject
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	// 회원목록
	public List<admin_muser_list_Dto> listall() {
		List<admin_muser_list_Dto> listall = sqlSession
				.selectList("com.L3_1team.health.mybatis.admin.admin_muser_list_listMapper.listall");
		return listall;
	}

	public List<admin_muser_list_Dto> list(HashMap<String, String> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.admin.admin_muser_list_listMapper.list", map);
	}

	public int getCount() {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_muser_list_listMapper.getCount");
	}

	// 검색
	public int search(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_muser_list_listMapper.search", map);
	}

	// 회원상세보기
	public admin_muser_list_Dto getinfo(String u_id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_muser_list_listMapper.getinfo", u_id);
	}

	// 탈퇴처리
	public int out(String u_id) {
		return sqlSession.update("com.L3_1team.health.mybatis.admin.admin_muser_list_listMapper.out", u_id);
	}

	// userlog

	public List<admin_userslog_Dto> recordlist(HashMap<String, Object> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.admin.admin_muser_list_listMapper.record", map);
	}

	public int recordCount() {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_muser_list_listMapper.recordCount");
	}

	public int logsearch(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_muser_list_listMapper.logsearch", map);
	}

}
