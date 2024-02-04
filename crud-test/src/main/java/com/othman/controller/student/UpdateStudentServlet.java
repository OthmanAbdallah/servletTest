package com.othman.controller.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.othman.dao.StudentDao;

/**
 * Servlet implementation class UpdateStudentServlet
 */
@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDao studentdao = new StudentDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("success",studentdao.updateStudent( 
				Integer.parseInt(request.getParameter("Sid")), 
				request.getParameter("Name"), 
				Integer.parseInt(request.getParameter("Age")), 
				request.getParameter("Country"),
				Double.parseDouble(request.getParameter("Gpa")), 
				request.getParameter("Uni_Abb"),
				request.getParameter("Gender")));
		RequestDispatcher rd=request.getRequestDispatcher("/UpdateStudentResult.jsp");
		rd.forward(request, response);
	}

}
