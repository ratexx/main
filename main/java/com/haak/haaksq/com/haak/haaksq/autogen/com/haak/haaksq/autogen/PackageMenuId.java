package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PackageMenuId generated by hbm2java
 */
@Embeddable
public class PackageMenuId implements java.io.Serializable {

	private int packageMenuId;
	private int packageId;
	private int menuId;

	public PackageMenuId() {
	}

	public PackageMenuId(int packageMenuId, int packageId, int menuId) {
		this.packageMenuId = packageMenuId;
		this.packageId = packageId;
		this.menuId = menuId;
	}

	@Column(name = "package_menu_id", nullable = false)
	public int getPackageMenuId() {
		return this.packageMenuId;
	}

	public void setPackageMenuId(int packageMenuId) {
		this.packageMenuId = packageMenuId;
	}

	@Column(name = "package_id", nullable = false)
	public int getPackageId() {
		return this.packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	@Column(name = "menu_id", nullable = false)
	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PackageMenuId))
			return false;
		PackageMenuId castOther = (PackageMenuId) other;

		return (this.getPackageMenuId() == castOther.getPackageMenuId())
				&& (this.getPackageId() == castOther.getPackageId())
				&& (this.getMenuId() == castOther.getMenuId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPackageMenuId();
		result = 37 * result + this.getPackageId();
		result = 37 * result + this.getMenuId();
		return result;
	}

}
