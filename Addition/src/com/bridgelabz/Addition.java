package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addition
 */
@WebServlet("/Add")
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int firstNumber = Integer.parseInt(request.getParameter("first"));
		int secondNumber = Integer.parseInt(request.getParameter("second"));
		int addition = firstNumber + secondNumber;
		PrintWriter out =  response.getWriter();
		out.println("<h1>Result" +addition+ "</h1>");
	}



}
