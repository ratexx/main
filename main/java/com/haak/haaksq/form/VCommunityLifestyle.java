package com.haak.haaksq.form;

// Generated Sep 26, 2012 11:53:40 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * VCommunityLifestyleId generated by hbm2java
 */
public class VCommunityLifestyle implements java.io.Serializable {

	private int communityLifestyleId;
	private int communityId;
	private String lifestyleName;
	private BigDecimal distanceFromHoa;
	private String lifestyleUrl;
	private String lifestyleGoogleMap;
	private String lifestyleDetail;
	private String lifestyleLink;
	private String googleMapLatitude;
	private String googleMapLongtitude;
	private String googleMapUrl;
	private Integer lifestyleId;
	private String fileName;
	private String pathName;
	private String fileDetail;
	private String attachUrl;
	private Integer languageId;
	private String lifestyleTypeName;
	private int linkId;
	private String recommende;
	private String address;
	private String contractNo;

	public VCommunityLifestyle() {
	}

	public VCommunityLifestyle(int communityLifestyleId, int communityId,
			String fileName, String pathName, String fileDetail,
			String attachUrl, int linkId) {
		this.communityLifestyleId = communityLifestyleId;
		this.communityId = communityId;
		this.fileName = fileName;
		this.pathName = pathName;
		this.fileDetail = fileDetail;
		this.attachUrl = attachUrl;
		this.linkId = linkId;
	}

	public VCommunityLifestyle(int communityLifestyleId, int communityId,
			String lifestyleName, BigDecimal distanceFromHoa,
			String lifestyleUrl, String lifestyleGoogleMap,
			String lifestyleDetail, String lifestyleLink,
			String googleMapLatitude, String googleMapLongtitude,
			String googleMapUrl, Integer lifestyleId, String fileName,
			String pathName, String fileDetail, String attachUrl,
			Integer languageId, String lifestyleTypeName, int linkId,
			String recommende, String address, String contractNo) {
		this.communityLifestyleId = communityLifestyleId;
		this.communityId = communityId;
		this.lifestyleName = lifestyleName;
		this.distanceFromHoa = distanceFromHoa;
		this.lifestyleUrl = lifestyleUrl;
		this.lifestyleGoogleMap = lifestyleGoogleMap;
		this.lifestyleDetail = lifestyleDetail;
		this.lifestyleLink = lifestyleLink;
		this.googleMapLatitude = googleMapLatitude;
		this.googleMapLongtitude = googleMapLongtitude;
		this.googleMapUrl = googleMapUrl;
		this.lifestyleId = lifestyleId;
		this.fileName = fileName;
		this.pathName = pathName;
		this.fileDetail = fileDetail;
		this.attachUrl = attachUrl;
		this.languageId = languageId;
		this.lifestyleTypeName = lifestyleTypeName;
		this.linkId = linkId;
		this.recommende = recommende;
		this.address = address;
		this.contractNo = contractNo;
	}

	public int getCommunityLifestyleId() {
		return this.communityLifestyleId;
	}

	public void setCommunityLifestyleId(int communityLifestyleId) {
		this.communityLifestyleId = communityLifestyleId;
	}

	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public String getLifestyleName() {
		return this.lifestyleName;
	}

	public void setLifestyleName(String lifestyleName) {
		this.lifestyleName = lifestyleName;
	}

	public BigDecimal getDistanceFromHoa() {
		return this.distanceFromHoa;
	}

	public void setDistanceFromHoa(BigDecimal distanceFromHoa) {
		this.distanceFromHoa = distanceFromHoa;
	}

	public String getLifestyleUrl() {
		return this.lifestyleUrl;
	}

	public void setLifestyleUrl(String lifestyleUrl) {
		this.lifestyleUrl = lifestyleUrl;
	}

	public String getLifestyleGoogleMap() {
		return this.lifestyleGoogleMap;
	}

	public void setLifestyleGoogleMap(String lifestyleGoogleMap) {
		this.lifestyleGoogleMap = lifestyleGoogleMap;
	}

	public String getLifestyleDetail() {
		return this.lifestyleDetail;
	}

	public void setLifestyleDetail(String lifestyleDetail) {
		this.lifestyleDetail = lifestyleDetail;
	}

	public String getLifestyleLink() {
		return this.lifestyleLink;
	}

