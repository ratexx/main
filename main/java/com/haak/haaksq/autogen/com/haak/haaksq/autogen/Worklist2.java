package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Worklist2 generated by hbm2java
 */
@Entity
@Table(name = "worklist2", catalog = "haaksquare_db")
public class Worklist2 implements java.io.Serializable {

	private Integer worklistId;
	private Integer worklistSeq;
	private Integer communityId;
	private Integer addressId;
	private Integer worklistTypeId;
	private Integer worklistSubjectId;
	private String worklistName;
	private String worklistDetail;
	private String phone;
	private Integer fromUserId;
	private String fromUserName;
	private String fromName;
	private String fromEmail;
	private String toUserName;
	private Integer roleId;
	private Integer worklistStatusId;
	private String jobDetails;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public Worklist2() {
	}

	public Worklist2(Integer worklistSeq, Integer communityId,
			Integer addressId, Integer worklistTypeId,
			Integer worklistSubjectId, String worklistName,
			String worklistDetail, String phone, Integer fromUserId,
			String fromUserName, String fromName, String fromEmail,
			String toUserName, Integer roleId, Integer worklistStatusId,
			String jobDetails, Integer modifyBy, Date modifyDate,
			Integer createBy, Date createDate) {
		this.worklistSeq = worklistSeq;
		this.communityId = communityId;
		this.addressId = addressId;
		this.worklistTypeId = worklistTypeId;
		this.worklistSubjectId = worklistSubjectId;
		this.worklistName = worklistName;
		this.worklistDetail = worklistDetail;
		this.phone = phone;
		this.fromUserId = fromUserId;
		this.fromUserName = fromUserName;
		this.fromName = fromName;
		this.fromEmail = fromEmail;
		this.toUserName = toUserName;
		this.roleId = roleId;
		this.worklistStatusId = worklistStatusId;
		this.jobDetails = jobDetails;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Worklist_Id", unique = true, nullable = false)
	public Integer getWorklistId() {
		return this.worklistId;
	}

	public void setWorklistId(Integer worklistId) {
		this.worklistId = worklistId;
	}

	@Column(name = "worklist_seq")
	public Integer getWorklistSeq() {
		return this.worklistSeq;
	}

	public void setWorklistSeq(Integer worklistSeq) {
		this.worklistSeq = worklistSeq;
	}

	@Column(name = "community_id")
	public Integer getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	@Column(name = "address_id")
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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

	@Column(name = "from_user_id")
	public Integer getFromUserId() {
		return this.fromUserId;
	}

	public void setFromUserId(Integer fromUserId) {
		this.fromUserId = fromUserId;
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

	@Column(name = "role_id")
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "worklist_status_id")
	public Integer getWorklistStatusId() {
		return this.worklistStatusId;
	}

	public void setWorklistStatusId(Integer worklistStatusId) {
		this.worklistStatusId = worklistStatusId;
	}

	@Column(name = "job_details", length = 2000)
	public String getJobDetails() {
		return this.jobDetails;
	}

	public void setJobDetails(String jobDetails) {
		this.jobDetails = jobDetails;
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
