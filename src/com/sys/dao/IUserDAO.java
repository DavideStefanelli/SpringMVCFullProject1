package com.sys.dao;

import javax.sql.DataSource;
import com.sys.beans.UserBean;

public interface IUserDAO {
	
	public abstract void setDataSource(DataSource dataSource);
	public UserBean getByEmail(String email);
	
}
