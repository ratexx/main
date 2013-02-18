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
 * MstPosition generated by hbm2java
 */
@Entity
@Table(name = "mst_position", catalog = "haaksquare_db")
public class MstPosition implements java.io.Serializable {

	private MstPositionId id;
	private String positionName;
	private int positionLevel;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public MstPosition() {
	}

	public MstPosition(MstPositionId id, String positionName, int positionLevel) {
		this.id = id;
		this.positionName = positionName;
		this.positionLevel = positionLevel;
	}

	public MstPosition(MstPositionId id, String positionName,
			int positionLevel, Integer modifyBy, Date modifyDate,
			Integer createBy, Date createDate) {
		this.id = id;
		this.positionName = positionName;
		this.positionLevel = positionLevel;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "positionId", column = @Column(name = "position_id", nullable = false)),
			@AttributeOverride(name = "languageId", column = @Column(name = "language_id", nullable = false)) })
	public MstPositionId getId() {
		return this.id;
	}

	public void setId(MstPositionId id) {
		this.id = id;
	}

	@Column(name = "position_name", nullable = false, length = 200)
	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	@Column(name = "position_level", nullable = false)
	public int getPositionLevel() {
		return this.positionLevel;
	}

	public void setPositionLevel(int positionLevel) {
		this.positionLevel = positionLevel;
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