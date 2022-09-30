package com.L3_1team.health;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;
import com.L3_1team.health.dto.client.menu.Community_border_tip_Dto;
import com.L3_1team.health.dto.client.menu.People_user_Dto;
import com.L3_1team.health.dto.client.menu.service_notice_Dto;

@Service
public class HomeService {
	@Inject HomeDao homeDao;
	
	public void setHomeDao(HomeDao homeDao) {
		this.homeDao = homeDao;
	}
	
	public List<People_user_Dto> UserBoard(){
		return homeDao.UserBoard();
	}
	
	public List<Community_border_tip_Dto> TipBoard(){
		return homeDao.TipBoard();
	}
	
	public List<Community_border_free_Dto> FreeBoard(){
		return homeDao.FreeBoard();
	}
	
	public List<service_notice_Dto> NoticeBoard(){
		return homeDao.NoticeBoard();
	}
}
