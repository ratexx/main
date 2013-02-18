package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VUserProfile generated by hbm2java
 */
@Entity
@Table(name = "v_user_profile", catalog = "haaksquare_db")
public class VUserProfile implements java.io.Serializable {

	private VUserProfileId id;

	public VUserProfile() {
	}

	public VUserProfile(VUserProfileId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "mobileNo", column = @Column(name = "mobile_no", length = 200)),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false)),
			@AttributeOverride(name = "pass", column = @Column(name = "pass", nullable = false, length = 10)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "userName", column = @Column(name = "user_name", nullable = false, length = 20)),
			@AttributeOverride(name = "firstName", column = @Column(name = "first_name", nullable = false, length = 200)),
			@AttributeOverride(name = "lastName", column = @Column(name = "last_name", length = 200)),
			@AttributeOverride(name = "nickName", column = @Column(name = "nick_name", length = 100)),
			@AttributeOverride(name = "email", column = @Column(name = "email", length = 100)),
			@AttributeOverride(name = "sports", column = @Column(name = "sports", length = 200)),
			@AttributeOverride(name = "hobbies", column = @Column(name = "hobbies", length = 200)),
			@AttributeOverride(name = "profession", column = @Column(name = "profession", length = 200)),
			@AttributeOverride(name = "addressId", column = @Column(name = "address_id", nullable = false)),
			@AttributeOverride(name = "createBy", column = @Column(name = "create_by")),
			@AttributeOverride(name = "createDate", column = @Column(name = "create_date", length = 170)),
			@AttributeOverride(name = "addressNo", column = @Column(name = "address_no", length = 1000)),
			@AttributeOverride(name = "noOfCars", column = @Column(name = "no_of_cars")),
			@AttributeOverride(name = "noOfDogs", column = @Column(name = "no_of_dogs")),
			@AttributeOverride(name = "noOfCats", column = @Column(name = "no_of_cats")),
			@AttributeOverride(name = "otherPets", column = @Column(name = "other_pets", length = 300)),
			@AttributeOverride(name = "soi", column = @Column(name = "soi", length = 200)),
			@AttributeOverride(name = "moo", column = @Column(name = "moo", length = 200)),
			@AttributeOverride(name = "road", column = @Column(name = "road", length = 200)),
			@AttributeOverride(name = "tumbolId", column = @Column(name = "tumbol_id", length = 10)),
			@AttributeOverride(name = "amphoeId", column = @Column(name = "amphoe_id", length = 10)),
			@AttributeOverride(name = "provinceId", column = @Column(name = "province_id", length = 10)),
			@AttributeOverride(name = "state", column = @Column(name = "state", length = 200)),
			@AttributeOverride(name = "zipcode", column = @Column(name = "zipcode", length = 10)),
			@AttributeOverride(name = "country", column = @Column(name = "country", length = 200)),
			@AttributeOverride(name = "tumbolName", column = @Column(name = "tumbol_name", length = 100)),
			@AttributeOverride(name = "amphoeName", column = @Column(name = "amphoe_name")),
			@AttributeOverride(name = "provinceName", column = @Column(name = "province_name")),
			@AttributeOverride(name = "modifyBy", column = @Column(name = "modify_by")),
			@AttributeOverride(name = "modifyDate", column = @Column(name = "modify_date", length = 170)),
			@AttributeOverride(name = "languageId", column = @Column(name = "language_id", nullable = false)),
			@AttributeOverride(name = "faxNo", column = @Column(name = "fax_no", length = 200)),
			@AttributeOverride(name = "telephoneNo", column = @Column(name = "telephone_no", length = 200)) })
	public VUserProfileId getId() {
		return this.id;
	}

	public void setId(VUserProfileId id) {
		this.id = id;
	}

}