	public void setLifestyleLink(String lifestyleLink) {
		this.lifestyleLink = lifestyleLink;
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

	public Integer getLifestyleId() {
		return this.lifestyleId;
	}

	public void setLifestyleId(Integer lifestyleId) {
		this.lifestyleId = lifestyleId;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getPathName() {
		return this.pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public String getFileDetail() {
		return this.fileDetail;
	}

	public void setFileDetail(String fileDetail) {
		this.fileDetail = fileDetail;
	}

	public String getAttachUrl() {
		return this.attachUrl;
	}

	public void setAttachUrl(String attachUrl) {
		this.attachUrl = attachUrl;
	}

	public Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getLifestyleTypeName() {
		return this.lifestyleTypeName;
	}

	public void setLifestyleTypeName(String lifestyleTypeName) {
		this.lifestyleTypeName = lifestyleTypeName;
	}

	public int getLinkId() {
		return this.linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	public String getRecommende() {
		return this.recommende;
	}

	public void setRecommende(String recommende) {
		this.recommende = recommende;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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
		if (!(other instanceof VCommunityLifestyle))
			return false;
		VCommunityLifestyle castOther = (VCommunityLifestyle) other;

		return (this.getCommunityLifestyleId() == castOther
				.getCommunityLifestyleId())
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& ((this.getLifestyleName() == castOther.getLifestyleName()) || (this
						.getLifestyleName() != null
						&& castOther.getLifestyleName() != null && this
						.getLifestyleName()
						.equals(castOther.getLifestyleName())))
				&& ((this.getDistanceFromHoa() == castOther
						.getDistanceFromHoa()) || (this.getDistanceFromHoa() != null
						&& castOther.getDistanceFromHoa() != null && this
						.getDistanceFromHoa().equals(
								castOther.getDistanceFromHoa())))
				&& ((this.getLifestyleUrl() == castOther.getLifestyleUrl()) || (this
						.getLifestyleUrl() != null
						&& castOther.getLifestyleUrl() != null && this
						.getLifestyleUrl().equals(castOther.getLifestyleUrl())))
				&& ((this.getLifestyleGoogleMap() == castOther
						.getLifestyleGoogleMap()) || (this
						.getLifestyleGoogleMap() != null
						&& castOther.getLifestyleGoogleMap() != null && this
						.getLifestyleGoogleMap().equals(
								castOther.getLifestyleGoogleMap())))
				&& ((this.getLifestyleDetail() == castOther
						.getLifestyleDetail()) || (this.getLifestyleDetail() != null
						&& castOther.getLifestyleDetail() != null && this
						.getLifestyleDetail().equals(
								castOther.getLifestyleDetail())))
				&& ((this.getLifestyleLink() == castOther.getLifestyleLink()) || (this
						.getLifestyleLink() != null
						&& castOther.getLifestyleLink() != null && this
						.getLifestyleLink()
						.equals(castOther.getLifestyleLink())))
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
				&& ((this.getLifestyleId() == castOther.getLifestyleId()) || (this
						.getLifestyleId() != null
						&& castOther.getLifestyleId() != null && this
						.getLifestyleId().equals(castOther.getLifestyleId())))
				&& ((this.getFileName() == castOther.getFileName()) || (this
						.getFileName() != null
						&& castOther.getFileName() != null && this
						.getFileName().equals(castOther.getFileName())))
				&& ((this.getPathName() == castOther.getPathName()) || (this
						.getPathName() != null
						&& castOther.getPathName() != null && this
						.getPathName().equals(castOther.getPathName())))
				&& ((this.getFileDetail() == castOther.getFileDetail()) || (this
						.getFileDetail() != null
						&& castOther.getFileDetail() != null && this
						.getFileDetail().equals(castOther.getFileDetail())))
				&& ((this.getAttachUrl() == castOther.getAttachUrl()) || (this
						.getAttachUrl() != null
						&& castOther.getAttachUrl() != null && this
						.getAttachUrl().equals(castOther.getAttachUrl())))
				&& ((this.getLanguageId() == castOther.getLanguageId()) || (this
						.getLanguageId() != null
						&& castOther.getLanguageId() != null && this
						.getLanguageId().equals(castOther.getLanguageId())))
				&& ((this.getLifestyleTypeName() == castOther
						.getLifestyleTypeName()) || (this
						.getLifestyleTypeName() != null
						&& castOther.getLifestyleTypeName() != null && this
						.getLifestyleTypeName().equals(
								castOther.getLifestyleTypeName())))
				&& (this.getLinkId() == castOther.getLinkId())
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
				+ (getLifestyleName() == null ? 0 : this.getLifestyleName()
						.hashCode());
		result = 37
				* result
				+ (getDistanceFromHoa() == null ? 0 : this.getDistanceFromHoa()
						.hashCode());
		result = 37
				* result
				+ (getLifestyleUrl() == null ? 0 : this.getLifestyleUrl()
						.hashCode());
		result = 37
				* result
				+ (getLifestyleGoogleMap() == null ? 0 : this
						.getLifestyleGoogleMap().hashCode());
		result = 37
				* result
				+ (getLifestyleDetail() == null ? 0 : this.getLifestyleDetail()
						.hashCode());
		result = 37
				* result
				+ (getLifestyleLink() == null ? 0 : this.getLifestyleLink()
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
				+ (getLifestyleId() == null ? 0 : this.getLifestyleId()
						.hashCode());
		result = 37 * result
				+ (getFileName() == null ? 0 : this.getFileName().hashCode());
		result = 37 * result
				+ (getPathName() == null ? 0 : this.getPathName().hashCode());
		result = 37
				* result
				+ (getFileDetail() == null ? 0 : this.getFileDetail()
						.hashCode());
		result = 37 * result
				+ (getAttachUrl() == null ? 0 : this.getAttachUrl().hashCode());
		result = 37
				* result
				+ (getLanguageId() == null ? 0 : this.getLanguageId()
						.hashCode());
		result = 37
				* result
				+ (getLifestyleTypeName() == null ? 0 : this
						.getLifestyleTypeName().hashCode());
		result = 37 * result + this.getLinkId();
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