package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VSearchUser generated by hbm2java
 */
@Entity
@Table(name = "v_search_user", catalog = "haaksquare_db")
public class VSearchUser implements java.io.Serializable {

	private VSearchUserId id;

	public VSearchUser() {
	}

	public VSearchUser(VSearchUserId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false)),
			@AttributeOverride(name = "keySearch", column = @Column(name = "key_search")) })
	public VSearchUserId getId() {
		return this.id;
	}

	public void setId(VSearchUserId id) {
		this.id = id;
	}

}
