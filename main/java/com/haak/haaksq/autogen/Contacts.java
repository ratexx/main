package com.haak.haaksq.autogen;

// Generated 17 ��.�. 2555, 10:58:09 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Contacts generated by hbm2java
 */
public class Contacts implements java.io.Serializable {

	private Integer id;
	private String firstname;
	private String lastname;
	private String telephone;
	private String email;
	private Date created;

	public Contacts() {
	}

	public Contacts(Date created) {
		this.created = created;
	}

	public Contacts(String firstname, String lastname, String telephone,
			String email, Date created) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.email = email;
		this.created = created;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
