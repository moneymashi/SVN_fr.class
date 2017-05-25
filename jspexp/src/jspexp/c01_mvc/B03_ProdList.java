package jspexp.c01_mvc;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspexp.z02_vo.Code;

/**
 * Servlet implementation class B03_ProdList
 */
@WebServlet(name = "prodList", urlPatterns = { "/prodList" })
public class B03_ProdList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public B03_ProdList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ctrl=request.getParameter("ctrl");
		
		Cookie[] cookies= request.getCookies();
		ArrayList<Code> cookList = new ArrayList<Code>();
		// ������ Code
		Code cd=null;
		// ���� ��Ű���� ���� ��..
		// ���
		// 1. ���, 2. �ٳ���, 3. ����
		int appleCnt=0;
		int bananaCnt=0;
		int strawCnt=0;
		if(cookies!=null&&cookies.length>0){
			for(Cookie c:cookies){
				if(ctrl!=null&&ctrl.equals("del")){
					c.setMaxAge(0);
					response.addCookie(c);
			// productXXX�� ������� ��Ű���� ��������..
				}else if(c.getName().length()>=7 &&
					c.getName().substring(0,7).equals("product")){
					// ������ü�� ����� �迭�� �ѱ�.
					cd = new Code();
					System.out.println(c.getValue());
					cd.setName(c.getName());
					cd.setValue(c.getValue());
					if(c.getValue().equals("apple") ) appleCnt++;
					if(c.getValue().equals("banana") ) bananaCnt++;
					if(c.getValue().equals("straw") ) strawCnt++;
					cookList.add(cd);
				}				
			}			
		}
		System.out.println("��� ��Ű ����:"+cookList.size());
		request.setAttribute("cookList", cookList);
		request.setAttribute("appleCnt", appleCnt);
		request.setAttribute("bananaCnt", bananaCnt);
		request.setAttribute("strawCnt", strawCnt);
		
		String page="/d02_cookie/a11_list.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
		
	}

}
