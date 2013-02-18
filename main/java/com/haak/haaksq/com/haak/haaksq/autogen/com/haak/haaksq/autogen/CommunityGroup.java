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
 * CommunityGroup generated by hbm2java
 */
@Entity
@Table(name = "community_group", catalog = "haaksquare_db")
public class CommunityGroup implements java.io.Serializable {

	private CommunityGroupId id;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public CommunityGroup() {
	}

	public CommunityGroup(CommunityGroupId id) {
		this.id = id;
	}

	public CommunityGroup(CommunityGroupId id, Integer modifyBy,
			Date modifyDate, Integer createBy, Date createDate) {
		this.id = id;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "communityGroupId", column = @Column(name = "community_group_id", nullable = false)) })
	public CommunityGroupId getId() {
		return this.id;
	}

	public void setId(CommunityGroupId id) {
		this.id = id;
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
