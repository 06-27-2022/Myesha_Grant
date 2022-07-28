package com.expense.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Dispatcher
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DispatcherServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String httpVerb = request.getMethod();
		
		if(httpVerb.equals("GET")) {
			RequestHelper.processGet(request, response);
		}else if(httpVerb.equals("POST")) {
			RequestHelper.processPost(request, response);
		}
		
		@SuppressWarnings("unused") // Uniform Resource Identifier
		String resource = request.getRequestURI();
		
		System.out.println(request.getRequestURI());
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
