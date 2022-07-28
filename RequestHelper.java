package com.expense.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expense.controller.RevUserController;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class RequestHelper 
 * Used in conjunction with dispatcher servlet.
 */
public class RequestHelper {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	

	public static Object processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String resource = request.getRequestURI();
		
		System.out.println(resource);
		
		String isolatedResource = resource.replace("/Expense/api", "");
		System.out.println(isolatedResource);
		ObjectMapper theMap = new ObjectMapper();

		switch(isolatedResource) {
		case "/revusers":
			response.setContentType("application/json");
			return theMap.writeValueAsString(RevUserController.findAll(request,response));
default:
	response.setStatus(404);
	break;
		}
		return response;
	}

	public static void processPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String resource = request.getRequestURI().replace("/Expense/api", "");		
	switch(resource) {
	case "/revuser":
		RevUserController.save(request, response);
		break;
		default:
			response.setStatus(404); //error
			break;
	}
	
	}
	

}
