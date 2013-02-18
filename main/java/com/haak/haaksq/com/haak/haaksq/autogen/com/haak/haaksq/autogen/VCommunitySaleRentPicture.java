package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VCommunitySaleRentPicture generated by hbm2java
 */
@Entity
@Table(name = "v_community_sale_rent_picture", catalog = "haaksquare_db")
public class VCommunitySaleRentPicture implements java.io.Serializable {

	private VCommunitySaleRentPictureId id;

	public VCommunitySaleRentPicture() {
	}

	public VCommunitySaleRentPicture(VCommunitySaleRentPictureId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "fileName", column = @Column(name = "file_name", nullable = false, length = 200)),
			@AttributeOverride(name = "pathName", column = @Column(name = "path_name", nullable = false, length = 200)),
			@AttributeOverride(name = "fileDetail", column = @Column(name = "file_detail", nullable = false, length = 2000)),
			@AttributeOverride(name = "attachUrl", column = @Column(name = "attach_url", nullable = false, length = 200)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "attachId", column = @Column(name = "attach_id", nullable = false)),
			@AttributeOverride(name = "attachSeq", column = @Column(name = "attach_seq", nullable = false)) })
	public VCommunitySaleRentPictureId getId() {
		return this.id;
	}

	public void setId(VCommunitySaleRentPictureId id) {
		this.id = id;
	}

}
