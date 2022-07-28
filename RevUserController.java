package com.expense.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expense.model.RevUser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.registration.repository.RevUserImpl;
import com.registration.repository.RevUserRepo;

public class RevUserController {

		private RevUserRepo revUserRepo;
		public static ObjectMapper objectMapper;
		
		public RevUserController() {
			setRevUserRepo(new RevUserImpl());
			objectMapper = new ObjectMapper();
		}
		
	public static Object processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		return response;
		
	}		
		
		public static String findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String json = objectMapper.writeValueAsString(RevUserRepo.findAllRevUsers());
			return json;
		}
	

	public static void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String jsonBody = new String();
		ObjectMapper objectMapper = new ObjectMapper();
		RevUser newRevUser = objectMapper.readValue(jsonBody, RevUser.class);
		RevUserRepo.save(newRevUser);	

}

	public RevUserRepo getRevUserRepo() {
		return revUserRepo;
	}

	public void setRevUserRepo(RevUserRepo revUserRepo) {
		this.revUserRepo = revUserRepo;
	}
	
}
