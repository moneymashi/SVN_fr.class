package jspexp.z01_database;

import java.sql.Statement; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jspexp.z02_vo.Emp;

/*
 * XXXDB.java����
 * vo��Ű��
 * 
 * field����
 * 1. Connection con :���ᰴü
 * 2. Statement stmt :��ȭ
 * 		PreStatement pstmt
 * 3. ResultSet rs; : ���
 * 
 */
public class A01_EmpDB {
	
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	/*public*/private void setConn() throws ClassNotFoundException,SQLException{
				//#####!!! throws~~~ exceptions ���� �����Ѱ��̹Ƿ� try catch�� ������ �ʿ����.
		// 1. driver �޸𸮿� �ø���
		// 2. DriverManager.getConnection(url, id, pass)
			Class.forName("oracle.jdbc.driver.OracleDriver");  //try catch����� �������� �ȶ�.
			//DB����̹�����(thin)@ip:port:sid  //####�⺻������ �����ҋ� �ʿ��ϴ�.
			String conInfo = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(conInfo, "scott", "tiger");
			System.out.println("Connection completed");
	}
	/*
	 *  emp ���̺� select * from emp���ؼ� �������� �����͸� 
	 *  ArrayList<Emp>�� �����ð���.
	 */
	public ArrayList <Emp> empList(){
		ArrayList<Emp> list = new ArrayList<Emp>();
		
		//1.����
		try {
			setConn();
			//2. ��ȭ
			stmt = con.createStatement();
			//sqló��.. 
			String sql = "select * from emp";
			//��ȭ�� �ϰ� ����� resultSet
			rs = stmt.executeQuery(sql);
			
			//3. ���. (select ==> ResultSet, insert/update/delete ==> DB�� ����.)
			// rs.next() : loop ��{}�� ó���� �Ŀ�, ���� row�� �����Ͱ� �ִ��� ���� boolean return.
			// rs.getXXXX("����/Ÿ��Ʋ��")   // �����ͺ��̽��� �÷���X
			/*
			 *  1) ArrayList<Emp> �� �����͸� ���� ������ü(Emp)�� �߰�
			 *  Emp (����, �������Ҵ�)  --> ArrayList<Emp> add
			 */
			Emp emp = null;
			// Emp emp�� loop���ȿ� �����ϸ餷������ü�� �ݺ���ŭ ���ܼ�, �޸𸮺��Ϲ߻�
			while(rs.next()){
				// Emp emp = new Emp(); loop�� �ۿ��� �����ϰ�, loop�� �ȿ� �������� ������ 
				// ������ü�� ������������, ������ �����͸� ������ �Ǽ���ŭ �Ҵ�.
				emp = new Emp();
				// emp.setEmpno() �� ������ ������(rs.getInt("empno"))
				//�Ҵ������� empno�ʵ忡 �����͸� ����.
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getDouble("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				list.add(emp);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// ����, ����, ��� rollback()
			
		}finally{
			/*
			 * �ڿ��Ҵ� ����: Connection -> Statement -> ResultSet
			 * �ڿ���������: ResultSet -> Statements -> Connection.
			 * if(�ڿ�!= null) �ڿ�.close()
			 *  // �ַ� finally���� ó���ȴ�.
			 */
			try {
				if(rs != null)   // resultSet�� �޸𸮿� �Ҵ�Ǿ�������..
					rs.close();  // IO�߻��ؼ� ����ó�� �������.
				if(stmt != null)
					stmt.close();
				if(con != null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		return list;
		
	}
	
	
	public ArrayList<Emp> search(Emp sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		try {
			setConn();
			stmt=con.createStatement();
			
			String sql = "select * from emp " 
			+ "where ename like '%" + sch.getEname() + "%' "
			+ " and job like '%" + sch.getJob() + "%' ";
			System.out.println(sql);
			
			rs = stmt.executeQuery(sql);
			Emp emp=null; // ���� ��ü ����
			while(rs.next()){
				emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getDouble("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				list.add(emp);		
			}
			// ����, ����, ���  �� ==> commit()
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			// �ڿ� ����
			try {
				if(rs!=null){
					rs.close();
				}
				if(stmt!=null){
					stmt.close();
				}	
				if(con!=null){
					con.close();
				}				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<Emp> searchPre(Emp sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		try {
			setConn();
			
			String sql = "select * from emp " 
			+ "where ename like '%' ||?|| '%' "   //####
			+ " and job like '%' ||?|| '%' ";	//####
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sch.getEname());
			pstmt.setString(2, sch.getJob());
			System.out.println(sql);
			
			rs = pstmt.executeQuery();
			Emp emp=null; // ���� ��ü ����
			while(rs.next()){
				emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getDouble("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				list.add(emp);		
			}
			// ����, ����, ���  �� ==> commit()
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			// �ڿ� ����
			try {
				if(rs!=null){
					rs.close();
				}
				if(stmt!=null){
					stmt.close();
				}	
				if(con!=null){
					con.close();
				}				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		A01_EmpDB db = new A01_EmpDB();
		
		// search() Ȱ��.
		Emp sch = new Emp();
		for(Emp emp: db.searchPre(sch)  /*search*/){
			System.out.println(
					emp.getEmpno() + "\t"+
					emp.getEname() +"\t"+
					emp.getJob() +"\t"+
					emp.getMgr() +"\t"+
					emp.getHiredate() +"\t"+
					emp.getSal() +"\t"+
					emp.getComm() +"\t"+
					emp.getDeptno()
					);
		}
	}
	
	
	

}
