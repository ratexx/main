package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VTaskManagerId generated by hbm2java
 */
@Embeddable
public class VTaskManagerId implements java.io.Serializable {

	private int id;
	private String worklistTypeName;
	private String worklistName;
	private String worklistDetail;
	private String fromUserName;
	private String fromName;
	private String fromEmail;
	private String toUserName;
	private String worklistSubjectName;
	private Integer communityId;
	private int roleId;
	private String fgPublic;
	private Integer worklistStatusId;
	private int worklistId;
	private String fgShowQuestName;
	private String fgShowAnswerName;
	private Integer addressId;
	private String jobDetails;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;
	private String worklistStatusName;

	public VTaskManagerId() {
	}

	public VTaskManagerId(int id, int roleId, int worklistId) {
		this.id = id;
		this.roleId = roleId;
		this.worklistId = worklistId;
	}

	public VTaskManagerId(int id, String worklistTypeName, String worklistName,
			String worklistDetail, String fromUserName, String fromName,
			String fromEmail, String toUserName, String worklistSubjectName,
			Integer communityId, int roleId, String fgPublic,
			Integer worklistStatusId, int worklistId, String fgShowQuestName,
			String fgShowAnswerName, Integer addressId, String jobDetails,
			Integer modifyBy, Date modifyDate, Integer createBy,
			Date createDate, String worklistStatusName) {
		this.id = id;
		this.worklistTypeName = worklistTypeName;
		this.worklistName = worklistName;
		this.worklistDetail = worklistDetail;
		this.fromUserName = fromUserName;
		this.fromName = fromName;
		this.fromEmail = fromEmail;
		this.toUserName = toUserName;
		this.worklistSubjectName = worklistSubjectName;
		this.communityId = communityId;
		this.roleId = roleId;
		this.fgPublic = fgPublic;
		this.worklistStatusId = worklistStatusId;
		this.worklistId = worklistId;
		this.fgShowQuestName = fgShowQuestName;
		this.fgShowAnswerName = fgShowAnswerName;
		this.addressId = addressId;
		this.jobDetails = jobDetails;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
		this.worklistStatusName = worklistStatusName;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "worklist_type_name", length = 200)
	public String getWorklistTypeName() {
		return this.worklistTypeName;
	}

	public void setWorklistTypeName(String worklistTypeName) {
		this.worklistTypeName = worklistTypeName;
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

	@Column(name = "worklist_subject_name", length = 200)
	public String getWorklistSubjectName() {
		return this.worklistSubjectName;
	}

	public void setWorklistSubjectName(String worklistSubjectName) {
		this.worklistSubjectName = worklistSubjectName;
	}

	@Column(name = "community_id")
	public Integer getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	@Column(name = "role_id", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "fg_public", length = 1)
	public String getFgPublic() {
		return this.fgPublic;
	}

	public void setFgPublic(String fgPublic) {
		this.fgPublic = fgPublic;
	}

	@Column(name = "worklist_status_id")
	public Integer getWorklistStatusId() {
		return this.worklistStatusId;
	}

	public void setWorklistStatusId(Integer worklistStatusId) {
		this.worklistStatusId = worklistStatusId;
	}

	@Column(name = "Worklist_Id", nullable = false)
	public int getWorklistId() {
		return this.worklistId;
	}

	public void setWorklistId(int worklistId) {
		this.worklistId = worklistId;
	}

	@Column(name = "fg_show_quest_name", length = 1)
	public String getFgShowQuestName() {
		return this.fgShowQuestName;
	}

	public void setFgShowQuestName(String fgShowQuestName) {
		this.fgShowQuestName = fgShowQuestName;
	}

	@Column(name = "fg_show_answer_name", length = 1)
	public String getFgShowAnswerName() {
		return this.fgShowAnswerName;
	}

	public void setFgShowAnswerName(String fgShowAnswerName) {
		this.fgShowAnswerName = fgShowAnswerName;
	}

	@Column(name = "address_id")
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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

	@Column(name = "create_date", length = 10)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "worklist_status_name", length = 100)
	public String getWorklistStatusName() {
		return this.worklistStatusName;
	}

