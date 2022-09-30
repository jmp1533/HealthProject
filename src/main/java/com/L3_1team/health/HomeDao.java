package com.L3_1team.health;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_tip_Dto;
import com.L3_1team.health.dto.client.menu.People_user_Dto;
import com.L3_1team.health.dto.client.menu.service_notice_Dto;

@Repository
public class HomeDao {
	@Inject SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<People_user_Dto> UserBoard(){
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.People_userMapper.main");
	}
	
	public List<Community_border_tip_Dto> TipBoard(){
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.community_border_tipMapper.main");
	}
	
	public List<Community_border_free_Dto> FreeBoard(){
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.community_border_freeMapper.main");
	}
	
	public List<service_notice_Dto> NoticeBoard(){
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.service_noticeMapper.main");
	}
}
