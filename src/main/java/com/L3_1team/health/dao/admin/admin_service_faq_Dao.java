package com.L3_1team.health.dao.admin;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.Service_faq_Dto;

@Repository
public class admin_service_faq_Dao {
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

	public List<Service_faq_Dto> list(HashMap<String, Object> map) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.service_faqMapper.list", map);
	}

	public int getCount() {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_faqMapper.getCount");
	}

	public Service_faq_Dto getinfo(int faq_num) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_faqMapper.getinfo", faq_num);
	}

	public Service_faq_Dto prev(int faq_num) {// 占쏙옙占쏙옙占쏙옙
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_faqMapper.prev", faq_num);
	}

	public Service_faq_Dto next(int faq_num) {// 占쏙옙占쏙옙占쏙옙
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_faqMapper.next", faq_num);
	}

	// 占쌜듸옙占�
	public int insert(Service_faq_Dto dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.service_faqMapper.insert", dto);
	}

	// 占쌜쇽옙占쏙옙
	public int update(Service_faq_Dto dto) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.service_faqMapper.update", dto);
	}

	// 占쌜삼옙占쏙옙
	public int delete(int faq_num) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.service_faqMapper.delete", faq_num);
	}

	// 占싯삼옙
	public int search(HashMap<String, Object> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.service_faqMapper.search", map);
	}

}