	public void setWorklistStatusName(String worklistStatusName) {
		this.worklistStatusName = worklistStatusName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VTaskManagerId))
			return false;
		VTaskManagerId castOther = (VTaskManagerId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getWorklistTypeName() == castOther
						.getWorklistTypeName()) || (this.getWorklistTypeName() != null
						&& castOther.getWorklistTypeName() != null && this
						.getWorklistTypeName().equals(
								castOther.getWorklistTypeName())))
				&& ((this.getWorklistName() == castOther.getWorklistName()) || (this
						.getWorklistName() != null
						&& castOther.getWorklistName() != null && this
						.getWorklistName().equals(castOther.getWorklistName())))
				&& ((this.getWorklistDetail() == castOther.getWorklistDetail()) || (this
						.getWorklistDetail() != null
						&& castOther.getWorklistDetail() != null && this
						.getWorklistDetail().equals(
								castOther.getWorklistDetail())))
				&& ((this.getFromUserName() == castOther.getFromUserName()) || (this
						.getFromUserName() != null
						&& castOther.getFromUserName() != null && this
						.getFromUserName().equals(castOther.getFromUserName())))
				&& ((this.getFromName() == castOther.getFromName()) || (this
						.getFromName() != null
						&& castOther.getFromName() != null && this
						.getFromName().equals(castOther.getFromName())))
				&& ((this.getFromEmail() == castOther.getFromEmail()) || (this
						.getFromEmail() != null
						&& castOther.getFromEmail() != null && this
						.getFromEmail().equals(castOther.getFromEmail())))
				&& ((this.getToUserName() == castOther.getToUserName()) || (this
						.getToUserName() != null
						&& castOther.getToUserName() != null && this
						.getToUserName().equals(castOther.getToUserName())))
				&& ((this.getWorklistSubjectName() == castOther
						.getWorklistSubjectName()) || (this
						.getWorklistSubjectName() != null
						&& castOther.getWorklistSubjectName() != null && this
						.getWorklistSubjectName().equals(
								castOther.getWorklistSubjectName())))
				&& ((this.getCommunityId() == castOther.getCommunityId()) || (this
						.getCommunityId() != null
						&& castOther.getCommunityId() != null && this
						.getCommunityId().equals(castOther.getCommunityId())))
				&& (this.getRoleId() == castOther.getRoleId())
				&& ((this.getFgPublic() == castOther.getFgPublic()) || (this
						.getFgPublic() != null
						&& castOther.getFgPublic() != null && this
						.getFgPublic().equals(castOther.getFgPublic())))
				&& ((this.getWorklistStatusId() == castOther
						.getWorklistStatusId()) || (this.getWorklistStatusId() != null
						&& castOther.getWorklistStatusId() != null && this
						.getWorklistStatusId().equals(
								castOther.getWorklistStatusId())))
				&& (this.getWorklistId() == castOther.getWorklistId())
				&& ((this.getFgShowQuestName() == castOther
						.getFgShowQuestName()) || (this.getFgShowQuestName() != null
						&& castOther.getFgShowQuestName() != null && this
						.getFgShowQuestName().equals(
								castOther.getFgShowQuestName())))
				&& ((this.getFgShowAnswerName() == castOther
						.getFgShowAnswerName()) || (this.getFgShowAnswerName() != null
						&& castOther.getFgShowAnswerName() != null && this
						.getFgShowAnswerName().equals(
								castOther.getFgShowAnswerName())))
				&& ((this.getAddressId() == castOther.getAddressId()) || (this
						.getAddressId() != null
						&& castOther.getAddressId() != null && this
						.getAddressId().equals(castOther.getAddressId())))
				&& ((this.getJobDetails() == castOther.getJobDetails()) || (this
						.getJobDetails() != null
						&& castOther.getJobDetails() != null && this
						.getJobDetails().equals(castOther.getJobDetails())))
				&& ((this.getModifyBy() == castOther.getModifyBy()) || (this
						.getModifyBy() != null
						&& castOther.getModifyBy() != null && this
						.getModifyBy().equals(castOther.getModifyBy())))
				&& ((this.getModifyDate() == castOther.getModifyDate()) || (this
						.getModifyDate() != null
						&& castOther.getModifyDate() != null && this
						.getModifyDate().equals(castOther.getModifyDate())))
				&& ((this.getCreateBy() == castOther.getCreateBy()) || (this
						.getCreateBy() != null
						&& castOther.getCreateBy() != null && this
						.getCreateBy().equals(castOther.getCreateBy())))
				&& ((this.getCreateDate() == castOther.getCreateDate()) || (this
						.getCreateDate() != null
						&& castOther.getCreateDate() != null && this
						.getCreateDate().equals(castOther.getCreateDate())))
				&& ((this.getWorklistStatusName() == castOther
						.getWorklistStatusName()) || (this
						.getWorklistStatusName() != null
						&& castOther.getWorklistStatusName() != null && this
						.getWorklistStatusName().equals(
								castOther.getWorklistStatusName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37
				* result
				+ (getWorklistTypeName() == null ? 0 : this
						.getWorklistTypeName().hashCode());
		result = 37
				* result
				+ (getWorklistName() == null ? 0 : this.getWorklistName()
						.hashCode());
		result = 37
				* result
				+ (getWorklistDetail() == null ? 0 : this.getWorklistDetail()
						.hashCode());
		result = 37
				* result
				+ (getFromUserName() == null ? 0 : this.getFromUserName()
						.hashCode());
		result = 37 * result
				+ (getFromName() == null ? 0 : this.getFromName().hashCode());
		result = 37 * result
				+ (getFromEmail() == null ? 0 : this.getFromEmail().hashCode());
		result = 37
				* result
				+ (getToUserName() == null ? 0 : this.getToUserName()
						.hashCode());
		result = 37
				* result
				+ (getWorklistSubjectName() == null ? 0 : this
						.getWorklistSubjectName().hashCode());
		result = 37
				* result
				+ (getCommunityId() == null ? 0 : this.getCommunityId()
						.hashCode());
		result = 37 * result + this.getRoleId();
		result = 37 * result
				+ (getFgPublic() == null ? 0 : this.getFgPublic().hashCode());
		result = 37
				* result
				+ (getWorklistStatusId() == null ? 0 : this
						.getWorklistStatusId().hashCode());
		result = 37 * result + this.getWorklistId();
		result = 37
				* result
				+ (getFgShowQuestName() == null ? 0 : this.getFgShowQuestName()
						.hashCode());
		result = 37
				* result
				+ (getFgShowAnswerName() == null ? 0 : this
						.getFgShowAnswerName().hashCode());
		result = 37 * result
				+ (getAddressId() == null ? 0 : this.getAddressId().hashCode());
		result = 37
				* result
				+ (getJobDetails() == null ? 0 : this.getJobDetails()
						.hashCode());
		result = 37 * result
				+ (getModifyBy() == null ? 0 : this.getModifyBy().hashCode());
		result = 37
				* result
				+ (getModifyDate() == null ? 0 : this.getModifyDate()
						.hashCode());
		result = 37 * result
				+ (getCreateBy() == null ? 0 : this.getCreateBy().hashCode());
		result = 37
				* result
				+ (getCreateDate() == null ? 0 : this.getCreateDate()
						.hashCode());
		result = 37
				* result
				+ (getWorklistStatusName() == null ? 0 : this
						.getWorklistStatusName().hashCode());
		return result;
	}

}