package com.L3_1team.health.controller.client.menu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.L3_1team.health.dto.admin.admin_mservice_qna_Dto;
import com.L3_1team.health.dto.admin.admin_mservice_qna_reple_Dto;
import com.L3_1team.health.service.client.menu.Service_qna_Service;

@Controller
public class service_qna_Controller {
	@Inject
	private Service_qna_Service qna_Service;

	public void setQna_Service(Service_qna_Service qna_Service) {
		this.qna_Service = qna_Service;
	}

	// ����Ʈ
	@RequestMapping("/client/menu/service/qna/qna_list")
	public String list(HttpServletRequest request, Model model) {

		String id = (String) request.getSession().getAttribute("id");
		if (id == null) {
			return "redirect:/client/user/insert/Login";
		}

		int n = qna_Service.count(id);

		if (n != 0) {
			List<admin_mservice_qna_Dto> list = qna_Service.list(id);
			model.addAttribute("list", list);

			return ".client.menu.service.qna.qna_list";
		} else {
			return ".client.menu.service.qna.qna_write";
		}
	}

	// �󼼺���
	@RequestMapping("/client/menu/service/qna/qna_view")
	public String getinfo(@RequestParam("q_num") int q_num, Model model) {
		admin_mservice_qna_Dto dto = qna_Service.getinfo(q_num);
		List<admin_mservice_qna_reple_Dto> list = qna_Service.repleinfo(q_num);
		model.addAttribute("dto", dto);
		model.addAttribute("list", list);
		return ".client.menu.service.qna.qna_view";
	}

	// �۾�����
	@RequestMapping(value = "/client/menu/service/qna/qna_write", method = RequestMethod.GET)
	public String qna_writeForm() {

		return ".client.menu.service.qna.qna_write";

	}

	// �۾���
	@RequestMapping(value = "/client/menu/service/qna/qna_write", method = RequestMethod.POST)
	public String qna_write(@RequestParam("qcate_num") int qcate_num, @RequestParam("q_title") String q_title,
			@RequestParam("q_content") String q_content,
			@RequestParam(value = "q_img", defaultValue = "null") String q_img, HttpSession session,
			MultipartFile file1) {

		String id = (String) session.getAttribute("id");

		String orgfilename = file1.getOriginalFilename();
		String savefilename = UUID.randomUUID() + "_" + orgfilename;
		String path = session.getServletContext().getRealPath("/resources/upload");
		FileOutputStream fos = null;
		InputStream is = null;

		try {
			fos = new FileOutputStream(path + "/" + savefilename);
			is = file1.getInputStream();
			FileCopyUtils.copy(is, fos);

			q_img = savefilename;
			admin_mservice_qna_Dto dto = new admin_mservice_qna_Dto(qcate_num, null, 0, id, q_title, q_content, q_img,
					null);

			int n = qna_Service.insert(dto);

			if (n > 0) {
				return "redirect:/client/menu/service/qna/qna_list";
			} else {
				return ".client.menu.service.qna.qna_write";
			}
		} catch (Exception ie) {
			return ".client.menu.service.qna.qna_write";
		} finally {
			try {
				if (is != null)
					is.close();
				if (fos != null)
					fos.close();
			} catch (IOException ie) {
			}
		}
	}

}
