package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VAdPublicId generated by hbm2java
 */
@Embeddable
public class VAdPublicId implements java.io.Serializable {

	private int adCommunityId;
	private int adId;
	private String adFilename;
	private String adPath;
	private String adUrl;
	private String fgPublic;
	private String adFileTypeName;

	public VAdPublicId() {
	}

	public VAdPublicId(int adCommunityId, int adId) {
		this.adCommunityId = adCommunityId;
		this.adId = adId;
	}

	public VAdPublicId(int adCommunityId, int adId, String adFilename,
			String adPath, String adUrl, String fgPublic, String adFileTypeName) {
		this.adCommunityId = adCommunityId;
		this.adId = adId;
		this.adFilename = adFilename;
		this.adPath = adPath;
		this.adUrl = adUrl;
		this.fgPublic = fgPublic;
		this.adFileTypeName = adFileTypeName;
	}

	@Column(name = "ad_community_id", nullable = false)
	public int getAdCommunityId() {
		return this.adCommunityId;
	}

	public void setAdCommunityId(int adCommunityId) {
		this.adCommunityId = adCommunityId;
	}

	@Column(name = "ad_id", nullable = false)
	public int getAdId() {
		return this.adId;
	}

	public void setAdId(int adId) {
		this.adId = adId;
	}

	@Column(name = "ad_filename", length = 500)
	public String getAdFilename() {
		return this.adFilename;
	}

	public void setAdFilename(String adFilename) {
		this.adFilename = adFilename;
	}

	@Column(name = "ad_path", length = 500)
	public String getAdPath() {
		return this.adPath;
	}

	public void setAdPath(String adPath) {
		this.adPath = adPath;
	}

	@Column(name = "ad_url", length = 1000)
	public String getAdUrl() {
		return this.adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}

	@Column(name = "fg_public", length = 1)
	public String getFgPublic() {
		return this.fgPublic;
	}

	public void setFgPublic(String fgPublic) {
		this.fgPublic = fgPublic;
	}

	@Column(name = "ad_file_type_name", length = 100)
	public String getAdFileTypeName() {
		return this.adFileTypeName;
	}

	public void setAdFileTypeName(String adFileTypeName) {
		this.adFileTypeName = adFileTypeName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VAdPublicId))
			return false;
		VAdPublicId castOther = (VAdPublicId) other;

		return (this.getAdCommunityId() == castOther.getAdCommunityId())
				&& (this.getAdId() == castOther.getAdId())
				&& ((this.getAdFilename() == castOther.getAdFilename()) || (this
						.getAdFilename() != null
						&& castOther.getAdFilename() != null && this
						.getAdFilename().equals(castOther.getAdFilename())))
				&& ((this.getAdPath() == castOther.getAdPath()) || (this
						.getAdPath() != null && castOther.getAdPath() != null && this
						.getAdPath().equals(castOther.getAdPath())))
				&& ((this.getAdUrl() == castOther.getAdUrl()) || (this
						.getAdUrl() != null && castOther.getAdUrl() != null && this
						.getAdUrl().equals(castOther.getAdUrl())))
				&& ((this.getFgPublic() == castOther.getFgPublic()) || (this
						.getFgPublic() != null
						&& castOther.getFgPublic() != null && this
						.getFgPublic().equals(castOther.getFgPublic())))
				&& ((this.getAdFileTypeName() == castOther.getAdFileTypeName()) || (this
						.getAdFileTypeName() != null
						&& castOther.getAdFileTypeName() != null && this
						.getAdFileTypeName().equals(
								castOther.getAdFileTypeName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAdCommunityId();
		result = 37 * result + this.getAdId();
		result = 37
				* result
				+ (getAdFilename() == null ? 0 : this.getAdFilename()
						.hashCode());
		result = 37 * result
				+ (getAdPath() == null ? 0 : this.getAdPath().hashCode());
		result = 37 * result
				+ (getAdUrl() == null ? 0 : this.getAdUrl().hashCode());
		result = 37 * result
				+ (getFgPublic() == null ? 0 : this.getFgPublic().hashCode());
		result = 37
				* result
				+ (getAdFileTypeName() == null ? 0 : this.getAdFileTypeName()
						.hashCode());
		return result;
	}

}