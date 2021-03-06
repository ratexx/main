package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VCommunityDownload generated by hbm2java
 */
@Entity
@Table(name = "v_community_download", catalog = "haaksquare_db")
public class VCommunityDownload implements java.io.Serializable {

	private VCommunityDownloadId id;

	public VCommunityDownload() {
	}

	public VCommunityDownload(VCommunityDownloadId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "attachId", column = @Column(name = "attach_id", nullable = false)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "fileName", column = @Column(name = "file_name", nullable = false, length = 200)),
			@AttributeOverride(name = "pathName", column = @Column(name = "path_name", nullable = false, length = 200)),
			@AttributeOverride(name = "fileDetail", column = @Column(name = "file_detail", nullable = false, length = 2000)),
			@AttributeOverride(name = "attachUrl", column = @Column(name = "attach_url", nullable = false, length = 200)) })
	public VCommunityDownloadId getId() {
		return this.id;
	}

	public void setId(VCommunityDownloadId id) {
		this.id = id;
	}

}
