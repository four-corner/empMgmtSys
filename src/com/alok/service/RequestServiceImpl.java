package com.alok.service;

import com.alok.to.*;
import com.alok.dao.*;

public class RequestServiceImpl implements RequestService {

	@Override
	public int postRequest(RequestTO rto) {
		// TODO Auto-generated method stub
		RequestDAO rdao = DAOFactory.getRequestDAO();

		return rdao.postRequest(rto);
	}

}
