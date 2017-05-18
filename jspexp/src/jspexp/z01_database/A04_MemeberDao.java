package jspexp.z01_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jspexp.z02_vo.Member;
// jspexp.z01_database.A04_MemeberDao
public class A04_MemeberDao {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public Member getMember(Member sch){
		Member mem = null;
		
		try {
			
			con = A00_DB.conn();
			String sql="SELECT * FROM member "
					+ "WHERE memid=? AND pass=? ";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, sch.getMemid());
			pstmt.setString(2, sch.getPass());
			rs = pstmt.executeQuery();
			if(rs.next()){
				mem = new Member();
				// rs.getXXXX(������ȣ)
				mem.setMemid(rs.getString(1));
				mem.setPass(rs.getString(2));
				mem.setName(rs.getString(3));
				mem.setPoint(rs.getInt(4));
				mem.setAuth(rs.getString(5));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return mem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A04_MemeberDao dao = new A04_MemeberDao();
		Member sch = new Member();
		sch.setMemid("himan");
		sch.setPass("7777");
		System.out.println(dao.getMember(sch).getName());
	}

}
