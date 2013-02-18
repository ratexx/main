package com.haak.haaksq.form;

public class FormReplyInbox {
		private int id;
		private String fromUser;
		private String inboxSubject;
		private String inboxDetails;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFromUser() {
			return fromUser;
		}
		public void setFromUser(String fromUser) {
			this.fromUser = fromUser;
		}
		public String getInboxSubject() {
			return inboxSubject;
		}
		public void setInboxSubject(String inboxSubject) {
			this.inboxSubject = inboxSubject;
		}
		public String getInboxDetails() {
			return inboxDetails;
		}
		public void setInboxDetails(String inboxDetails) {
			this.inboxDetails = inboxDetails;
		}

}
