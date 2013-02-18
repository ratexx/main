package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CommunityAddress generated by hbm2java
 */
@Entity
@Table(name = "community_address", catalog = "haaksquare_db")
public class CommunityAddress implements java.io.Serializable {

	private int addressId;
	private String addressNo;
	private String soi;
	private String moo;
	private String road;
	private String tumbol;
	private String amphoe;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	private String telephone;
	private String fax;
	private String mobile;
	private Integer noOfCars;
	private Integer noOfDogs;
	private Integer noOfCats;
	private String otherPets;
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;

	public CommunityAddress() {
	}

	public CommunityAddress(int addressId) {
		this.addressId = addressId;
	}

	public CommunityAddress(int addressId, String addressNo, String soi,
			String moo, String road, String tumbol, String amphoe, String city,
			String state, String zipcode, String country, String telephone,
			String fax, String mobile, Integer noOfCars, Integer noOfDogs,
			Integer noOfCats, String otherPets, Integer modifyBy,
			Date modifyDate, Integer createBy, Date createDate) {
		this.addressId = addressId;
		this.addressNo = addressNo;
		this.soi = soi;
		this.moo = moo;
		this.road = road;
		this.tumbol = tumbol;
		this.amphoe = amphoe;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.telephone = telephone;
		this.fax = fax;
		this.mobile = mobile;
		this.noOfCars = noOfCars;
		this.noOfDogs = noOfDogs;
		this.noOfCats = noOfCats;
		this.otherPets = otherPets;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	@Id
	@Column(name = "address_id", unique = true, nullable = false)
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

	@Column(name = "road", length = 200)
	public String getRoad() {
		return this.road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	@Column(name = "tumbol", length = 200)
	public String getTumbol() {
		return this.tumbol;
	}

	public void setTumbol(String tumbol) {
		this.tumbol = tumbol;
	}

	@Column(name = "amphoe", length = 200)
	public String getAmphoe() {
		return this.amphoe;
	}

	public void setAmphoe(String amphoe) {
		this.amphoe = amphoe;
	}

	@Column(name = "city", length = 200)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
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

	@Column(name = "fax", length = 100)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "mobile", length = 100)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "no_of_cars")
	public Integer getNoOfCars() {
		return this.noOfCars;
	}

	public void setNoOfCars(Integer noOfCars) {
		this.noOfCars = noOfCars;
	}

	@Column(name = "no_of_dogs")
	public Integer getNoOfDogs() {
		return this.noOfDogs;
	}

	public void setNoOfDogs(Integer noOfDogs) {
		this.noOfDogs = noOfDogs;
	}

	@Column(name = "no_of_cats")
	public Integer getNoOfCats() {
		return this.noOfCats;
	}

	public void setNoOfCats(Integer noOfCats) {
		this.noOfCats = noOfCats;
	}

	@Column(name = "other_pets", length = 300)
	public String getOtherPets() {
		return this.otherPets;
	}

	public void setOtherPets(String otherPets) {
		this.otherPets = otherPets;
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
