package com.alok.dao;

import com.alok.jdbc.util.JDBCUtil;
import com.alok.to.*;

import java.sql.*;
import java.util.*;

public class JDBCEmployeeDAO implements EmployeeDAO {

	@Override
	public EmployeeTO verifyEmployee(String un, String pw) {
		// TODO Auto-generated method stub
		EmployeeTO eto = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "select * from employees where username=? and password=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, un);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			if (rs.next()) {
				eto = new EmployeeTO();
				eto.setEmpId(rs.getString(1));
				eto.setEname(rs.getString(2));
				eto.setEmail(rs.getString(3));
				eto.setPhone(rs.getString(4));
				eto.setRole(rs.getString(5));
				eto.setUsername(rs.getString(6));
				eto.setPassword(rs.getString(7));
				eto.setStatus(rs.getString(8));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
		}
		return eto;
	}

}
