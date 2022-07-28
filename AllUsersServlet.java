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
import com.registration.repository.RevUserRepo;


public class AllUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AllUsersServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		@SuppressWarnings("unused")
		RevUserRepo revuserrepo = new RevUserImpl();
		List<RevUser> revusers = RevUser.findAllRevUsers();	
		
		//read and write functionality
		ObjectMapper theMap = new ObjectMapper();
		String json = theMap.writeValueAsString(revusers);
		
		response.setContentType("application/JSON");
		//print out representations of the object that is called
		PrintWriter writer = response.getWriter();
		writer.write(json);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
