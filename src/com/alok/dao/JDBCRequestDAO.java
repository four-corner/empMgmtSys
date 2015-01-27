package com.alok.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.alok.jdbc.util.JDBCUtil;
import com.alok.to.RequestTO;
import com.sun.corba.se.spi.presentation.rmi.PresentationDefaults;

public class JDBCRequestDAO implements RequestDAO {

	@Override
	public int postRequest(RequestTO rto) {
		// TODO Auto-generated method stub
		int RID = 0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "insert into requests values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			RID = getNextRequestID();
			ps.setInt(1, RID);
			ps.setString(2, rto.getEmpId());
			ps.setString(3, rto.getDescription());
			ps.setString(4, rto.getPriority());
			ps.setString(5, rto.getStatus());
			int x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(ps, con);
		}
		return RID;
	}

	private int getNextRequestID() {
		// TODO Auto-generated method stub
		int rid = 1;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "select max(reqId) from requests";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				int x = rs.getInt(1);
				rid = x + 1;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
		}
		return rid;
	}

}
