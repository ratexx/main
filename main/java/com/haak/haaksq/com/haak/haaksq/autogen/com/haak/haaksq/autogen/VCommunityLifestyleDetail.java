package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VCommunityLifestyleDetail generated by hbm2java
 */
@Entity
@Table(name = "v_community_lifestyle_detail", catalog = "haaksquare_db")
public class VCommunityLifestyleDetail implements java.io.Serializable {

	private VCommunityLifestyleDetailId id;

	public VCommunityLifestyleDetail() {
	}

	public VCommunityLifestyleDetail(VCommunityLifestyleDetailId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "communityLifestyleId", column = @Column(name = "community_lifestyle_id", nullable = false)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "lifestyleName", column = @Column(name = "lifestyle_name", length = 500)),
			@AttributeOverride(name = "distanceFromHoa", column = @Column(name = "distance_from_HOA", precision = 10)),
			@AttributeOverride(name = "fileName", column = @Column(name = "file_name", nullable = false, length = 200)),
			@AttributeOverride(name = "pathName", column = @Column(name = "path_name", nullable = false, length = 200)),
			@AttributeOverride(name = "attachId", column = @Column(name = "attach_id", nullable = false)),
			@AttributeOverride(name = "attachSeq", column = @Column(name = "attach_seq", nullable = false)),
			@AttributeOverride(name = "attachUrl", column = @Column(name = "attach_url", nullable = false, length = 200)),
			@AttributeOverride(name = "fileDetail", column = @Column(name = "file_detail", nullable = false, length = 2000)),
			@AttributeOverride(name = "lifestyleUrl", column = @Column(name = "lifestyle_url", length = 1000)),
			@AttributeOverride(name = "lifestyleGoogleMap", column = @Column(name = "lifestyle_google_map", length = 1000)),
			@AttributeOverride(name = "lifestyleDetail", column = @Column(name = "lifestyle_detail", length = 1000)),
			@AttributeOverride(name = "recommende", column = @Column(name = "recommende", length = 1000)),
			@AttributeOverride(name = "address", column = @Column(name = "address", length = 1000)),
			@AttributeOverride(name = "contractNo", column = @Column(name = "contract_no", length = 200)) })
	public VCommunityLifestyleDetailId getId() {
		return this.id;
	}

	public void setId(VCommunityLifestyleDetailId id) {
		this.id = id;
	}

}
