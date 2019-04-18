package com.dell.tsp.subscriber.service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dell.tsp.subscriber.dao.DataDaoImpl;
import com.dell.tsp.subscriber.model.LoginDTO;
import com.dell.tsp.subscriber.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	DataDaoImpl dataDao;
	
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	EntityManager em;
	
	
	/*
	 * public String getLogin(String user, String pass) { TypedQuery query =
	 * em.createQuery("select c from login c where c.user_name = ?",
	 * LoginDTO.class); query.setParameter(1, user); LoginDTO login = (LoginDTO)
	 * query.getResultList().get(0); return null; }
	 */
	
	public String getLoginDetails(String userName, String password) {
		String status = dataDao.findByUserName(userName);
		if(status.equals(password)) {
			status = "Successful Login!";
		}
		
		if(status.equals("User not found")) {
			status = "User Not Found!";
		}
		
		else if(!status.equals("User not found") && !status.equals(password)){
			status = "Invalid Password! Please try again";
		}
		return status;
	}

}
