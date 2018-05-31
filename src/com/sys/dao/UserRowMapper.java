package com.sys.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sys.beans.UserBean;

public class UserRowMapper implements RowMapper<UserBean> {

	public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserBean user = new UserBean();
		user.setId(rs.getInt("id"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		return user;
	}
	
}
