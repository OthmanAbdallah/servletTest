package com.othman.controller.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.othman.dao.StudentDao;
import com.othman.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/Createstudentservlet")
public class CreateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private StudentDao studentdao = new StudentDao();
   
    public CreateStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd=request.getRequestDispatcher("/createStudent.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Sid=Integer.parseInt(request.getParameter("Sid"));
		String Name=request.getParameter("Name");
		int Age=Integer.parseInt(request.getParameter("Age"));
		String Country=request.getParameter("Country");
		double Gpa=Double.parseDouble(request.getParameter("Gpa"));
		String Uni_Abb=request.getParameter("Uni_Abb");
		String Gender=request.getParameter("Gender"); 
		Student student = new Student(12,Name,Age,Gender,Country,Sid,Gpa,Uni_Abb);
		
		request.setAttribute("success",studentdao.createStudent(student));
		
		RequestDispatcher rd=request.getRequestDispatcher("/CreateStudentResult.jsp");
		rd.forward(request, response);
	}

}
