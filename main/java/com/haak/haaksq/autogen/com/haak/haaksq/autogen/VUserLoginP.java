package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VUserLoginP generated by hbm2java
 */
@Entity
@Table(name = "v_user_login_p", catalog = "haaksquare_db")
public class VUserLoginP implements java.io.Serializable {

	private VUserLoginPId id;

	public VUserLoginP() {
	}

	public VUserLoginP(VUserLoginPId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "pass", column = @Column(name = "pass", nullable = false, length = 10)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id", nullable = false)),
			@AttributeOverride(name = "firstName", column = @Column(name = "first_name", nullable = false, length = 200)),
			@AttributeOverride(name = "lastName", column = @Column(name = "last_name", length = 200)),
			@AttributeOverride(name = "nickName", column = @Column(name = "nick_name", length = 100)),
			@AttributeOverride(name = "email", column = @Column(name = "email", length = 100)),
			@AttributeOverride(name = "packageId", column = @Column(name = "package_id")),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false)),
			@AttributeOverride(name = "userName", column = @Column(name = "user_name", nullable = false, length = 20)),
			@AttributeOverride(name = "fileName", column = @Column(name = "file_name", nullable = false, length = 200)),
			@AttributeOverride(name = "pathName", column = @Column(name = "path_name", nullable = false, length = 200)),
			@AttributeOverride(name = "fileDetail", column = @Column(name = "file_detail", nullable = false, length = 2000)),
			@AttributeOverride(name = "attachUrl", column = @Column(name = "attach_url", nullable = false, length = 200)),
			@AttributeOverride(name = "addressId", column = @Column(name = "address_id", nullable = false)),
			@AttributeOverride(name = "fgOpen", column = @Column(name = "fg_open", length = 1)) })
	public VUserLoginPId getId() {
		return this.id;
	}

	public void setId(VUserLoginPId id) {
		this.id = id;
	}

}