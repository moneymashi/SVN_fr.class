package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import project3.vo.Member;

public class MemberDao {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public ArrayList<Member> getMemberList(){
		ArrayList<Member> list = new ArrayList<Member>();
		
		try {
			con = DB.conn();
			String sql = "SELECT * FROM DRINK_MEMBER";
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();
			Member mem = null;
			if(rs.next()){
				mem = new Member();
				mem.setMemid(rs.getString(1));
				mem.setPass(rs.getString(2));
				mem.setName(rs.getString(3));
				mem.setAuth(rs.getString(6));
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
		return list;
	}
		
	// �α��� 
	public Member getMember(Member sch){
		Member mem = null;
		
		try {
			con = DB.conn();
			String sql = "SELECT * FROM DRINK_MEMBER WHERE id=? AND pwd=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, sch.getMemid());
			pstmt.setString(2, sch.getPass());
			rs = pstmt.executeQuery();
			if(rs.next()){
				mem = new Member();
				mem.setMemid(rs.getString("id"));
				mem.setPass(rs.getString("pwd"));
			}else{
				System.out.println("RS Error");
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
	
	public void insertMember(Member mem){
		// db ����ó��..
		try {
			con = DB.conn();
			String sql="INSERT INTO DRINK_MEMBER VALUES(?,?,?,?)";
			/* COMMIT
			 autocommit �ɼ��� false����Ͽ� commit���� ���� ������ 
			 Ʈ����� Ȯ�� ó������ �ʵ��� �Ѵ�. setAutoCommit(false) 
			 * */
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(sql);	
			pstmt.setString(1, mem.getMemid());
			pstmt.setString(2, mem.getPass());
			pstmt.setString(3, mem.getName());
			pstmt.setString(4, mem.getAuth());
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		MemberDao mem = new MemberDao();
		Member dto = new Member();
		dto.setMemid("hotteok");
		dto.setPass("7777");
		Member dto2 = mem.getMember(dto);
		System.out.println(dto2.getMemid() + ", " + dto2.getPass());
		*/
	}

}
