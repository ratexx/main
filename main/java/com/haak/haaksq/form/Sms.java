package com.haak.haaksq.form;

// Generated 23 �.�. 2555, 23:39:18 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sms generated by hbm2java
 */
@Entity
@Table(name = "sms", catalog = "haaksquare_db")
public class Sms implements java.io.Serializable {

	private Integer smsId;
	private String smsMessage;
	private Date createDate;
	private int createBy;

	public Sms() {
	}

	public Sms(String smsMessage, Date createDate, int createBy) {
		this.smsMessage = smsMessage;
		this.createDate = createDate;
		this.createBy = createBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "sms_id", unique = true, nullable = false)
	public Integer getSmsId() {
		return this.smsId;
	}

	public void setSmsId(Integer smsId) {
		this.smsId = smsId;
	}

	@Column(name = "sms_message", nullable = false, length = 2000)
	public String getSmsMessage() {
		return this.smsMessage;
	}

	public void setSmsMessage(String smsMessage) {
		this.smsMessage = smsMessage;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "create_date", nullable = false, length = 10)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "create_by", nullable = false)
	public int getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}

}
