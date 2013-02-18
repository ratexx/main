package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VCommunityLifestyle generated by hbm2java
 */
@Entity
@Table(name = "v_community_lifestyle", catalog = "haaksquare_db")
public class VCommunityLifestyle implements java.io.Serializable {

	private VCommunityLifestyleId id;

	public VCommunityLifestyle() {
	}

	public VCommunityLifestyle(VCommunityLifestyleId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "communityLifestyleId", column = @Column(name = "community_lifestyle_id", nullable = false)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "lifestyleName", column = @Column(name = "lifestyle_name", length = 500)),
			@AttributeOverride(name = "distanceFromHoa", column = @Column(name = "distance_from_HOA", precision = 10)),
			@AttributeOverride(name = "lifestyleUrl", column = @Column(name = "lifestyle_url", length = 1000)),
			@AttributeOverride(name = "lifestyleGoogleMap", column = @Column(name = "lifestyle_google_map", length = 1000)),
			@AttributeOverride(name = "lifestyleDetail", column = @Column(name = "lifestyle_detail", length = 1000)),
			@AttributeOverride(name = "lifestyleLink", column = @Column(name = "lifestyle_link", length = 300)),
			@AttributeOverride(name = "googleMapLatitude", column = @Column(name = "google_map_latitude", length = 500)),
			@AttributeOverride(name = "googleMapLongtitude", column = @Column(name = "google_map_longtitude", length = 500)),
			@AttributeOverride(name = "googleMapUrl", column = @Column(name = "google_map_url", length = 500)),
			@AttributeOverride(name = "lifestyleId", column = @Column(name = "lifestyle_id")),
			@AttributeOverride(name = "fileName", column = @Column(name = "file_name", nullable = false, length = 200)),
			@AttributeOverride(name = "pathName", column = @Column(name = "path_name", nullable = false, length = 200)),
			@AttributeOverride(name = "fileDetail", column = @Column(name = "file_detail", nullable = false, length = 2000)),
			@AttributeOverride(name = "attachUrl", column = @Column(name = "attach_url", nullable = false, length = 200)),
			@AttributeOverride(name = "languageId", column = @Column(name = "language_id")),
			@AttributeOverride(name = "lifestyleTypeName", column = @Column(name = "lifestyle_type_name")),
			@AttributeOverride(name = "linkId", column = @Column(name = "link_id", nullable = false)),
			@AttributeOverride(name = "recommende", column = @Column(name = "recommende", length = 1000)),
			@AttributeOverride(name = "address", column = @Column(name = "address", length = 1000)),
			@AttributeOverride(name = "contractNo", column = @Column(name = "contract_no", length = 200)) })
	public VCommunityLifestyleId getId() {
		return this.id;
	}

	public void setId(VCommunityLifestyleId id) {
		this.id = id;
	}

}