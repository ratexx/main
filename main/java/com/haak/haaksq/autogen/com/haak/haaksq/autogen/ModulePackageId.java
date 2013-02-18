package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModulePackageId generated by hbm2java
 */
@Embeddable
public class ModulePackageId implements java.io.Serializable {

	private int moduleId;
	private int packageId;

	public ModulePackageId() {
	}

	public ModulePackageId(int moduleId, int packageId) {
		this.moduleId = moduleId;
		this.packageId = packageId;
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
		if (!(other instanceof ModulePackageId))
			return false;
		ModulePackageId castOther = (ModulePackageId) other;

		return (this.getModuleId() == castOther.getModuleId())
				&& (this.getPackageId() == castOther.getPackageId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getModuleId();
		result = 37 * result + this.getPackageId();
		return result;
	}

}
