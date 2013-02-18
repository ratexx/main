package com.haak.haaksq.form;

// Generated 25 ��.�. 2555, 23:10:06 by Hibernate Tools 3.4.0.CR1

/**
 * VLoginActionId generated by hbm2java
 */
public class VLoginAction implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String packageName;
	private String menuName;
	private String moduleName;
	private int packageId;
	private int menuId;
	private int communityId;
	private String firstName;
	private int roleId;

	public VLoginAction() {
	}

	public VLoginAction(int packageId, int menuId, int communityId,
			String firstName, int roleId) {
		this.packageId = packageId;
		this.menuId = menuId;
		this.communityId = communityId;
		this.firstName = firstName;
		this.roleId = roleId;
	}

	public VLoginAction(String packageName, String menuName,
			String moduleName, int packageId, int menuId, int communityId,
			String firstName, int roleId) {
		this.packageName = packageName;
		this.menuName = menuName;
		this.moduleName = moduleName;
		this.packageId = packageId;
		this.menuId = menuId;
		this.communityId = communityId;
		this.firstName = firstName;
		this.roleId = roleId;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public int getPackageId() {
		return this.packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VLoginAction))
			return false;
		VLoginAction castOther = (VLoginAction) other;

		return ((this.getPackageName() == castOther.getPackageName()) || (this
				.getPackageName() != null && castOther.getPackageName() != null && this
				.getPackageName().equals(castOther.getPackageName())))
				&& ((this.getMenuName() == castOther.getMenuName()) || (this
						.getMenuName() != null
						&& castOther.getMenuName() != null && this
						.getMenuName().equals(castOther.getMenuName())))
				&& ((this.getModuleName() == castOther.getModuleName()) || (this
						.getModuleName() != null
						&& castOther.getModuleName() != null && this
						.getModuleName().equals(castOther.getModuleName())))
				&& (this.getPackageId() == castOther.getPackageId())
				&& (this.getMenuId() == castOther.getMenuId())
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& ((this.getFirstName() == castOther.getFirstName()) || (this
						.getFirstName() != null
						&& castOther.getFirstName() != null && this
						.getFirstName().equals(castOther.getFirstName())))
				&& (this.getRoleId() == castOther.getRoleId());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPackageName() == null ? 0 : this.getPackageName()
						.hashCode());
		result = 37 * result
				+ (getMenuName() == null ? 0 : this.getMenuName().hashCode());
		result = 37
				* result
				+ (getModuleName() == null ? 0 : this.getModuleName()
						.hashCode());
		result = 37 * result + this.getPackageId();
		result = 37 * result + this.getMenuId();
		result = 37 * result + this.getCommunityId();
		result = 37 * result
				+ (getFirstName() == null ? 0 : this.getFirstName().hashCode());
		result = 37 * result + this.getRoleId();
		return result;
	}

}