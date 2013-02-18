package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RoleModuleId generated by hbm2java
 */
@Embeddable
public class RoleModuleId implements java.io.Serializable {

	private int roleModuleId;
	private int roleId;
	private int moduleId;
	private int packageId;

	public RoleModuleId() {
	}

	public RoleModuleId(int roleModuleId, int roleId, int moduleId,
			int packageId) {
		this.roleModuleId = roleModuleId;
		this.roleId = roleId;
		this.moduleId = moduleId;
		this.packageId = packageId;
	}

	@Column(name = "role_module_id", nullable = false)
	public int getRoleModuleId() {
		return this.roleModuleId;
	}

	public void setRoleModuleId(int roleModuleId) {
		this.roleModuleId = roleModuleId;
	}

	@Column(name = "role_id", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "module_id", nullable = false)
	public int getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	@Column(name = "package_id", nullable = false)
	public int getPackageId() {
		return this.packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RoleModuleId))
			return false;
		RoleModuleId castOther = (RoleModuleId) other;

		return (this.getRoleModuleId() == castOther.getRoleModuleId())
				&& (this.getRoleId() == castOther.getRoleId())
				&& (this.getModuleId() == castOther.getModuleId())
				&& (this.getPackageId() == castOther.getPackageId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRoleModuleId();
		result = 37 * result + this.getRoleId();
		result = 37 * result + this.getModuleId();
		result = 37 * result + this.getPackageId();
		return result;
	}

}
