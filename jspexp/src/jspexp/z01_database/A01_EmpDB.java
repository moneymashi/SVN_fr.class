package jspexp.z01_database;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import jspexp.z02_vo.Emp;
// jspexp.z01_database.A01_EmpDB
public class A01_EmpDB {
	// field ����
	// 1. Connection con : ���� ��ü
	// 2. Statement stmt : ��ȭ
//	      PreparedStatement pstmt
//	   3. ResultSet rs;  : ���
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// ����ó���� �޼��� : ���ܻ��� ����ó��
	private void setConn() throws ClassNotFoundException, SQLException{
//		1. driver�޸𸮿� �ø���
//		2. DriverManger.getConnection(url, id,pass)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// db����̹�����(thin)@ip:port:sid
			String conInfo="jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(conInfo, "scott", "tiger");
			System.out.println("���� ���� ����!!");
	}
	// emp ���̺� select * from emp���ؼ� �������� �����͸�
	// ArrayList<Emp>�� ������
	public ArrayList<Emp> empList(){
		ArrayList<Emp> list = new ArrayList<Emp>();
//		1. ����
		try {
			setConn();
//		2. ��ȭ
			stmt=con.createStatement();
//			sqló��
			String sql="SELECT * FROM EMP ";
//			��ȭ�� �ϰ�, �����(ResultSet)
			rs = stmt.executeQuery(sql);
//		3. ���(select==> ResultSet, insert/update/delete ==> DB�� ó��)
//			rs.next() : loop ��{}�� ó���� �Ŀ�, ���� row�� �����Ͱ�
//			            �ִ��� ���θ� return true/false
//			rs.getXXXX("�÷���") �÷���:sql���� ��Ÿ���� title �÷���
//			                     database��  �÷���X
//			1)  ArrayList<Emp>�� �����͸� ���� ������ü(Emp)�� �߰�
//			    Emp(����, �������Ҵ�)  --> ArrayList<Emp> add
			Emp emp=null; // ���� ��ü ����
			// Emp emp �� loop�� �ȿ� �����ϸ� ������ü�� �ݺ���ŭ ���� �޸�
			// ���Ϲ߻�
		    // Emp emp = new Emp(); loop�� �ۿ��� �����ϰ�, loop�� �ȿ� ����
			// ���� ������ ���� ��ü�� �����ϱ�, ������ �����͸� ������ �Ǽ���ŭ
			// �Ҵ�
			while(rs.next()){
				emp = new Emp();
				// emp.setEmpno()��  ������ ������(rs.getInt("empno"))
//				  �Ҵ������� empno �ʵ忡 �����͸� ����
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// ����,����, ���  rollback()
			e.printStackTrace();
		}finally{
			
			// �ڿ� ����
			try {
				if(rs!=null){
					// ResultSet�� ���� �޸𸮿� �Ҵ� �Ǿ� �ִٸ�.
					rs.close();
				}
				if(stmt!=null){
					stmt.close();
				}	
				if(con!=null){
					con.close();
				}				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	// �˻� �޼���
	// input(Person p){
	//   
	//}
	// ���� �޼���
	// Person p = new Person();
	// p.name="ȫ�浿"
	// input(p)
	public ArrayList<Emp> search(Emp sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		try {
			setConn();
			stmt=con.createStatement();
			String sql="SELECT * \n"
					+ "FROM EMP  \n"
					+ "WHERE ENAME LIKE '%"+sch.getEname()+"%'  \n"
					+ "AND JOB LIKE '%"+sch.getJob()+"%' ";
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// ����,����, ���  rollback()
			e.printStackTrace();
		}finally{
			// �ڿ� ����
			try {
				if(rs!=null){
					// ResultSet�� ���� �޸𸮿� �Ҵ� �Ǿ� �ִٸ�.
					rs.close();
				}
				if(stmt!=null){
					stmt.close();
				}	
				if(con!=null){
					con.close();
				}				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	// �˻� �޼���
	public ArrayList<Emp> searchPre(Emp sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		try {
			setConn();

			String sql="SELECT * \n"
					+ "FROM EMP  \n" 
					+ "WHERE ENAME LIKE '%' || ? || '%'  \n"
					+ "AND JOB LIKE '%'||?||'%' ";
			System.out.println(sql);
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, sch.getEname()); //ù��°
			pstmt.setString(2, sch.getJob());//�ι�°
			
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// ����,����, ���  rollback()
			e.printStackTrace();
		}finally{
			// �ڿ� ����
			try {
				if(rs!=null){
					// ResultSet�� ���� �޸𸮿� �Ҵ� �Ǿ� �ִٸ�.
					rs.close();
				}
				if(stmt!=null){
					stmt.close();
				}	
				if(con!=null){
					con.close();
				}				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	// �Է¸޼��� �����..
	public void insertEmp(Emp ins){
		// db ����ó��..
		try {
			con=A00_DB.conn();
			String sql="INSERT INTO EMP VALUES( EMP_SEQ.NEXTVAL,"
					+ "?,?,?,SYSDATE,?,?,?)";
			/* COMMIT
			 autocommit �ɼ��� false����Ͽ� commit���� ���� ������ 
			 Ʈ����� Ȯ�� ó������ �ʵ��� �Ѵ�. setAutoCommit(false) 
			 * */
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(sql);	
			pstmt.setString(1, ins.getEname());
			pstmt.setString(2, ins.getJob());
			pstmt.setInt(3, ins.getMgr());
			pstmt.setDouble(4, ins.getSal());
			pstmt.setDouble(5, ins.getComm());
			pstmt.setInt(6, ins.getDeptno());
			pstmt.executeUpdate();
			// ���������� ó�� �Ǿ��� ��, commit
			con.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// ��Ͻ�, ���� �߻����� ��ü ������ �Է� ���
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void updateEmp(Emp upt){
		try {
			con = A00_DB.conn();
			con.setAutoCommit(false);
			String sql="update emp      "+
						"   set ename=?,"+
						"	   job=?,   "+
						"	   mgr=?,   "+
						"	   sal=?,   "+
						"	   comm=?,  "+
						"	   deptno=? "+
						"where empno=?  ";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, upt.getEname());
			pstmt.setString(2, upt.getJob());
			pstmt.setInt(3,  upt.getMgr());
			pstmt.setDouble(4,  upt.getSal());
			pstmt.setDouble(5,  upt.getComm());
			pstmt.setInt(6,  upt.getDeptno());
			pstmt.setInt(7,  upt.getEmpno());
			pstmt.executeUpdate();
			con.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A01_EmpDB db = new A01_EmpDB();
		Emp dto= new Emp();
		dto.setEname("aa");
		dto.setJob("accs");
		dto.setMgr(7839);
		dto.setSal(8888);
		dto.setComm(888);
		dto.setDeptno(40);
		dto.setEmpno(7936);
//		db.insertEmp(dto); // 
		db.updateEmp(dto); // 
		System.out.println(db.empList().size());
		for(Emp emp:db.empList()){
			System.out.print(emp.getEmpno()+"\t");
			System.out.print(emp.getEname()+"\t");
			System.out.print(emp.getMgr()+"\t");
			System.out.print(emp.getJob()+"\t");
			System.out.print(emp.getHiredate()+"\t");
			System.out.print(emp.getSal()+"\t");
			System.out.print(emp.getComm()+"\t");
			System.out.print(emp.getDeptno()+"\n");
		}
		/*
		Emp sch01 = new Emp();
		sch01.setEname("S");
		System.out.println("check");
		for(Emp emp:db.search(sch01)){
			System.out.print(emp.getEmpno()+"\t");
			System.out.print(emp.getEname()+"\t");
			System.out.print(emp.getMgr()+"\t");
			System.out.print(emp.getJob()+"\t");
			System.out.print(emp.getHiredate()+"\t");
			System.out.print(emp.getSal()+"\t");
			System.out.print(emp.getComm()+"\t");
			System.out.print(emp.getDeptno()+"\n");
		}	
		*/	
		
	}

}
