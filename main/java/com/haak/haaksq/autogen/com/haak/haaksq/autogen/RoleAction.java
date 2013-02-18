package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RoleAction generated by hbm2java
 */
@Entity
@Table(name = "role_action", catalog = "haaksquare_db")
public class RoleAction implements java.io.Serializable {

	private RoleActionId id;

	public RoleAction() {
	}

	public RoleAction(RoleActionId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "roleModuleId", column = @Column(name = "role_module_id", nullable = false)),
			@AttributeOverride(name = "actionId", column = @Column(name = "action_id", nullable = false)) })
	public RoleActionId getId() {
		return this.id;
	}

	public void setId(RoleActionId id) {
		this.id = id;
	}

}
