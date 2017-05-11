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
 * XXXDB.java생성
 * vo패키지
 * 
 * field선언
 * 1. Connection con :연결객체
 * 2. Statement stmt :대화
 * 		PreStatement pstmt
 * 3. ResultSet rs; : 결과
 * 
 */
public class A01_EmpDB {
	
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	/*public*/private void setConn() throws ClassNotFoundException,SQLException{
				//#####!!! throws~~~ exceptions 으로 위임한곳이므로 try catch가 일일히 필요없다.
		// 1. driver 메모리에 올리기
		// 2. DriverManager.getConnection(url, id, pass)
			Class.forName("oracle.jdbc.driver.OracleDriver");  //try catch해줘야 에러라인 안뜸.
			//DB드라이버종류(thin)@ip:port:sid  //####기본적으로 연결할떄 필요하다.
			String conInfo = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(conInfo, "scott", "tiger");
			System.out.println("Connection completed");
	}
	/*
	 *  emp 테이블에 select * from emp통해서 가져오는 데이터를 
	 *  ArrayList<Emp>로 가져올거임.
	 */
	public ArrayList <Emp> empList(){
		ArrayList<Emp> list = new ArrayList<Emp>();
		
		//1.연결
		try {
			setConn();
			//2. 대화
			stmt = con.createStatement();
			//sql처리.. 
			String sql = "select * from emp";
			//대화를 하고 결과값 resultSet
			rs = stmt.executeQuery(sql);
			
			//3. 결과. (select ==> ResultSet, insert/update/delete ==> DB내 정리.)
			// rs.next() : loop 블럭{}을 처리한 후에, 다음 row에 데이터가 있는지 여부 boolean return.
			// rs.getXXXX("별명/타이틀명")   // 데이터베이스의 컬럼명X
			/*
			 *  1) ArrayList<Emp> 에 데이터를 담은 단위객체(Emp)를 추가
			 *  Emp (생성, 데이터할당)  --> ArrayList<Emp> add
			 */
			Emp emp = null;
			// Emp emp를 loop문안에 선언하면ㅇ참조객체가 반복만큼 생겨서, 메모리부하발생
			while(rs.next()){
				// Emp emp = new Emp(); loop문 밖에서 생성하고, loop문 안에 생성하지 않으면 
				// 같은객체를 참조가때문에, 마지막 데이터를 데이터 건수만큼 할당.
				emp = new Emp();
				// emp.setEmpno() 에 가져온 데이터(rs.getInt("empno"))
				//할당함으로 empno필드에 데이터를 저장.
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
			// 수정, 삭제, 등록 rollback()
			
		}finally{
			/*
			 * 자원할당 순서: Connection -> Statement -> ResultSet
			 * 자원해제순서: ResultSet -> Statements -> Connection.
			 * if(자원!= null) 자원.close()
			 *  // 주로 finally에서 처리된다.
			 */
			try {
				if(rs != null)   // resultSet이 메모리에 할당되어있으면..
					rs.close();  // IO발생해서 예외처리 해줘야함.
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
			Emp emp=null; // 단위 객체 선언
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
			// 수정, 삭제, 등록  시 ==> commit()
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			// 자원 해제
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
			Emp emp=null; // 단위 객체 선언
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
			// 수정, 삭제, 등록  시 ==> commit()
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			// 자원 해제
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
		
		// search() 활용.
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
