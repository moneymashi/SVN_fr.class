package jspexp.c01_mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspexp.z02_vo.Member;

/**
 * Servlet implementation class A05_Login
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class A05_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A05_Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("login Controller ȣ��");
//		1. ��û
		String id= request.getParameter("id");
		String pwd= request.getParameter("pwd");
//		2. modelȣ����, �����
		boolean goMain=false;
		// id�� pass�� �Էµ� ���
		if(id!=null&&pwd!=null){
			// ��ȿ�� id�� pass �Է��� ���
//			if(id.equals("himan")&&pwd.equals("7777")){
//				goMain=true;
//				// view�ܿ� �ѱ� ������
//			}
			A05_Service service = new A05_Service();
			Member vo = new Member();
			vo.setMemid(id);
			vo.setPass(pwd);
			// ��ȿ�� ���..
			if(service.isValid(vo)){
				goMain=true;
			}
			// login�� �� ��쿡�� id���� ������ ����.
			request.setAttribute("id", id);
		}
//		3. View�� ȣ��.
		System.out.println("id��?"+id);
		String page="/c01_mvc/a05_login.jsp";
		// id���� ���� ��, �ʱ� pageȣ��
//		if(id==null||id.trim().equals("")){
//			page="/c01_mvc/a06_main.jsp";
//		}else{
//			page="/c01_mvc/a06_main.jsp";
//		}
		// ���� ������ �� �� ���� ��.
		if( goMain ){
			page="/c01_mvc/a06_main.jsp";
		}
		
		// id�� ���� ��, DB check�ؼ� model ó��
		System.out.println("�̵��� page:"+page);
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
		
	}

}
