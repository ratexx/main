package com.haak.haaksq.service;

import java.util.List;

import com.haak.haaksq.form.CacheM;
import com.haak.haaksq.form.CommunityNew;
import com.haak.haaksq.form.PageInPutUser;
import com.haak.haaksq.form.StmImg;
import com.haak.haaksq.form.UserProfile;
import com.haak.haaksq.form.UserProfileForm;
import com.haak.haaksq.form.VUserProfile;

public interface AdminAddService {
	
	 public void saveUser(PageInPutUser pageinputUser);
	 public PageInPutUser loadUserdetails(UserProfileForm user);
	 public VUserProfile loadUserDetails(UserProfileForm user,int lanuage_id);
	 public void updateUser(VUserProfile userForm,int lanuageID);
	 public List<CacheM> getCacheM(String name,int commuid) ;
	 public List<CacheM> getCacheM(String name) ;
	 public void saveNews(CommunityNew commuNews);
	 public List<UserProfile> getListUser(int community ,int[] roleId);
	 
	 public void saveLogSMS(int communityId , String msg,String[] mobileNo,int user ,int useCredit);
	 public List<UserProfile> searchUser(String  key,int commuId);
	 public void deleteUser(int userId);
	    
	 public StmImg save_img_stream(String img_path,String img_name,int create_by,String ipClient);
	    
}
