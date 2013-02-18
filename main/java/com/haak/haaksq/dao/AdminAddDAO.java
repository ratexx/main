package com.haak.haaksq.dao;

import java.util.List;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.haak.haaksq.form.Address;
import com.haak.haaksq.form.AttachFile;
import com.haak.haaksq.form.CacheM;
import com.haak.haaksq.form.CommunityAddress;
import com.haak.haaksq.form.CommunityNew;
import com.haak.haaksq.form.Sms;
import com.haak.haaksq.form.SmsCredit;
import com.haak.haaksq.form.SmsHistory;
import com.haak.haaksq.form.SmsTo;
import com.haak.haaksq.form.StmImg;
import com.haak.haaksq.form.UserProfile;
import com.haak.haaksq.form.UserProfileForm;
import com.haak.haaksq.form.UserRole;
import com.haak.haaksq.form.VResultSendSms;
import com.haak.haaksq.form.VUserProfile;

public interface AdminAddDAO {
    public void saveUser(UserProfile userProfile);    
    public void saveAddress(Address address);  
    public void saveAttach(AttachFile attachFile);
    public void saveAttach(UserRole userRole);
    public void saveCommuAd(CommunityAddress commuAdd);
    public void updateUser(UserProfile userProfile);
    public UserProfile loadUserProfile(int user);
    public CommunityAddress loadCommuAddress(int addressID);
    public void updateCommuAddress(CommunityAddress commuAdd);
    public VUserProfile loadUserDetails(int user,int lanuage_id);   	
    public void saveCommunityNews(CommunityNew commuNews);
    
    public List<CacheM> getCacheM(String  columnValue ,String columnName , String tableName ,String where) ;
    public void saveNews(CommunityNew commuNews);
    public List<UserProfile> getListUser(int community,int roleId);
    
    
    public void saveSMS(Sms sms );      
    public void saveSmsCredit(SmsCredit smsCredit );
    public void saveSmsHistory(SmsHistory smsHistory);
    public void saveSmsTo(SmsTo smsTo);
    
    public List<VResultSendSms> getSMSDetail(int smsId);
    public void updateSmsCredit(SmsCredit smsCredit);
    
    public List<UserProfile> getListUser(Object[] user_id ,int community);   	
	public List<Object> getSearchUser(String key) ;
    public void deleteUser(UserProfile userProfile);
    
    public void save_img_stream(StmImg stmImg);
    

}
