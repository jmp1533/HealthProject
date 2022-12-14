package com.L3_1team.health.dao.admin;

import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.L3_1team.health.dto.admin.admin_mservice_qna_Dto;
import com.L3_1team.health.dto.admin.admin_mservice_qna_reple_Dto;

@Repository
public class admin_mservice_qna_Dao {
	@Inject
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	// list
	public List<admin_mservice_qna_Dto> list(HashMap<String, Object> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.admin.admin_mservice_qna_Mapper.list", map);
	}

	public int getCount() {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_mservice_qna_Mapper.getCount");
	}

	// 검색
	public int search(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_mservice_qna_Mapper.search", map);
	}

	// 상세보기
	public admin_mservice_qna_Dto getinfo(int q_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.admin.admin_mservice_qna_Mapper.getinfo", q_num);
	}

	// 댓글쓰기
	public int reple(admin_mservice_qna_reple_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.admin.admin_mservice_qna_Mapper.reple", dto);
	}

	public List<admin_mservice_qna_reple_Dto> repleinfo(int q_num) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.admin.admin_mservice_qna_Mapper.repleinfo", q_num);
	}

}
