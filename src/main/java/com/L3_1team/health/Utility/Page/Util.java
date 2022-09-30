package com.L3_1team.health.Utility.Page;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Util {
	public static String saveImgFromSE(CommonsMultipartFile fileData, HttpServletRequest request) {
		String rootPath = request.getSession().getServletContext().getRealPath("/resources/uploadG");
		Calendar now = new GregorianCalendar();		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int MILLISECOND = now.get(Calendar.MILLISECOND);
		StringBuffer fileName = new StringBuffer();
		String orgFileName = "";
					
		try {
			fileName.append(year).append(month).append(day).append(hour).append(minute).append(second).append(MILLISECOND);
			
			File rootFile = new File(rootPath + "/" + fileName + fileData.getOriginalFilename());
			fileData.transferTo(rootFile);
			orgFileName = fileName + fileData.getOriginalFilename();

		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orgFileName;
	}
	
	public static String GetHttpResponse(String url, String param, int timeOut) {		
		URL urlConn = null;
		HttpURLConnection conn = null;
		BufferedReader br = null;
		StringBuffer sb = null;
		String line = "";
		String response = "";
		
		try {
			urlConn = new URL(url + "?" + param);
			conn = (HttpURLConnection)urlConn.openConnection();
			
			if(null != conn){
				conn.setConnectTimeout(timeOut);
				conn.setUseCaches(false); //캐시사용안함
				conn.setRequestMethod("GET");
				conn.setRequestProperty("X-Naver-Client-Id", "VhAOSgODqnxzPHljqtc_");
				conn.setRequestProperty("X-Naver-Client-Secret", "IgUOl_V6do");
				
				if(HttpURLConnection.HTTP_OK == conn.getResponseCode()){
					br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));					
					sb = new StringBuffer();
					
					while(null != (line=br.readLine())){
						sb.append(line);
					}
					
					response = sb.toString()
									.replaceAll("&lt;", "")
									.replaceAll("b&gt;", "")
									.replaceAll("&amp;", "")
									.replaceAll("&quot;", "")
									.replaceAll("&apos;", "")
									.replaceAll("<b>", "")
									.replaceAll("</b>", "");
					
					br.close();
					conn.disconnect();
				}
			}
		}catch(Exception e) {
			String aa = e.getMessage();
		}
		
		return response;
	}
}
