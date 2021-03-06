package com.haak.haaksq.form;

// Generated Oct 2, 2012 7:24:14 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * VResultSendSmsId generated by hbm2java
 */
public class VResultSendSms implements java.io.Serializable {

	private String smsMessage;
	private int smsToId;
	private String smsId;
	private int communityId;
	private int userId;
	private String mobileNo;
	private String smsStatus;
	private int smsCradit;
	private Date createDate;
	private int createBy;

	public VResultSendSms() {
	}

	public VResultSendSms(String smsMessage, int smsToId, String smsId,
			int communityId, int userId, String mobileNo, String smsStatus,
			int smsCradit, Date createDate, int createBy) {
		this.smsMessage = smsMessage;
		this.smsToId = smsToId;
		this.smsId = smsId;
		this.communityId = communityId;
		this.userId = userId;
		this.mobileNo = mobileNo;
		this.smsStatus = smsStatus;
		this.smsCradit = smsCradit;
		this.createDate = createDate;
		this.createBy = createBy;
	}

	public String getSmsMessage() {
		return this.smsMessage;
	}

	public void setSmsMessage(String smsMessage) {
		this.smsMessage = smsMessage;
	}

	public int getSmsToId() {
		return this.smsToId;
	}

	public void setSmsToId(int smsToId) {
		this.smsToId = smsToId;
	}

	public String getSmsId() {
		return this.smsId;
	}

	public void setSmsId(String smsId) {
		this.smsId = smsId;
	}

	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getSmsStatus() {
		return this.smsStatus;
	}

	public void setSmsStatus(String smsStatus) {
		this.smsStatus = smsStatus;
	}

	public int getSmsCradit() {
		return this.smsCradit;
	}

	public void setSmsCradit(int smsCradit) {
		this.smsCradit = smsCradit;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VResultSendSms))
			return false;
		VResultSendSms castOther = (VResultSendSms) other;

		return ((this.getSmsMessage() == castOther.getSmsMessage()) || (this
				.getSmsMessage() != null && castOther.getSmsMessage() != null && this
				.getSmsMessage().equals(castOther.getSmsMessage())))
				&& (this.getSmsToId() == castOther.getSmsToId())
				&& ((this.getSmsId() == castOther.getSmsId()) || (this
						.getSmsId() != null && castOther.getSmsId() != null && this
						.getSmsId().equals(castOther.getSmsId())))
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& (this.getUserId() == castOther.getUserId())
				&& ((this.getMobileNo() == castOther.getMobileNo()) || (this
						.getMobileNo() != null
						&& castOther.getMobileNo() != null && this
						.getMobileNo().equals(castOther.getMobileNo())))
				&& ((this.getSmsStatus() == castOther.getSmsStatus()) || (this
						.getSmsStatus() != null
						&& castOther.getSmsStatus() != null && this
						.getSmsStatus().equals(castOther.getSmsStatus())))
				&& (this.getSmsCradit() == castOther.getSmsCradit())
				&& ((this.getCreateDate() == castOther.getCreateDate()) || (this
						.getCreateDate() != null
						&& castOther.getCreateDate() != null && this
						.getCreateDate().equals(castOther.getCreateDate())))
				&& (this.getCreateBy() == castOther.getCreateBy());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSmsMessage() == null ? 0 : this.getSmsMessage()
						.hashCode());
		result = 37 * result + this.getSmsToId();
		result = 37 * result
				+ (getSmsId() == null ? 0 : this.getSmsId().hashCode());
		result = 37 * result + this.getCommunityId();
		result = 37 * result + this.getUserId();
		result = 37 * result
				+ (getMobileNo() == null ? 0 : this.getMobileNo().hashCode());
		result = 37 * result
				+ (getSmsStatus() == null ? 0 : this.getSmsStatus().hashCode());
		result = 37 * result + this.getSmsCradit();
		result = 37
				* result
				+ (getCreateDate() == null ? 0 : this.getCreateDate()
						.hashCode());
		result = 37 * result + this.getCreateBy();
		return result;
	}

}
