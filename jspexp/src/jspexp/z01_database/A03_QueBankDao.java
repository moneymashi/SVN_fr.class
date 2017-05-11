package jspexp.z01_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jspexp.z02_vo.Quebank;

public class A03_QueBankDao {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// �˻��޼���(PreparedStatement)
	public ArrayList<Quebank> search(Quebank sch){
		ArrayList<Quebank> list = new ArrayList<Quebank>();
//		����ó��.
		try {
			con= A00_DB.conn();
			//  ���ڿ� ?��  ���� ?�����ϱ� ���Ͽ�
			//  '%'|| '���ڿ�' ||'%'
			String sql="SELECT * FROM quebank \n"
					+ " WHERE que LIKE '%'|| ? ||'%' \n"
					+ " AND que_type LIKE '%'|| ? ||'%' \n";
			System.out.println(sql);
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, sch.getQue());
			pstmt.setString(2, sch.getQueType());			
			rs = pstmt.executeQuery();
			Quebank qb=null;
			while(rs.next()){
				qb= new Quebank();
				qb.setNo(rs.getInt("no"));
				qb.setQue(rs.getString("que"));
				qb.setCoransw(rs.getString("coransw"));
				qb.setQueType(rs.getString("que_type"));
				list.add(qb);
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null){
					rs.close();
				}
				if(pstmt!=null){
					pstmt.close();
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
	
	public static void main(String args[]){
		Quebank sch= new Quebank();
		sch.setQue("");
		sch.setQueType("");
		System.out.println(new A03_QueBankDao().search(sch).size());
	}

}
