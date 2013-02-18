package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VCommunityGallaryDetail generated by hbm2java
 */
@Entity
@Table(name = "v_community_gallary_detail", catalog = "haaksquare_db")
public class VCommunityGallaryDetail implements java.io.Serializable {

	private VCommunityGallaryDetailId id;

	public VCommunityGallaryDetail() {
	}

	public VCommunityGallaryDetail(VCommunityGallaryDetailId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "fileName", column = @Column(name = "file_name", nullable = false, length = 200)),
			@AttributeOverride(name = "fileTypeName", column = @Column(name = "file_type_name", nullable = false, length = 100)),
			@AttributeOverride(name = "pathName", column = @Column(name = "path_name", nullable = false, length = 200)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "attachSeq", column = @Column(name = "attach_seq", nullable = false)),
			@AttributeOverride(name = "fileDetail", column = @Column(name = "file_detail", nullable = false, length = 2000)),
			@AttributeOverride(name = "attachUrl", column = @Column(name = "attach_url", nullable = false, length = 200)),
			@AttributeOverride(name = "modifyBy", column = @Column(name = "modify_by")),
			@AttributeOverride(name = "attachId", column = @Column(name = "attach_id", nullable = false)) })
	public VCommunityGallaryDetailId getId() {
		return this.id;
	}

	public void setId(VCommunityGallaryDetailId id) {
		this.id = id;
	}

}