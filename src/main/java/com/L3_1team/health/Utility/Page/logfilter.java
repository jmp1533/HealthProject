package com.L3_1team.health.Utility.Page;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logfilter implements Filter {
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse rep, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) req;
		HttpSession session = request.getSession();
		boolean login = false;
		
		if (session != null) {
			String log = (String) session.getAttribute("id");
			if (log != null) {
				login = true;
			}
		}
		
		if (!login) {
			HttpServletResponse resp = (HttpServletResponse) rep;
			resp.sendRedirect("/client/user/insert/Login");
		} else {
			chain.doFilter(req, rep);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
	}
}
