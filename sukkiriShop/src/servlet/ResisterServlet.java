package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Account;

@WebServlet("/ResisterServlet")
public class ResisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(
		        "/WEB-INF/jsp/resister.jsp");
		    dispatcher.forward(request, response);	}

	protected void doPost(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String userid = request.getParameter("userId");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String pass = request.getParameter("pass");
		String mail = request.getParameter("mail");
		Account newaccount = new Account();
		try {
		newaccount.setUserid(userid);
		newaccount.setName(name);
		newaccount.setAge(Integer.parseInt(age));
		newaccount.setPass(pass);
		newaccount.setMail(mail);

		request.setAttribute("newaccount", newaccount);

		RequestDispatcher dispatcher = request.getRequestDispatcher(
		        "/WEB-INF/jsp/ResisterOK.jsp");
		    dispatcher.forward(request, response);
		}catch(NumberFormatException e) {
			System.out.println("もう一度やり直してください");
		}
	}

}
