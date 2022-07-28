package com.expense.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InvalidateCookies
 */
public class InvalidateCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InvalidateCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookieJar = request.getCookies();
		for(Cookie cookie : cookieJar) {
			if(cookie.getName().equals("authenticated")) {
				cookie.setMaxAge(0);//deletes cookie
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
