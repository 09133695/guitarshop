package guitar.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guitarshop.entity.guitarspec;

/**
 * Servlet implementation class match
 */
@WebServlet("/match")
public class match extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@SuppressWarnings("null")
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("込込込込");
		String backwood = new String(request.getParameter("backwood"));
		System.out.println(backwood);
		guitarspec spec = new guitarspec();
		spec.setBackWood(request.getParameter("backwood"));
		System.out.println(request.getParameter("backwood"));

		/*
		 * if (dpassword.equals(password)) { HttpSession sessionemail =
		 * request.getSession(); sessionemail.setAttribute("email",
		 * request.getParameter("username")); response.setHeader("refresh",
		 * "1;URl=index.jsp"); } // TODO Auto-generated method stub
		 */ }
}
