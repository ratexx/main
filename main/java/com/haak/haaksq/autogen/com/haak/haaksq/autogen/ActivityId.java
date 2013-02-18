package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ActivityId generated by hbm2java
 */
@Embeddable
public class ActivityId implements java.io.Serializable {

	private Integer moduleActivityId;
	private int activityId;
	private int moduleId;
	private int activityTypeId;
	private String activityName;
	private String activityDetail;
	private Date activityDate;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public ActivityId() {
	}

	public ActivityId(int activityId, int moduleId, int activityTypeId,
			String activityName) {
		this.activityId = activityId;
		this.moduleId = moduleId;
		this.activityTypeId = activityTypeId;
		this.activityName = activityName;
	}

	public ActivityId(Integer moduleActivityId, int activityId, int moduleId,
			int activityTypeId, String activityName, String activityDetail,
			Date activityDate, Integer modifyBy, Date modifyDate,
			Integer createBy, Date createDate) {
		this.moduleActivityId = moduleActivityId;
		this.activityId = activityId;
		this.moduleId = moduleId;
		this.activityTypeId = activityTypeId;
		this.activityName = activityName;
		this.activityDetail = activityDetail;
		this.activityDate = activityDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@Column(name = "module_activity_id")
	public Integer getModuleActivityId() {
		return this.moduleActivityId;
	}

	public void setModuleActivityId(Integer moduleActivityId) {
		this.moduleActivityId = moduleActivityId;
	}

	@Column(name = "activity_id", nullable = false)
	public int getActivityId() {
		return this.activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	@Column(name = "module_id", nullable = false)
	public int getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	@Column(name = "activity_type_id", nullable = false)
	public int getActivityTypeId() {
		return this.activityTypeId;
	}

	public void setActivityTypeId(int activityTypeId) {
		this.activityTypeId = activityTypeId;
	}

	@Column(name = "activity_name", nullable = false, length = 200)
	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	@Column(name = "activity_detail", length = 2000)
	public String getActivityDetail() {
		return this.activityDetail;
	}

	public void setActivityDetail(String activityDetail) {
		this.activityDetail = activityDetail;
	}

	@Column(name = "activity_date", length = 19)
	public Date getActivityDate() {
		return this.activityDate;
	}

	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
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

	@Column(name = "create_date", length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ActivityId))
			return false;
		ActivityId castOther = (ActivityId) other;

		return ((this.getModuleActivityId() == castOther.getModuleActivityId()) || (this
				.getModuleActivityId() != null
				&& castOther.getModuleActivityId() != null && this
				.getModuleActivityId().equals(castOther.getModuleActivityId())))
				&& (this.getActivityId() == castOther.getActivityId())
				&& (this.getModuleId() == castOther.getModuleId())
				&& (this.getActivityTypeId() == castOther.getActivityTypeId())
				&& ((this.getActivityName() == castOther.getActivityName()) || (this
						.getActivityName() != null
						&& castOther.getActivityName() != null && this
						.getActivityName().equals(castOther.getActivityName())))
				&& ((this.getActivityDetail() == castOther.getActivityDetail()) || (this
						.getActivityDetail() != null
						&& castOther.getActivityDetail() != null && this
						.getActivityDetail().equals(
								castOther.getActivityDetail())))
				&& ((this.getActivityDate() == castOther.getActivityDate()) || (this
						.getActivityDate() != null
						&& castOther.getActivityDate() != null && this
						.getActivityDate().equals(castOther.getActivityDate())))
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
						.getCreateDate().equals(castOther.getCreateDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getModuleActivityId() == null ? 0 : this
						.getModuleActivityId().hashCode());
		result = 37 * result + this.getActivityId();
		result = 37 * result + this.getModuleId();
		result = 37 * result + this.getActivityTypeId();
		result = 37
				* result
				+ (getActivityName() == null ? 0 : this.getActivityName()
						.hashCode());
		result = 37
				* result
				+ (getActivityDetail() == null ? 0 : this.getActivityDetail()
						.hashCode());
		result = 37
				* result
				+ (getActivityDate() == null ? 0 : this.getActivityDate()
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
		return result;
	}

}
