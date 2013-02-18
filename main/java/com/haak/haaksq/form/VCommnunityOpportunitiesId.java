package com.haak.haaksq.form;

// Generated Jun 19, 2012 11:53:06 PM by Hibernate Tools 3.4.0.CR1

/**
 * VCommnunityOpportunitiesId generated by hbm2java
 */
public class VCommnunityOpportunitiesId implements java.io.Serializable {

	private Integer oppCategoryId;
	private Integer oppSubCategoryId;
	private int communityOppId;
	private int communityId;
	private int oppSeq;
	private String fgPublic;
	private String oppDetail;
	private String oppContact;
	private String oppLink;
	private String oppUrl;
	private String oppGoogleMap;
	private String googleMapLatitude;
	private String googleMapLongtitude;
	private String googleMapUrl;
	private String oppCategoryName;
	private String oppSubCategoryName;
	private int languageId;

	public VCommnunityOpportunitiesId() {
	}

	public VCommnunityOpportunitiesId(int communityOppId, int communityId,
			int oppSeq, int languageId) {
		this.communityOppId = communityOppId;
		this.communityId = communityId;
		this.oppSeq = oppSeq;
		this.languageId = languageId;
	}

	public VCommnunityOpportunitiesId(Integer oppCategoryId,
			Integer oppSubCategoryId, int communityOppId, int communityId,
			int oppSeq, String fgPublic, String oppDetail, String oppContact,
			String oppLink, String oppUrl, String oppGoogleMap,
			String googleMapLatitude, String googleMapLongtitude,
			String googleMapUrl, String oppCategoryName,
			String oppSubCategoryName, int languageId) {
		this.oppCategoryId = oppCategoryId;
		this.oppSubCategoryId = oppSubCategoryId;
		this.communityOppId = communityOppId;
		this.communityId = communityId;
		this.oppSeq = oppSeq;
		this.fgPublic = fgPublic;
		this.oppDetail = oppDetail;
		this.oppContact = oppContact;
		this.oppLink = oppLink;
		this.oppUrl = oppUrl;
		this.oppGoogleMap = oppGoogleMap;
		this.googleMapLatitude = googleMapLatitude;
		this.googleMapLongtitude = googleMapLongtitude;
		this.googleMapUrl = googleMapUrl;
		this.oppCategoryName = oppCategoryName;
		this.oppSubCategoryName = oppSubCategoryName;
		this.languageId = languageId;
	}

	public Integer getOppCategoryId() {
		return this.oppCategoryId;
	}

	public void setOppCategoryId(Integer oppCategoryId) {
		this.oppCategoryId = oppCategoryId;
	}

	public Integer getOppSubCategoryId() {
		return this.oppSubCategoryId;
	}

	public void setOppSubCategoryId(Integer oppSubCategoryId) {
		this.oppSubCategoryId = oppSubCategoryId;
	}

	public int getCommunityOppId() {
		return this.communityOppId;
	}

	public void setCommunityOppId(int communityOppId) {
		this.communityOppId = communityOppId;
	}

	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public int getOppSeq() {
		return this.oppSeq;
	}

	public void setOppSeq(int oppSeq) {
		this.oppSeq = oppSeq;
	}

	public String getFgPublic() {
		return this.fgPublic;
	}

	public void setFgPublic(String fgPublic) {
		this.fgPublic = fgPublic;
	}

	public String getOppDetail() {
		return this.oppDetail;
	}

	public void setOppDetail(String oppDetail) {
		this.oppDetail = oppDetail;
	}

	public String getOppContact() {
		return this.oppContact;
	}

	public void setOppContact(String oppContact) {
		this.oppContact = oppContact;
	}

	public String getOppLink() {
		return this.oppLink;
	}

	public void setOppLink(String oppLink) {
		this.oppLink = oppLink;
	}

	public String getOppUrl() {
		return this.oppUrl;
	}

	public void setOppUrl(String oppUrl) {
		this.oppUrl = oppUrl;
	}

	public String getOppGoogleMap() {
		return this.oppGoogleMap;
	}

	public void setOppGoogleMap(String oppGoogleMap) {
		this.oppGoogleMap = oppGoogleMap;
	}

	public String getGoogleMapLatitude() {
		return this.googleMapLatitude;
	}

	public void setGoogleMapLatitude(String googleMapLatitude) {
		this.googleMapLatitude = googleMapLatitude;
	}

	public String getGoogleMapLongtitude() {
		return this.googleMapLongtitude;
	}

	public void setGoogleMapLongtitude(String googleMapLongtitude) {
		this.googleMapLongtitude = googleMapLongtitude;
	}

	public String getGoogleMapUrl() {
		return this.googleMapUrl;
	}

	public void setGoogleMapUrl(String googleMapUrl) {
		this.googleMapUrl = googleMapUrl;
	}

	public String getOppCategoryName() {
		return this.oppCategoryName;
	}

	public void setOppCategoryName(String oppCategoryName) {
		this.oppCategoryName = oppCategoryName;
	}

	public String getOppSubCategoryName() {
		return this.oppSubCategoryName;
	}

