package com.alok.struts2;

import com.alok.service.*;
import com.opensymphony.xwork2.ActionSupport;

public class ALOKBaseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static EmployeeService employeeService;
	static RequestService requestService;
	static {
		employeeService = new EmployeeServiceImpl();
		requestService = new RequestServiceImpl();
	}
}
