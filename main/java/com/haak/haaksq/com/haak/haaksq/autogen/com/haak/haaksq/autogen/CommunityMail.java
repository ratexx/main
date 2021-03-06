package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

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
 * CommunityMail generated by hbm2java
 */
@Entity
@Table(name = "community_mail", catalog = "haaksquare_db")
public class CommunityMail implements java.io.Serializable {

	private CommunityMailId id;
	private Integer fromUserId;
	private String mailSubject;
	private String mailBody;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;
	private Integer modifyBy;

	public CommunityMail() {
	}

	public CommunityMail(CommunityMailId id) {
		this.id = id;
	}

	public CommunityMail(CommunityMailId id, Integer fromUserId,
			String mailSubject, String mailBody, Date modifyDate,
			Integer createBy, Date createDate, Integer modifyBy) {
		this.id = id;
		this.fromUserId = fromUserId;
		this.mailSubject = mailSubject;
		this.mailBody = mailBody;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
		this.modifyBy = modifyBy;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "communityMailId", column = @Column(name = "community_mail_id", nullable = false)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "mailSeq", column = @Column(name = "mail_seq", nullable = false)) })
	public CommunityMailId getId() {
		return this.id;
	}

	public void setId(CommunityMailId id) {
		this.id = id;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "create_date", length = 10)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "modify_by")
	public Integer getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

}
