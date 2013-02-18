package com.haak.haaksq.form;

// Generated Feb 12, 2013 11:20:22 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VUserDetailImg generated by hbm2java
 */
@Entity
@Table(name = "v_user_detail_img", catalog = "haaksquare_db")
public class VUserDetailImg implements java.io.Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2500087015697185856L;
	
	private int communityId;
	private String userName;
	private String firstName;
	private String lastName;
	private String nickName;
	private String email;
	private String mobileNo;
	private String faxNo;
	private String telephoneNo;
	private String sports;
	private String hobbies;
	private String profession;
	private int addressId;
	private int attachId;
	private int linkId;
	private int attachSeq;
	private int fileTypeId;
	private String fileName;
	private String pathName;
	private String fileDetail;
	private String attachUrl;
	
	private Integer modifyBy;
	private Date modifyDate;
	private Integer createBy;
	private Date createDate;


	private VUserDetailImgId id;

	public VUserDetailImg() {
	}

	public VUserDetailImg(VUserDetailImgId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false))
	})
	public VUserDetailImgId getId() {
		return this.id;
	}

	public void setId(VUserDetailImgId id) {
		this.id = id;
	}
	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	@Column(name = "user_name", nullable = false, length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "first_name", nullable = false, length = 200)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 200)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "nick_name", length = 100)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "mobile_no", length = 200)
	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column(name = "fax_no", length = 200)
	public String getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	@Column(name = "telephone_no", length = 200)
	public String getTelephoneNo() {
		return this.telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	@Column(name = "sports", length = 200)
	public String getSports() {
		return this.sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	@Column(name = "hobbies", length = 200)
	public String getHobbies() {
		return this.hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Column(name = "profession", length = 200)
	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Column(name = "address_id", nullable = false)
	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	@Column(name = "attach_id", nullable = false)
	public int getAttachId() {
		return this.attachId;
	}

	public void setAttachId(int attachId) {
		this.attachId = attachId;
	}

	@Column(name = "link_id", nullable = false)
	public int getLinkId() {
		return this.linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	@Column(name = "attach_seq", nullable = false)
	public int getAttachSeq() {
		return this.attachSeq;
	}

	public void setAttachSeq(int attachSeq) {
		this.attachSeq = attachSeq;
	}

	@Column(name = "file_type_id", nullable = false)
	public int getFileTypeId() {
		return this.fileTypeId;
	}

	public void setFileTypeId(int fileTypeId) {
		this.fileTypeId = fileTypeId;
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

	@Column(name = "file_detail", nullable = false, length = 2000)
	public String getFileDetail() {
		return this.fileDetail;
	}

	public void setFileDetail(String fileDetail) {
		this.fileDetail = fileDetail;
	}

	@Column(name = "attach_url", nullable = false, length = 200)
	public String getAttachUrl() {
		return this.attachUrl;
	}

	public void setAttachUrl(String attachUrl) {
		this.attachUrl = attachUrl;
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
	
}