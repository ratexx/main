package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModuleActivityId generated by hbm2java
 */
@Embeddable
public class ModuleActivityId implements java.io.Serializable {

	private int moduleActivityId;
	private int roleModuleId;
	private int moduleId;
	private int activityId;

	public ModuleActivityId() {
	}

	public ModuleActivityId(int moduleActivityId, int roleModuleId,
			int moduleId, int activityId) {
		this.moduleActivityId = moduleActivityId;
		this.roleModuleId = roleModuleId;
		this.moduleId = moduleId;
		this.activityId = activityId;
	}

	@Column(name = "module_activity_id", nullable = false)
	public int getModuleActivityId() {
		return this.moduleActivityId;
	}

	public void setModuleActivityId(int moduleActivityId) {
		this.moduleActivityId = moduleActivityId;
	}

	@Column(name = "role_module_id", nullable = false)
	public int getRoleModuleId() {
		return this.roleModuleId;
	}

	public void setRoleModuleId(int roleModuleId) {
		this.roleModuleId = roleModuleId;
	}

	@Column(name = "module_id", nullable = false)
	public int getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	@Column(name = "activity_id", nullable = false)
	public int getActivityId() {
		return this.activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModuleActivityId))
			return false;
		ModuleActivityId castOther = (ModuleActivityId) other;

		return (this.getModuleActivityId() == castOther.getModuleActivityId())
				&& (this.getRoleModuleId() == castOther.getRoleModuleId())
				&& (this.getModuleId() == castOther.getModuleId())
				&& (this.getActivityId() == castOther.getActivityId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getModuleActivityId();
		result = 37 * result + this.getRoleModuleId();
		result = 37 * result + this.getModuleId();
		result = 37 * result + this.getActivityId();
		return result;
	}

}
