package com.haak.haaksq.form;

// Generated 23 �.�. 2555, 10:57:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Community generated by hbm2java
 */
@Entity
@Table(name = "community", catalog = "haaksquare_db")
public class Community implements java.io.Serializable {

	private int communityId;
	private Integer communityGroupId;
	private Integer communityTypeId;
	private String fgOpen;
	private Integer packageId;
	private String communityName;
	private String communitySize;
	private String communityShotDetail;
	private String communityDetail;
	private String googleMapLatitude;
	private String googleMapLongtitude;
	private String googleMapUrl;
	private String companyOwner;
	private Long startPrise;
	private Long endPrise;
	private Integer addressId;
	private String addressNo;
	private String soi;
	private String moo;
	private String road;
	private String tumbolId;
	private String amphoeId;
	private String provinceId;
	private String state;
	private String zipcode;
	private String country;
	private String telephone;
	private String mobile;
	private Integer unitAll;
	private Date modifyDate;
	private Integer createBy;
	private Integer unitLive;
	private Integer unitSales;
	private Integer unitResidence;
	private Integer cat;
	private Integer dog;
	private Integer contractorsNo;
	private Integer contractorsEmployeesNo;
	private Integer modifyBy;
	private Date createDate;

	public Community() {
	}

	public Community(int communityId) {
		this.communityId = communityId;
	}

	public Community(int communityId, Integer communityGroupId,
			Integer communityTypeId, String fgOpen, Integer packageId,
			String communityName, String communitySize,
			String communityShotDetail, String communityDetail,
			String googleMapLatitude, String googleMapLongtitude,
			String googleMapUrl, String companyOwner, Long startPrise,
			Long endPrise, Integer addressId, String addressNo, String soi,
			String moo, String road, String tumbolId, String amphoeId,
			String provinceId, String state, String zipcode, String country,
			String telephone, String mobile, Integer unitAll, Date modifyDate,
			Integer createBy, Integer unitLive, Integer unitSales,
			Integer unitResidence, Integer cat, Integer dog,
			Integer contractorsNo, Integer contractorsEmployeesNo,
			Integer modifyBy, Date createDate) {
		this.communityId = communityId;
		this.communityGroupId = communityGroupId;
		this.communityTypeId = communityTypeId;
		this.fgOpen = fgOpen;
		this.packageId = packageId;
		this.communityName = communityName;
		this.communitySize = communitySize;
		this.communityShotDetail = communityShotDetail;
		this.communityDetail = communityDetail;
		this.googleMapLatitude = googleMapLatitude;
		this.googleMapLongtitude = googleMapLongtitude;
		this.googleMapUrl = googleMapUrl;
		this.companyOwner = companyOwner;
		this.startPrise = startPrise;
		this.endPrise = endPrise;
		this.addressId = addressId;
		this.addressNo = addressNo;
		this.soi = soi;
		this.moo = moo;
		this.road = road;
		this.tumbolId = tumbolId;
		this.amphoeId = amphoeId;
		this.provinceId = provinceId;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.telephone = telephone;
		this.mobile = mobile;
		this.unitAll = unitAll;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.unitLive = unitLive;
		this.unitSales = unitSales;
		this.unitResidence = unitResidence;
		this.cat = cat;
		this.dog = dog;
		this.contractorsNo = contractorsNo;
		this.contractorsEmployeesNo = contractorsEmployeesNo;
		this.modifyBy = modifyBy;
		this.createDate = createDate;
	}

	@Id
	@Column(name = "community_id", unique = true, nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "community_group_id")
	public Integer getCommunityGroupId() {
		return this.communityGroupId;
	}

	public void setCommunityGroupId(Integer communityGroupId) {
		this.communityGroupId = communityGroupId;
	}

	@Column(name = "community_type_id")
	public Integer getCommunityTypeId() {
		return this.communityTypeId;
	}

	public void setCommunityTypeId(Integer communityTypeId) {
		this.communityTypeId = communityTypeId;
	}

	@Column(name = "fg_open", length = 1)
	public String getFgOpen() {
		return this.fgOpen;
	}

	public void setFgOpen(String fgOpen) {
		this.fgOpen = fgOpen;
	}

