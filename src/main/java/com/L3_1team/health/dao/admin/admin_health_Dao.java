package com.L3_1team.health.dao.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.Finder_company_Dto;

@Repository
public class admin_health_Dao {
	@Inject
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<Finder_company_Dto> getlist(HashMap<String, Object> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.finder_companyMapper.list", map);
	}

	public Finder_company_Dto search(int b_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.finder_companyMapper.search", b_num);
	}

	public List<String> img(int b_num) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.finder_companyMapper.img", b_num);
	}

	public int getCount(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.finder_companyMapper.getCount", map);
	}

	public int delete(int b_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.finder_companyMapper.delete", b_num);
	}
}
