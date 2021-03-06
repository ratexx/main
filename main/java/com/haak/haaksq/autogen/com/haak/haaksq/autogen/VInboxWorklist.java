package com.haak.haaksq.autogen;

// Generated Feb 13, 2013 12:10:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VInboxWorklist generated by hbm2java
 */
@Entity
@Table(name = "v_inbox_worklist", catalog = "haaksquare_db")
public class VInboxWorklist implements java.io.Serializable {

	private VInboxWorklistId id;

	public VInboxWorklist() {
	}

	public VInboxWorklist(VInboxWorklistId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "worklistTypeName", column = @Column(name = "worklist_type_name", length = 200)),
			@AttributeOverride(name = "worklistName", column = @Column(name = "worklist_name", length = 200)),
			@AttributeOverride(name = "worklistDetail", column = @Column(name = "worklist_detail", length = 2000)),
			@AttributeOverride(name = "fromUserName", column = @Column(name = "from_user_name", length = 100)),
			@AttributeOverride(name = "fromName", column = @Column(name = "from_name", length = 200)),
			@AttributeOverride(name = "fromEmail", column = @Column(name = "from_email", length = 100)),
			@AttributeOverride(name = "toUserName", column = @Column(name = "to_user_name", length = 100)),
			@AttributeOverride(name = "worklistSubjectName", column = @Column(name = "worklist_subject_name", length = 200)),
			@AttributeOverride(name = "communityId", column = @Column(name = "community_id")),
			@AttributeOverride(name = "roleId", column = @Column(name = "role_id", nullable = false)),
			@AttributeOverride(name = "fgPublic", column = @Column(name = "fg_public", length = 1)),
			@AttributeOverride(name = "worklistStatusId", column = @Column(name = "worklist_status_id")),
			@AttributeOverride(name = "worklistId", column = @Column(name = "Worklist_Id", nullable = false)),
			@AttributeOverride(name = "fgShowQuestName", column = @Column(name = "fg_show_quest_name", length = 1)),
			@AttributeOverride(name = "fgShowAnswerName", column = @Column(name = "fg_show_answer_name", length = 1)),
			@AttributeOverride(name = "addressId", column = @Column(name = "address_id")),
			@AttributeOverride(name = "createDate", column = @Column(name = "create_date", length = 10)),
			@AttributeOverride(name = "createBy", column = @Column(name = "create_by")),
			@AttributeOverride(name = "modifyDate", column = @Column(name = "modify_date", length = 19)),
			@AttributeOverride(name = "modifyBy", column = @Column(name = "modify_by")) })
	public VInboxWorklistId getId() {
		return this.id;
	}

	public void setId(VInboxWorklistId id) {
		this.id = id;
	}

}
