package com.hefshine.Filter;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import GM_login.bean.GM_memebership;


public class SessionFilter implements Filter {

   
    public SessionFilter() {
    }
	public void destroy() {	
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
	
		
		HttpSession session=req.getSession();
		
		GM_memebership memebership=(GM_memebership) session.getAttribute("memebership");
		
			
			if(session == null && memebership == null)
			{
				RequestDispatcher dispatcher=request.getRequestDispatcher("Login.jsp");
				dispatcher.forward(req, res);
			}
		
		chain.doFilter(request, response);
		}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
