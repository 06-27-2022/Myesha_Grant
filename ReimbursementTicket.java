package com.expense.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.registration.repository.RevUserImpl;

/**
 * Servlet implementation class ReimbursementTicket
 */
public class ReimbursementTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ReimbursementTicket() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getInputStream();
		
		//constructor
		new ObjectMapper();
		new RevUserImpl();
			
				ReimbursementTicket clientTicket = null;
				ReimbursementTicket.save(clientTicket);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


	public static void save(ReimbursementTicket clientTicket) {
		// TODO Auto-generated method stub
		
	}

}
