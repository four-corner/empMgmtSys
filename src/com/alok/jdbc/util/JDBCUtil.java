package com.alok.jdbc.util;

import java.sql.*;

public class JDBCUtil {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public static Connection getMySQLConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3307/alokdb";
		Connection con = DriverManager.getConnection(url, "root", "password");
		return con;
	}

	public static void cleanup(Statement st, Connection con) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public static void cleanup(ResultSet rs, Statement st, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
