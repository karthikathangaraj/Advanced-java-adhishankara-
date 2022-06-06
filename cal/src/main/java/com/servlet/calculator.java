package com.servlet;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpServlet;

public class calculator extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
	         int a=Integer.parseInt(request.getParameter("n1"));	
	         int b=Integer.parseInt(request.getParameter("n2"));	
	         int ans=a+b;
	         System.out.println(ans);
	}
	
	

}
