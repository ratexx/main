package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VModuleSubmenuId generated by hbm2java
 */
@Embeddable
public class VModuleSubmenuId implements java.io.Serializable {

	private int menuId;
	private String menuName;
	private Integer seq;
	private Integer levelMenu;
	private Integer seqSub;
	private Integer parrentSubMenu;
	private int roleModuleActionId;
	private Integer packageId;
	private Integer communityId;
	private Integer roleId;
	private Integer moduleId;
	private String fgView;
	private String fgAdd;
	private String fgEdit;
	private String fgDelete;
	private Integer modifyBy;
	private Date modyfyDate;
	private Integer createBy;
	private Date createDate;

	public VModuleSubmenuId() {
	}

	public VModuleSubmenuId(int menuId, int roleModuleActionId) {
		this.menuId = menuId;
		this.roleModuleActionId = roleModuleActionId;
	}

	public VModuleSubmenuId(int menuId, String menuName, Integer seq,
			Integer levelMenu, Integer seqSub, Integer parrentSubMenu,
			int roleModuleActionId, Integer packageId, Integer communityId,
			Integer roleId, Integer moduleId, String fgView, String fgAdd,
			String fgEdit, String fgDelete, Integer modifyBy, Date modyfyDate,
			Integer createBy, Date createDate) {
		this.menuId = menuId;
		this.menuName = menuName;
		this.seq = seq;
		this.levelMenu = levelMenu;
		this.seqSub = seqSub;
		this.parrentSubMenu = parrentSubMenu;
		this.roleModuleActionId = roleModuleActionId;
		this.packageId = packageId;
		this.communityId = communityId;
		this.roleId = roleId;
		this.moduleId = moduleId;
		this.fgView = fgView;
		this.fgAdd = fgAdd;
		this.fgEdit = fgEdit;
		this.fgDelete = fgDelete;
		this.modifyBy = modifyBy;
		this.modyfyDate = modyfyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@Column(name = "menu_id", nullable = false)
	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	@Column(name = "menu_name", length = 100)
	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@Column(name = "seq")
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "level_menu")
	public Integer getLevelMenu() {
		return this.levelMenu;
	}

	public void setLevelMenu(Integer levelMenu) {
		this.levelMenu = levelMenu;
	}

	@Column(name = "seq_sub")
	public Integer getSeqSub() {
		return this.seqSub;
	}

	public void setSeqSub(Integer seqSub) {
		this.seqSub = seqSub;
	}

	@Column(name = "parrent_sub_menu")
	public Integer getParrentSubMenu() {
		return this.parrentSubMenu;
	}

	public void setParrentSubMenu(Integer parrentSubMenu) {
		this.parrentSubMenu = parrentSubMenu;
	}

	@Column(name = "role_module_action_id", nullable = false)
	public int getRoleModuleActionId() {
		return this.roleModuleActionId;
	}

	public void setRoleModuleActionId(int roleModuleActionId) {
		this.roleModuleActionId = roleModuleActionId;
	}

