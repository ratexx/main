package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VCommunityGallaryDetailId generated by hbm2java
 */
@Embeddable
public class VCommunityGallaryDetailId implements java.io.Serializable {

	private String fileName;
	private String fileTypeName;
	private String pathName;
	private int communityId;
	private int attachSeq;
	private String fileDetail;
	private String attachUrl;
	private Integer modifyBy;
	private int attachId;

	public VCommunityGallaryDetailId() {
	}

	public VCommunityGallaryDetailId(String fileName, String fileTypeName,
			String pathName, int communityId, int attachSeq, String fileDetail,
			String attachUrl, int attachId) {
		this.fileName = fileName;
		this.fileTypeName = fileTypeName;
		this.pathName = pathName;
		this.communityId = communityId;
		this.attachSeq = attachSeq;
		this.fileDetail = fileDetail;
		this.attachUrl = attachUrl;
		this.attachId = attachId;
	}

	public VCommunityGallaryDetailId(String fileName, String fileTypeName,
			String pathName, int communityId, int attachSeq, String fileDetail,
			String attachUrl, Integer modifyBy, int attachId) {
		this.fileName = fileName;
		this.fileTypeName = fileTypeName;
		this.pathName = pathName;
		this.communityId = communityId;
		this.attachSeq = attachSeq;
		this.fileDetail = fileDetail;
		this.attachUrl = attachUrl;
		this.modifyBy = modifyBy;
		this.attachId = attachId;
	}

	@Column(name = "file_name", nullable = false, length = 200)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "file_type_name", nullable = false, length = 100)
	public String getFileTypeName() {
		return this.fileTypeName;
	}

	public void setFileTypeName(String fileTypeName) {
		this.fileTypeName = fileTypeName;
	}

	@Column(name = "path_name", nullable = false, length = 200)
	public String getPathName() {
		return this.pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "attach_seq", nullable = false)
	public int getAttachSeq() {
		return this.attachSeq;
	}

	public void setAttachSeq(int attachSeq) {
		this.attachSeq = attachSeq;
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

	@Column(name = "modify_by")
	public Integer getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "attach_id", nullable = false)
	public int getAttachId() {
		return this.attachId;
	}

	public void setAttachId(int attachId) {
		this.attachId = attachId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VCommunityGallaryDetailId))
			return false;
		VCommunityGallaryDetailId castOther = (VCommunityGallaryDetailId) other;

		return ((this.getFileName() == castOther.getFileName()) || (this
				.getFileName() != null && castOther.getFileName() != null && this
				.getFileName().equals(castOther.getFileName())))
				&& ((this.getFileTypeName() == castOther.getFileTypeName()) || (this
						.getFileTypeName() != null
						&& castOther.getFileTypeName() != null && this
						.getFileTypeName().equals(castOther.getFileTypeName())))
				&& ((this.getPathName() == castOther.getPathName()) || (this
						.getPathName() != null
						&& castOther.getPathName() != null && this
						.getPathName().equals(castOther.getPathName())))
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& (this.getAttachSeq() == castOther.getAttachSeq())
				&& ((this.getFileDetail() == castOther.getFileDetail()) || (this
						.getFileDetail() != null
						&& castOther.getFileDetail() != null && this
						.getFileDetail().equals(castOther.getFileDetail())))
				&& ((this.getAttachUrl() == castOther.getAttachUrl()) || (this
						.getAttachUrl() != null
						&& castOther.getAttachUrl() != null && this
						.getAttachUrl().equals(castOther.getAttachUrl())))
				&& ((this.getModifyBy() == castOther.getModifyBy()) || (this
						.getModifyBy() != null
						&& castOther.getModifyBy() != null && this
						.getModifyBy().equals(castOther.getModifyBy())))
				&& (this.getAttachId() == castOther.getAttachId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFileName() == null ? 0 : this.getFileName().hashCode());
		result = 37
				* result
				+ (getFileTypeName() == null ? 0 : this.getFileTypeName()
						.hashCode());
		result = 37 * result
				+ (getPathName() == null ? 0 : this.getPathName().hashCode());
		result = 37 * result + this.getCommunityId();
		result = 37 * result + this.getAttachSeq();
		result = 37
				* result
				+ (getFileDetail() == null ? 0 : this.getFileDetail()
						.hashCode());
		result = 37 * result
				+ (getAttachUrl() == null ? 0 : this.getAttachUrl().hashCode());
		result = 37 * result
				+ (getModifyBy() == null ? 0 : this.getModifyBy().hashCode());
		result = 37 * result + this.getAttachId();
		return result;
	}

}
