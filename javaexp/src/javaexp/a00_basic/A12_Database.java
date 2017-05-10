package javaexp.a00_basic;

import java.sql.*; // java.sql package ������ �ִ� ������ ��� ���ڽ��ϴ�.

public class A12_Database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	DB�� java�� ������ �ʿ��� ��ҵ�..
 * 1) �����ϴ� �ٸ�!!  
 * 		- �޸� (driver) jdbc
 *      - Class.forName("����̹�")
 * 2) ��� DB server��ü ����
 * 		- ip, port, sid, ����, ��й�ȣ.
 *      - Connection ��ü..
 *      - DriverManager.getConnection("ip","id","password")
 * 3) sql�� ����..server�� ����..
 * 		- ���ᰴü.createStatement()
 *      - Statement�� executeQuery("select * from emp");
 * 4) select �� ���, ������� �޾ƾ�..
 *      - ResultSet ���� Statement�� executeQuery("select * from emp");
 *      - ����..
 *      - while(rs.next())  
 *      		rs.getString("�÷���") 
 * */
		// ����..
		Connection con=null;
		// ��ȭ..
		Statement stmt=null;
		// ��ȭ�� ���� �����..select * from emp
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//  ip : localhost
			// port : 1521
			// sid : xe
			// id : scott 
			// pass : tiger
			// jdbc:oracle:thin:@localhost:1521:xe
			//  driver ���� @ ip:port:sid
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
//			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "tiger");
			stmt = con.createStatement();
			String sql = "SELECT * FROM EMP ";
			rs = stmt.executeQuery(sql);
			// �����Ͱ� ���� ������,,,
			while( rs.next()){
				System.out.println(rs.getInt("empno")+"\t"
								+rs.getString("ename"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("���Ἲ��!!!");
	}

}
