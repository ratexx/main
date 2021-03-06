package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstContractNumberCategoryId generated by hbm2java
 */
@Embeddable
public class MstContractNumberCategoryId implements java.io.Serializable {

	private int contractNumberCategoryId;
	private int languageId;

	public MstContractNumberCategoryId() {
	}

	public MstContractNumberCategoryId(int contractNumberCategoryId,
			int languageId) {
		this.contractNumberCategoryId = contractNumberCategoryId;
		this.languageId = languageId;
	}

	@Column(name = "contract_number_category_id", nullable = false)
	public int getContractNumberCategoryId() {
		return this.contractNumberCategoryId;
	}

	public void setContractNumberCategoryId(int contractNumberCategoryId) {
		this.contractNumberCategoryId = contractNumberCategoryId;
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
		if (!(other instanceof MstContractNumberCategoryId))
			return false;
		MstContractNumberCategoryId castOther = (MstContractNumberCategoryId) other;

		return (this.getContractNumberCategoryId() == castOther
				.getContractNumberCategoryId())
				&& (this.getLanguageId() == castOther.getLanguageId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getContractNumberCategoryId();
		result = 37 * result + this.getLanguageId();
		return result;
	}

}
