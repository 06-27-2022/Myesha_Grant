package com.expense.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookies
 */
public class Cookies extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("Myesha")&& password.equals("Bre082")) {
			//send cookie to client machine
			Cookie myCookie = new Cookie("authenticated", "true");
			//add the cookie to response
			response.addCookie(myCookie);
		}else {
			response.setStatus(401);
		}
	}

}
