package jspexp.b01_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A01_SVL_Start
 * http://localhost:6080/jspexp/a01_start
 * ���� ��ü ȣ��.
 */
@WebServlet(name = "a01_start", urlPatterns = { "/a01_start" })
public class A01_SVL_Start extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A01_SVL_Start() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, 
							HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// ȭ��..
		response.setContentType("text/html; charset=utf-8");
		// ��� ����.Stream���� �������� ����..
		// http://localhost:6080/jspexp/a01_start
		PrintWriter out = response.getWriter();
		out.print("<html><body><h1>�ȳ��ϼ���! ����!!</h1></body></html>");
		
		
	}

}
