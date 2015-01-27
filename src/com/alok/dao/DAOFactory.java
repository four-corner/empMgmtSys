package com.alok.dao;

public class DAOFactory {
	static EmployeeDAO employeeDAO;
	static RequestDAO requestDAO;
	static {
		employeeDAO = new JDBCEmployeeDAO();
		requestDAO = new JDBCRequestDAO();
	}

	public static EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public static RequestDAO getRequestDAO() {
		return requestDAO;
	}
}
