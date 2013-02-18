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
 * MenuModule generated by hbm2java
 */
@Entity
@Table(name = "menu_module", catalog = "haaksquare_db")
public class MenuModule implements java.io.Serializable {

	private MenuModuleId id;
	private int moduleId;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public MenuModule() {
	}

	public MenuModule(MenuModuleId id, int moduleId) {
		this.id = id;
		this.moduleId = moduleId;
	}

	public MenuModule(MenuModuleId id, int moduleId, Integer modifyBy,
			Date modifyDate, Integer createBy, Date createDate) {
		this.id = id;
		this.moduleId = moduleId;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "menuModuleId", column = @Column(name = "menu_module_id", nullable = false)),
			@AttributeOverride(name = "packageMenuId", column = @Column(name = "package_menu_id", nullable = false)),
			@AttributeOverride(name = "menuId", column = @Column(name = "menu_id", nullable = false)) })
	public MenuModuleId getId() {
		return this.id;
	}

	public void setId(MenuModuleId id) {
		this.id = id;
	}

	@Column(name = "module_id", nullable = false)
	public int getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
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
