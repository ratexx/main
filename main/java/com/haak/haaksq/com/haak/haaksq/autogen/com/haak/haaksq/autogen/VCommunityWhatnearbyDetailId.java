package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VCommunityWhatNearByDetailId generated by hbm2java
 */
@Embeddable
public class VCommunityWhatNearByDetailId implements java.io.Serializable {

	private int communityLifestyleId;
	private int communityId;
	private String lifestyleFullName;
	private BigDecimal distanceFromHoa;
	private String lifestyleLink;
	private String recommende;
	private String address;
	private String contractNo;

	public VCommunityWhatNearByDetailId() {
	}

	public VCommunityWhatNearByDetailId(int communityLifestyleId,
			int communityId) {
		this.communityLifestyleId = communityLifestyleId;
		this.communityId = communityId;
	}

	public VCommunityWhatNearByDetailId(int communityLifestyleId,
			int communityId, String lifestyleFullName,
			BigDecimal distanceFromHoa, String lifestyleLink,
			String recommende, String address, String contractNo) {
		this.communityLifestyleId = communityLifestyleId;
		this.communityId = communityId;
		this.lifestyleFullName = lifestyleFullName;
		this.distanceFromHoa = distanceFromHoa;
		this.lifestyleLink = lifestyleLink;
		this.recommende = recommende;
		this.address = address;
		this.contractNo = contractNo;
	}

	@Column(name = "community_lifestyle_id", nullable = false)
	public int getCommunityLifestyleId() {
		return this.communityLifestyleId;
	}

	public void setCommunityLifestyleId(int communityLifestyleId) {
		this.communityLifestyleId = communityLifestyleId;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "lifestyle_full_name", length = 500)
	public String getLifestyleFullName() {
		return this.lifestyleFullName;
	}

	public void setLifestyleFullName(String lifestyleFullName) {
		this.lifestyleFullName = lifestyleFullName;
	}

	@Column(name = "distance_from_HOA", precision = 10)
	public BigDecimal getDistanceFromHoa() {
		return this.distanceFromHoa;
	}

	public void setDistanceFromHoa(BigDecimal distanceFromHoa) {
		this.distanceFromHoa = distanceFromHoa;
	}

	@Column(name = "lifestyle_link", length = 300)
	public String getLifestyleLink() {
		return this.lifestyleLink;
	}

	public void setLifestyleLink(String lifestyleLink) {
		this.lifestyleLink = lifestyleLink;
	}

	@Column(name = "recommende", length = 1000)
	public String getRecommende() {
		return this.recommende;
	}

	public void setRecommende(String recommende) {
		this.recommende = recommende;
	}

	@Column(name = "address", length = 1000)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "contract_no", length = 200)
	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VCommunityWhatNearByDetailId))
			return false;
		VCommunityWhatNearByDetailId castOther = (VCommunityWhatNearByDetailId) other;

		return (this.getCommunityLifestyleId() == castOther
				.getCommunityLifestyleId())
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& ((this.getLifestyleFullName() == castOther
						.getLifestyleFullName()) || (this
						.getLifestyleFullName() != null
						&& castOther.getLifestyleFullName() != null && this
						.getLifestyleFullName().equals(
								castOther.getLifestyleFullName())))
				&& ((this.getDistanceFromHoa() == castOther
						.getDistanceFromHoa()) || (this.getDistanceFromHoa() != null
						&& castOther.getDistanceFromHoa() != null && this
						.getDistanceFromHoa().equals(
								castOther.getDistanceFromHoa())))
				&& ((this.getLifestyleLink() == castOther.getLifestyleLink()) || (this
						.getLifestyleLink() != null
						&& castOther.getLifestyleLink() != null && this
						.getLifestyleLink()
						.equals(castOther.getLifestyleLink())))
				&& ((this.getRecommende() == castOther.getRecommende()) || (this
						.getRecommende() != null
						&& castOther.getRecommende() != null && this
						.getRecommende().equals(castOther.getRecommende())))
				&& ((this.getAddress() == castOther.getAddress()) || (this
						.getAddress() != null && castOther.getAddress() != null && this
						.getAddress().equals(castOther.getAddress())))
				&& ((this.getContractNo() == castOther.getContractNo()) || (this
						.getContractNo() != null
						&& castOther.getContractNo() != null && this
						.getContractNo().equals(castOther.getContractNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCommunityLifestyleId();
		result = 37 * result + this.getCommunityId();
		result = 37
				* result
				+ (getLifestyleFullName() == null ? 0 : this
						.getLifestyleFullName().hashCode());
		result = 37
				* result
				+ (getDistanceFromHoa() == null ? 0 : this.getDistanceFromHoa()
						.hashCode());
		result = 37
				* result
				+ (getLifestyleLink() == null ? 0 : this.getLifestyleLink()
						.hashCode());
		result = 37
				* result
				+ (getRecommende() == null ? 0 : this.getRecommende()
						.hashCode());
		result = 37 * result
				+ (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37
				* result
				+ (getContractNo() == null ? 0 : this.getContractNo()
						.hashCode());
		return result;
	}

}