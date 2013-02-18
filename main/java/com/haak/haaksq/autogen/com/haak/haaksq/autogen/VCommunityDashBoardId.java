package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VCommunityDashBoardId generated by hbm2java
 */
@Embeddable
public class VCommunityDashBoardId implements java.io.Serializable {

	private int communityDashBoardId;
	private Long revenueAreasSquarePlan;
	private Long revenueAreasSquareActual;
	private Long revenueAreasAmountPlan;
	private Long revenueAreasAmountActual;
	private Long expensesAreasSquarePlan;
	private Long expensesAreasSquareActual;
	private Long expensesAreasAmountPlan;
	private Long expensesAreasAmountActual;
	private Long saveAmount;
	private Integer paid;
	private Integer notPaid;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public VCommunityDashBoardId() {
	}

	public VCommunityDashBoardId(int communityDashBoardId) {
		this.communityDashBoardId = communityDashBoardId;
	}

	public VCommunityDashBoardId(int communityDashBoardId,
			Long revenueAreasSquarePlan, Long revenueAreasSquareActual,
			Long revenueAreasAmountPlan, Long revenueAreasAmountActual,
			Long expensesAreasSquarePlan, Long expensesAreasSquareActual,
			Long expensesAreasAmountPlan, Long expensesAreasAmountActual,
			Long saveAmount, Integer paid, Integer notPaid, Integer modifyBy,
			Date modifyDate, Integer createBy, Date createDate) {
		this.communityDashBoardId = communityDashBoardId;
		this.revenueAreasSquarePlan = revenueAreasSquarePlan;
		this.revenueAreasSquareActual = revenueAreasSquareActual;
		this.revenueAreasAmountPlan = revenueAreasAmountPlan;
		this.revenueAreasAmountActual = revenueAreasAmountActual;
		this.expensesAreasSquarePlan = expensesAreasSquarePlan;
		this.expensesAreasSquareActual = expensesAreasSquareActual;
		this.expensesAreasAmountPlan = expensesAreasAmountPlan;
		this.expensesAreasAmountActual = expensesAreasAmountActual;
		this.saveAmount = saveAmount;
		this.paid = paid;
		this.notPaid = notPaid;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@Column(name = "community_dash_board_id", nullable = false)
	public int getCommunityDashBoardId() {
		return this.communityDashBoardId;
	}

	public void setCommunityDashBoardId(int communityDashBoardId) {
		this.communityDashBoardId = communityDashBoardId;
	}

	@Column(name = "revenue_areas_square_plan", precision = 10, scale = 0)
	public Long getRevenueAreasSquarePlan() {
		return this.revenueAreasSquarePlan;
	}

	public void setRevenueAreasSquarePlan(Long revenueAreasSquarePlan) {
		this.revenueAreasSquarePlan = revenueAreasSquarePlan;
	}

	@Column(name = "revenue_areas_square_actual", precision = 10, scale = 0)
	public Long getRevenueAreasSquareActual() {
		return this.revenueAreasSquareActual;
	}

	public void setRevenueAreasSquareActual(Long revenueAreasSquareActual) {
		this.revenueAreasSquareActual = revenueAreasSquareActual;
	}

	@Column(name = "revenue_areas_amount_plan", precision = 10, scale = 0)
	public Long getRevenueAreasAmountPlan() {
		return this.revenueAreasAmountPlan;
	}

	public void setRevenueAreasAmountPlan(Long revenueAreasAmountPlan) {
		this.revenueAreasAmountPlan = revenueAreasAmountPlan;
	}

	@Column(name = "revenue_areas_amount_actual", precision = 10, scale = 0)
	public Long getRevenueAreasAmountActual() {
		return this.revenueAreasAmountActual;
	}

	public void setRevenueAreasAmountActual(Long revenueAreasAmountActual) {
		this.revenueAreasAmountActual = revenueAreasAmountActual;
	}

	@Column(name = "expenses_areas_square_plan", precision = 10, scale = 0)
	public Long getExpensesAreasSquarePlan() {
		return this.expensesAreasSquarePlan;
	}

	public void setExpensesAreasSquarePlan(Long expensesAreasSquarePlan) {
		this.expensesAreasSquarePlan = expensesAreasSquarePlan;
	}

	@Column(name = "expenses_areas_square_actual", precision = 10, scale = 0)
	public Long getExpensesAreasSquareActual() {
		return this.expensesAreasSquareActual;
	}

	public void setExpensesAreasSquareActual(Long expensesAreasSquareActual) {
		this.expensesAreasSquareActual = expensesAreasSquareActual;
	}

	@Column(name = "expenses_areas_amount_plan", precision = 10, scale = 0)
	public Long getExpensesAreasAmountPlan() {
		return this.expensesAreasAmountPlan;
	}

	public void setExpensesAreasAmountPlan(Long expensesAreasAmountPlan) {
		this.expensesAreasAmountPlan = expensesAreasAmountPlan;
	}

	@Column(name = "expenses_areas_amount_actual", precision = 10, scale = 0)
	public Long getExpensesAreasAmountActual() {
		return this.expensesAreasAmountActual;
	}

	public void setExpensesAreasAmountActual(Long expensesAreasAmountActual) {
		this.expensesAreasAmountActual = expensesAreasAmountActual;
	}

	@Column(name = "save_amount", precision = 10, scale = 0)
	public Long getSaveAmount() {
		return this.saveAmount;
	}

	public void setSaveAmount(Long saveAmount) {
		this.saveAmount = saveAmount;
	}

	@Column(name = "paid")
	public Integer getPaid() {
		return this.paid;
	}

	public void setPaid(Integer paid) {
		this.paid = paid;
	}

	@Column(name = "not_paid")
	public Integer getNotPaid() {
		return this.notPaid;
	}

	public void setNotPaid(Integer notPaid) {
		this.notPaid = notPaid;
	}

	@Column(name = "modify_by")
	public Integer getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

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
		if (!(other instanceof VCommunityDashBoardId))
			return false;
		VCommunityDashBoardId castOther = (VCommunityDashBoardId) other;

		return (this.getCommunityDashBoardId() == castOther
				.getCommunityDashBoardId())
				&& ((this.getRevenueAreasSquarePlan() == castOther
						.getRevenueAreasSquarePlan()) || (this
						.getRevenueAreasSquarePlan() != null
						&& castOther.getRevenueAreasSquarePlan() != null && this
						.getRevenueAreasSquarePlan().equals(
								castOther.getRevenueAreasSquarePlan())))
				&& ((this.getRevenueAreasSquareActual() == castOther
						.getRevenueAreasSquareActual()) || (this
						.getRevenueAreasSquareActual() != null
						&& castOther.getRevenueAreasSquareActual() != null && this
						.getRevenueAreasSquareActual().equals(
								castOther.getRevenueAreasSquareActual())))
				&& ((this.getRevenueAreasAmountPlan() == castOther
						.getRevenueAreasAmountPlan()) || (this
						.getRevenueAreasAmountPlan() != null
						&& castOther.getRevenueAreasAmountPlan() != null && this
						.getRevenueAreasAmountPlan().equals(
								castOther.getRevenueAreasAmountPlan())))
				&& ((this.getRevenueAreasAmountActual() == castOther
						.getRevenueAreasAmountActual()) || (this
						.getRevenueAreasAmountActual() != null
						&& castOther.getRevenueAreasAmountActual() != null && this
						.getRevenueAreasAmountActual().equals(
								castOther.getRevenueAreasAmountActual())))
				&& ((this.getExpensesAreasSquarePlan() == castOther
						.getExpensesAreasSquarePlan()) || (this
						.getExpensesAreasSquarePlan() != null
						&& castOther.getExpensesAreasSquarePlan() != null && this
						.getExpensesAreasSquarePlan().equals(
								castOther.getExpensesAreasSquarePlan())))
				&& ((this.getExpensesAreasSquareActual() == castOther
						.getExpensesAreasSquareActual()) || (this
						.getExpensesAreasSquareActual() != null
						&& castOther.getExpensesAreasSquareActual() != null && this
						.getExpensesAreasSquareActual().equals(
								castOther.getExpensesAreasSquareActual())))
				&& ((this.getExpensesAreasAmountPlan() == castOther
						.getExpensesAreasAmountPlan()) || (this
						.getExpensesAreasAmountPlan() != null
						&& castOther.getExpensesAreasAmountPlan() != null && this
						.getExpensesAreasAmountPlan().equals(
								castOther.getExpensesAreasAmountPlan())))
				&& ((this.getExpensesAreasAmountActual() == castOther
						.getExpensesAreasAmountActual()) || (this
						.getExpensesAreasAmountActual() != null
						&& castOther.getExpensesAreasAmountActual() != null && this
						.getExpensesAreasAmountActual().equals(
								castOther.getExpensesAreasAmountActual())))
				&& ((this.getSaveAmount() == castOther.getSaveAmount()) || (this
						.getSaveAmount() != null
						&& castOther.getSaveAmount() != null && this
						.getSaveAmount().equals(castOther.getSaveAmount())))
				&& ((this.getPaid() == castOther.getPaid()) || (this.getPaid() != null
						&& castOther.getPaid() != null && this.getPaid()
						.equals(castOther.getPaid())))
				&& ((this.getNotPaid() == castOther.getNotPaid()) || (this
						.getNotPaid() != null && castOther.getNotPaid() != null && this
						.getNotPaid().equals(castOther.getNotPaid())))
				&& ((this.getModifyBy() == castOther.getModifyBy()) || (this
						.getModifyBy() != null
						&& castOther.getModifyBy() != null && this
						.getModifyBy().equals(castOther.getModifyBy())))
				&& ((this.getModifyDate() == castOther.getModifyDate()) || (this
						.getModifyDate() != null
						&& castOther.getModifyDate() != null && this
						.getModifyDate().equals(castOther.getModifyDate())))
				&& ((this.getCreateBy() == castOther.getCreateBy()) || (this
						.getCreateBy() != null
						&& castOther.getCreateBy() != null && this
						.getCreateBy().equals(castOther.getCreateBy())))
				&& ((this.getCreateDate() == castOther.getCreateDate()) || (this
						.getCreateDate() != null
						&& castOther.getCreateDate() != null && this
						.getCreateDate().equals(castOther.getCreateDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCommunityDashBoardId();
		result = 37
				* result
				+ (getRevenueAreasSquarePlan() == null ? 0 : this
						.getRevenueAreasSquarePlan().hashCode());
		result = 37
				* result
				+ (getRevenueAreasSquareActual() == null ? 0 : this
						.getRevenueAreasSquareActual().hashCode());
		result = 37
				* result
				+ (getRevenueAreasAmountPlan() == null ? 0 : this
						.getRevenueAreasAmountPlan().hashCode());
		result = 37
				* result
				+ (getRevenueAreasAmountActual() == null ? 0 : this
						.getRevenueAreasAmountActual().hashCode());
		result = 37
				* result
				+ (getExpensesAreasSquarePlan() == null ? 0 : this
						.getExpensesAreasSquarePlan().hashCode());
		result = 37
				* result
				+ (getExpensesAreasSquareActual() == null ? 0 : this
						.getExpensesAreasSquareActual().hashCode());
		result = 37
				* result
				+ (getExpensesAreasAmountPlan() == null ? 0 : this
						.getExpensesAreasAmountPlan().hashCode());
		result = 37
				* result
				+ (getExpensesAreasAmountActual() == null ? 0 : this
						.getExpensesAreasAmountActual().hashCode());
		result = 37
				* result
				+ (getSaveAmount() == null ? 0 : this.getSaveAmount()
						.hashCode());
		result = 37 * result
				+ (getPaid() == null ? 0 : this.getPaid().hashCode());
		result = 37 * result
				+ (getNotPaid() == null ? 0 : this.getNotPaid().hashCode());
		result = 37 * result
				+ (getModifyBy() == null ? 0 : this.getModifyBy().hashCode());
		result = 37
				* result
				+ (getModifyDate() == null ? 0 : this.getModifyDate()
						.hashCode());
		result = 37 * result
				+ (getCreateBy() == null ? 0 : this.getCreateBy().hashCode());
		result = 37
				* result
				+ (getCreateDate() == null ? 0 : this.getCreateDate()
						.hashCode());
		return result;
	}

}