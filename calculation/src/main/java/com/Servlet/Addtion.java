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
	   public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	   {

	      int a=Integer.parseInt(request.getParameter("n1"));
	      int b=Integer.parseInt(request.getParameter("n2"));
	      int ans=a+b; 
	      PrintWriter out=response.getWriter();
	      if(ans%2==0)
	      {
	    	  System.out.println("even number");
	    	  out.println("even number");
	    	  
	      }
	      System.out.println(ans);
	      
	      out.println("addition of two numbers is ="+ans);
	}
	
	
	

}
