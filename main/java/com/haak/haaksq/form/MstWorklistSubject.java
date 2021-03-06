package com.haak.haaksq.form;

// Generated Jun 19, 2012 11:53:06 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * MstWorklistSubject generated by hbm2java
 */
public class MstWorklistSubject implements java.io.Serializable {

	private int worklistSubjectId;
	private String worklistSubjectName;
	private Integer communityId;
	private Integer roleId;
	private String fgPublic;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public MstWorklistSubject() {
	}

	public MstWorklistSubject(int worklistSubjectId) {
		this.worklistSubjectId = worklistSubjectId;
	}

	public MstWorklistSubject(int worklistSubjectId,
			String worklistSubjectName, Integer communityId, Integer roleId,
			String fgPublic, Integer modifyBy, Date modifyDate,
			Integer createBy, Date createDate) {
		this.worklistSubjectId = worklistSubjectId;
		this.worklistSubjectName = worklistSubjectName;
		this.communityId = communityId;
		this.roleId = roleId;
		this.fgPublic = fgPublic;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	public int getWorklistSubjectId() {
		return this.worklistSubjectId;
	}

	public void setWorklistSubjectId(int worklistSubjectId) {
		this.worklistSubjectId = worklistSubjectId;
	}

	public String getWorklistSubjectName() {
		return this.worklistSubjectName;
	}

	public void setWorklistSubjectName(String worklistSubjectName) {
		this.worklistSubjectName = worklistSubjectName;
	}

	public Integer getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getFgPublic() {
		return this.fgPublic;
	}

	public void setFgPublic(String fgPublic) {
		this.fgPublic = fgPublic;
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
