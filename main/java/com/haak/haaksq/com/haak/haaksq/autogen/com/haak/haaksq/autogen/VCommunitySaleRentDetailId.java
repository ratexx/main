package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VCommunitySaleRentDetailId generated by hbm2java
 */
@Embeddable
public class VCommunitySaleRentDetailId implements java.io.Serializable {

	private int communitySaleRentId;
	private int communityId;
	private String salesRentName;
	private String communityTypeName;
	private Long valueAmount;
	private BigDecimal landSpace;
	private BigDecimal liveSpace;
	private Integer bedRoom;
	private Integer bathRoom;
	private String salesRentDetail;
	private String exteriorOption;
	private String interiorOption;
	private String contract;
	private String fileName;
	private String pathName;
	private String attachUrl;
	private String salesRentUrl;

	public VCommunitySaleRentDetailId() {
	}

	public VCommunitySaleRentDetailId(int communitySaleRentId, int communityId,
			String fileName, String pathName, String attachUrl) {
		this.communitySaleRentId = communitySaleRentId;
		this.communityId = communityId;
		this.fileName = fileName;
		this.pathName = pathName;
		this.attachUrl = attachUrl;
	}

	public VCommunitySaleRentDetailId(int communitySaleRentId, int communityId,
			String salesRentName, String communityTypeName, Long valueAmount,
			BigDecimal landSpace, BigDecimal liveSpace, Integer bedRoom,
			Integer bathRoom, String salesRentDetail, String exteriorOption,
			String interiorOption, String contract, String fileName,
			String pathName, String attachUrl, String salesRentUrl) {
		this.communitySaleRentId = communitySaleRentId;
		this.communityId = communityId;
		this.salesRentName = salesRentName;
		this.communityTypeName = communityTypeName;
		this.valueAmount = valueAmount;
		this.landSpace = landSpace;
		this.liveSpace = liveSpace;
		this.bedRoom = bedRoom;
		this.bathRoom = bathRoom;
		this.salesRentDetail = salesRentDetail;
		this.exteriorOption = exteriorOption;
		this.interiorOption = interiorOption;
		this.contract = contract;
		this.fileName = fileName;
		this.pathName = pathName;
		this.attachUrl = attachUrl;
		this.salesRentUrl = salesRentUrl;
	}

	@Column(name = "community_sale_rent_id", nullable = false)
	public int getCommunitySaleRentId() {
		return this.communitySaleRentId;
	}

	public void setCommunitySaleRentId(int communitySaleRentId) {
		this.communitySaleRentId = communitySaleRentId;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "sales_rent_name", length = 100)
	public String getSalesRentName() {
		return this.salesRentName;
	}

	public void setSalesRentName(String salesRentName) {
		this.salesRentName = salesRentName;
	}

	@Column(name = "community_type_name")
	public String getCommunityTypeName() {
		return this.communityTypeName;
	}

	public void setCommunityTypeName(String communityTypeName) {
		this.communityTypeName = communityTypeName;
	}

	@Column(name = "value_amount", precision = 10, scale = 0)
	public Long getValueAmount() {
		return this.valueAmount;
	}

	public void setValueAmount(Long valueAmount) {
		this.valueAmount = valueAmount;
	}

	@Column(name = "land_space", precision = 10)
	public BigDecimal getLandSpace() {
		return this.landSpace;
	}

	public void setLandSpace(BigDecimal landSpace) {
		this.landSpace = landSpace;
	}

	@Column(name = "live_space", precision = 10)
	public BigDecimal getLiveSpace() {
		return this.liveSpace;
	}

	public void setLiveSpace(BigDecimal liveSpace) {
		this.liveSpace = liveSpace;
	}

	@Column(name = "bed_room")
	public Integer getBedRoom() {
		return this.bedRoom;
	}

	public void setBedRoom(Integer bedRoom) {
		this.bedRoom = bedRoom;
	}

	@Column(name = "bath_room")
	public Integer getBathRoom() {
		return this.bathRoom;
	}

	public void setBathRoom(Integer bathRoom) {
		this.bathRoom = bathRoom;
	}

	@Column(name = "sales_rent_detail", length = 1000)
	public String getSalesRentDetail() {
		return this.salesRentDetail;
	}

	public void setSalesRentDetail(String salesRentDetail) {
		this.salesRentDetail = salesRentDetail;
	}

	@Column(name = "exterior_option", length = 1000)
	public String getExteriorOption() {
		return this.exteriorOption;
	}

	public void setExteriorOption(String exteriorOption) {
		this.exteriorOption = exteriorOption;
	}

	@Column(name = "interior_option", length = 1000)
	public String getInteriorOption() {
		return this.interiorOption;
	}

	public void setInteriorOption(String interiorOption) {
		this.interiorOption = interiorOption;
	}

	@Column(name = "contract", length = 1000)
	public String getContract() {
		return this.contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
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

	@Column(name = "attach_url", nullable = false, length = 200)
	public String getAttachUrl() {
		return this.attachUrl;
	}

	public void setAttachUrl(String attachUrl) {
		this.attachUrl = attachUrl;
	}

	@Column(name = "sales_rent_url", length = 1000)
	public String getSalesRentUrl() {
		return this.salesRentUrl;
	}

	public void setSalesRentUrl(String salesRentUrl) {
		this.salesRentUrl = salesRentUrl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VCommunitySaleRentDetailId))
			return false;
		VCommunitySaleRentDetailId castOther = (VCommunitySaleRentDetailId) other;

