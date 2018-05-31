package com.sys.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sys.beans.UserBean;

@Repository
public class UserDAO implements IUserDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public UserBean getByEmail(String email) {
		return jdbcTemplate.queryForObject("SELECT * FROM user where email = ?", new Object[] { email }, new UserRowMapper());
	}

}
