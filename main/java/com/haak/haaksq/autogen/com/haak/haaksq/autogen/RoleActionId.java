package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RoleActionId generated by hbm2java
 */
@Embeddable
public class RoleActionId implements java.io.Serializable {

	private int roleModuleId;
	private int actionId;

	public RoleActionId() {
	}

	public RoleActionId(int roleModuleId, int actionId) {
		this.roleModuleId = roleModuleId;
		this.actionId = actionId;
	}

	@Column(name = "role_module_id", nullable = false)
	public int getRoleModuleId() {
		return this.roleModuleId;
	}

	public void setRoleModuleId(int roleModuleId) {
		this.roleModuleId = roleModuleId;
	}

	@Column(name = "action_id", nullable = false)
	public int getActionId() {
		return this.actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RoleActionId))
			return false;
		RoleActionId castOther = (RoleActionId) other;

		return (this.getRoleModuleId() == castOther.getRoleModuleId())
				&& (this.getActionId() == castOther.getActionId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRoleModuleId();
		result = 37 * result + this.getActionId();
		return result;
	}

}