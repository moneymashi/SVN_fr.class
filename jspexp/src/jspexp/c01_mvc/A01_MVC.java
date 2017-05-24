package jspexp.c01_mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A01_MVC
 */
@WebServlet(name = "mvc01", urlPatterns = { "/mvc01" })
public class A01_MVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A01_MVC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		1. ��û ���� ���� ó��..
		
//		2. model�� ó��(view�ܿ� �ٽ�)
		String name="ȫ�浿";
		request.setAttribute("name", name); // view�� ����ó��.. name
		
//		3. view�� ó��(jspȣ��):request, response�� ����.
		String jspPage="/c01_mvc/a01_mvc.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(jspPage);
		rd.forward(request, response);
		
		
	}

}
