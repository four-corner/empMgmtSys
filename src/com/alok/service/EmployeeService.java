package com.alok.service;

import com.alok.exception.*;
import com.alok.to.*;

public interface EmployeeService {
	public EmployeeTO verifyEmployee(String un, String pw)
			throws EmployeeNotFoundException;
}
