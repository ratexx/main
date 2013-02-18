package com.haak.haaksq.form;

// Generated Sep 9, 2012 11:13:12 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * UserProfile generated by hbm2java
 */
public class UserProfile implements java.io.Serializable {

	private Integer userId;
	private String pass;
	private int communityId;
	private String userName;
	private String firstName;
	private String lastName;
	private String nickName;
	private String email;
	private String mobileNo;
	private String faxNo;
	private String telephoneNo;
	private String sports;
	private String hobbies;
	private String profession;
	private int addressId;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public UserProfile() {
	}

	public UserProfile(String pass, int communityId, String userName,
			String firstName, int addressId) {
		this.pass = pass;
		this.communityId = communityId;
		this.userName = userName;
		this.firstName = firstName;
		this.addressId = addressId;
	}

	public UserProfile(String pass, int communityId, String userName,
			String firstName, String lastName, String nickName, String email,
			String mobileNo, String faxNo, String telephoneNo, String sports,
			String hobbies, String profession, int addressId, Integer modifyBy,
			Date modifyDate, Integer createBy, Date createDate) {
		this.pass = pass;
		this.communityId = communityId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.faxNo = faxNo;
		this.telephoneNo = telephoneNo;
		this.sports = sports;
		this.hobbies = hobbies;
		this.profession = profession;
		this.addressId = addressId;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getTelephoneNo() {
		return this.telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getSports() {
		return this.sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public String getHobbies() {
		return this.hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public Integer getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Integer getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
