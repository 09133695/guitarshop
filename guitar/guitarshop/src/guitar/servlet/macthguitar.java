package guitar.servlet;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import guitarshop.bll.inventoryBll;
import guitarshop.entity.guitar;
import guitarshop.entity.guitarspec;

/**
 * Servlet implementation class macthguitar
 */
@WebServlet("/macthguitar")
public class macthguitar extends HttpServlet {
	@SuppressWarnings("null")
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 接受页面查询条件，并封装成spec
		guitarspec spec = new guitarspec();
		spec.setBackWood(request.getParameter("backwood"));
		spec.setBuilder(request.getParameter("builder"));
		spec.setModel(request.getParameter("model"));
		spec.setTopWood(request.getParameter("topwood"));
		spec.setType(request.getParameter("type"));
		// 新建一个guitar List 用来存储匹配到的guitars
		List matchingGuitars = new LinkedList();

		// 调用inventoryDal的match（）方法，传入spec对象作为参数，遍历数据库中所有guitar与之匹配
		// 并将结果返回给matchingGuitars
		try {
			matchingGuitars = inventoryBll.match(spec);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(matchingGuitars);
		request.setAttribute("aaa", matchingGuitars);
		request.getRequestDispatcher("match.jsp").forward(request, response);
	}
}
