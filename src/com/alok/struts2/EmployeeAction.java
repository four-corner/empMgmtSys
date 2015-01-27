package com.alok.struts2;

import javax.servlet.http.*;
import org.apache.struts2.*;
import com.alok.to.EmployeeTO;

public class EmployeeAction extends ALOKBaseAction {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void validate() {
		if (username == null || username.length() == 0) {
			addFieldError("username", "Username is Required");
		}

		if (password == null || password.length() == 0) {
			addFieldError(password, "Password is Required");
		}
	}

	public String execute() throws Exception {
		EmployeeTO eto = null;
		eto = employeeService.verifyEmployee(username, password);
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpSession session = req.getSession();
		session.setAttribute("ETO", eto);
		return SUCCESS;

	}
}
