package com.haak.haaksq.form;

import java.io.Serializable;

public class BlogAd implements Serializable{
	int commuId;
	int adId;
	String adFileName;
	String adPath;
	String adUrl;
	String adFlagPublic;
	public int getCommuId() {
		return commuId;
	}
	public void setCommuId(int commuId) {
		this.commuId = commuId;
	}
	public int getAdId() {
		return adId;
	}
	public void setAdId(int adId) {
		this.adId = adId;
	}
	public String getAdFileName() {
		return adFileName;
	}
	public void setAdFileName(String adFileName) {
		this.adFileName = adFileName;
	}
	public String getAdPath() {
		return adPath;
	}
	public void setAdPath(String adPath) {
		this.adPath = adPath;
	}
	public String getAdUrl() {
		return adUrl;
	}
	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}
	public String getAdFlagPublic() {
		return adFlagPublic;
	}
	public void setAdFlagPublic(String adFlagPublic) {
		this.adFlagPublic = adFlagPublic;
	}

}
