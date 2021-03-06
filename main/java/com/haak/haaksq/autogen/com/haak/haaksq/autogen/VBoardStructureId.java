package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VBoardStructureId generated by hbm2java
 */
@Embeddable
public class VBoardStructureId implements java.io.Serializable {

	private String positionName;
	private int positionLevel;
	private int communityId;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private int languageId;
	private String pathName;
	private String fileDetail;
	private String attachUrl;
	private String fileName;
	private String companyName;
	private String companyGroupName;

	public VBoardStructureId() {
	}

	public VBoardStructureId(String positionName, int positionLevel,
			int communityId, int languageId, String pathName,
			String fileDetail, String attachUrl, String fileName) {
		this.positionName = positionName;
		this.positionLevel = positionLevel;
		this.communityId = communityId;
		this.languageId = languageId;
		this.pathName = pathName;
		this.fileDetail = fileDetail;
		this.attachUrl = attachUrl;
		this.fileName = fileName;
	}

	public VBoardStructureId(String positionName, int positionLevel,
			int communityId, String firstName, String lastName,
			String userName, String email, int languageId, String pathName,
			String fileDetail, String attachUrl, String fileName,
			String companyName, String companyGroupName) {
		this.positionName = positionName;
		this.positionLevel = positionLevel;
		this.communityId = communityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.languageId = languageId;
		this.pathName = pathName;
		this.fileDetail = fileDetail;
		this.attachUrl = attachUrl;
		this.fileName = fileName;
		this.companyName = companyName;
		this.companyGroupName = companyGroupName;
	}

	@Column(name = "position_name", nullable = false, length = 200)
	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	@Column(name = "position_level", nullable = false)
	public int getPositionLevel() {
		return this.positionLevel;
	}

	public void setPositionLevel(int positionLevel) {
		this.positionLevel = positionLevel;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "first_name", length = 200)
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

	@Column(name = "user_name", length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "email", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "language_id", nullable = false)
	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
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

	@Column(name = "file_name", nullable = false, length = 200)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "company_name", length = 500)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "company_group_name", length = 500)
	public String getCompanyGroupName() {
		return this.companyGroupName;
	}

	public void setCompanyGroupName(String companyGroupName) {
		this.companyGroupName = companyGroupName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VBoardStructureId))
			return false;
		VBoardStructureId castOther = (VBoardStructureId) other;

		return ((this.getPositionName() == castOther.getPositionName()) || (this
				.getPositionName() != null
				&& castOther.getPositionName() != null && this
				.getPositionName().equals(castOther.getPositionName())))
				&& (this.getPositionLevel() == castOther.getPositionLevel())
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& ((this.getFirstName() == castOther.getFirstName()) || (this
						.getFirstName() != null
						&& castOther.getFirstName() != null && this
						.getFirstName().equals(castOther.getFirstName())))
				&& ((this.getLastName() == castOther.getLastName()) || (this
						.getLastName() != null
						&& castOther.getLastName() != null && this
						.getLastName().equals(castOther.getLastName())))
				&& ((this.getUserName() == castOther.getUserName()) || (this
						.getUserName() != null
						&& castOther.getUserName() != null && this
						.getUserName().equals(castOther.getUserName())))
				&& ((this.getEmail() == castOther.getEmail()) || (this
						.getEmail() != null && castOther.getEmail() != null && this
						.getEmail().equals(castOther.getEmail())))
				&& (this.getLanguageId() == castOther.getLanguageId())
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
				&& ((this.getFileName() == castOther.getFileName()) || (this
						.getFileName() != null
						&& castOther.getFileName() != null && this
						.getFileName().equals(castOther.getFileName())))
				&& ((this.getCompanyName() == castOther.getCompanyName()) || (this
						.getCompanyName() != null
						&& castOther.getCompanyName() != null && this
						.getCompanyName().equals(castOther.getCompanyName())))
				&& ((this.getCompanyGroupName() == castOther
						.getCompanyGroupName()) || (this.getCompanyGroupName() != null
						&& castOther.getCompanyGroupName() != null && this
						.getCompanyGroupName().equals(
								castOther.getCompanyGroupName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPositionName() == null ? 0 : this.getPositionName()
						.hashCode());
		result = 37 * result + this.getPositionLevel();
		result = 37 * result + this.getCommunityId();
		result = 37 * result
				+ (getFirstName() == null ? 0 : this.getFirstName().hashCode());
		result = 37 * result
				+ (getLastName() == null ? 0 : this.getLastName().hashCode());
		result = 37 * result
				+ (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37 * result
				+ (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + this.getLanguageId();
		result = 37 * result
				+ (getPathName() == null ? 0 : this.getPathName().hashCode());
		result = 37
				* result
				+ (getFileDetail() == null ? 0 : this.getFileDetail()
						.hashCode());
		result = 37 * result
				+ (getAttachUrl() == null ? 0 : this.getAttachUrl().hashCode());
		result = 37 * result
				+ (getFileName() == null ? 0 : this.getFileName().hashCode());
		result = 37
				* result
				+ (getCompanyName() == null ? 0 : this.getCompanyName()
						.hashCode());
		result = 37
				* result
				+ (getCompanyGroupName() == null ? 0 : this
						.getCompanyGroupName().hashCode());
		return result;
	}

}
