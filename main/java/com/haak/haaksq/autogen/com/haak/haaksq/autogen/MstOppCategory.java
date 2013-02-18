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
 * MstOppCategory generated by hbm2java
 */
@Entity
@Table(name = "mst_opp_category", catalog = "haaksquare_db")
public class MstOppCategory implements java.io.Serializable {

	private MstOppCategoryId id;
	private String oppCategoryName;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public MstOppCategory() {
	}

	public MstOppCategory(MstOppCategoryId id) {
		this.id = id;
	}

	public MstOppCategory(MstOppCategoryId id, String oppCategoryName,
			Integer modifyBy, Date modifyDate, Integer createBy, Date createDate) {
		this.id = id;
		this.oppCategoryName = oppCategoryName;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "oppCategoryId", column = @Column(name = "opp_category_id", nullable = false)),
			@AttributeOverride(name = "languageId", column = @Column(name = "language_id", nullable = false)) })
	public MstOppCategoryId getId() {
		return this.id;
	}

	public void setId(MstOppCategoryId id) {
		this.id = id;
	}

	@Column(name = "opp_category_name", length = 100)
	public String getOppCategoryName() {
		return this.oppCategoryName;
	}

	public void setOppCategoryName(String oppCategoryName) {
		this.oppCategoryName = oppCategoryName;
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
