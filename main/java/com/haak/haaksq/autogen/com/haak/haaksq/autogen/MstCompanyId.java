package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstCompanyId generated by hbm2java
 */
@Embeddable
public class MstCompanyId implements java.io.Serializable {

	private int companyId;
	private int languageId;
	private int communityId;

	public MstCompanyId() {
	}

	public MstCompanyId(int companyId, int languageId, int communityId) {
		this.companyId = companyId;
		this.languageId = languageId;
		this.communityId = communityId;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Column(name = "language_id", nullable = false)
	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MstCompanyId))
			return false;
		MstCompanyId castOther = (MstCompanyId) other;

		return (this.getCompanyId() == castOther.getCompanyId())
				&& (this.getLanguageId() == castOther.getLanguageId())
				&& (this.getCommunityId() == castOther.getCommunityId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCompanyId();
		result = 37 * result + this.getLanguageId();
		result = 37 * result + this.getCommunityId();
		return result;
	}

}
