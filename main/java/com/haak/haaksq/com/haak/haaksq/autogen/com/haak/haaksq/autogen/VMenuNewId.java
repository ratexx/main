package com.haak.haaksq.autogen;

// Generated 11 �.�. 2555, 10:30:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VMenuNewId generated by hbm2java
 */
@Embeddable
public class VMenuNewId implements java.io.Serializable {

	private int menuId;
	private String menuName;
	private Integer seq;
	private Integer levelMenu;
	private Integer seqSub;
	private Integer parrentSubMenu;
	private String menuUrl;
	private String menuImageUrl;
	private int languageId;

	public VMenuNewId() {
	}

	public VMenuNewId(int menuId, String menuUrl, int languageId) {
		this.menuId = menuId;
		this.menuUrl = menuUrl;
		this.languageId = languageId;
	}

	public VMenuNewId(int menuId, String menuName, Integer seq,
			Integer levelMenu, Integer seqSub, Integer parrentSubMenu,
			String menuUrl, String menuImageUrl, int languageId) {
		this.menuId = menuId;
		this.menuName = menuName;
		this.seq = seq;
		this.levelMenu = levelMenu;
		this.seqSub = seqSub;
		this.parrentSubMenu = parrentSubMenu;
		this.menuUrl = menuUrl;
		this.menuImageUrl = menuImageUrl;
		this.languageId = languageId;
	}

	@Column(name = "menu_id", nullable = false)
	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	@Column(name = "menu_name", length = 100)
	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@Column(name = "seq")
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "level_menu")
	public Integer getLevelMenu() {
		return this.levelMenu;
	}

	public void setLevelMenu(Integer levelMenu) {
		this.levelMenu = levelMenu;
	}

	@Column(name = "seq_sub")
	public Integer getSeqSub() {
		return this.seqSub;
	}

	public void setSeqSub(Integer seqSub) {
		this.seqSub = seqSub;
	}

	@Column(name = "parrent_sub_menu")
	public Integer getParrentSubMenu() {
		return this.parrentSubMenu;
	}

	public void setParrentSubMenu(Integer parrentSubMenu) {
		this.parrentSubMenu = parrentSubMenu;
	}

	@Column(name = "menu_url", nullable = false, length = 100)
	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	@Column(name = "menu_image_url", length = 100)
	public String getMenuImageUrl() {
		return this.menuImageUrl;
	}

	public void setMenuImageUrl(String menuImageUrl) {
		this.menuImageUrl = menuImageUrl;
	}

	@Column(name = "language_id", nullable = false)
	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VMenuNewId))
			return false;
		VMenuNewId castOther = (VMenuNewId) other;

		return (this.getMenuId() == castOther.getMenuId())
				&& ((this.getMenuName() == castOther.getMenuName()) || (this
						.getMenuName() != null
						&& castOther.getMenuName() != null && this
						.getMenuName().equals(castOther.getMenuName())))
				&& ((this.getSeq() == castOther.getSeq()) || (this.getSeq() != null
						&& castOther.getSeq() != null && this.getSeq().equals(
						castOther.getSeq())))
				&& ((this.getLevelMenu() == castOther.getLevelMenu()) || (this
						.getLevelMenu() != null
						&& castOther.getLevelMenu() != null && this
						.getLevelMenu().equals(castOther.getLevelMenu())))
				&& ((this.getSeqSub() == castOther.getSeqSub()) || (this
						.getSeqSub() != null && castOther.getSeqSub() != null && this
						.getSeqSub().equals(castOther.getSeqSub())))
				&& ((this.getParrentSubMenu() == castOther.getParrentSubMenu()) || (this
						.getParrentSubMenu() != null
						&& castOther.getParrentSubMenu() != null && this
						.getParrentSubMenu().equals(
								castOther.getParrentSubMenu())))
				&& ((this.getMenuUrl() == castOther.getMenuUrl()) || (this
						.getMenuUrl() != null && castOther.getMenuUrl() != null && this
						.getMenuUrl().equals(castOther.getMenuUrl())))
				&& ((this.getMenuImageUrl() == castOther.getMenuImageUrl()) || (this
						.getMenuImageUrl() != null
						&& castOther.getMenuImageUrl() != null && this
						.getMenuImageUrl().equals(castOther.getMenuImageUrl())))
				&& (this.getLanguageId() == castOther.getLanguageId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMenuId();
		result = 37 * result
				+ (getMenuName() == null ? 0 : this.getMenuName().hashCode());
		result = 37 * result
				+ (getSeq() == null ? 0 : this.getSeq().hashCode());
		result = 37 * result
				+ (getLevelMenu() == null ? 0 : this.getLevelMenu().hashCode());
		result = 37 * result
				+ (getSeqSub() == null ? 0 : this.getSeqSub().hashCode());
		result = 37
				* result
				+ (getParrentSubMenu() == null ? 0 : this.getParrentSubMenu()
						.hashCode());
		result = 37 * result
				+ (getMenuUrl() == null ? 0 : this.getMenuUrl().hashCode());
		result = 37
				* result
				+ (getMenuImageUrl() == null ? 0 : this.getMenuImageUrl()
						.hashCode());
		result = 37 * result + this.getLanguageId();
		return result;
	}

}