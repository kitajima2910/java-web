package com.hoaipx.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/index")
public class IndexController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("txtName");
		int age = Integer.parseInt(req.getParameter("txtAge"));
		req.setAttribute("title", "JSP - Servlet");
		req.setAttribute("name", name);
		req.setAttribute("age", age);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
}
