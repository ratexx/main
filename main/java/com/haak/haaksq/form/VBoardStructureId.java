package com.haak.haaksq.form;

// Generated Jul 23, 2012 11:44:02 PM by Hibernate Tools 3.4.0.CR1

/**
 * VBoardStructureId generated by hbm2java
 */
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
			String fileDetail, String attachUrl, String fileName) {
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
	}

	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public int getPositionLevel() {
		return this.positionLevel;
	}

	public void setPositionLevel(int positionLevel) {
		this.positionLevel = positionLevel;
	}

	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
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

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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
						.getFileName().equals(castOther.getFileName())));
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
		return result;
	}

}
