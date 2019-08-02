package com.covalense.emp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;
@Log
//@WebServlet("/")
public class FrontEndController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// forwarding the servlet using path
		//String path =req.getRequestURI();
		//log.info("===url"+path);
		//req.getRequestDispatcher(path).forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// forwarding the servlet using path
		//String path = "/emp/" + req.getPathInfo();
		//req.getRequestDispatcher(path).forward(req, resp);
	}

}// end of class
