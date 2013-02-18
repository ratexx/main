package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * CommunityLifestyle generated by hbm2java
 */
@Entity
@Table(name = "community_lifestyle", catalog = "haaksquare_db")
public class CommunityLifestyle implements java.io.Serializable {

	private Integer communityLifestyleId;
	private int communityId;
	private Integer lifestyleId;
	private Integer lifestyleTypeId;
	private String lifestyleDetail;
	private String lifestyleFullName;
	private BigDecimal distanceFromHoa;
	private String recommende;
	private String address;
	private String contractNo;
	private String lifestyleLink;
	private String lifestyleUrl;
	private String lifestyleGoogleMap;
	private String googleMapLatitude;
	private String googleMapLongtitude;
	private String googleMapUrl;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public CommunityLifestyle() {
	}

	public CommunityLifestyle(int communityId) {
		this.communityId = communityId;
	}

	public CommunityLifestyle(int communityId, Integer lifestyleId,
			Integer lifestyleTypeId, String lifestyleDetail,
			String lifestyleFullName, BigDecimal distanceFromHoa,
			String recommende, String address, String contractNo,
			String lifestyleLink, String lifestyleUrl,
			String lifestyleGoogleMap, String googleMapLatitude,
			String googleMapLongtitude, String googleMapUrl, Integer modifyBy,
			Date modifyDate, Integer createBy, Date createDate) {
		this.communityId = communityId;
		this.lifestyleId = lifestyleId;
		this.lifestyleTypeId = lifestyleTypeId;
		this.lifestyleDetail = lifestyleDetail;
		this.lifestyleFullName = lifestyleFullName;
		this.distanceFromHoa = distanceFromHoa;
		this.recommende = recommende;
		this.address = address;
		this.contractNo = contractNo;
		this.lifestyleLink = lifestyleLink;
		this.lifestyleUrl = lifestyleUrl;
		this.lifestyleGoogleMap = lifestyleGoogleMap;
		this.googleMapLatitude = googleMapLatitude;
		this.googleMapLongtitude = googleMapLongtitude;
		this.googleMapUrl = googleMapUrl;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "community_lifestyle_id", unique = true, nullable = false)
	public Integer getCommunityLifestyleId() {
		return this.communityLifestyleId;
	}

	public void setCommunityLifestyleId(Integer communityLifestyleId) {
		this.communityLifestyleId = communityLifestyleId;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "lifestyle_id")
	public Integer getLifestyleId() {
		return this.lifestyleId;
	}

	public void setLifestyleId(Integer lifestyleId) {
		this.lifestyleId = lifestyleId;
	}

	@Column(name = "lifestyle_type_id")
	public Integer getLifestyleTypeId() {
		return this.lifestyleTypeId;
	}

	public void setLifestyleTypeId(Integer lifestyleTypeId) {
		this.lifestyleTypeId = lifestyleTypeId;
	}

	@Column(name = "lifestyle_detail", length = 1000)
	public String getLifestyleDetail() {
		return this.lifestyleDetail;
	}

	public void setLifestyleDetail(String lifestyleDetail) {
		this.lifestyleDetail = lifestyleDetail;
	}

	@Column(name = "lifestyle_full_name", length = 500)
	public String getLifestyleFullName() {
		return this.lifestyleFullName;
	}

	public void setLifestyleFullName(String lifestyleFullName) {
		this.lifestyleFullName = lifestyleFullName;
	}

	@Column(name = "distance_from_HOA", precision = 10)
	public BigDecimal getDistanceFromHoa() {
		return this.distanceFromHoa;
	}

	public void setDistanceFromHoa(BigDecimal distanceFromHoa) {
		this.distanceFromHoa = distanceFromHoa;
	}

	@Column(name = "recommende", length = 1000)
	public String getRecommende() {
		return this.recommende;
	}

	public void setRecommende(String recommende) {
		this.recommende = recommende;
	}

	@Column(name = "address", length = 1000)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "contract_no", length = 200)
	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	@Column(name = "lifestyle_link", length = 300)
	public String getLifestyleLink() {
		return this.lifestyleLink;
	}

	public void setLifestyleLink(String lifestyleLink) {
		this.lifestyleLink = lifestyleLink;
	}

	@Column(name = "lifestyle_url", length = 1000)
	public String getLifestyleUrl() {
		return this.lifestyleUrl;
	}

	public void setLifestyleUrl(String lifestyleUrl) {
		this.lifestyleUrl = lifestyleUrl;
	}

	@Column(name = "lifestyle_google_map", length = 1000)
	public String getLifestyleGoogleMap() {
		return this.lifestyleGoogleMap;
	}

	public void setLifestyleGoogleMap(String lifestyleGoogleMap) {
		this.lifestyleGoogleMap = lifestyleGoogleMap;
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