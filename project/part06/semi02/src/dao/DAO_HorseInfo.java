package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.HorseInfo;

public class DAO_HorseInfo {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public ArrayList<HorseInfo> searchHor(HorseInfo sch){
		ArrayList<HorseInfo> hlist = new ArrayList<HorseInfo>();
		HorseInfo hi = null;
		String sql = "SELECT * FROM HORSE_INFO\n"
				+ "WHERE HNAME LIKE '%'||?||'%' \n"
				+ "AND GENDER LIKE '%'||?||'%' \n"
				+ "AND FATHER LIKE '%'||?||'%' \n"
				+ "AND MOTHER LIKE '%'||?||'%' \n"
				+ "AND OWNERNAME LIKE '%'||?||'%'";
		try {
			con = AA_Con.conn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sch.getHname());
			pstmt.setString(2, sch.getGender());
			pstmt.setString(3, sch.getFather());
			pstmt.setString(4, sch.getMother());
			pstmt.setString(5, sch.getOwnername());
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				hi = new HorseInfo();
				hi.setHname(rs.getString("hname"));
				hi.setHnum(rs.getInt("hnum"));
				hi.setBirthdate(rs.getDate("birthdate"));
				hi.setGender(rs.getString("gender"));
				hi.setColor(rs.getString("color"));
				hi.setRegdate(rs.getDate("regdate"));
				hi.setCountry(rs.getString("country"));
				hi.setFather(rs.getString("father"));
				hi.setMother(rs.getString("mother"));
				hi.setTrainernum(rs.getInt("trainernum"));
				hi.setOwnername(rs.getString("ownername"));
				hlist.add(hi);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt != null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(sql);
		return hlist;
	}

}
