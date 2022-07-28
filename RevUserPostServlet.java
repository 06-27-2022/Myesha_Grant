package com.expense.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expense.model.RevUser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.registration.repository.RevUserImpl;
import com.registration.repository.RevUserRepo;

/**
 * Servlet will intercept HTTP request, allow to receive user data
 */
public class RevUserPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 public RevUserPostServlet() {
        super();//abstract class
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
//		String requestBodyText = new String(request.getInputStream());
		
		//Deserialize into a java object using Jackson's Object Mapper
		ObjectMapper objectMapper = new ObjectMapper();
		RevUser revuser = objectMapper.readValue(request.getInputStream(), RevUser.class);
				
				@SuppressWarnings("unused")
				RevUserRepo revUserRepo = new RevUserImpl();
			
				RevUserRepo.save(revuser);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
