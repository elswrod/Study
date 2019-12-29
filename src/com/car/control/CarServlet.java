package com.car.control;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CarServlet
 */
@WebServlet("/CarServlet")
public class CarServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//doGet(request, response);
		String method=request.getParameter("method");
		switch(method) {
		case"listAll":{
			System.out.println("查询");
			
			
			
			break;
		}
		case"listAdd":{
			System.out.println("增加");
			break;
		}
		case"listDel":{
			System.out.println("删除");
			break;
		}
		case"listUpdate":{
			System.out.println("修改");
			break;
		}
		}
	}

}
