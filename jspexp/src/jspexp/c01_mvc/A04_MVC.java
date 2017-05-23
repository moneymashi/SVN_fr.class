package jspexp.c01_mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A04_MVC
 */
@WebServlet(name = "mvc04", urlPatterns = { "/mvc04" })
public class A04_MVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A04_MVC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// urlPatterns = { "/mvc04" }
		// http://localhost:6080/jspexp/mvc04?num01=77&num02=55&name=himan
		// 1. 요청값..
		String num01= request.getParameter("num01");
		String num02= request.getParameter("num02");
		String name= request.getParameter("name");
		// 2. model(비지니스로직) 
		int sum=Integer.parseInt(num01)+Integer.parseInt(num02);
		System.out.println(num01+" + "+num02 + " = "+ sum);
		System.out.println("mvc04 호출!!num01:"+num01);
		System.out.println("mvc04 호출!!name:"+name);
		
		
	}

}
