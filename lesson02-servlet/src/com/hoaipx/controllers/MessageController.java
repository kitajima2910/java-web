package com.hoaipx.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/message.html")
public class MessageController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg = "Đang vào doGet(req, resp)";
		req.setAttribute("keyMsg", msg);
		req.getRequestDispatcher("message.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg = "Đang vào doPost(req, resp)";
		req.setAttribute("keyMsg", msg);
		req.getRequestDispatcher("message.jsp").forward(req, resp);
	}
	
}
