package com.expense.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.registration.repository.RevUserImpl;
import com.registration.repository.RevUserRepo;

/**
 * Servlet implementation class TicketStatus
 */
public class TicketStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private JsonParser TicketStatus;
       
    
    public TicketStatus() {
        super();
    }

	
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getInputStream();
		
		ObjectMapper objectMapper = new ObjectMapper();
//		JsonParser  TicketStatus = null;
		ReimbursementTicket reimbursementTicket = objectMapper.readValue(TicketStatus, ReimbursementTicket.class);
				
				
				RevUserRepo revUserRepo = new RevUserImpl();
			
				ReimbursementTicket clientTicket = null;
				ReimbursementTicket.save(clientTicket);	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
