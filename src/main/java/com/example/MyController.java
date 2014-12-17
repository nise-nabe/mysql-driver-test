package com.example;

import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Driver;
import java.sql.DriverManager;

import lombok.SneakyThrows;

@WebServlet("/")
public class MyController extends HttpServlet {
	@Override
	@SneakyThrows
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		Enumeration<Driver> ds = DriverManager.getDrivers();
		while (ds.hasMoreElements()) {
			Driver d = ds.nextElement();
			response.getWriter().println(d.getClass());
		}
	}
}
