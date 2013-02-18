package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VCommunityResource generated by hbm2java
 */
@Entity
@Table(name = "v_community_resource", catalog = "haaksquare_db")
public class VCommunityResource implements java.io.Serializable {

	private VCommunityResourceId id;

	public VCommunityResource() {
	}

	public VCommunityResource(VCommunityResourceId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "communityResourceId", column = @Column(name = "community_resource_id", nullable = false)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "seq", column = @Column(name = "seq", nullable = false)),
			@AttributeOverride(name = "fgOpen", column = @Column(name = "fg_open", length = 1)),
			@AttributeOverride(name = "fgPublic", column = @Column(name = "fg_public", length = 1)),
			@AttributeOverride(name = "resourceCategoryId", column = @Column(name = "resource_category_id")),
			@AttributeOverride(name = "resourceSubCategoryId", column = @Column(name = "resource_sub_category_id")),
			@AttributeOverride(name = "resourceName", column = @Column(name = "resource_name", length = 500)),
			@AttributeOverride(name = "resourceDetail", column = @Column(name = "resource_detail", length = 2000)),
			@AttributeOverride(name = "fgShow", column = @Column(name = "fg_show", length = 1)),
			@AttributeOverride(name = "modifyDate", column = @Column(name = "modify_date", length = 19)),
			@AttributeOverride(name = "createBy", column = @Column(name = "create_by")),
			@AttributeOverride(name = "createDate", column = @Column(name = "create_date", length = 19)),
			@AttributeOverride(name = "modifyBy", column = @Column(name = "modify_by")),
			@AttributeOverride(name = "fileName", column = @Column(name = "file_name", nullable = false, length = 200)),
			@AttributeOverride(name = "pathName", column = @Column(name = "path_name", nullable = false, length = 200)),
			@AttributeOverride(name = "fileDetail", column = @Column(name = "file_detail", nullable = false, length = 2000)),
			@AttributeOverride(name = "attachUrl", column = @Column(name = "attach_url", nullable = false, length = 200)),
			@AttributeOverride(name = "year", column = @Column(name = "year", length = 4)),
			@AttributeOverride(name = "unit", column = @Column(name = "unit")) })
	public VCommunityResourceId getId() {
		return this.id;
	}

	public void setId(VCommunityResourceId id) {
		this.id = id;
	}

}
