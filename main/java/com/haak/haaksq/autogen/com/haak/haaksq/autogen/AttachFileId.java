package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AttachFileId generated by hbm2java
 */
@Embeddable
public class AttachFileId implements java.io.Serializable {

	private int attachId;
	private int communityId;
	private int linkId;
	private int attachSeq;

	public AttachFileId() {
	}

	public AttachFileId(int attachId, int communityId, int linkId, int attachSeq) {
		this.attachId = attachId;
		this.communityId = communityId;
		this.linkId = linkId;
		this.attachSeq = attachSeq;
	}

	@Column(name = "attach_id", nullable = false)
	public int getAttachId() {
		return this.attachId;
	}

	public void setAttachId(int attachId) {
		this.attachId = attachId;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "link_id", nullable = false)
	public int getLinkId() {
		return this.linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
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
		if (!(other instanceof AttachFileId))
			return false;
		AttachFileId castOther = (AttachFileId) other;

		return (this.getAttachId() == castOther.getAttachId())
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& (this.getLinkId() == castOther.getLinkId())
				&& (this.getAttachSeq() == castOther.getAttachSeq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAttachId();
		result = 37 * result + this.getCommunityId();
		result = 37 * result + this.getLinkId();
		result = 37 * result + this.getAttachSeq();
		return result;
	}

}
