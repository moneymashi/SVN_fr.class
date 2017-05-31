package z01_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import z02_vo.AuctionUserVO;

public class SignUpDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public boolean confirmEmail(String newE) {
		System.out.println("받는값:" + newE);
		boolean sameEmail = false;
		try {
			con = ConnectDB.conn();
			String sql = "SELECT * FROM AUCTION_USER WHERE EMAIL=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, newE);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				sameEmail = true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("email중복:" + sameEmail);
		}
		return sameEmail;
	}

	public void insertMem(AuctionUserVO ins) {
		try {
			con = ConnectDB.conn();
			con.setAutoCommit(false);
			String sql = "INSERT INTO auction_user (USER_NAME,EMAIL,PASSWORD,register_date) " + "VALUES (?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ("비번:"+ins.getPassword()));
			pstmt.setString(2, ins.getEmail());
			pstmt.setString(3, ins.getPassword());
			pstmt.setDate(4, ins.getRegisterDate());
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
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

	}

}
