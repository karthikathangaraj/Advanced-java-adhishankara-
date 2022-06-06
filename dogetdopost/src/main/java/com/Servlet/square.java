package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class square extends HttpServlet{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	   {

	     // int a=Integer.parseInt(request.getParameter("n1"));
	     // int b=Integer.parseInt(request.getParameter("n2"));
	      //int ans=a+b;
	      //int sqr=ans *ans;
	     // System.out.println(ans);
		int k=(int)request.getAttribute("sqr");
	      PrintWriter out=response.getWriter();
	      out.println("square of two numbers is" +k);
	}

}
