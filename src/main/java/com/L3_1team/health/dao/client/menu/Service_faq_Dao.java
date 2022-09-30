package com.L3_1team.health.dao.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.Service_faq_Dto;

@Repository
public class Service_faq_Dao {
	@Inject
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<Service_faq_Dto> listall() {
		List<Service_faq_Dto> listall = sqlSession
				.selectList("com.L3_1team.health.mybatis.menu.service_faqMapper.listall");
		return listall;
	}

	public List<Service_faq_Dto> list(HashMap<String, Integer> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.service_faqMapper.list", map);
	}

	public int getCount() {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_faqMapper.getCount");
	}

	// �۵��
	public int insert(Service_faq_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.service_faqMapper.insert", dto);
	}

	// �ۼ���
	public int update(Service_faq_Dto dto) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.service_faqMapper.update", dto);
	}

	// �ۻ���
	public int delete(int faq_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.service_faqMapper.delete", faq_num);
	}
}