package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Worklist generated by hbm2java
 */
@Entity
@Table(name = "worklist", catalog = "haaksquare_db")
public class Worklist implements java.io.Serializable {

	private WorklistId id;
	private Integer communityId;
	private Integer worklistTypeId;
	private Integer worklistSubjectId;
	private String worklistName;
	private String worklistDetail;
	private String phone;
	private String fromUserName;
	private String fromName;
	private String fromEmail;
	private String toUserName;
	private Integer worklistStatusId;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public Worklist() {
	}

	public Worklist(WorklistId id) {
		this.id = id;
	}

	public Worklist(WorklistId id, Integer communityId, Integer worklistTypeId,
			Integer worklistSubjectId, String worklistName,
			String worklistDetail, String phone, String fromUserName,
			String fromName, String fromEmail, String toUserName,
			Integer worklistStatusId, Integer modifyBy, Date modifyDate,
			Integer createBy, Date createDate) {
		this.id = id;
		this.communityId = communityId;
		this.worklistTypeId = worklistTypeId;
		this.worklistSubjectId = worklistSubjectId;
		this.worklistName = worklistName;
		this.worklistDetail = worklistDetail;
		this.phone = phone;
		this.fromUserName = fromUserName;
		this.fromName = fromName;
		this.fromEmail = fromEmail;
		this.toUserName = toUserName;
		this.worklistStatusId = worklistStatusId;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "worklistId", column = @Column(name = "worklist_id", nullable = false)),
			@AttributeOverride(name = "worklistSeq", column = @Column(name = "worklist_seq", nullable = false)) })
	public WorklistId getId() {
		return this.id;
	}

	public void setId(WorklistId id) {
		this.id = id;
	}

	@Column(name = "community_id")
	public Integer getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	@Column(name = "worklist_type_id")
	public Integer getWorklistTypeId() {
		return this.worklistTypeId;
	}

	public void setWorklistTypeId(Integer worklistTypeId) {
		this.worklistTypeId = worklistTypeId;
	}

	@Column(name = "worklist_subject_id")
	public Integer getWorklistSubjectId() {
		return this.worklistSubjectId;
	}

	public void setWorklistSubjectId(Integer worklistSubjectId) {
		this.worklistSubjectId = worklistSubjectId;
	}

	@Column(name = "worklist_name", length = 200)
	public String getWorklistName() {
		return this.worklistName;
	}

	public void setWorklistName(String worklistName) {
		this.worklistName = worklistName;
	}

	@Column(name = "worklist_detail", length = 2000)
	public String getWorklistDetail() {
		return this.worklistDetail;
	}

	public void setWorklistDetail(String worklistDetail) {
		this.worklistDetail = worklistDetail;
	}

	@Column(name = "phone", length = 200)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "from_user_name", length = 100)
	public String getFromUserName() {
		return this.fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	@Column(name = "from_name", length = 200)
	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	@Column(name = "from_email", length = 100)
	public String getFromEmail() {
		return this.fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	@Column(name = "to_user_name", length = 100)
	public String getToUserName() {
		return this.toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	@Column(name = "worklist_status_id")
	public Integer getWorklistStatusId() {
		return this.worklistStatusId;
	}

	public void setWorklistStatusId(Integer worklistStatusId) {
		this.worklistStatusId = worklistStatusId;
	}

	@Column(name = "modify_by")
	public Integer getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_date", length = 19)
	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Column(name = "create_by")
	public Integer getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "create_date", length = 10)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}