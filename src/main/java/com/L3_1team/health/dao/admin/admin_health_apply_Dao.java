package com.L3_1team.health.dao.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.admin.admin_mhealth_business_Dto;

@Repository
public class admin_health_apply_Dao {
	@Inject
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<admin_mhealth_business_Dto> list(HashMap<String, Object> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.admin.admin_mhealth_applyMapper.list", map);
	}

	public int getCount(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_mhealth_applyMapper.getCount", map);
	}

	// 검색
	public int search(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_mhealth_applyMapper.search", map);
	}

	// 삭제
	public int delete(int b_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.admin.admin_mhealth_applyMapper.delete", b_num);
	}

	public List<String> img(int b_num) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.admin.admin_mhealth_applyMapper.img", b_num);
	}

	// 상세보기
	public admin_mhealth_business_Dto getinfo(int b_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_mhealth_applyMapper.getinfo", b_num);
	}

	public List<String> getinfoimg(int b_num) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.admin.admin_mhealth_applyMapper.getinfoimg", b_num);
	}

	public int imgdel(int b_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.admin.admin_mhealth_applyMapper.imgdel", b_num);
	}

	// 등록
	public int update(admin_mhealth_business_Dto dto) {
		return sqlSession.update("com.L3_1team.health.mybatis.admin.admin_mhealth_applyMapper.update", dto);
	}
}
