package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VCommunityMailId generated by hbm2java
 */
@Embeddable
public class VCommunityMailId implements java.io.Serializable {

	private int communityMailId;
	private int communityId;
	private int mailSeq;
	private Integer fromUserId;
	private String mailSubject;
	private String mailBody;
	private Date createDate;

	public VCommunityMailId() {
	}

	public VCommunityMailId(int communityMailId, int communityId, int mailSeq) {
		this.communityMailId = communityMailId;
		this.communityId = communityId;
		this.mailSeq = mailSeq;
	}

	public VCommunityMailId(int communityMailId, int communityId, int mailSeq,
			Integer fromUserId, String mailSubject, String mailBody,
			Date createDate) {
		this.communityMailId = communityMailId;
		this.communityId = communityId;
		this.mailSeq = mailSeq;
		this.fromUserId = fromUserId;
		this.mailSubject = mailSubject;
		this.mailBody = mailBody;
		this.createDate = createDate;
	}

	@Column(name = "community_mail_id", nullable = false)
	public int getCommunityMailId() {
		return this.communityMailId;
	}

	public void setCommunityMailId(int communityMailId) {
		this.communityMailId = communityMailId;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "mail_seq", nullable = false)
	public int getMailSeq() {
		return this.mailSeq;
	}

	public void setMailSeq(int mailSeq) {
		this.mailSeq = mailSeq;
	}

	@Column(name = "from_user_id")
	public Integer getFromUserId() {
		return this.fromUserId;
	}

	public void setFromUserId(Integer fromUserId) {
		this.fromUserId = fromUserId;
	}

	@Column(name = "mail_subject", length = 1000)
	public String getMailSubject() {
		return this.mailSubject;
	}

	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	@Column(name = "mail_body", length = 2000)
	public String getMailBody() {
		return this.mailBody;
	}

	public void setMailBody(String mailBody) {
		this.mailBody = mailBody;
	}

	@Column(name = "create_date", length = 10)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VCommunityMailId))
			return false;
		VCommunityMailId castOther = (VCommunityMailId) other;

		return (this.getCommunityMailId() == castOther.getCommunityMailId())
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& (this.getMailSeq() == castOther.getMailSeq())
				&& ((this.getFromUserId() == castOther.getFromUserId()) || (this
						.getFromUserId() != null
						&& castOther.getFromUserId() != null && this
						.getFromUserId().equals(castOther.getFromUserId())))
				&& ((this.getMailSubject() == castOther.getMailSubject()) || (this
						.getMailSubject() != null
						&& castOther.getMailSubject() != null && this
						.getMailSubject().equals(castOther.getMailSubject())))
				&& ((this.getMailBody() == castOther.getMailBody()) || (this
						.getMailBody() != null
						&& castOther.getMailBody() != null && this
						.getMailBody().equals(castOther.getMailBody())))
				&& ((this.getCreateDate() == castOther.getCreateDate()) || (this
						.getCreateDate() != null
						&& castOther.getCreateDate() != null && this
						.getCreateDate().equals(castOther.getCreateDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCommunityMailId();
		result = 37 * result + this.getCommunityId();
		result = 37 * result + this.getMailSeq();
		result = 37
				* result
				+ (getFromUserId() == null ? 0 : this.getFromUserId()
						.hashCode());
		result = 37
				* result
				+ (getMailSubject() == null ? 0 : this.getMailSubject()
						.hashCode());
		result = 37 * result
				+ (getMailBody() == null ? 0 : this.getMailBody().hashCode());
		result = 37
				* result
				+ (getCreateDate() == null ? 0 : this.getCreateDate()
						.hashCode());
		return result;
	}

}
