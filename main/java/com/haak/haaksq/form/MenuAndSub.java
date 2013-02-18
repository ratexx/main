package com.haak.haaksq.form;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MenuAndSub  implements java.io.Serializable {


	

	
	
	private static final long serialVersionUID = 1L;
	
	int menuId;
	String menuName;
	String menuURL;
	int menuSeq;
	int menuLevel;
	int menuSubSeq;
	int menuParrentSubMenu;
	int menuLanguageId;	
	List<MenuAndSub> listSubMenu;
	
	public List<MenuAndSub> getListSubMenu() {
		return listSubMenu;
	}
	public void setListSubMenu(List<MenuAndSub> listSubMenu) {
		this.listSubMenu = listSubMenu;
	}
	public int getCommuId() {
		return commuId;
	}
	public void setCommuId(int commuId) {
		this.commuId = commuId;
	}



	int packageId;
	int commuId;

	
	
	
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuURL() {
		return menuURL;
	}
	public void setMenuURL(String menuURL) {
		this.menuURL = menuURL;
	}

	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getMenuSeq() {
		return menuSeq;
	}
	public void setMenuSeq(int menuSeq) {
		this.menuSeq = menuSeq;
	}
	public int getMenuLevel() {
		return menuLevel;
	}
	public void setMenuLevel(int menuLevel) {
		this.menuLevel = menuLevel;
	}
	public int getMenuSubSeq() {
		return menuSubSeq;
	}
	public void setMenuSubSeq(int menuSubSeq) {
		this.menuSubSeq = menuSubSeq;
	}
	public int getMenuParrentSubMenu() {
		return menuParrentSubMenu;
	}
	public void setMenuParrentSubMenu(int menuParrentSubMenu) {
		this.menuParrentSubMenu = menuParrentSubMenu;
	}
	public int getMenuLanguageId() {
		return menuLanguageId;
	}
	public void setMenuLanguageId(int menuLanguageId) {
		this.menuLanguageId = menuLanguageId;
	}
}
	