	@Column(name = "package_id")
	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	@Column(name = "community_name", length = 200)
	public String getCommunityName() {
		return this.communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	@Column(name = "community_size", length = 100)
	public String getCommunitySize() {
		return this.communitySize;
	}

	public void setCommunitySize(String communitySize) {
		this.communitySize = communitySize;
	}

	@Column(name = "community_shot_detail", length = 1000)
	public String getCommunityShotDetail() {
		return this.communityShotDetail;
	}

	public void setCommunityShotDetail(String communityShotDetail) {
		this.communityShotDetail = communityShotDetail;
	}

	@Column(name = "community_detail", length = 2000)
	public String getCommunityDetail() {
		return this.communityDetail;
	}

	public void setCommunityDetail(String communityDetail) {
		this.communityDetail = communityDetail;
	}

	@Column(name = "google_map_latitude", length = 500)
	public String getGoogleMapLatitude() {
		return this.googleMapLatitude;
	}

	public void setGoogleMapLatitude(String googleMapLatitude) {
		this.googleMapLatitude = googleMapLatitude;
	}

	@Column(name = "google_map_longtitude", length = 500)
	public String getGoogleMapLongtitude() {
		return this.googleMapLongtitude;
	}

	public void setGoogleMapLongtitude(String googleMapLongtitude) {
		this.googleMapLongtitude = googleMapLongtitude;
	}

	@Column(name = "google_map_url", length = 500)
	public String getGoogleMapUrl() {
		return this.googleMapUrl;
	}

	public void setGoogleMapUrl(String googleMapUrl) {
		this.googleMapUrl = googleMapUrl;
	}

	@Column(name = "company_owner", length = 200)
	public String getCompanyOwner() {
		return this.companyOwner;
	}

	public void setCompanyOwner(String companyOwner) {
		this.companyOwner = companyOwner;
	}

	@Column(name = "start_prise", precision = 10, scale = 0)
	public Long getStartPrise() {
		return this.startPrise;
	}

	public void setStartPrise(Long startPrise) {
		this.startPrise = startPrise;
	}

	@Column(name = "end_prise", precision = 10, scale = 0)
	public Long getEndPrise() {
		return this.endPrise;
	}

	public void setEndPrise(Long endPrise) {
		this.endPrise = endPrise;
	}

	@Column(name = "address_id")
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "address_no", length = 1000)
	public String getAddressNo() {
		return this.addressNo;
	}

	public void setAddressNo(String addressNo) {
		this.addressNo = addressNo;
	}

	@Column(name = "soi", length = 200)
	public String getSoi() {
		return this.soi;
	}

	public void setSoi(String soi) {
		this.soi = soi;
	}

	@Column(name = "moo", length = 200)
	public String getMoo() {
		return this.moo;
	}

	public void setMoo(String moo) {
		this.moo = moo;
	}

	@Column(name = "road", length = 200)
	public String getRoad() {
		return this.road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	@Column(name = "tumbol_id", length = 10)
	public String getTumbolId() {
		return this.tumbolId;
	}

	public void setTumbolId(String tumbolId) {
		this.tumbolId = tumbolId;
	}

	@Column(name = "amphoe_id", length = 10)
	public String getAmphoeId() {
		return this.amphoeId;
	}

	public void setAmphoeId(String amphoeId) {
		this.amphoeId = amphoeId;
	}

	@Column(name = "province_id", length = 10)
	public String getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	@Column(name = "state", length = 200)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "zipcode", length = 10)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "country", length = 200)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "telephone", length = 100)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "mobile", length = 100)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "unit_all")
	public Integer getUnitAll() {
		return this.unitAll;
	}

	public void setUnitAll(Integer unitAll) {
		this.unitAll = unitAll;
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

	@Column(name = "unit_live")
	public Integer getUnitLive() {
		return this.unitLive;
	}

	public void setUnitLive(Integer unitLive) {
		this.unitLive = unitLive;
	}

	@Column(name = "unit_sales")
	public Integer getUnitSales() {
		return this.unitSales;
	}

	public void setUnitSales(Integer unitSales) {
		this.unitSales = unitSales;
	}

	@Column(name = "unit_residence")
	public Integer getUnitResidence() {
		return this.unitResidence;
	}

	public void setUnitResidence(Integer unitResidence) {
		this.unitResidence = unitResidence;
	}

	@Column(name = "cat")
	public Integer getCat() {
		return this.cat;
	}

	public void setCat(Integer cat) {
		this.cat = cat;
	}

	@Column(name = "dog")
	public Integer getDog() {
		return this.dog;
	}

	public void setDog(Integer dog) {
		this.dog = dog;
	}

	@Column(name = "contractors_no")
	public Integer getContractorsNo() {
		return this.contractorsNo;
	}

	public void setContractorsNo(Integer contractorsNo) {
		this.contractorsNo = contractorsNo;
	}

	@Column(name = "Contractors_employees_no")
	public Integer getContractorsEmployeesNo() {
		return this.contractorsEmployeesNo;
	}

	public void setContractorsEmployeesNo(Integer contractorsEmployeesNo) {
		this.contractorsEmployeesNo = contractorsEmployeesNo;
	}

	@Column(name = "modify_by")
	public Integer getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
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
