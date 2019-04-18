package com.dell.tsp.subscriber.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dell.tsp.subscriber.model.LoginDTO;

@Repository
public class DataDaoImpl {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public class LoginMapper implements RowMapper<LoginDTO>{
		@Override
		public  LoginDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			LoginDTO login = new LoginDTO();
			login.setSubscriberId(rs.getInt("subscriber_id"));
			login.setUserName(rs.getString("user_name"));
			login.setPassWord(rs.getString("password"));
			return login;
		}
		
	}
	

	 
	 public String findByUserName(String userName) {
		 try {
			 LoginDTO loginDTO =  jdbcTemplate.queryForObject("SELECT * FROM LOGIN WHERE USER_NAME = ?", new Object[] { userName },
	                    new BeanPropertyRowMapper<LoginDTO>(LoginDTO.class));
			 return  loginDTO.getPassWord();
		 }catch(EmptyResultDataAccessException e) {
			 return "User not found";
		 }
	 }
}
