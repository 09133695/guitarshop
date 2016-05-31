package main.servlet;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.bll.GuitarBll;
import main.entity.GuitarSpec;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public search() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 接受页面查询条件，并封装成spec
		GuitarSpec spec = new GuitarSpec(null, null, null, null, null);
		spec.setBackWood(request.getParameter("backwood"));
		spec.setBuilder(request.getParameter("builder"));
		spec.setModel(request.getParameter("model"));
		spec.setTopWood(request.getParameter("topwood"));
		spec.setType(request.getParameter("type"));
		// 新建一个guitar List 用来存储匹配到的guitars
		List matchingGuitars = new LinkedList();

		matchingGuitars = GuitarBll.inventory().search(spec);

		System.out.println(matchingGuitars);

		request.setAttribute("matchingGuitars", matchingGuitars);
		request.getRequestDispatcher("match.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
