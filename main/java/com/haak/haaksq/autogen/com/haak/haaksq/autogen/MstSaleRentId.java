package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstSaleRentId generated by hbm2java
 */
@Embeddable
public class MstSaleRentId implements java.io.Serializable {

	private int saleRentTypeId;
	private int languageId;

	public MstSaleRentId() {
	}

	public MstSaleRentId(int saleRentTypeId, int languageId) {
		this.saleRentTypeId = saleRentTypeId;
		this.languageId = languageId;
	}

	@Column(name = "sale_rent_type_id", nullable = false)
	public int getSaleRentTypeId() {
		return this.saleRentTypeId;
	}

	public void setSaleRentTypeId(int saleRentTypeId) {
		this.saleRentTypeId = saleRentTypeId;
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
		if (!(other instanceof MstSaleRentId))
			return false;
		MstSaleRentId castOther = (MstSaleRentId) other;

		return (this.getSaleRentTypeId() == castOther.getSaleRentTypeId())
				&& (this.getLanguageId() == castOther.getLanguageId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSaleRentTypeId();
		result = 37 * result + this.getLanguageId();
		return result;
	}

}
