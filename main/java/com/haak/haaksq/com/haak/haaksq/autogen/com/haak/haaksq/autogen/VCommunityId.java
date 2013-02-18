package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VCommunityId generated by hbm2java
 */
@Embeddable
public class VCommunityId implements java.io.Serializable {

	private int communityId;
	private String communityName;
	private String communityTypeName;
	private String provinceName;
	private String amphoeName;
	private String tumbolName;
	private String googleMapLatitude;
	private String googleMapLongtitude;
	private String googleMapUrl;
	private String communityShotDetail;
	private Integer packageId;
	private String fileName;
	private String pathName;
	private int fileTypeId;
	private String communitySize;
	private String communityDetail;
	private String companyOwner;
	private Long startPrise;
	private Long endPrise;
	private Integer addressId;
	private String addressNo;
	private String soi;
	private String moo;
	private String road;
	private String state;
	private String zipcode;
	private String country;
	private String telephone;
	private String mobile;
	private Integer unitAll;
	private Integer unitLive;
	private Integer unitSales;
	private Integer unitResidence;
	private Integer cat;
	private Integer dog;
	private Integer contractorsNo;
	private Integer contractorsEmployeesNo;
	private String fgOpen;

	public VCommunityId() {
	}

	public VCommunityId(int communityId, String fileName, String pathName,
			int fileTypeId) {
		this.communityId = communityId;
		this.fileName = fileName;
		this.pathName = pathName;
		this.fileTypeId = fileTypeId;
	}

