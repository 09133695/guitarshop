package main.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.dal.SqlFactory;
import main.entity.Guitar;
import main.entity.GuitarSpec;

/**
 * Servlet implementation class AddGuitar
 */
@WebServlet("/AddGuitar")
public class AddGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 SqlFactory.createConnection("sqllite");//创建链接
			GuitarSpec spec = new GuitarSpec(null, null, null, null, null);
			spec.setBackWood(request.getParameter("backwood"));
			spec.setBuilder(request.getParameter("builder"));
			spec.setModel(request.getParameter("model"));
			spec.setTopWood(request.getParameter("topwood"));
			spec.setType(request.getParameter("type"));
		Guitar.addGuitar(request.getParameter("serialnumber"), Double.valueOf(request.getParameter("price")), spec);//添加一个吉他
		request.getRequestDispatcher("allguitars.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