		return (this.getCommunitySaleRentId() == castOther
				.getCommunitySaleRentId())
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& ((this.getSalesRentName() == castOther.getSalesRentName()) || (this
						.getSalesRentName() != null
						&& castOther.getSalesRentName() != null && this
						.getSalesRentName()
						.equals(castOther.getSalesRentName())))
				&& ((this.getCommunityTypeName() == castOther
						.getCommunityTypeName()) || (this
						.getCommunityTypeName() != null
						&& castOther.getCommunityTypeName() != null && this
						.getCommunityTypeName().equals(
								castOther.getCommunityTypeName())))
				&& ((this.getValueAmount() == castOther.getValueAmount()) || (this
						.getValueAmount() != null
						&& castOther.getValueAmount() != null && this
						.getValueAmount().equals(castOther.getValueAmount())))
				&& ((this.getLandSpace() == castOther.getLandSpace()) || (this
						.getLandSpace() != null
						&& castOther.getLandSpace() != null && this
						.getLandSpace().equals(castOther.getLandSpace())))
				&& ((this.getLiveSpace() == castOther.getLiveSpace()) || (this
						.getLiveSpace() != null
						&& castOther.getLiveSpace() != null && this
						.getLiveSpace().equals(castOther.getLiveSpace())))
				&& ((this.getBedRoom() == castOther.getBedRoom()) || (this
						.getBedRoom() != null && castOther.getBedRoom() != null && this
						.getBedRoom().equals(castOther.getBedRoom())))
				&& ((this.getBathRoom() == castOther.getBathRoom()) || (this
						.getBathRoom() != null
						&& castOther.getBathRoom() != null && this
						.getBathRoom().equals(castOther.getBathRoom())))
				&& ((this.getSalesRentDetail() == castOther
						.getSalesRentDetail()) || (this.getSalesRentDetail() != null
						&& castOther.getSalesRentDetail() != null && this
						.getSalesRentDetail().equals(
								castOther.getSalesRentDetail())))
				&& ((this.getExteriorOption() == castOther.getExteriorOption()) || (this
						.getExteriorOption() != null
						&& castOther.getExteriorOption() != null && this
						.getExteriorOption().equals(
								castOther.getExteriorOption())))
				&& ((this.getInteriorOption() == castOther.getInteriorOption()) || (this
						.getInteriorOption() != null
						&& castOther.getInteriorOption() != null && this
						.getInteriorOption().equals(
								castOther.getInteriorOption())))
				&& ((this.getContract() == castOther.getContract()) || (this
						.getContract() != null
						&& castOther.getContract() != null && this
						.getContract().equals(castOther.getContract())))
				&& ((this.getFileName() == castOther.getFileName()) || (this
						.getFileName() != null
						&& castOther.getFileName() != null && this
						.getFileName().equals(castOther.getFileName())))
				&& ((this.getPathName() == castOther.getPathName()) || (this
						.getPathName() != null
						&& castOther.getPathName() != null && this
						.getPathName().equals(castOther.getPathName())))
				&& ((this.getAttachUrl() == castOther.getAttachUrl()) || (this
						.getAttachUrl() != null
						&& castOther.getAttachUrl() != null && this
						.getAttachUrl().equals(castOther.getAttachUrl())))
				&& ((this.getSalesRentUrl() == castOther.getSalesRentUrl()) || (this
						.getSalesRentUrl() != null
						&& castOther.getSalesRentUrl() != null && this
						.getSalesRentUrl().equals(castOther.getSalesRentUrl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCommunitySaleRentId();
		result = 37 * result + this.getCommunityId();
		result = 37
				* result
				+ (getSalesRentName() == null ? 0 : this.getSalesRentName()
						.hashCode());
		result = 37
				* result
				+ (getCommunityTypeName() == null ? 0 : this
						.getCommunityTypeName().hashCode());
		result = 37
				* result
				+ (getValueAmount() == null ? 0 : this.getValueAmount()
						.hashCode());
		result = 37 * result
				+ (getLandSpace() == null ? 0 : this.getLandSpace().hashCode());
		result = 37 * result
				+ (getLiveSpace() == null ? 0 : this.getLiveSpace().hashCode());
		result = 37 * result
				+ (getBedRoom() == null ? 0 : this.getBedRoom().hashCode());
		result = 37 * result
				+ (getBathRoom() == null ? 0 : this.getBathRoom().hashCode());
		result = 37
				* result
				+ (getSalesRentDetail() == null ? 0 : this.getSalesRentDetail()
						.hashCode());
		result = 37
				* result
				+ (getExteriorOption() == null ? 0 : this.getExteriorOption()
						.hashCode());
		result = 37
				* result
				+ (getInteriorOption() == null ? 0 : this.getInteriorOption()
						.hashCode());
		result = 37 * result
				+ (getContract() == null ? 0 : this.getContract().hashCode());
		result = 37 * result
				+ (getFileName() == null ? 0 : this.getFileName().hashCode());
		result = 37 * result
				+ (getPathName() == null ? 0 : this.getPathName().hashCode());
		result = 37 * result
				+ (getAttachUrl() == null ? 0 : this.getAttachUrl().hashCode());
		result = 37
				* result
				+ (getSalesRentUrl() == null ? 0 : this.getSalesRentUrl()
						.hashCode());
		return result;
	}

}