	public void setOppSubCategoryName(String oppSubCategoryName) {
		this.oppSubCategoryName = oppSubCategoryName;
	}

	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VCommnunityOpportunitiesId))
			return false;
		VCommnunityOpportunitiesId castOther = (VCommnunityOpportunitiesId) other;

		return ((this.getOppCategoryId() == castOther.getOppCategoryId()) || (this
				.getOppCategoryId() != null
				&& castOther.getOppCategoryId() != null && this
				.getOppCategoryId().equals(castOther.getOppCategoryId())))
				&& ((this.getOppSubCategoryId() == castOther
						.getOppSubCategoryId()) || (this.getOppSubCategoryId() != null
						&& castOther.getOppSubCategoryId() != null && this
						.getOppSubCategoryId().equals(
								castOther.getOppSubCategoryId())))
				&& (this.getCommunityOppId() == castOther.getCommunityOppId())
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& (this.getOppSeq() == castOther.getOppSeq())
				&& ((this.getFgPublic() == castOther.getFgPublic()) || (this
						.getFgPublic() != null
						&& castOther.getFgPublic() != null && this
						.getFgPublic().equals(castOther.getFgPublic())))
				&& ((this.getOppDetail() == castOther.getOppDetail()) || (this
						.getOppDetail() != null
						&& castOther.getOppDetail() != null && this
						.getOppDetail().equals(castOther.getOppDetail())))
				&& ((this.getOppContact() == castOther.getOppContact()) || (this
						.getOppContact() != null
						&& castOther.getOppContact() != null && this
						.getOppContact().equals(castOther.getOppContact())))
				&& ((this.getOppLink() == castOther.getOppLink()) || (this
						.getOppLink() != null && castOther.getOppLink() != null && this
						.getOppLink().equals(castOther.getOppLink())))
				&& ((this.getOppUrl() == castOther.getOppUrl()) || (this
						.getOppUrl() != null && castOther.getOppUrl() != null && this
						.getOppUrl().equals(castOther.getOppUrl())))
				&& ((this.getOppGoogleMap() == castOther.getOppGoogleMap()) || (this
						.getOppGoogleMap() != null
						&& castOther.getOppGoogleMap() != null && this
						.getOppGoogleMap().equals(castOther.getOppGoogleMap())))
				&& ((this.getGoogleMapLatitude() == castOther
						.getGoogleMapLatitude()) || (this
						.getGoogleMapLatitude() != null
						&& castOther.getGoogleMapLatitude() != null && this
						.getGoogleMapLatitude().equals(
								castOther.getGoogleMapLatitude())))
				&& ((this.getGoogleMapLongtitude() == castOther
						.getGoogleMapLongtitude()) || (this
						.getGoogleMapLongtitude() != null
						&& castOther.getGoogleMapLongtitude() != null && this
						.getGoogleMapLongtitude().equals(
								castOther.getGoogleMapLongtitude())))
				&& ((this.getGoogleMapUrl() == castOther.getGoogleMapUrl()) || (this
						.getGoogleMapUrl() != null
						&& castOther.getGoogleMapUrl() != null && this
						.getGoogleMapUrl().equals(castOther.getGoogleMapUrl())))
				&& ((this.getOppCategoryName() == castOther
						.getOppCategoryName()) || (this.getOppCategoryName() != null
						&& castOther.getOppCategoryName() != null && this
						.getOppCategoryName().equals(
								castOther.getOppCategoryName())))
				&& ((this.getOppSubCategoryName() == castOther
						.getOppSubCategoryName()) || (this
						.getOppSubCategoryName() != null
						&& castOther.getOppSubCategoryName() != null && this
						.getOppSubCategoryName().equals(
								castOther.getOppSubCategoryName())))
				&& (this.getLanguageId() == castOther.getLanguageId());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOppCategoryId() == null ? 0 : this.getOppCategoryId()
						.hashCode());
		result = 37
				* result
				+ (getOppSubCategoryId() == null ? 0 : this
						.getOppSubCategoryId().hashCode());
		result = 37 * result + this.getCommunityOppId();
		result = 37 * result + this.getCommunityId();
		result = 37 * result + this.getOppSeq();
		result = 37 * result
				+ (getFgPublic() == null ? 0 : this.getFgPublic().hashCode());
		result = 37 * result
				+ (getOppDetail() == null ? 0 : this.getOppDetail().hashCode());
		result = 37
				* result
				+ (getOppContact() == null ? 0 : this.getOppContact()
						.hashCode());
		result = 37 * result
				+ (getOppLink() == null ? 0 : this.getOppLink().hashCode());
		result = 37 * result
				+ (getOppUrl() == null ? 0 : this.getOppUrl().hashCode());
		result = 37
				* result
				+ (getOppGoogleMap() == null ? 0 : this.getOppGoogleMap()
						.hashCode());
		result = 37
				* result
				+ (getGoogleMapLatitude() == null ? 0 : this
						.getGoogleMapLatitude().hashCode());
		result = 37
				* result
				+ (getGoogleMapLongtitude() == null ? 0 : this
						.getGoogleMapLongtitude().hashCode());
		result = 37
				* result
				+ (getGoogleMapUrl() == null ? 0 : this.getGoogleMapUrl()
						.hashCode());
		result = 37
				* result
				+ (getOppCategoryName() == null ? 0 : this.getOppCategoryName()
						.hashCode());
		result = 37
				* result
				+ (getOppSubCategoryName() == null ? 0 : this
						.getOppSubCategoryName().hashCode());
		result = 37 * result + this.getLanguageId();
		return result;
	}

}