package jaspexp.database;

import java.sql.*;

public class A01_EmpDB {
	// field ����
	// 1. Connection con : ���� ��ü
	// 2. Statement stmt : ��ȭ
	//    PreStatement pstmt
	// 3. ResultSet rs; : ���
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// ����ó���� �޼���
	public void setConn() throws ClassNotFoundException, SQLException{
		// 1. driver �޸𸮿� �ø���
		// 2. DriverManager.getConnection(url, id, pass)
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// db ����̹� ����(thin)@ip:port:sid
		String conInfo = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(conInfo, "scott", "tiger");
		System.out.println("���� ���� ����");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A01_EmpDB db = new A01_EmpDB();
		
		try{
			db.setConn();
		}catch(ClassNotFoundException e){
			
		}catch(SQLException e){
			
		}
		
	}

}
