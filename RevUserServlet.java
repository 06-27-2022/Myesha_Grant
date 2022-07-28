package com.expense.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expense.model.RevUser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.registration.repository.RevUserImpl;

//JavaScript Object Notation
//Servlet is an abstract class extended from GenericServlet. Servlets intercept HTTP request.
public class RevUserServlet extends HttpServlet {
	
	//Serialization added to remove compiler warning
	private static final long serialVersionUID = 1L;

	//getting resource from the server
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RevUserImpl revUserRepo = new RevUserImpl();
		List<RevUser> revuser = revUserRepo.findAllRevUsers();
		
		ObjectMapper theMapper = new ObjectMapper();
		String json = theMapper.writeValueAsString(revuser); 
		
		
		response.setContentType("application/json");
		
		//writes to response body
		PrintWriter writer = response.getWriter();
		writer.write("select * from revuser");
		
		response.setStatus(200);
		
		return;
				
		
}
	//sending data to the server
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//reads and writes the values
		ObjectMapper objectMapper = new ObjectMapper();
		RevUser revUserFromRequestBody = objectMapper.readValue(request.getInputStream(),RevUser.class);
				
				//prints to console
		System.out.println(revUserFromRequestBody);
		
		
	}
	
}                                    