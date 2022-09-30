package com.L3_1team.health.Utility.Page;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class Ajaxupload {
	@RequestMapping("/se.do")
	public String d() {
		return "fileUpload";
	}

	@RequestMapping("/utility/page/Ajaxuplod")
	public @ResponseBody String mybatistest(HttpServletRequest request, HttpSession session) throws IOException {
		FileOutputStream fos = null;
		InputStream is = null;
		MultipartHttpServletRequest multi = (MultipartHttpServletRequest) request;
		MultipartFile file = multi.getFile("agentInstallFile");// jsp 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 input type="file"占쏙옙 占식띰옙占쏙옙拷占�		
		String path = session.getServletContext().getRealPath("/resources/uploadG");
		String savefilename = UUID.randomUUID() + "_";
							
		try {
			if (file != null) {
				fos = new FileOutputStream(path + "/" + savefilename + file.getOriginalFilename());
				// 占쏙옙占쌜듸옙 占쏙옙占쏙옙占쏙옙 占싻억옙占쏙옙占� 占쏙옙占쏙옙 占쏙옙트占쏙옙占쏙옙체 占쏙옙占쏙옙
				is = file.getInputStream();
				// 占쏙옙占쏙옙 占쏙옙占쏙옙占싹깍옙
				FileCopyUtils.copy(is, fos);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
		}

		return savefilename + file.getOriginalFilename();

	}

	@RequestMapping(value = "/seImgInsert", method = RequestMethod.POST)
	public @ResponseBody String seImgInsert(
			@RequestParam(value = "update_image") CommonsMultipartFile update_image, HttpServletRequest request) {
		String bindName = Util.saveImgFromSE(update_image, request);
		return bindName;
	}

	@RequestMapping(value = "/otherImgInsert", method = RequestMethod.POST)
	public @ResponseBody String otherImgInsert(
			@RequestParam(value = "other_image") CommonsMultipartFile update_image, HttpServletRequest request) {
		String bindName = Util.saveImgFromSE(update_image, request);
		return bindName;
	}
}
