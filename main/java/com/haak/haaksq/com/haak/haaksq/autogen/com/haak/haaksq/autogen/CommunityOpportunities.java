package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CommunityOpportunities generated by hbm2java
 */
@Entity
@Table(name = "community_opportunities", catalog = "haaksquare_db")
public class CommunityOpportunities implements java.io.Serializable {

	private CommunityOpportunitiesId id;
	private String fgPublic;
	private Integer oppCategoryId;
	private Integer oppSubCategoryId;
	private String oppDetail;
	private String oppContact;
	private String oppLink;
	private String oppUrl;
	private String oppGoogleMap;
	private String googleMapLatitude;
	private String googleMapLongtitude;
	private String googleMapUrl;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;
	private Integer modifyBy;

	public CommunityOpportunities() {
	}

	public CommunityOpportunities(CommunityOpportunitiesId id) {
		this.id = id;
	}

	public CommunityOpportunities(CommunityOpportunitiesId id, String fgPublic,
			Integer oppCategoryId, Integer oppSubCategoryId, String oppDetail,
			String oppContact, String oppLink, String oppUrl,
			String oppGoogleMap, String googleMapLatitude,
			String googleMapLongtitude, String googleMapUrl, Date modifyDate,
			Integer createBy, Date createDate, Integer modifyBy) {
		this.id = id;
		this.fgPublic = fgPublic;
		this.oppCategoryId = oppCategoryId;
		this.oppSubCategoryId = oppSubCategoryId;
		this.oppDetail = oppDetail;
		this.oppContact = oppContact;
		this.oppLink = oppLink;
		this.oppUrl = oppUrl;
		this.oppGoogleMap = oppGoogleMap;
		this.googleMapLatitude = googleMapLatitude;
		this.googleMapLongtitude = googleMapLongtitude;
		this.googleMapUrl = googleMapUrl;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
		this.modifyBy = modifyBy;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "communityOppId", column = @Column(name = "community_opp_id", nullable = false)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "oppSeq", column = @Column(name = "opp_seq", nullable = false)) })
	public CommunityOpportunitiesId getId() {
		return this.id;
	}

	public void setId(CommunityOpportunitiesId id) {
		this.id = id;
	}

	@Column(name = "fg_public", length = 1)
	public String getFgPublic() {
		return this.fgPublic;
	}

	public void setFgPublic(String fgPublic) {
		this.fgPublic = fgPublic;
	}

	@Column(name = "opp_category_id")
	public Integer getOppCategoryId() {
		return this.oppCategoryId;
	}

	public void setOppCategoryId(Integer oppCategoryId) {
		this.oppCategoryId = oppCategoryId;
	}

	@Column(name = "opp_sub_category_id")
	public Integer getOppSubCategoryId() {
		return this.oppSubCategoryId;
	}

	public void setOppSubCategoryId(Integer oppSubCategoryId) {
		this.oppSubCategoryId = oppSubCategoryId;
	}

	@Column(name = "opp_detail", length = 2000)
	public String getOppDetail() {
		return this.oppDetail;
	}

	public void setOppDetail(String oppDetail) {
		this.oppDetail = oppDetail;
	}

	@Column(name = "opp_contact", length = 500)
	public String getOppContact() {
		return this.oppContact;
	}

	public void setOppContact(String oppContact) {
		this.oppContact = oppContact;
	}

	@Column(name = "opp_link", length = 300)
	public String getOppLink() {
		return this.oppLink;
	}

	public void setOppLink(String oppLink) {
		this.oppLink = oppLink;
	}

	@Column(name = "opp_url", length = 1000)
	public String getOppUrl() {
		return this.oppUrl;
	}

	public void setOppUrl(String oppUrl) {
		this.oppUrl = oppUrl;
	}

	@Column(name = "opp_google_map", length = 1000)
	public String getOppGoogleMap() {
		return this.oppGoogleMap;
	}

	public void setOppGoogleMap(String oppGoogleMap) {
		this.oppGoogleMap = oppGoogleMap;
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

	@Column(name = "modify_by")
	public Integer getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

}
