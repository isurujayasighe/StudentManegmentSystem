package com.isuru.studentbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user_lay")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String fristName;
	
	private String lastName;
	
	private String school;
	
	private String NicNo;
	
	private String curruntTempel;
	
	private String educationTemple;

	/**
	 * @return the fristName
	 */
	public String getFristName() {
		return fristName;
	}

	/**
	 * @param fristName the fristName to set
	 */
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the nicNo
	 */
	public String getNicNo() {
		return NicNo;
	}

	/**
	 * @param nicNo the nicNo to set
	 */
	public void setNicNo(String nicNo) {
		NicNo = nicNo;
	}

	/**
	 * @return the curruntTempel
	 */
	public String getCurruntTempel() {
		return curruntTempel;
	}

	/**
	 * @param curruntTempel the curruntTempel to set
	 */
	public void setCurruntTempel(String curruntTempel) {
		this.curruntTempel = curruntTempel;
	}

	/**
	 * @return the educationTemple
	 */
	public String getEducationTemple() {
		return educationTemple;
	}

	/**
	 * @param educationTemple the educationTemple to set
	 */
	public void setEducationTemple(String educationTemple) {
		this.educationTemple = educationTemple;
	}
	
	

}
