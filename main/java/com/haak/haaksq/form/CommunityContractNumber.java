package com.haak.haaksq.form;

// Generated Sep 20, 2012 10:58:38 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * CommunityContractNumber generated by hbm2java
 */
public class CommunityContractNumber implements java.io.Serializable {

	private int contractNumberId;
	private int communityId;
	
	public int getContractNumberId() {
		return contractNumberId;
	}


	public void setContractNumberId(int contractNumberId) {
		this.contractNumberId = contractNumberId;
	}


	public int getCommunityId() {
		return communityId;
	}


	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	private Integer contractNumberCategoryId;
	private String contractNumberName;
	private String contractNumberDetail;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public CommunityContractNumber() {
	}

	
	public Integer getContractNumberCategoryId() {
		return this.contractNumberCategoryId;
	}

	public void setContractNumberCategoryId(Integer contractNumberCategoryId) {
		this.contractNumberCategoryId = contractNumberCategoryId;
	}

	public String getContractNumberName() {
		return this.contractNumberName;
	}

	public void setContractNumberName(String contractNumberName) {
		this.contractNumberName = contractNumberName;
	}

	public String getContractNumberDetail() {
		return this.contractNumberDetail;
	}

	public void setContractNumberDetail(String contractNumberDetail) {
		this.contractNumberDetail = contractNumberDetail;
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
