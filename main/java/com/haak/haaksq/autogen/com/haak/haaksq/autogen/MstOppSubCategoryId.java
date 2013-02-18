package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstOppSubCategoryId generated by hbm2java
 */
@Embeddable
public class MstOppSubCategoryId implements java.io.Serializable {

	private int oppSubCategoryId;
	private int oppCategoryId;
	private int languageId;

	public MstOppSubCategoryId() {
	}

	public MstOppSubCategoryId(int oppSubCategoryId, int oppCategoryId,
			int languageId) {
		this.oppSubCategoryId = oppSubCategoryId;
		this.oppCategoryId = oppCategoryId;
		this.languageId = languageId;
	}

	@Column(name = "opp_sub_category_id", nullable = false)
	public int getOppSubCategoryId() {
		return this.oppSubCategoryId;
	}

	public void setOppSubCategoryId(int oppSubCategoryId) {
		this.oppSubCategoryId = oppSubCategoryId;
	}

	@Column(name = "opp_category_id", nullable = false)
	public int getOppCategoryId() {
		return this.oppCategoryId;
	}

	public void setOppCategoryId(int oppCategoryId) {
		this.oppCategoryId = oppCategoryId;
	}

	@Column(name = "language_id", nullable = false)
	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MstOppSubCategoryId))
			return false;
		MstOppSubCategoryId castOther = (MstOppSubCategoryId) other;

		return (this.getOppSubCategoryId() == castOther.getOppSubCategoryId())
				&& (this.getOppCategoryId() == castOther.getOppCategoryId())
				&& (this.getLanguageId() == castOther.getLanguageId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getOppSubCategoryId();
		result = 37 * result + this.getOppCategoryId();
		result = 37 * result + this.getLanguageId();
		return result;
	}

}
