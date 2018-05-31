package com.sys.services;

import com.sys.beans.CredentialsBean;
import com.sys.beans.UserBean;

public interface ILoginService {

	public UserBean authenticate(CredentialsBean credentials);
	
}
