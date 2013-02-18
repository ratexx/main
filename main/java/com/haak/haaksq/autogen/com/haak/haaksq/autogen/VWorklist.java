package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VWorklist generated by hbm2java
 */
@Entity
@Table(name = "v_worklist", catalog = "haaksquare_db")
public class VWorklist implements java.io.Serializable {

	private VWorklistId id;

	public VWorklist() {
	}

	public VWorklist(VWorklistId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "worklistId", column = @Column(name = "worklist_id", nullable = false)),
			@AttributeOverride(name = "worklistSeq", column = @Column(name = "worklist_seq", nullable = false)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id")),
			@AttributeOverride(name = "worklistSubjectName", column = @Column(name = "worklist_subject_name", length = 200)),
			@AttributeOverride(name = "roleId", column = @Column(name = "role_id", nullable = false)),
			@AttributeOverride(name = "fgPublic", column = @Column(name = "fg_public", length = 1)),
			@AttributeOverride(name = "worklistTypeName", column = @Column(name = "worklist_type_name", length = 200)),
			@AttributeOverride(name = "worklistStatusName", column = @Column(name = "worklist_status_name", length = 100)),
			@AttributeOverride(name = "worklistName", column = @Column(name = "worklist_name", length = 200)),
			@AttributeOverride(name = "worklistDetail", column = @Column(name = "worklist_detail", length = 2000)),
			@AttributeOverride(name = "phone", column = @Column(name = "phone", length = 200)),
			@AttributeOverride(name = "fromUserName", column = @Column(name = "from_user_name", length = 100)),
			@AttributeOverride(name = "fromName", column = @Column(name = "from_name", length = 200)),
			@AttributeOverride(name = "fromEmail", column = @Column(name = "from_email", length = 100)) })
	public VWorklistId getId() {
		return this.id;
	}

	public void setId(VWorklistId id) {
		this.id = id;
	}

}
