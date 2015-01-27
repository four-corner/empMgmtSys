package com.alok.service;

import com.alok.exception.*;
import com.alok.to.*;
import com.alok.dao.*;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public EmployeeTO verifyEmployee(String un, String pw)
			throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		EmployeeDAO edao = DAOFactory.getEmployeeDAO();
		EmployeeTO eto = edao.verifyEmployee(un, pw);
		if (eto == null) {
			throw new EmployeeNotFoundException();
		}
		return eto;
	}

}
