package com.qn.controller;

import java.io.IOException;

import com.qn.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		// request.getParameter("id" --> this would give me a String type data
		String name = request.getParameter("name");
		// Here Integer.parseInt() --> This is not required in the above program because
		// it is giving a string so no need to convert it to string
		int marks1 = Integer.parseInt(request.getParameter("marks1"));
		int marks2 = Integer.parseInt(request.getParameter("marks2"));
		int marks3 = Integer.parseInt(request.getParameter("marks3"));
		Student tempStudent = new Student();
		tempStudent.setId(id);
		tempStudent.setName(name);
		tempStudent.setMarks1(marks1);
		tempStudent.setMarks2(marks2);
		tempStudent.setMarks3(marks3);

		int rows = tempStudent.addResult();
		if (rows == 0) {
			response.sendRedirect("/add-result-mvc/AddResultFailure.html");
		} else {
			response.sendRedirect("/add-result-mvc/AddResultSuccess.html");
		}

	}
}
