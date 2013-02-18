package com.haak.haaksq.form;

import java.io.Serializable;

public class BlogBOD implements Serializable{
		String bodDetail;
		String bodURL;
		String bod_IMG;
		public String getBodDetail() {
			return bodDetail;
		}
		public void setBodDetail(String bodDetail) {
			this.bodDetail = bodDetail;
		}
		public String getBodURL() {
			return bodURL;
		}
		public void setBodURL(String bodURL) {
			this.bodURL = bodURL;
		}
		public String getBod_IMG() {
			return bod_IMG;
		}
		public void setBod_IMG(String bod_IMG) {
			this.bod_IMG = bod_IMG;
		}


}
