package com.isuru.studentbackend.model;

import java.util.Collection;

public class Response {
	
	private Integer status;
	private Collection<User> user;
	
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the user
	 */
	public Collection<User> getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(Collection<User> user) {
		this.user = user;
	}
	
	
	
	

}
