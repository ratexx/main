package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VCommunitySaleRentPictureId generated by hbm2java
 */
@Embeddable
public class VCommunitySaleRentPictureId implements java.io.Serializable {

	private String fileName;
	private String pathName;
	private String fileDetail;
	private String attachUrl;
	private int communityId;
	private int attachId;
	private int attachSeq;

	public VCommunitySaleRentPictureId() {
	}

	public VCommunitySaleRentPictureId(String fileName, String pathName,
			String fileDetail, String attachUrl, int communityId, int attachId,
			int attachSeq) {
		this.fileName = fileName;
		this.pathName = pathName;
		this.fileDetail = fileDetail;
		this.attachUrl = attachUrl;
		this.communityId = communityId;
		this.attachId = attachId;
		this.attachSeq = attachSeq;
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

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "attach_id", nullable = false)
	public int getAttachId() {
		return this.attachId;
	}

	public void setAttachId(int attachId) {
		this.attachId = attachId;
	}

	@Column(name = "attach_seq", nullable = false)
	public int getAttachSeq() {
		return this.attachSeq;
	}

	public void setAttachSeq(int attachSeq) {
		this.attachSeq = attachSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VCommunitySaleRentPictureId))
			return false;
		VCommunitySaleRentPictureId castOther = (VCommunitySaleRentPictureId) other;

		return ((this.getFileName() == castOther.getFileName()) || (this
				.getFileName() != null && castOther.getFileName() != null && this
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
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& (this.getAttachId() == castOther.getAttachId())
				&& (this.getAttachSeq() == castOther.getAttachSeq());
	}

	public int hashCode() {
		int result = 17;

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
		result = 37 * result + this.getCommunityId();
		result = 37 * result + this.getAttachId();
		result = 37 * result + this.getAttachSeq();
		return result;
	}

}
