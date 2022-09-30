package com.L3_1team.health.service.client.user;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.user.UserDao;
import com.L3_1team.health.dto.client.user.UserDto;

@Service
public class UserService {
	@Inject
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public int insert(UserDto userDto) {
		return userDao.insert(userDto);
	}

	public String login(HashMap<String, String> map) {
		return userDao.login(map);
	}

	public int userlog(String userlogid) {
		return userDao.userlog(userlogid);
	}

	public int infoinsert(HashMap<String, Object> map) {
		return userDao.infoinsert(map);
	}

	public int infoselect(String u_id) {
		return userDao.infoselect(u_id);
	}
}
