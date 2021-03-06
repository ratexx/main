package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BoardId generated by hbm2java
 */
@Embeddable
public class BoardId implements java.io.Serializable {

	private int boardId;
	private int communityId;

	public BoardId() {
	}

	public BoardId(int boardId, int communityId) {
		this.boardId = boardId;
		this.communityId = communityId;
	}

	@Column(name = "board_id", nullable = false)
	public int getBoardId() {
		return this.boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	@Column(name = "community_id", nullable = false)
	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BoardId))
			return false;
		BoardId castOther = (BoardId) other;

		return (this.getBoardId() == castOther.getBoardId())
				&& (this.getCommunityId() == castOther.getCommunityId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBoardId();
		result = 37 * result + this.getCommunityId();
		return result;
	}

}
