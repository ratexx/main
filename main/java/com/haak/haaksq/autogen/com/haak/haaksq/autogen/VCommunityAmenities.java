package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VCommunityAmenities generated by hbm2java
 */
@Entity
@Table(name = "v_community_amenities", catalog = "haaksquare_db")
public class VCommunityAmenities implements java.io.Serializable {

	private VCommunityAmenitiesId id;

	public VCommunityAmenities() {
	}

	public VCommunityAmenities(VCommunityAmenitiesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id")),
			@AttributeOverride(name = "amenitiesName", column = @Column(name = "amenities_name", length = 200)),
			@AttributeOverride(name = "amenitiesFg", column = @Column(name = "amenities_fg", length = 1)),
			@AttributeOverride(name = "amenitiesDetail", column = @Column(name = "amenities_detail", length = 500)),
			@AttributeOverride(name = "communityAmenitiesId", column = @Column(name = "community_amenities_id", nullable = false)),
			@AttributeOverride(name = "langaugeId", column = @Column(name = "langauge_id", nullable = false)) })
	public VCommunityAmenitiesId getId() {
		return this.id;
	}

	public void setId(VCommunityAmenitiesId id) {
		this.id = id;
	}

}
