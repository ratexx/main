package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AttachFile generated by hbm2java
 */
@Entity
@Table(name = "attach_file", catalog = "haaksquare_db")
public class AttachFile implements java.io.Serializable {

	private AttachFileId id;
	private int fileTypeId;
	private String fileName;
	private String pathName;
	private String fileDetail;
	private String attachUrl;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public AttachFile() {
	}

	public AttachFile(AttachFileId id, int fileTypeId, String fileName,
			String pathName, String fileDetail, String attachUrl) {
		this.id = id;
		this.fileTypeId = fileTypeId;
		this.fileName = fileName;
		this.pathName = pathName;
		this.fileDetail = fileDetail;
		this.attachUrl = attachUrl;
	}

	public AttachFile(AttachFileId id, int fileTypeId, String fileName,
			String pathName, String fileDetail, String attachUrl,
			Integer modifyBy, Date modifyDate, Integer createBy, Date createDate) {
		this.id = id;
		this.fileTypeId = fileTypeId;
		this.fileName = fileName;
		this.pathName = pathName;
		this.fileDetail = fileDetail;
		this.attachUrl = attachUrl;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "attachId", column = @Column(name = "attach_id", nullable = false)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "linkId", column = @Column(name = "link_id", nullable = false)),
			@AttributeOverride(name = "attachSeq", column = @Column(name = "attach_seq", nullable = false)) })
	public AttachFileId getId() {
		return this.id;
	}

	public void setId(AttachFileId id) {
		this.id = id;
	}

	@Column(name = "file_type_id", nullable = false)
	public int getFileTypeId() {
		return this.fileTypeId;
	}

	public void setFileTypeId(int fileTypeId) {
		this.fileTypeId = fileTypeId;
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

	@Column(name = "modify_by")
	public Integer getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_date", length = 19)
	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Column(name = "create_by")
	public Integer getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}