package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VCommunityWhatnearbyPicture generated by hbm2java
 */
@Entity
@Table(name = "v_community_whatnearby_picture", catalog = "haaksquare_db")
public class VCommunityWhatnearbyPicture implements java.io.Serializable {

	private VCommunityWhatnearbyPictureId id;

	public VCommunityWhatnearbyPicture() {
	}

	public VCommunityWhatnearbyPicture(VCommunityWhatnearbyPictureId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "communityLifestyleId", column = @Column(name = "community_lifestyle_id", nullable = false)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "fileName", column = @Column(name = "file_name", nullable = false, length = 200)),
			@AttributeOverride(name = "pathName", column = @Column(name = "path_name", nullable = false, length = 200)),
			@AttributeOverride(name = "fileDetail", column = @Column(name = "file_detail", nullable = false, length = 2000)),
			@AttributeOverride(name = "attachUrl", column = @Column(name = "attach_url", nullable = false, length = 200)),
			@AttributeOverride(name = "attachSeq", column = @Column(name = "attach_seq", nullable = false)) })
	public VCommunityWhatnearbyPictureId getId() {
		return this.id;
	}

	public void setId(VCommunityWhatnearbyPictureId id) {
		this.id = id;
	}

}
