package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VMenuModuleId generated by hbm2java
 */
@Embeddable
public class VMenuModuleId implements java.io.Serializable {

	private String packageName;
	private String menuName;
	private String moduleName;
	private int packageId;
	private int menuId;
	private int moduleId;
	private int packageMenuId;
	private String moduleUrl;
	private int languageId;
	private String moduleImageUrl;

	public VMenuModuleId() {
	}

	public VMenuModuleId(int packageId, int menuId, int moduleId,
			int packageMenuId, int languageId) {
		this.packageId = packageId;
		this.menuId = menuId;
		this.moduleId = moduleId;
		this.packageMenuId = packageMenuId;
		this.languageId = languageId;
	}

	public VMenuModuleId(String packageName, String menuName,
			String moduleName, int packageId, int menuId, int moduleId,
			int packageMenuId, String moduleUrl, int languageId,
			String moduleImageUrl) {
		this.packageName = packageName;
		this.menuName = menuName;
		this.moduleName = moduleName;
		this.packageId = packageId;
		this.menuId = menuId;
		this.moduleId = moduleId;
		this.packageMenuId = packageMenuId;
		this.moduleUrl = moduleUrl;
		this.languageId = languageId;
		this.moduleImageUrl = moduleImageUrl;
	}

	@Column(name = "package_name", length = 200)
	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	@Column(name = "menu_name", length = 100)
	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@Column(name = "module_name", length = 200)
	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
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

	@Column(name = "module_id", nullable = false)
	public int getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	@Column(name = "package_menu_id", nullable = false)
	public int getPackageMenuId() {
		return this.packageMenuId;
	}

	public void setPackageMenuId(int packageMenuId) {
		this.packageMenuId = packageMenuId;
	}

	@Column(name = "module_url", length = 100)
	public String getModuleUrl() {
		return this.moduleUrl;
	}

	public void setModuleUrl(String moduleUrl) {
		this.moduleUrl = moduleUrl;
	}

	@Column(name = "language_id", nullable = false)
	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	@Column(name = "module_image_url", length = 100)
	public String getModuleImageUrl() {
		return this.moduleImageUrl;
	}

	public void setModuleImageUrl(String moduleImageUrl) {
		this.moduleImageUrl = moduleImageUrl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VMenuModuleId))
			return false;
		VMenuModuleId castOther = (VMenuModuleId) other;

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
				&& (this.getModuleId() == castOther.getModuleId())
				&& (this.getPackageMenuId() == castOther.getPackageMenuId())
				&& ((this.getModuleUrl() == castOther.getModuleUrl()) || (this
						.getModuleUrl() != null
						&& castOther.getModuleUrl() != null && this
						.getModuleUrl().equals(castOther.getModuleUrl())))
				&& (this.getLanguageId() == castOther.getLanguageId())
				&& ((this.getModuleImageUrl() == castOther.getModuleImageUrl()) || (this
						.getModuleImageUrl() != null
						&& castOther.getModuleImageUrl() != null && this
						.getModuleImageUrl().equals(
								castOther.getModuleImageUrl())));
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
		result = 37 * result + this.getModuleId();
		result = 37 * result + this.getPackageMenuId();
		result = 37 * result
				+ (getModuleUrl() == null ? 0 : this.getModuleUrl().hashCode());
		result = 37 * result + this.getLanguageId();
		result = 37
				* result
				+ (getModuleImageUrl() == null ? 0 : this.getModuleImageUrl()
						.hashCode());
		return result;
	}

}
