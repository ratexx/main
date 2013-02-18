package com.haak.haaksq.form;

import java.io.Serializable;

public class UserProfileForm implements Serializable{
	
		public String userName;
		public String firstName;

		public String lastName;
		public String nickName;
		public String email;
		public int commuID;
		public int packageID;
		public int userID;
		public int addressID;
		private String password;
		
		private int[] roleList;
		
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getNickName() {
			return nickName;
		}
		public void setNickName(String nickName) {
			this.nickName = nickName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getCommuID() {
			return commuID;
		}
		public void setCommuID(int commuID) {
			this.commuID = commuID;
		}
		public int getPackageID() {
			return packageID;
		}
		public void setPackageID(int packageID) {
			this.packageID = packageID;
		}
		public int[] getRoleList() {
			return roleList;
		}
		public void setRoleList(int[] roleList) {
			this.roleList = roleList;
		}
		public int getUserID() {
			return userID;
		}
		public void setUserID(int userID) {
			this.userID = userID;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getAddressID() {
			return addressID;
		}
		public void setAddressID(int addressID) {
			this.addressID = addressID;
		}
		
}