	@Column(name = "package_id")
	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	@Column(name = "community_id")
	public Integer getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	@Column(name = "role_id")
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "module_id")
	public Integer getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	@Column(name = "fg_view", length = 1)
	public String getFgView() {
		return this.fgView;
	}

	public void setFgView(String fgView) {
		this.fgView = fgView;
	}

	@Column(name = "fg_Add", length = 1)
	public String getFgAdd() {
		return this.fgAdd;
	}

	public void setFgAdd(String fgAdd) {
		this.fgAdd = fgAdd;
	}

	@Column(name = "fg_edit", length = 1)
	public String getFgEdit() {
		return this.fgEdit;
	}

	public void setFgEdit(String fgEdit) {
		this.fgEdit = fgEdit;
	}

	@Column(name = "fg_delete", length = 1)
	public String getFgDelete() {
		return this.fgDelete;
	}

	public void setFgDelete(String fgDelete) {
		this.fgDelete = fgDelete;
	}

	@Column(name = "modify_by")
	public Integer getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "modyfy_date", length = 19)
	public Date getModyfyDate() {
		return this.modyfyDate;
	}

	public void setModyfyDate(Date modyfyDate) {
		this.modyfyDate = modyfyDate;
	}

	@Column(name = "create_by")
	public Integer getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	@Column(name = "create_date", length = 19)
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
		if (!(other instanceof VModuleSubmenuId))
			return false;
		VModuleSubmenuId castOther = (VModuleSubmenuId) other;

		return (this.getMenuId() == castOther.getMenuId())
				&& ((this.getMenuName() == castOther.getMenuName()) || (this
						.getMenuName() != null
						&& castOther.getMenuName() != null && this
						.getMenuName().equals(castOther.getMenuName())))
				&& ((this.getSeq() == castOther.getSeq()) || (this.getSeq() != null
						&& castOther.getSeq() != null && this.getSeq().equals(
						castOther.getSeq())))
				&& ((this.getLevelMenu() == castOther.getLevelMenu()) || (this
						.getLevelMenu() != null
						&& castOther.getLevelMenu() != null && this
						.getLevelMenu().equals(castOther.getLevelMenu())))
				&& ((this.getSeqSub() == castOther.getSeqSub()) || (this
						.getSeqSub() != null && castOther.getSeqSub() != null && this
						.getSeqSub().equals(castOther.getSeqSub())))
				&& ((this.getParrentSubMenu() == castOther.getParrentSubMenu()) || (this
						.getParrentSubMenu() != null
						&& castOther.getParrentSubMenu() != null && this
						.getParrentSubMenu().equals(
								castOther.getParrentSubMenu())))
				&& (this.getRoleModuleActionId() == castOther
						.getRoleModuleActionId())
				&& ((this.getPackageId() == castOther.getPackageId()) || (this
						.getPackageId() != null
						&& castOther.getPackageId() != null && this
						.getPackageId().equals(castOther.getPackageId())))
				&& ((this.getCommunityId() == castOther.getCommunityId()) || (this
						.getCommunityId() != null
						&& castOther.getCommunityId() != null && this
						.getCommunityId().equals(castOther.getCommunityId())))
				&& ((this.getRoleId() == castOther.getRoleId()) || (this
						.getRoleId() != null && castOther.getRoleId() != null && this
						.getRoleId().equals(castOther.getRoleId())))
				&& ((this.getModuleId() == castOther.getModuleId()) || (this
						.getModuleId() != null
						&& castOther.getModuleId() != null && this
						.getModuleId().equals(castOther.getModuleId())))
				&& ((this.getFgView() == castOther.getFgView()) || (this
						.getFgView() != null && castOther.getFgView() != null && this
						.getFgView().equals(castOther.getFgView())))
				&& ((this.getFgAdd() == castOther.getFgAdd()) || (this
						.getFgAdd() != null && castOther.getFgAdd() != null && this
						.getFgAdd().equals(castOther.getFgAdd())))
				&& ((this.getFgEdit() == castOther.getFgEdit()) || (this
						.getFgEdit() != null && castOther.getFgEdit() != null && this
						.getFgEdit().equals(castOther.getFgEdit())))
				&& ((this.getFgDelete() == castOther.getFgDelete()) || (this
						.getFgDelete() != null
						&& castOther.getFgDelete() != null && this
						.getFgDelete().equals(castOther.getFgDelete())))
				&& ((this.getModifyBy() == castOther.getModifyBy()) || (this
						.getModifyBy() != null
						&& castOther.getModifyBy() != null && this
						.getModifyBy().equals(castOther.getModifyBy())))
				&& ((this.getModyfyDate() == castOther.getModyfyDate()) || (this
						.getModyfyDate() != null
						&& castOther.getModyfyDate() != null && this
						.getModyfyDate().equals(castOther.getModyfyDate())))
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

		result = 37 * result + this.getMenuId();
		result = 37 * result
				+ (getMenuName() == null ? 0 : this.getMenuName().hashCode());
		result = 37 * result
				+ (getSeq() == null ? 0 : this.getSeq().hashCode());
		result = 37 * result
				+ (getLevelMenu() == null ? 0 : this.getLevelMenu().hashCode());
		result = 37 * result
				+ (getSeqSub() == null ? 0 : this.getSeqSub().hashCode());
		result = 37
				* result
				+ (getParrentSubMenu() == null ? 0 : this.getParrentSubMenu()
						.hashCode());
		result = 37 * result + this.getRoleModuleActionId();
		result = 37 * result
				+ (getPackageId() == null ? 0 : this.getPackageId().hashCode());
		result = 37
				* result
				+ (getCommunityId() == null ? 0 : this.getCommunityId()
						.hashCode());
		result = 37 * result
				+ (getRoleId() == null ? 0 : this.getRoleId().hashCode());
		result = 37 * result
				+ (getModuleId() == null ? 0 : this.getModuleId().hashCode());
		result = 37 * result
				+ (getFgView() == null ? 0 : this.getFgView().hashCode());
		result = 37 * result
				+ (getFgAdd() == null ? 0 : this.getFgAdd().hashCode());
		result = 37 * result
				+ (getFgEdit() == null ? 0 : this.getFgEdit().hashCode());
		result = 37 * result
				+ (getFgDelete() == null ? 0 : this.getFgDelete().hashCode());
		result = 37 * result
				+ (getModifyBy() == null ? 0 : this.getModifyBy().hashCode());
		result = 37
				* result
				+ (getModyfyDate() == null ? 0 : this.getModyfyDate()
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
