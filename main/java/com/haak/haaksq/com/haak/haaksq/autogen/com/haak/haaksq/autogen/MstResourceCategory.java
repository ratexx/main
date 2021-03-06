package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

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
 * MstResourceCategory generated by hbm2java
 */
@Entity
@Table(name = "mst_resource_category", catalog = "haaksquare_db")
public class MstResourceCategory implements java.io.Serializable {

	private MstResourceCategoryId id;
	private String resourceCategoryName;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public MstResourceCategory() {
	}

	public MstResourceCategory(MstResourceCategoryId id) {
		this.id = id;
	}

	public MstResourceCategory(MstResourceCategoryId id,
			String resourceCategoryName, Integer modifyBy, Date modifyDate,
			Integer createBy, Date createDate) {
		this.id = id;
		this.resourceCategoryName = resourceCategoryName;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "resourceResourceId", column = @Column(name = "resource_resource_id", nullable = false)),
			@AttributeOverride(name = "languageId", column = @Column(name = "language_id", nullable = false)) })
	public MstResourceCategoryId getId() {
		return this.id;
	}

	public void setId(MstResourceCategoryId id) {
		this.id = id;
	}

	@Column(name = "resource_category_name", length = 100)
	public String getResourceCategoryName() {
		return this.resourceCategoryName;
	}

	public void setResourceCategoryName(String resourceCategoryName) {
		this.resourceCategoryName = resourceCategoryName;
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
