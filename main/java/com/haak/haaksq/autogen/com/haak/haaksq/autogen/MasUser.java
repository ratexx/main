package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MasUser generated by hbm2java
 */
@Entity
@Table(name = "mas_user", catalog = "haaksquare_db")
public class MasUser implements java.io.Serializable {

	private Long id;
	private String birthday;
	private String address;
	private String companyName;
	private String createBy;
	private String createDate;
	private String email;
	private String firstName;
	private String gender;
	private String lastName;
	private String mobile;
	private String point;
	private String postCode;
	private String provinceId;
	private String referfriend;
	private String registerDate;
	private String status;
	private String supplierFlag;
	private String tel;
	private String userName;
	private String userPassword;
	private String userRole;
	private Integer version;

	public MasUser() {
	}

	public MasUser(String birthday, String address, String companyName,
			String createBy, String createDate, String email, String firstName,
			String gender, String lastName, String mobile, String point,
			String postCode, String provinceId, String referfriend,
			String registerDate, String status, String supplierFlag,
			String tel, String userName, String userPassword, String userRole,
			Integer version) {
		this.birthday = birthday;
		this.address = address;
		this.companyName = companyName;
		this.createBy = createBy;
		this.createDate = createDate;
		this.email = email;
		this.firstName = firstName;
		this.gender = gender;
		this.lastName = lastName;
		this.mobile = mobile;
		this.point = point;
		this.postCode = postCode;
		this.provinceId = provinceId;
		this.referfriend = referfriend;
		this.registerDate = registerDate;
		this.status = status;
		this.supplierFlag = supplierFlag;
		this.tel = tel;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
		this.version = version;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "birthday", length = 30)
	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Column(name = "address", length = 2000)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "company_name", length = 30)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "create_by", length = 30)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "create_date", length = 30)
	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Column(name = "email", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "first_name", length = 30)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "gender", length = 1)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "last_name", length = 30)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "mobile", length = 30)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "point", length = 10)
	public String getPoint() {
		return this.point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	@Column(name = "post_code", length = 50)
	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Column(name = "province_id", length = 30)
	public String getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	@Column(name = "referfriend")
	public String getReferfriend() {
		return this.referfriend;
	}

	public void setReferfriend(String referfriend) {
		this.referfriend = referfriend;
	}

	@Column(name = "register_date", length = 30)
	public String getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	@Column(name = "status", length = 30)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "supplier_flag", length = 5)
	public String getSupplierFlag() {
		return this.supplierFlag;
	}

	public void setSupplierFlag(String supplierFlag) {
		this.supplierFlag = supplierFlag;
	}

	@Column(name = "tel", length = 30)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "user_name", length = 30)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "user_password", length = 30)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "user_role", length = 30)
	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
