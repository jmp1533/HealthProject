package com.L3_1team.health.dao.client.menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.Utility.Page.Util;
import com.L3_1team.health.dto.client.menu.Health_news_Dto;

@Repository
public class Health_news_Dao {
	private String _url = "https://openapi.naver.com/v1/search/news.json";
	private int _timeOut = 10000;
	
	
	public ArrayList<Health_news_Dto> list(int pageNum, String sort){		
		ArrayList<Health_news_Dto> list=new ArrayList<Health_news_Dto>();
		StringBuffer param = new StringBuffer();
		JSONParser jsonParse = new JSONParser();
		
		String response = "";				
		int pageStart = 1;
		int total=0;
		
		try{			
			pageStart = ((pageNum-1)*10)+1;
			
			param.append("query=" + URLEncoder.encode("식단 헬스","utf-8"));
			param.append("&sort=" + URLEncoder.encode(sort,"utf-8"));
			param.append("&start=" + pageStart);
			             			
			response = Util.GetHttpResponse(_url, param.toString(), _timeOut);
			
			JSONObject responseObj = (JSONObject) jsonParse.parse(response);
			
			total = Integer.parseInt(responseObj.get("total").toString());
			
			JSONArray items = (JSONArray) responseObj.get("items");
			
			for(int i=0; i<items.size(); i++) {
				
				JSONObject item = (JSONObject) items.get(i);
				
				String title = item.get("title").toString();
				String content = item.get("description").toString();
				String link = item.get("link").toString();
				
				//EEE, d MMM yyyy HH:mm:ss Z
				SimpleDateFormat pubDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", Locale.US); 
				Date pubDate = pubDateFormat.parse(item.get("pubDate").toString()); 

				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String date = dateFormat.format(pubDate);
								
				list.add(new Health_news_Dto(title, content, link, date, total));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return list;
	}	
}
