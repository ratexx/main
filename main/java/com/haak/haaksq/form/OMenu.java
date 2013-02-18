package com.haak.haaksq.form;


public class OMenu  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String menuName;
	String menuLinkImg;
	String menuURL;
	String menuTheme;
	
	
	
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
	public String getMenuTheme() {
		return menuTheme;
	}
	public void setMenuTheme(String menuTheme) {
		this.menuTheme = menuTheme;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getMenuLinkImg() {
		return menuLinkImg;
	}
	public void setMenuLinkImg(String menuLinkImg) {
		this.menuLinkImg = menuLinkImg;
	}
	
	
	
}
