package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserRoleId generated by hbm2java
 */
@Embeddable
public class UserRoleId implements java.io.Serializable {

	private int userRoleId;
	private int roleId;
	private int userId;

	public UserRoleId() {
	}

	public UserRoleId(int userRoleId, int roleId, int userId) {
		this.userRoleId = userRoleId;
		this.roleId = roleId;
		this.userId = userId;
	}

	@Column(name = "user_role_id", nullable = false)
	public int getUserRoleId() {
		return this.userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	@Column(name = "role_id", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserRoleId))
			return false;
		UserRoleId castOther = (UserRoleId) other;

		return (this.getUserRoleId() == castOther.getUserRoleId())
				&& (this.getRoleId() == castOther.getRoleId())
				&& (this.getUserId() == castOther.getUserId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserRoleId();
		result = 37 * result + this.getRoleId();
		result = 37 * result + this.getUserId();
		return result;
	}

}
