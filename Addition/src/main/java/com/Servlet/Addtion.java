package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Addtion extends HttpServlet{ 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mymsg;

	   public void init() throws ServletException {
	      mymsg = "good morning team ";
	   }

	   public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	   {

	      // Setting up the content type of webpage
	      response.setContentType("text/html");

	      // Writing message to the web page
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + mymsg + "</h1>");
	   }

	   public void destroy() {
	     
	}
	
	
	

}
