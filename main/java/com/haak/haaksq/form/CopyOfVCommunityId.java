package com.haak.haaksq.form;

// Generated Jun 1, 2012 11:52:36 PM by Hibernate Tools 3.4.0.CR1

/**
 * VCommunityId generated by hbm2java
 */
public class CopyOfVCommunityId implements java.io.Serializable {

	private int communityId;
	private String communityName;
	private String communityTypeName;
	private String provinceName;
	private String amphoeName;
	private String tumbolName;
	private String googleMapLatitude;
	private String googleMapLongtitude;
	private String googleMapUrl;
	private String communityShotDetail;
	private Integer packageId;
	private String fileName;
	private String pathName;
	private int fileTypeId;

	public CopyOfVCommunityId() {
	}

	public CopyOfVCommunityId(int communityId, String fileName, String pathName,
			int fileTypeId) {
		this.communityId = communityId;
		this.fileName = fileName;
		this.pathName = pathName;
		this.fileTypeId = fileTypeId;
	}

	public CopyOfVCommunityId(int communityId, String communityName,
			String communityTypeName, String provinceName, String amphoeName,
			String tumbolName, String googleMapLatitude,
			String googleMapLongtitude, String googleMapUrl,
			String communityShotDetail, Integer packageId, String fileName,
			String pathName, int fileTypeId) {
		this.communityId = communityId;
		this.communityName = communityName;
		this.communityTypeName = communityTypeName;
		this.provinceName = provinceName;
		this.amphoeName = amphoeName;
		this.tumbolName = tumbolName;
		this.googleMapLatitude = googleMapLatitude;
		this.googleMapLongtitude = googleMapLongtitude;
		this.googleMapUrl = googleMapUrl;
		this.communityShotDetail = communityShotDetail;
		this.packageId = packageId;
		this.fileName = fileName;
		this.pathName = pathName;
		this.fileTypeId = fileTypeId;
	}

	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public String getCommunityName() {
		return this.communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getCommunityTypeName() {
		return this.communityTypeName;
	}

	public void setCommunityTypeName(String communityTypeName) {
		this.communityTypeName = communityTypeName;
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getAmphoeName() {
		return this.amphoeName;
	}

	public void setAmphoeName(String amphoeName) {
		this.amphoeName = amphoeName;
	}

	public String getTumbolName() {
		return this.tumbolName;
	}

	public void setTumbolName(String tumbolName) {
		this.tumbolName = tumbolName;
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

	public String getCommunityShotDetail() {
		return this.communityShotDetail;
	}

	public void setCommunityShotDetail(String communityShotDetail) {
		this.communityShotDetail = communityShotDetail;
	}

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
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

	public int getFileTypeId() {
		return this.fileTypeId;
	}

	public void setFileTypeId(int fileTypeId) {
		this.fileTypeId = fileTypeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CopyOfVCommunityId))
			return false;
		CopyOfVCommunityId castOther = (CopyOfVCommunityId) other;

		return (this.getCommunityId() == castOther.getCommunityId())
				&& ((this.getCommunityName() == castOther.getCommunityName()) || (this
						.getCommunityName() != null
						&& castOther.getCommunityName() != null && this
						.getCommunityName()
						.equals(castOther.getCommunityName())))
				&& ((this.getCommunityTypeName() == castOther
						.getCommunityTypeName()) || (this
						.getCommunityTypeName() != null
						&& castOther.getCommunityTypeName() != null && this
						.getCommunityTypeName().equals(
								castOther.getCommunityTypeName())))
				&& ((this.getProvinceName() == castOther.getProvinceName()) || (this
						.getProvinceName() != null
						&& castOther.getProvinceName() != null && this
						.getProvinceName().equals(castOther.getProvinceName())))
				&& ((this.getAmphoeName() == castOther.getAmphoeName()) || (this
						.getAmphoeName() != null
						&& castOther.getAmphoeName() != null && this
						.getAmphoeName().equals(castOther.getAmphoeName())))
				&& ((this.getTumbolName() == castOther.getTumbolName()) || (this
						.getTumbolName() != null
						&& castOther.getTumbolName() != null && this
						.getTumbolName().equals(castOther.getTumbolName())))
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
				&& ((this.getCommunityShotDetail() == castOther
						.getCommunityShotDetail()) || (this
						.getCommunityShotDetail() != null
						&& castOther.getCommunityShotDetail() != null && this
						.getCommunityShotDetail().equals(
								castOther.getCommunityShotDetail())))
				&& ((this.getPackageId() == castOther.getPackageId()) || (this
						.getPackageId() != null
						&& castOther.getPackageId() != null && this
						.getPackageId().equals(castOther.getPackageId())))
				&& ((this.getFileName() == castOther.getFileName()) || (this
						.getFileName() != null
						&& castOther.getFileName() != null && this
						.getFileName().equals(castOther.getFileName())))
				&& ((this.getPathName() == castOther.getPathName()) || (this
						.getPathName() != null
						&& castOther.getPathName() != null && this
						.getPathName().equals(castOther.getPathName())))
				&& (this.getFileTypeId() == castOther.getFileTypeId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCommunityId();
		result = 37
				* result
				+ (getCommunityName() == null ? 0 : this.getCommunityName()
						.hashCode());
		result = 37
				* result
				+ (getCommunityTypeName() == null ? 0 : this
						.getCommunityTypeName().hashCode());
		result = 37
				* result
				+ (getProvinceName() == null ? 0 : this.getProvinceName()
						.hashCode());
		result = 37
				* result
				+ (getAmphoeName() == null ? 0 : this.getAmphoeName()
						.hashCode());
		result = 37
				* result
				+ (getTumbolName() == null ? 0 : this.getTumbolName()
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
				+ (getCommunityShotDetail() == null ? 0 : this
						.getCommunityShotDetail().hashCode());
		result = 37 * result
				+ (getPackageId() == null ? 0 : this.getPackageId().hashCode());
		result = 37 * result
				+ (getFileName() == null ? 0 : this.getFileName().hashCode());
		result = 37 * result
				+ (getPathName() == null ? 0 : this.getPathName().hashCode());
		result = 37 * result + this.getFileTypeId();
		return result;
	}

}
