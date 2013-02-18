package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VUserLoginPId generated by hbm2java
 */
@Embeddable
public class VUserLoginPId implements java.io.Serializable {

	private String pass;
	private int communityId;
	private String firstName;
	private String lastName;
	private String nickName;
	private String email;
	private Integer packageId;
	private int userId;
	private String userName;
	private String fileName;
	private String pathName;
	private String fileDetail;
	private String attachUrl;
	private int addressId;
	private String fgOpen;

	public VUserLoginPId() {
	}

	public VUserLoginPId(String pass, int communityId, String firstName,
			int userId, String userName, String fileName, String pathName,
			String fileDetail, String attachUrl, int addressId) {
		this.pass = pass;
		this.communityId = communityId;
		this.firstName = firstName;
		this.userId = userId;
		this.userName = userName;
		this.fileName = fileName;
		this.pathName = pathName;
		this.fileDetail = fileDetail;
		this.attachUrl = attachUrl;
		this.addressId = addressId;
	}

	public VUserLoginPId(String pass, int communityId, String firstName,
			String lastName, String nickName, String email, Integer packageId,
			int userId, String userName, String fileName, String pathName,
			String fileDetail, String attachUrl, int addressId, String fgOpen) {
		this.pass = pass;
		this.communityId = communityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.email = email;
		this.packageId = packageId;
		this.userId = userId;
		this.userName = userName;
		this.fileName = fileName;
		this.pathName = pathName;
		this.fileDetail = fileDetail;
		this.attachUrl = attachUrl;
		this.addressId = addressId;
		this.fgOpen = fgOpen;
	}

	@Column(name = "pass", nullable = false, length = 10)
	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "first_name", nullable = false, length = 200)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 200)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "nick_name", length = 100)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "package_id")
	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "user_name", nullable = false, length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "file_name", nullable = false, length = 200)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "path_name", nullable = false, length = 200)
	public String getPathName() {
		return this.pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	@Column(name = "file_detail", nullable = false, length = 2000)
	public String getFileDetail() {
		return this.fileDetail;
	}

	public void setFileDetail(String fileDetail) {
		this.fileDetail = fileDetail;
	}

	@Column(name = "attach_url", nullable = false, length = 200)
	public String getAttachUrl() {
		return this.attachUrl;
	}

	public void setAttachUrl(String attachUrl) {
		this.attachUrl = attachUrl;
	}

	@Column(name = "address_id", nullable = false)
	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	@Column(name = "fg_open", length = 1)
	public String getFgOpen() {
		return this.fgOpen;
	}

	public void setFgOpen(String fgOpen) {
		this.fgOpen = fgOpen;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VUserLoginPId))
			return false;
		VUserLoginPId castOther = (VUserLoginPId) other;

		return ((this.getPass() == castOther.getPass()) || (this.getPass() != null
				&& castOther.getPass() != null && this.getPass().equals(
				castOther.getPass())))
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& ((this.getFirstName() == castOther.getFirstName()) || (this
						.getFirstName() != null
						&& castOther.getFirstName() != null && this
						.getFirstName().equals(castOther.getFirstName())))
				&& ((this.getLastName() == castOther.getLastName()) || (this
						.getLastName() != null
						&& castOther.getLastName() != null && this
						.getLastName().equals(castOther.getLastName())))
				&& ((this.getNickName() == castOther.getNickName()) || (this
						.getNickName() != null
						&& castOther.getNickName() != null && this
						.getNickName().equals(castOther.getNickName())))
				&& ((this.getEmail() == castOther.getEmail()) || (this
						.getEmail() != null && castOther.getEmail() != null && this
						.getEmail().equals(castOther.getEmail())))
				&& ((this.getPackageId() == castOther.getPackageId()) || (this
						.getPackageId() != null
						&& castOther.getPackageId() != null && this
						.getPackageId().equals(castOther.getPackageId())))
				&& (this.getUserId() == castOther.getUserId())
				&& ((this.getUserName() == castOther.getUserName()) || (this
						.getUserName() != null
						&& castOther.getUserName() != null && this
						.getUserName().equals(castOther.getUserName())))
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
				&& (this.getAddressId() == castOther.getAddressId())
				&& ((this.getFgOpen() == castOther.getFgOpen()) || (this
						.getFgOpen() != null && castOther.getFgOpen() != null && this
						.getFgOpen().equals(castOther.getFgOpen())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPass() == null ? 0 : this.getPass().hashCode());
		result = 37 * result + this.getCommunityId();
		result = 37 * result
				+ (getFirstName() == null ? 0 : this.getFirstName().hashCode());
		result = 37 * result
				+ (getLastName() == null ? 0 : this.getLastName().hashCode());
		result = 37 * result
				+ (getNickName() == null ? 0 : this.getNickName().hashCode());
		result = 37 * result
				+ (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result
				+ (getPackageId() == null ? 0 : this.getPackageId().hashCode());
		result = 37 * result + this.getUserId();
		result = 37 * result
				+ (getUserName() == null ? 0 : this.getUserName().hashCode());
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
		result = 37 * result + this.getAddressId();
		result = 37 * result
				+ (getFgOpen() == null ? 0 : this.getFgOpen().hashCode());
		return result;
	}

}
