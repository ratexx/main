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
 * MstAmphoe generated by hbm2java
 */
@Entity
@Table(name = "mst_amphoe", catalog = "haaksquare_db")
public class MstAmphoe implements java.io.Serializable {

	private MstAmphoeId id;
	private String amphoeName;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public MstAmphoe() {
	}

	public MstAmphoe(MstAmphoeId id) {
		this.id = id;
	}

	public MstAmphoe(MstAmphoeId id, String amphoeName, Integer modifyBy,
			Date modifyDate, Integer createBy, Date createDate) {
		this.id = id;
		this.amphoeName = amphoeName;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "amphoeId", column = @Column(name = "amphoe_id", nullable = false)),
			@AttributeOverride(name = "languageId", column = @Column(name = "language_id", nullable = false)) })
	public MstAmphoeId getId() {
		return this.id;
	}

	public void setId(MstAmphoeId id) {
		this.id = id;
	}

	@Column(name = "amphoe_name")
	public String getAmphoeName() {
		return this.amphoeName;
	}

	public void setAmphoeName(String amphoeName) {
		this.amphoeName = amphoeName;
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
