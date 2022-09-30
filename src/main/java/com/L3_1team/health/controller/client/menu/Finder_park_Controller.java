package com.L3_1team.health.controller.client.menu;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.L3_1team.health.Utility.Page.PageUtil;
import com.L3_1team.health.dto.client.menu.Finder_park_parklist_Dto;
import com.L3_1team.health.service.client.menu.Finder_company_Service;

@Controller
public class Finder_park_Controller {
	@Inject
	Finder_company_Service finder_park_Service;

	private String _url = "http://openapi.seoul.go.kr:8088/6a6d703135333332303933";
	
	public void setFinder_park_Service(Finder_company_Service finder_park_Service) {
		this.finder_park_Service = finder_park_Service;
	}

	@RequestMapping(value = "/client/menu/finder/park/Parkview", method = RequestMethod.GET)
	public String parkViewForm(@Param("p_idx") int p_idx, Model model) {
		Finder_park_parklist_Dto parklist_Dto = search(p_idx);
		model.addAttribute("parklist_Dto", parklist_Dto);

		return ".client.menu.finder.park.Parkview";
	}

	public Finder_park_parklist_Dto search(int p_idx) {
		
		Finder_park_parklist_Dto parklist_Dto = null;
		InputStream is = null;
		DocumentBuilderFactory factory = null;
		DocumentBuilder builder = null;
		Document document = null;
		Element xml = null;
		
		Node npark, ncontent, naddr, nzone, ndivision, nimg, nadmintel, nlon, nlat = null;
		String p_park, p_list_content, p_addr, p_zone, p_division, p_img, p_admintel = null;
		float logitude, latitude = 0;
		String path = "";
		
		try {
			path = "/xml/SearchParkInfoService/1/1/" + p_idx;
			
			URL url = new URL(_url + path);

			is = url.openStream();
			factory = DocumentBuilderFactory.newInstance();
			builder = factory.newDocumentBuilder();
			document = builder.parse(is);
			xml = document.getDocumentElement();

			npark = xml.getElementsByTagName("P_PARK").item(0);
			ncontent = xml.getElementsByTagName("P_LIST_CONTENT").item(0);
			naddr = xml.getElementsByTagName("P_ADDR").item(0);
			nzone = xml.getElementsByTagName("P_ZONE").item(0);
			ndivision = xml.getElementsByTagName("P_DIVISION").item(0);
			nimg = xml.getElementsByTagName("P_IMG").item(0);
			nadmintel = xml.getElementsByTagName("P_ADMINTEL").item(0);
			nlon = xml.getElementsByTagName("LONGITUDE").item(0);
			nlat = xml.getElementsByTagName("LATITUDE").item(0);

			p_park = npark.getFirstChild().getNodeValue();
			p_list_content = ncontent.getFirstChild().getNodeValue();
			p_addr = naddr.getFirstChild().getNodeValue();
			p_zone = nzone.getFirstChild().getNodeValue();
			p_division = ndivision.getFirstChild().getNodeValue();
			p_img = nimg.getFirstChild().getNodeValue();
			p_admintel = nadmintel.getFirstChild().getNodeValue();
			
			logitude = Float.parseFloat(nlon.getFirstChild().getNodeValue());
			latitude = Float.parseFloat(nlat.getFirstChild().getNodeValue());

			parklist_Dto = new Finder_park_parklist_Dto(p_idx, p_park, p_list_content, p_addr,
					p_zone, p_division, p_img, p_admintel, logitude, latitude);

		} catch (Exception e) {
		}
		
		return parklist_Dto;
	}

	@RequestMapping(value = "/client/menu/finder/park/ParkList", method = RequestMethod.GET)
	public String parkListForm(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, Model model) {
		int count = tcount();

		PageUtil page = new PageUtil(pageNum, count, 10, 10);

		List<Finder_park_parklist_Dto> list = parklist(page);

		model.addAttribute("page", page);
		model.addAttribute("list", list);

		return ".client.menu.finder.park.ParkList";
	}

	@RequestMapping(value = "/client/menu/finder/park/ParkList", method = RequestMethod.POST)
	public String parkList(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, Model model) {
		int count = tcount();

		PageUtil page = new PageUtil(pageNum, count, 10, 10);

		List<Finder_park_parklist_Dto> list = parklist(page);

		model.addAttribute("page", page);
		model.addAttribute("list", list);

		return ".client.menu.finder.park.ParkList";
	}

	public List<Finder_park_parklist_Dto> parklist(PageUtil page) {
		ArrayList<Finder_park_parklist_Dto> list = null;
		Finder_park_parklist_Dto parklist_Dto = null;
		InputStream is = null;
		DocumentBuilderFactory factory = null;
		DocumentBuilder builder = null;
		Document document = null;
		Element xml = null;
		
		NodeList idxlist, parklist, addrlist, admintellist = null;
		String path = "";

		try {
			path = "/xml/SearchInfoByParkNameService/" + page.getStartRow() + "/" + page.getEndRow();
			
			URL url = new URL(_url + path);

			is = url.openStream();
			factory = DocumentBuilderFactory.newInstance();
			builder = factory.newDocumentBuilder();
			document = builder.parse(is);
			xml = document.getDocumentElement();

			idxlist = xml.getElementsByTagName("P_IDX");
			parklist = xml.getElementsByTagName("P_PARK");
			addrlist = xml.getElementsByTagName("P_ADDR");
			admintellist = xml.getElementsByTagName("P_ADMINTEL");

			list = new ArrayList<Finder_park_parklist_Dto>();
			for (int i = 0; i < page.getEndPageNum(); i++) {
				if (idxlist.item(i) == null)
					break;
				
				Node nidx = idxlist.item(i);
				Node npark = parklist.item(i);
				Node naddr = addrlist.item(i);
				Node nadmintel = admintellist.item(i);
				
				String p_idx = nidx.getFirstChild().getNodeValue();
				String p_park = npark.getFirstChild().getNodeValue();
				String p_addr = naddr.getFirstChild().getNodeValue();
				String p_admintel = nadmintel.getFirstChild().getNodeValue();
				
				parklist_Dto = new Finder_park_parklist_Dto(Integer.parseInt(p_idx), p_park, null, p_addr, null, null,
						null, p_admintel, 0, 0);

				list.add(parklist_Dto);
			}			
		} catch (Exception e) {
		}
		
		return list;
	}

	public int tcount() {
		InputStream is = null;
		DocumentBuilderFactory factory = null;
		DocumentBuilder builder = null;
		Document document = null;
		Element xml = null;
		
		String path = "";
		int tc = 0;
		
		try {
			path = "/xml/SearchParkInfoService/1/1/";
			
			URL url = new URL(_url + path);

			is = url.openStream();
			factory = DocumentBuilderFactory.newInstance();
			builder = factory.newDocumentBuilder();
			document = builder.parse(is);
			xml = document.getDocumentElement();

			NodeList totalcount = xml.getElementsByTagName("list_total_count");
			Node ntotalcount = totalcount.item(0);
			tc = Integer.parseInt(ntotalcount.getFirstChild().getNodeValue());			
		} catch (Exception e) {
		}
		
		return tc;
	}
}
