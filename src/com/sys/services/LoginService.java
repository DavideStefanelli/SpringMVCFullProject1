package com.sys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.beans.CredentialsBean;
import com.sys.beans.UserBean;
import com.sys.dao.IUserDAO;

@Service
public class LoginService implements ILoginService {

	@Autowired
	IUserDAO userDAO;
	
	@Override
	public UserBean authenticate(CredentialsBean credentials) {
		UserBean dbEntity = userDAO.getByEmail(credentials.getEmail());
		if(dbEntity != null && dbEntity.getPassword().equals(credentials.getPassword())) {
			return dbEntity;	
		} else {
			return null;
		}
	}

	
	
}
