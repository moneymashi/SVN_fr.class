package javaexp.a00_basic;

import java.sql.*; // java.sql.* ���� ��� �� import �ϰڴ�.

public class A12_Database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * DB �� java�� ������ �ʿ��� ��ҵ�
		 * 	1) �����ϴ� �ٸ�
		 * 		- �޸�(driver) jdbc
		 * 		- Class.forName("����̹�")
		 * 
		 * 	2) ��� DB server ��ü ����
		 * 		- ip, port, sid, id/pw
		 * 		- Connetion ��ü
		 * 		- DriverManager.getConnection("ip","id","password")
		 * 
		 * 	3) sql�� ����, server�� ����
		 * 		- ��ȭ��ü createStatement()
		 * 		- Statement�� executeQuery("select * from emp");
		 * 
		 * 	4) select �� ���, ������� �޾ƾ�
		 * 		- ResultSet ���� Statement�� executeQuery("select * from emp");
		 * 		- �� �޴�
		 * 		- while(rs.next()){
		 * 			rs.getString("�÷���")
		 * 		}
		 * */

		//����
		Connection con=null;
		//��ȭ
		Statement stmt=null;
		//��ȭ�� ���� ����� .. select * from emp;
		ResultSet rs=null;

		try {
			// IO ����ó�� ���־�� !
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// ip : localhost
			// port : 1521
			// sid : xe
			// id : scott
			// pw : tiger
			// jdbc:oracle:thin:@
			// ����̹� ���� @ ip:port:sid
			// toad - �ش� ���� - properties ���� Ȯ�ΰ���
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// IO ����ó��
			// ctrl + 1 ���� catch clause �ϸ� �߰������� ó���ȴ�
			con = DriverManager.getConnection(url,"scott","tiger");
			

			stmt=con.createStatement();
			String sql="SELECT * FROM EMP";
			
			rs=stmt.executeQuery(sql);
			// �����Ͱ� ����������
			while(rs.next()){
				System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename"));
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				// IO ����ó��
				rs.close();
				stmt.close();
				con.close();		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		// System.out.println("Connection Success");
	}

}
