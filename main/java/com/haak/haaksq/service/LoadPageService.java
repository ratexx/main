package com.haak.haaksq.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.haak.haaksq.form.BlogAd;
import com.haak.haaksq.form.CommunityContractNumber;
import com.haak.haaksq.form.CommunityLifestyle;
import com.haak.haaksq.form.CommunityNew;
import com.haak.haaksq.form.MenuAndSub;
import com.haak.haaksq.form.MenuForm;
import com.haak.haaksq.form.UserProfileForm;
import com.haak.haaksq.form.VCommnunityOpportunitiesId;
import com.haak.haaksq.form.VCommunityGallaryId;
import com.haak.haaksq.form.VCommunity;
import com.haak.haaksq.form.VCommunityLifestyle;
import com.haak.haaksq.form.VCommunityNewsId;
import com.haak.haaksq.form.VCommunityResource;
import com.haak.haaksq.form.VCommunitySaleRentId;
import com.haak.haaksq.form.VCommunityWhatNearBy;
import com.haak.haaksq.form.VInboxByUser;
import com.haak.haaksq.form.VInboxWorklistId;
import com.haak.haaksq.form.VModuleSubmenu;
import com.haak.haaksq.form.VSearchUser;
import com.haak.haaksq.form.VTaskManager;
import com.haak.haaksq.form.VUserAction;
import com.haak.haaksq.form.VUserProfile;
import com.haak.haaksq.form.VWorklist;

public interface LoadPageService {
	
	
	public List<VUserAction> loadLoginDetails(String  user_name) ;	
	public List<MenuForm> loadMenu(int package_id , int language_id ,int commuId) ;
    public UserProfileForm login(String userName , String pass) ;
    public List<Object> loadModule(int package_id,int  language_id,int menu_id) ;
    public List<BlogAd> loadAd(int commuId,String publicFlag)  ;
    public VCommunity loadCommunityDeatils(int communityId ,int lanuageId)  ;
    public List<VCommunityGallaryId> loadGallary(int commuId ,boolean flagFullDetail) ;
    public List<VCommunityWhatNearBy> loadWhatNearBy(int commuId ,int languageId ,boolean flagFullDetail) ;
    public List<VCommunitySaleRentId> loadSaleAndRent(int commuId ,int languageId ,boolean flagFullDetail) ;
    public List<VCommunityLifestyle> loadLifeStyle (int commuId ,int languageId ,boolean flagFullDetail) ;
    public List<VCommnunityOpportunitiesId> loadOppo (int commuId ,int languageId ,boolean flagFullDetail) ;
    public List<VCommunityNewsId> getBlogNews (int commuId  ,boolean flagFullDetail) ;
    public List<VInboxWorklistId> getInbox (int commuId  , int[] roleList ,  String userName , boolean flagFullDetail) ;
    public boolean isDuplecate(String table,String column,String value ) ;
    public List<VInboxByUser> getInboxByUser (int[] roleId ,int addressID  ,  boolean flagFullDetail) ;
    public List<VTaskManager> getTaskManager ( int commuID  , boolean flagPublic ,  boolean flagFullDetail) ;
    
    
    public List<CommunityNew> getNewsCommunity( int commuID  , boolean flagFullDetail ,int lanuageID ,boolean flagLogin) ;
    public List<CommunityNew> getNewsGeneral( int commuID  ,  boolean flagFullDetail ,int lanuageID) ;
    
    public List<CommunityContractNumber> getContractNumber( int commuID   ,  boolean flagFullDetail ,int lanuageID) ;
    public List<VCommunityResource> getResource( int commuID   ,  boolean flagFullDetail ,int lanuageID ,boolean flagLogin) ;
    
    public List<VUserProfile> loadUserProfile(int commuId , int lanuageId) ;
    public Map<String,MenuAndSub> loadMenuSubmenu( int language_id ,int commuId ,int[] roleId)  ;
    public List<VModuleSubmenu> getUserPrivilege(int commuId,int[] role  ) ;
    
    public List<CommunityLifestyle> getCommunityLifeStyle(int commuId,int lifeTypeID) ;
}
