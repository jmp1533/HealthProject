package com.L3_1team.health.service.client.popup;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.client.popup.popup_msg_Dao;
import com.L3_1team.health.dto.client.popup.popup_msg_Dto;

@Service
public class popup_msg_Service {
	@Inject
	popup_msg_Dao msg_Dao;

	public void setMsg_Dao(popup_msg_Dao msg_Dao) {
		this.msg_Dao = msg_Dao;
	}

	public int insert(popup_msg_Dto msg_Dto) {
		return msg_Dao.insert(msg_Dto);
	}

	public int update(int msg_num) {
		return msg_Dao.update(msg_num);
	}

	public int delete(int msg_num) {
		return msg_Dao.delete(msg_num);
	}

	public List<popup_msg_Dto> list(HashMap<String, Object> map) {
		return msg_Dao.list(map);
	}

	public popup_msg_Dto search(int msg_num) {
		return msg_Dao.search(msg_num);
	}

	public popup_msg_Dto prev(HashMap<String, Object> map) {
		return msg_Dao.prev(map);
	}

	public popup_msg_Dto next(HashMap<String, Object> map) {
		return msg_Dao.next(map);
	}

	public int getCount(HashMap<String, Object> map) {
		return msg_Dao.getCount(map);
	}
}
