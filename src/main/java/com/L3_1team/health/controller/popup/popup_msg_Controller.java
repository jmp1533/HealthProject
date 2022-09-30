package com.L3_1team.health.controller.popup;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.client.popup.popup_msg_Dto;
import com.L3_1team.health.service.client.popup.popup_msg_Service;

@Controller
public class popup_msg_Controller {
	@Inject
	popup_msg_Service msg_Service;

	public void setMsg_Service(popup_msg_Service msg_Service) {
		this.msg_Service = msg_Service;
	}

	@RequestMapping(value = "/client/popup/msg/msgdelete", method = RequestMethod.POST)
	public String msgdeleteForm(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			HttpServletRequest request, Model model) {

		String delck[] = request.getParameterValues("delck");

		for (int i = 0; i < delck.length; i++) {
			int msg_num = Integer.parseInt(delck[i].toString());
			msg_Service.delete(msg_num);
		}

		String id = (String) request.getSession().getAttribute("id");

		list(id, pageNum, model);

		return ".client.popup.msg.msglist";
	}

	@RequestMapping(value = "/client/popup/msg/msginsert", method = RequestMethod.GET)
	public String msginsertForm(HttpServletRequest request, Model model) {
		return ".client.popup.msg.msginsert";
	}

	@RequestMapping(value = "/client/popup/msg/msginsert", method = RequestMethod.POST)
	public String msginsert(@ModelAttribute("msg_Dto") popup_msg_Dto msg_Dto, HttpServletRequest request, Model model) {

		int n = msg_Service.insert(msg_Dto);
		if (n > 0) {
			list(msg_Dto.getMsg_send_id(), 1, model);
			return ".client.popup.msg.msglist";
		} else {
			return ".client.popup.msg.msginsert";
		}
	}

	@RequestMapping(value = "/client/popup/msg/msglist", method = RequestMethod.GET)
	public String msglistForm(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			HttpServletRequest request, Model model) {

		String id = (String) request.getSession().getAttribute("id");

		list(id, pageNum, model);

		return ".client.popup.msg.msglist";
	}

	@RequestMapping(value = "/client/popup/msg/msgview", method = RequestMethod.GET)
	public String msgview(@RequestParam(value = "msg_num") int msg_num, HttpServletRequest request, Model model) {

		String id = (String) request.getSession().getAttribute("id");

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("msg_num", msg_num);
		map.put("id", id);

		popup_msg_Dto msg_Dto = msg_Service.search(msg_num);
		popup_msg_Dto prev = msg_Service.prev(map);
		popup_msg_Dto next = msg_Service.next(map);

		if (msg_Dto != null) {
			msg_Service.update(msg_num);
		}
		model.addAttribute("msg_Dto", msg_Dto);
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);
		return ".client.popup.msg.msgview";
	}

	public void list(String id, int pageNum, Model model) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);

		int count = msg_Service.getCount(map);
		PageUtil page = new PageUtil(pageNum, count, 15, 10);

		map.put("startRow", page.getStartRow());
		map.put("endRow", page.getEndRow());

		List<popup_msg_Dto> list = msg_Service.list(map);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMsg_title().length() > 14) {
				list.get(i).setMsg_title(list.get(i).getMsg_title().substring(0, 11) + "...");
			}
		}

		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("count", (count - (pageNum - 1) * 10) + 1);
	}
}
