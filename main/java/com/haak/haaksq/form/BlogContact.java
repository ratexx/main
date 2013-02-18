package com.haak.haaksq.form;

import java.io.Serializable;

public class BlogContact implements Serializable{
	String contactDetail ;
	String contactURL;
	String contactURL_IMG;
	public String getContactDetail() {
		return contactDetail;
	}
	public void setContactDetail(String contactDetail) {
		this.contactDetail = contactDetail;
	}
	public String getContactURL() {
		return contactURL;
	}
	public void setContactURL(String contactURL) {
		this.contactURL = contactURL;
	}
	public String getContactURL_IMG() {
		return contactURL_IMG;
	}
	public void setContactURL_IMG(String contactURL_IMG) {
		this.contactURL_IMG = contactURL_IMG;
	}

}