	public VCommunityId(int communityId, String communityName,
			String communityTypeName, String provinceName, String amphoeName,
			String tumbolName, String googleMapLatitude,
			String googleMapLongtitude, String googleMapUrl,
			String communityShotDetail, Integer packageId, String fileName,
			String pathName, int fileTypeId, String communitySize,
			String communityDetail, String companyOwner, Long startPrise,
			Long endPrise, Integer addressId, String addressNo, String soi,
			String moo, String road, String state, String zipcode,
			String country, String telephone, String mobile, Integer unitAll,
			Integer unitLive, Integer unitSales, Integer unitResidence,
			Integer cat, Integer dog, Integer contractorsNo,
			Integer contractorsEmployeesNo, String fgOpen) {
		this.communityId = communityId;
		this.communityName = communityName;
		this.communityTypeName = communityTypeName;
		this.provinceName = provinceName;
		this.amphoeName = amphoeName;
		this.tumbolName = tumbolName;
		this.googleMapLatitude = googleMapLatitude;
		this.googleMapLongtitude = googleMapLongtitude;
		this.googleMapUrl = googleMapUrl;
		this.communityShotDetail = communityShotDetail;
		this.packageId = packageId;
		this.fileName = fileName;
		this.pathName = pathName;
		this.fileTypeId = fileTypeId;
		this.communitySize = communitySize;
		this.communityDetail = communityDetail;
		this.companyOwner = companyOwner;
		this.startPrise = startPrise;
		this.endPrise = endPrise;
		this.addressId = addressId;
		this.addressNo = addressNo;
		this.soi = soi;
		this.moo = moo;
		this.road = road;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.telephone = telephone;
		this.mobile = mobile;
		this.unitAll = unitAll;
		this.unitLive = unitLive;
		this.unitSales = unitSales;
		this.unitResidence = unitResidence;
		this.cat = cat;
		this.dog = dog;
		this.contractorsNo = contractorsNo;
		this.contractorsEmployeesNo = contractorsEmployeesNo;
		this.fgOpen = fgOpen;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "community_name", length = 200)
	public String getCommunityName() {
		return this.communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	@Column(name = "community_type_name")
	public String getCommunityTypeName() {
		return this.communityTypeName;
	}

	public void setCommunityTypeName(String communityTypeName) {
		this.communityTypeName = communityTypeName;
	}

	@Column(name = "province_name")
	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	@Column(name = "amphoe_name")
	public String getAmphoeName() {
		return this.amphoeName;
	}

	public void setAmphoeName(String amphoeName) {
		this.amphoeName = amphoeName;
	}

	@Column(name = "tumbol_name", length = 100)
	public String getTumbolName() {
		return this.tumbolName;
	}

	public void setTumbolName(String tumbolName) {
		this.tumbolName = tumbolName;
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

	@Column(name = "community_shot_detail", length = 1000)
	public String getCommunityShotDetail() {
		return this.communityShotDetail;
	}

	public void setCommunityShotDetail(String communityShotDetail) {
		this.communityShotDetail = communityShotDetail;
	}

	@Column(name = "package_id")
	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	@Column(name = "file_name", nullable = false, length = 200)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "path_name", nullable = false, length = 200)
	public String getPathName() {
		return this.pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	@Column(name = "file_type_id", nullable = false)
	public int getFileTypeId() {
		return this.fileTypeId;
	}

	public void setFileTypeId(int fileTypeId) {
		this.fileTypeId = fileTypeId;
	}

	@Column(name = "community_size", length = 100)
	public String getCommunitySize() {
		return this.communitySize;
	}

	public void setCommunitySize(String communitySize) {
		this.communitySize = communitySize;
	}

	@Column(name = "community_detail", length = 2000)
	public String getCommunityDetail() {
		return this.communityDetail;
	}

	public void setCommunityDetail(String communityDetail) {
		this.communityDetail = communityDetail;
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

	@Column(name = "fg_open", length = 1)
	public String getFgOpen() {
		return this.fgOpen;
	}

	public void setFgOpen(String fgOpen) {
		this.fgOpen = fgOpen;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VCommunityId))
			return false;
		VCommunityId castOther = (VCommunityId) other;

		return (this.getCommunityId() == castOther.getCommunityId())
				&& ((this.getCommunityName() == castOther.getCommunityName()) || (this
						.getCommunityName() != null
						&& castOther.getCommunityName() != null && this
						.getCommunityName()
						.equals(castOther.getCommunityName())))
				&& ((this.getCommunityTypeName() == castOther
						.getCommunityTypeName()) || (this
						.getCommunityTypeName() != null
						&& castOther.getCommunityTypeName() != null && this
						.getCommunityTypeName().equals(
								castOther.getCommunityTypeName())))
				&& ((this.getProvinceName() == castOther.getProvinceName()) || (this
						.getProvinceName() != null
						&& castOther.getProvinceName() != null && this
						.getProvinceName().equals(castOther.getProvinceName())))
				&& ((this.getAmphoeName() == castOther.getAmphoeName()) || (this
						.getAmphoeName() != null
						&& castOther.getAmphoeName() != null && this
						.getAmphoeName().equals(castOther.getAmphoeName())))
				&& ((this.getTumbolName() == castOther.getTumbolName()) || (this
						.getTumbolName() != null
						&& castOther.getTumbolName() != null && this
						.getTumbolName().equals(castOther.getTumbolName())))
				&& ((this.getGoogleMapLatitude() == castOther
						.getGoogleMapLatitude()) || (this
						.getGoogleMapLatitude() != null
						&& castOther.getGoogleMapLatitude() != null && this
						.getGoogleMapLatitude().equals(
								castOther.getGoogleMapLatitude())))
				&& ((this.getGoogleMapLongtitude() == castOther
						.getGoogleMapLongtitude()) || (this
						.getGoogleMapLongtitude() != null
						&& castOther.getGoogleMapLongtitude() != null && this
						.getGoogleMapLongtitude().equals(
								castOther.getGoogleMapLongtitude())))
				&& ((this.getGoogleMapUrl() == castOther.getGoogleMapUrl()) || (this
						.getGoogleMapUrl() != null
						&& castOther.getGoogleMapUrl() != null && this
						.getGoogleMapUrl().equals(castOther.getGoogleMapUrl())))
				&& ((this.getCommunityShotDetail() == castOther
						.getCommunityShotDetail()) || (this
						.getCommunityShotDetail() != null
						&& castOther.getCommunityShotDetail() != null && this
						.getCommunityShotDetail().equals(
								castOther.getCommunityShotDetail())))
				&& ((this.getPackageId() == castOther.getPackageId()) || (this
						.getPackageId() != null
						&& castOther.getPackageId() != null && this
						.getPackageId().equals(castOther.getPackageId())))
				&& ((this.getFileName() == castOther.getFileName()) || (this
						.getFileName() != null
						&& castOther.getFileName() != null && this
						.getFileName().equals(castOther.getFileName())))
				&& ((this.getPathName() == castOther.getPathName()) || (this
						.getPathName() != null
						&& castOther.getPathName() != null && this
						.getPathName().equals(castOther.getPathName())))
				&& (this.getFileTypeId() == castOther.getFileTypeId())
				&& ((this.getCommunitySize() == castOther.getCommunitySize()) || (this
						.getCommunitySize() != null
						&& castOther.getCommunitySize() != null && this
						.getCommunitySize()
						.equals(castOther.getCommunitySize())))
				&& ((this.getCommunityDetail() == castOther
						.getCommunityDetail()) || (this.getCommunityDetail() != null
						&& castOther.getCommunityDetail() != null && this
						.getCommunityDetail().equals(
								castOther.getCommunityDetail())))
				&& ((this.getCompanyOwner() == castOther.getCompanyOwner()) || (this
						.getCompanyOwner() != null
						&& castOther.getCompanyOwner() != null && this
						.getCompanyOwner().equals(castOther.getCompanyOwner())))
				&& ((this.getStartPrise() == castOther.getStartPrise()) || (this
						.getStartPrise() != null
						&& castOther.getStartPrise() != null && this
						.getStartPrise().equals(castOther.getStartPrise())))
				&& ((this.getEndPrise() == castOther.getEndPrise()) || (this
						.getEndPrise() != null
						&& castOther.getEndPrise() != null && this
						.getEndPrise().equals(castOther.getEndPrise())))
				&& ((this.getAddressId() == castOther.getAddressId()) || (this
						.getAddressId() != null
						&& castOther.getAddressId() != null && this
						.getAddressId().equals(castOther.getAddressId())))
				&& ((this.getAddressNo() == castOther.getAddressNo()) || (this
						.getAddressNo() != null
						&& castOther.getAddressNo() != null && this
						.getAddressNo().equals(castOther.getAddressNo())))
				&& ((this.getSoi() == castOther.getSoi()) || (this.getSoi() != null
						&& castOther.getSoi() != null && this.getSoi().equals(
						castOther.getSoi())))
				&& ((this.getMoo() == castOther.getMoo()) || (this.getMoo() != null
						&& castOther.getMoo() != null && this.getMoo().equals(
						castOther.getMoo())))
				&& ((this.getRoad() == castOther.getRoad()) || (this.getRoad() != null
						&& castOther.getRoad() != null && this.getRoad()
						.equals(castOther.getRoad())))
				&& ((this.getState() == castOther.getState()) || (this
						.getState() != null && castOther.getState() != null && this
						.getState().equals(castOther.getState())))
				&& ((this.getZipcode() == castOther.getZipcode()) || (this
						.getZipcode() != null && castOther.getZipcode() != null && this
						.getZipcode().equals(castOther.getZipcode())))
				&& ((this.getCountry() == castOther.getCountry()) || (this
						.getCountry() != null && castOther.getCountry() != null && this
						.getCountry().equals(castOther.getCountry())))
				&& ((this.getTelephone() == castOther.getTelephone()) || (this
						.getTelephone() != null
						&& castOther.getTelephone() != null && this
						.getTelephone().equals(castOther.getTelephone())))
				&& ((this.getMobile() == castOther.getMobile()) || (this
						.getMobile() != null && castOther.getMobile() != null && this
						.getMobile().equals(castOther.getMobile())))
				&& ((this.getUnitAll() == castOther.getUnitAll()) || (this
						.getUnitAll() != null && castOther.getUnitAll() != null && this
						.getUnitAll().equals(castOther.getUnitAll())))
				&& ((this.getUnitLive() == castOther.getUnitLive()) || (this
						.getUnitLive() != null
						&& castOther.getUnitLive() != null && this
						.getUnitLive().equals(castOther.getUnitLive())))
				&& ((this.getUnitSales() == castOther.getUnitSales()) || (this
						.getUnitSales() != null
						&& castOther.getUnitSales() != null && this
						.getUnitSales().equals(castOther.getUnitSales())))
				&& ((this.getUnitResidence() == castOther.getUnitResidence()) || (this
						.getUnitResidence() != null
						&& castOther.getUnitResidence() != null && this
						.getUnitResidence()
						.equals(castOther.getUnitResidence())))
				&& ((this.getCat() == castOther.getCat()) || (this.getCat() != null
						&& castOther.getCat() != null && this.getCat().equals(
						castOther.getCat())))
				&& ((this.getDog() == castOther.getDog()) || (this.getDog() != null
						&& castOther.getDog() != null && this.getDog().equals(
						castOther.getDog())))
				&& ((this.getContractorsNo() == castOther.getContractorsNo()) || (this
						.getContractorsNo() != null
						&& castOther.getContractorsNo() != null && this
						.getContractorsNo()
						.equals(castOther.getContractorsNo())))
				&& ((this.getContractorsEmployeesNo() == castOther
						.getContractorsEmployeesNo()) || (this
						.getContractorsEmployeesNo() != null
						&& castOther.getContractorsEmployeesNo() != null && this
						.getContractorsEmployeesNo().equals(
								castOther.getContractorsEmployeesNo())))
				&& ((this.getFgOpen() == castOther.getFgOpen()) || (this
						.getFgOpen() != null && castOther.getFgOpen() != null && this
						.getFgOpen().equals(castOther.getFgOpen())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCommunityId();
		result = 37
				* result
				+ (getCommunityName() == null ? 0 : this.getCommunityName()
						.hashCode());
		result = 37
				* result
				+ (getCommunityTypeName() == null ? 0 : this
						.getCommunityTypeName().hashCode());
		result = 37
				* result
				+ (getProvinceName() == null ? 0 : this.getProvinceName()
						.hashCode());
		result = 37
				* result
				+ (getAmphoeName() == null ? 0 : this.getAmphoeName()
						.hashCode());
		result = 37
				* result
				+ (getTumbolName() == null ? 0 : this.getTumbolName()
						.hashCode());
		result = 37
				* result
				+ (getGoogleMapLatitude() == null ? 0 : this
						.getGoogleMapLatitude().hashCode());
		result = 37
				* result
				+ (getGoogleMapLongtitude() == null ? 0 : this
						.getGoogleMapLongtitude().hashCode());
		result = 37
				* result
				+ (getGoogleMapUrl() == null ? 0 : this.getGoogleMapUrl()
						.hashCode());
		result = 37
				* result
				+ (getCommunityShotDetail() == null ? 0 : this
						.getCommunityShotDetail().hashCode());
		result = 37 * result
				+ (getPackageId() == null ? 0 : this.getPackageId().hashCode());
		result = 37 * result
				+ (getFileName() == null ? 0 : this.getFileName().hashCode());
		result = 37 * result
				+ (getPathName() == null ? 0 : this.getPathName().hashCode());
		result = 37 * result + this.getFileTypeId();
		result = 37
				* result
				+ (getCommunitySize() == null ? 0 : this.getCommunitySize()
						.hashCode());
		result = 37
				* result
				+ (getCommunityDetail() == null ? 0 : this.getCommunityDetail()
						.hashCode());
		result = 37
				* result
				+ (getCompanyOwner() == null ? 0 : this.getCompanyOwner()
						.hashCode());
		result = 37
				* result
				+ (getStartPrise() == null ? 0 : this.getStartPrise()
						.hashCode());
		result = 37 * result
				+ (getEndPrise() == null ? 0 : this.getEndPrise().hashCode());
		result = 37 * result
				+ (getAddressId() == null ? 0 : this.getAddressId().hashCode());
		result = 37 * result
				+ (getAddressNo() == null ? 0 : this.getAddressNo().hashCode());
		result = 37 * result
				+ (getSoi() == null ? 0 : this.getSoi().hashCode());
		result = 37 * result
				+ (getMoo() == null ? 0 : this.getMoo().hashCode());
		result = 37 * result
				+ (getRoad() == null ? 0 : this.getRoad().hashCode());
		result = 37 * result
				+ (getState() == null ? 0 : this.getState().hashCode());
		result = 37 * result
				+ (getZipcode() == null ? 0 : this.getZipcode().hashCode());
		result = 37 * result
				+ (getCountry() == null ? 0 : this.getCountry().hashCode());
		result = 37 * result
				+ (getTelephone() == null ? 0 : this.getTelephone().hashCode());
		result = 37 * result
				+ (getMobile() == null ? 0 : this.getMobile().hashCode());
		result = 37 * result
				+ (getUnitAll() == null ? 0 : this.getUnitAll().hashCode());
		result = 37 * result
				+ (getUnitLive() == null ? 0 : this.getUnitLive().hashCode());
		result = 37 * result
				+ (getUnitSales() == null ? 0 : this.getUnitSales().hashCode());
		result = 37
				* result
				+ (getUnitResidence() == null ? 0 : this.getUnitResidence()
						.hashCode());
		result = 37 * result
				+ (getCat() == null ? 0 : this.getCat().hashCode());
		result = 37 * result
				+ (getDog() == null ? 0 : this.getDog().hashCode());
		result = 37
				* result
				+ (getContractorsNo() == null ? 0 : this.getContractorsNo()
						.hashCode());
		result = 37
				* result
				+ (getContractorsEmployeesNo() == null ? 0 : this
						.getContractorsEmployeesNo().hashCode());
		result = 37 * result
				+ (getFgOpen() == null ? 0 : this.getFgOpen().hashCode());
		return result;
	}

}
