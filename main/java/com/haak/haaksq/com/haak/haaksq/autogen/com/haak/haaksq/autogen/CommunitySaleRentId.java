package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CommunitySaleRentId generated by hbm2java
 */
@Embeddable
public class CommunitySaleRentId implements java.io.Serializable {

	private int communitySaleRentId;
	private int communityId;

	public CommunitySaleRentId() {
	}

	public CommunitySaleRentId(int communitySaleRentId, int communityId) {
		this.communitySaleRentId = communitySaleRentId;
		this.communityId = communityId;
	}

	@Column(name = "community_sale_rent_id", nullable = false)
	public int getCommunitySaleRentId() {
		return this.communitySaleRentId;
	}

	public void setCommunitySaleRentId(int communitySaleRentId) {
		this.communitySaleRentId = communitySaleRentId;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CommunitySaleRentId))
			return false;
		CommunitySaleRentId castOther = (CommunitySaleRentId) other;

		return (this.getCommunitySaleRentId() == castOther
				.getCommunitySaleRentId())
				&& (this.getCommunityId() == castOther.getCommunityId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCommunitySaleRentId();
		result = 37 * result + this.getCommunityId();
		return result;
	}

}
