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
 * CommunityContractNumber generated by hbm2java
 */
@Entity
@Table(name = "community_contract_number", catalog = "haaksquare_db")
public class CommunityContractNumber implements java.io.Serializable {

	private CommunityContractNumberId id;
	private Integer contractNumberCategoryId;
	private String contractNumberName;
	private String contractNumberDetail;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public CommunityContractNumber() {
	}

	public CommunityContractNumber(CommunityContractNumberId id) {
		this.id = id;
	}

	public CommunityContractNumber(CommunityContractNumberId id,
			Integer contractNumberCategoryId, String contractNumberName,
			String contractNumberDetail, Date modifyDate, Integer createBy,
			Date createDate) {
		this.id = id;
		this.contractNumberCategoryId = contractNumberCategoryId;
		this.contractNumberName = contractNumberName;
		this.contractNumberDetail = contractNumberDetail;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "contractNumberId", column = @Column(name = "contract_number_id", nullable = false)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)) })
	public CommunityContractNumberId getId() {
		return this.id;
	}

	public void setId(CommunityContractNumberId id) {
		this.id = id;
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