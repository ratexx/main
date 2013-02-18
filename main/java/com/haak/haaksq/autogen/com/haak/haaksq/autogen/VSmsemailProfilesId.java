package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VSmsemailProfilesId generated by hbm2java
 */
@Embeddable
public class VSmsemailProfilesId implements java.io.Serializable {

	private int addressId;
	private String addressNo;
	private String soi;
	private String moo;
	private int communityId;
	private int roleId;
	private String userName;
	private String road;
	private String email;
	private String mobile;

	public VSmsemailProfilesId() {
	}

	public VSmsemailProfilesId(int addressId, int communityId, int roleId,
			String userName) {
		this.addressId = addressId;
		this.communityId = communityId;
		this.roleId = roleId;
		this.userName = userName;
	}

	public VSmsemailProfilesId(int addressId, String addressNo, String soi,
			String moo, int communityId, int roleId, String userName,
			String road, String email, String mobile) {
		this.addressId = addressId;
		this.addressNo = addressNo;
		this.soi = soi;
		this.moo = moo;
		this.communityId = communityId;
		this.roleId = roleId;
		this.userName = userName;
		this.road = road;
		this.email = email;
		this.mobile = mobile;
	}

	@Column(name = "address_id", nullable = false)
	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
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

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "role_id", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "user_name", nullable = false, length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "road", length = 200)
	public String getRoad() {
		return this.road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "mobile", length = 100)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VSmsemailProfilesId))
			return false;
		VSmsemailProfilesId castOther = (VSmsemailProfilesId) other;

		return (this.getAddressId() == castOther.getAddressId())
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
				&& (this.getCommunityId() == castOther.getCommunityId())
				&& (this.getRoleId() == castOther.getRoleId())
				&& ((this.getUserName() == castOther.getUserName()) || (this
						.getUserName() != null
						&& castOther.getUserName() != null && this
						.getUserName().equals(castOther.getUserName())))
				&& ((this.getRoad() == castOther.getRoad()) || (this.getRoad() != null
						&& castOther.getRoad() != null && this.getRoad()
						.equals(castOther.getRoad())))
				&& ((this.getEmail() == castOther.getEmail()) || (this
						.getEmail() != null && castOther.getEmail() != null && this
						.getEmail().equals(castOther.getEmail())))
				&& ((this.getMobile() == castOther.getMobile()) || (this
						.getMobile() != null && castOther.getMobile() != null && this
						.getMobile().equals(castOther.getMobile())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAddressId();
		result = 37 * result
				+ (getAddressNo() == null ? 0 : this.getAddressNo().hashCode());
		result = 37 * result
				+ (getSoi() == null ? 0 : this.getSoi().hashCode());
		result = 37 * result
				+ (getMoo() == null ? 0 : this.getMoo().hashCode());
		result = 37 * result + this.getCommunityId();
		result = 37 * result + this.getRoleId();
		result = 37 * result
				+ (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37 * result
				+ (getRoad() == null ? 0 : this.getRoad().hashCode());
		result = 37 * result
				+ (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result
				+ (getMobile() == null ? 0 : this.getMobile().hashCode());
		return result;
	}

}
