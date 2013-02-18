package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VAdPublic generated by hbm2java
 */
@Entity
@Table(name = "v_ad_public", catalog = "haaksquare_db")
public class VAdPublic implements java.io.Serializable {

	private VAdPublicId id;

	public VAdPublic() {
	}

	public VAdPublic(VAdPublicId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "adCommunityId", column = @Column(name = "ad_community_id", nullable = false)),
			@AttributeOverride(name = "adId", column = @Column(name = "ad_id", nullable = false)),
			@AttributeOverride(name = "adFilename", column = @Column(name = "ad_filename", length = 500)),
			@AttributeOverride(name = "adPath", column = @Column(name = "ad_path", length = 500)),
			@AttributeOverride(name = "adUrl", column = @Column(name = "ad_url", length = 1000)),
			@AttributeOverride(name = "fgPublic", column = @Column(name = "fg_public", length = 1)),
			@AttributeOverride(name = "adFileTypeName", column = @Column(name = "ad_file_type_name", length = 100)) })
	public VAdPublicId getId() {
		return this.id;
	}

	public void setId(VAdPublicId id) {
		this.id = id;
	}

}
