package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CommunityDashBoard generated by hbm2java
 */
@Entity
@Table(name = "community_dash_board", catalog = "haaksquare_db")
public class CommunityDashBoard implements java.io.Serializable {

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

	public CommunityDashBoard() {
	}

	public CommunityDashBoard(int communityDashBoardId) {
		this.communityDashBoardId = communityDashBoardId;
	}

	public CommunityDashBoard(int communityDashBoardId,
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

	@Id
	@Column(name = "community_dash_board_id", unique = true, nullable = false)
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

}
