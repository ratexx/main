package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VCommunityContractNumberId generated by hbm2java
 */
@Embeddable
public class VCommunityContractNumberId implements java.io.Serializable {

	private int contractNumberId;
	private int communityId;
	private Integer contractNumberCategoryId;
	private String contractNumberName;
	private String contractNumberDetail;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;
	private int languageId;
	private String contractNumberCategoryName;

	public VCommunityContractNumberId() {
	}

	public VCommunityContractNumberId(int contractNumberId, int communityId,
			int languageId) {
		this.contractNumberId = contractNumberId;
		this.communityId = communityId;
		this.languageId = languageId;
	}

	public VCommunityContractNumberId(int contractNumberId, int communityId,
			Integer contractNumberCategoryId, String contractNumberName,
			String contractNumberDetail, Date modifyDate, Integer createBy,
			Date createDate, int languageId, String contractNumberCategoryName) {
		this.contractNumberId = contractNumberId;
		this.communityId = communityId;
		this.contractNumberCategoryId = contractNumberCategoryId;
		this.contractNumberName = contractNumberName;
		this.contractNumberDetail = contractNumberDetail;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
		this.languageId = languageId;
		this.contractNumberCategoryName = contractNumberCategoryName;
	}

	@Column(name = "contract_number_id", nullable = false)
	public int getContractNumberId() {
		return this.contractNumberId;
	}

	public void setContractNumberId(int contractNumberId) {
		this.contractNumberId = contractNumberId;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "contract_number_category_id")
	public Integer getContractNumberCategoryId() {
		return this.contractNumberCategoryId;
	}

	public void setContractNumberCategoryId(Integer contractNumberCategoryId) {
		this.contractNumberCategoryId = contractNumberCategoryId;
	}

	@Column(name = "contract_number_name", length = 300)
	public String getContractNumberName() {
		return this.contractNumberName;
	}

	public void setContractNumberName(String contractNumberName) {
		this.contractNumberName = contractNumberName;
	}

	@Column(name = "contract_number_detail", length = 500)
	public String getContractNumberDetail() {
		return this.contractNumberDetail;
	}

	public void setContractNumberDetail(String contractNumberDetail) {
		this.contractNumberDetail = contractNumberDetail;
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

	@Column(name = "language_id", nullable = false)
	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	@Column(name = "contract_number_category_name", length = 100)
	public String getContractNumberCategoryName() {
		return this.contractNumberCategoryName;
	}

	public void setContractNumberCategoryName(String contractNumberCategoryName) {
		this.contractNumberCategoryName = contractNumberCategoryName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VCommunityContractNumberId))
			return false;
		VCommunityContractNumberId castOther = (VCommunityContractNumberId) other;

		return (this.getContractNumberId() == castOther.getContractNumberId())
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& ((this.getContractNumberCategoryId() == castOther
						.getContractNumberCategoryId()) || (this
						.getContractNumberCategoryId() != null
						&& castOther.getContractNumberCategoryId() != null && this
						.getContractNumberCategoryId().equals(
								castOther.getContractNumberCategoryId())))
				&& ((this.getContractNumberName() == castOther
						.getContractNumberName()) || (this
						.getContractNumberName() != null
						&& castOther.getContractNumberName() != null && this
						.getContractNumberName().equals(
								castOther.getContractNumberName())))
				&& ((this.getContractNumberDetail() == castOther
						.getContractNumberDetail()) || (this
						.getContractNumberDetail() != null
						&& castOther.getContractNumberDetail() != null && this
						.getContractNumberDetail().equals(
								castOther.getContractNumberDetail())))
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
				&& (this.getLanguageId() == castOther.getLanguageId())
				&& ((this.getContractNumberCategoryName() == castOther
						.getContractNumberCategoryName()) || (this
						.getContractNumberCategoryName() != null
						&& castOther.getContractNumberCategoryName() != null && this
						.getContractNumberCategoryName().equals(
								castOther.getContractNumberCategoryName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getContractNumberId();
		result = 37 * result + this.getCommunityId();
		result = 37
				* result
				+ (getContractNumberCategoryId() == null ? 0 : this
						.getContractNumberCategoryId().hashCode());
		result = 37
				* result
				+ (getContractNumberName() == null ? 0 : this
						.getContractNumberName().hashCode());
		result = 37
				* result
				+ (getContractNumberDetail() == null ? 0 : this
						.getContractNumberDetail().hashCode());
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
		result = 37 * result + this.getLanguageId();
		result = 37
				* result
				+ (getContractNumberCategoryName() == null ? 0 : this
						.getContractNumberCategoryName().hashCode());
		return result;
	}

}
