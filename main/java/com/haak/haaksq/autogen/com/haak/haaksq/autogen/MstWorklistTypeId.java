package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstWorklistTypeId generated by hbm2java
 */
@Embeddable
public class MstWorklistTypeId implements java.io.Serializable {

	private Integer worklistTypeId;
	private String worklistTypeName;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public MstWorklistTypeId() {
	}

	public MstWorklistTypeId(Integer worklistTypeId, String worklistTypeName,
			Integer modifyBy, Date modifyDate, Integer createBy, Date createDate) {
		this.worklistTypeId = worklistTypeId;
		this.worklistTypeName = worklistTypeName;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@Column(name = "worklist_type_id")
	public Integer getWorklistTypeId() {
		return this.worklistTypeId;
	}

	public void setWorklistTypeId(Integer worklistTypeId) {
		this.worklistTypeId = worklistTypeId;
	}

	@Column(name = "worklist_type_name", length = 200)
	public String getWorklistTypeName() {
		return this.worklistTypeName;
	}

	public void setWorklistTypeName(String worklistTypeName) {
		this.worklistTypeName = worklistTypeName;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MstWorklistTypeId))
			return false;
		MstWorklistTypeId castOther = (MstWorklistTypeId) other;

		return ((this.getWorklistTypeId() == castOther.getWorklistTypeId()) || (this
				.getWorklistTypeId() != null
				&& castOther.getWorklistTypeId() != null && this
				.getWorklistTypeId().equals(castOther.getWorklistTypeId())))
				&& ((this.getWorklistTypeName() == castOther
						.getWorklistTypeName()) || (this.getWorklistTypeName() != null
						&& castOther.getWorklistTypeName() != null && this
						.getWorklistTypeName().equals(
								castOther.getWorklistTypeName())))
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
				+ (getWorklistTypeId() == null ? 0 : this.getWorklistTypeId()
						.hashCode());
		result = 37
				* result
				+ (getWorklistTypeName() == null ? 0 : this
						.getWorklistTypeName().hashCode());
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