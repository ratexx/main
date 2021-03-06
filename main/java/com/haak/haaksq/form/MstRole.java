package com.haak.haaksq.form;

// Generated Oct 2, 2012 7:24:14 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * MstRole generated by hbm2java
 */
public class MstRole implements java.io.Serializable {

	private int roleId;
	private String roleName;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public MstRole() {
	}

	public MstRole(int roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public MstRole(int roleId, String roleName, Integer modifyBy,
			Date modifyDate, Integer createBy, Date createDate) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
