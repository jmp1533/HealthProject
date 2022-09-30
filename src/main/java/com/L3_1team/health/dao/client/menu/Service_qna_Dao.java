package com.L3_1team.health.dao.client.menu;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.admin.admin_mservice_qna_Dto;
import com.L3_1team.health.dto.admin.admin_mservice_qna_reple_Dto;

@Repository
public class Service_qna_Dao {
	@Inject
	private SqlSession sqlSession;

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	// ±Û¾²±â
	public int insert(admin_mservice_qna_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.service_qnaMapper.insert", dto);
	}

	// list
	public List<admin_mservice_qna_Dto> list(String id) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.service_qnaMapper.list", id);
	}

	public admin_mservice_qna_Dto getinfo(int q_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_qnaMapper.getinfo", q_num);
	}

	public int count(String id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_qnaMapper.count", id);
	}

	public List<admin_mservice_qna_reple_Dto> repleinfo(int q_num) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.service_qnaMapper.repleinfo", q_num);
	}
}
