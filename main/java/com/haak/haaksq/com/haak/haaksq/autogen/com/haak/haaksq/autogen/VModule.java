package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VModule generated by hbm2java
 */
@Entity
@Table(name = "v_module", catalog = "haaksquare_db")
public class VModule implements java.io.Serializable {

	private VModuleId id;

	public VModule() {
	}

	public VModule(VModuleId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "packageName", column = @Column(name = "package_name", length = 200)),
			@AttributeOverride(name = "menuName", column = @Column(name = "menu_name", length = 100)),
			@AttributeOverride(name = "moduleName", column = @Column(name = "module_name", length = 200)),
			@AttributeOverride(name = "packageId", column = @Column(name = "package_id", nullable = false)),
			@AttributeOverride(name = "menuId", column = @Column(name = "menu_id", nullable = false)),
			@AttributeOverride(name = "moduleId", column = @Column(name = "module_id", nullable = false)),
			@AttributeOverride(name = "packageMenuId", column = @Column(name = "package_menu_id", nullable = false)),
			@AttributeOverride(name = "moduleUrl", column = @Column(name = "module_url", length = 100)),
			@AttributeOverride(name = "moduleImageUrl", column = @Column(name = "module_image_url", length = 100)),
			@AttributeOverride(name = "moduleDetail", column = @Column(name = "module_detail", length = 1000)),
			@AttributeOverride(name = "moduleLanguageId", column = @Column(name = "module_language_id", nullable = false)),
			@AttributeOverride(name = "packageLanguageId", column = @Column(name = "package_language_id", nullable = false)),
			@AttributeOverride(name = "languageId", column = @Column(name = "language_id", nullable = false)) })
	public VModuleId getId() {
		return this.id;
	}

	public void setId(VModuleId id) {
		this.id = id;
	}

}
