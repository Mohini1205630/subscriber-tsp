package com.dell.tsp.subscriber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class LoginEntity {
	
	private int subscriberId;
    private String userName;
    private String passWord;
    
    public LoginEntity() {
		super();
	}
    
    
	public LoginEntity(int subscriberId, String userName, String passWord) {
		super();
		this.subscriberId = subscriberId;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	@Id
	@Column(name="subscriber_id" , nullable = false)
	public int getSubscriberId() {
		return subscriberId;
	}
	
	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}
	
	@Column(name="user_name" , nullable = false)
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name="password" , nullable = false)
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
