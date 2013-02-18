package com.haak.haaksq.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.haak.haaksq.constanst.HaakConst;
import com.haak.haaksq.dao.ContactDAO;
import com.haak.haaksq.dao.MainLoadDAO;
import com.haak.haaksq.dbutil.SqlUtil;
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

@Service
public class LoadPageServiceImpl implements LoadPageService{

	
	
	@Autowired
	private ContactDAO contactDAO;
	@Autowired
	private MainLoadDAO mainLoadDAO; 
	 

		
	    @Transactional
	    public List<VUserAction> loadLoginDetails(String  user_name) {
			return mainLoadDAO.loadUserDetails(user_name);
	    }
	    
	    
	    @Transactional
	    public List<MenuForm> loadMenu(int package_id , int language_id ,int commuId) {
			return mainLoadDAO.loadMenu( package_id ,  language_id , commuId );
	    }
	    
	    
	    @Transactional
	    public UserProfileForm login(String userName , String pass) {
	    	
	    	UserProfileForm user = mainLoadDAO.login(userName, pass);
	    	if(user != null){
	    		user.setRoleList(mainLoadDAO.getListRole(user.getUserID())) ;
	    	}
	    	return user;
	    }
	    
	    
	    @Transactional
	    public List<Object> loadModule(int package_id,int  language_id,int menu_id) {
	    	return mainLoadDAO.loadModule( package_id,  language_id, menu_id);
	    }
	    
	    @Transactional
	    public List<BlogAd> loadAd(int commuId,String publicFlag)  {
	    	return mainLoadDAO.loadAd( commuId,  publicFlag);
	    }
	    
	    
	    @Transactional
	    public VCommunity loadCommunityDeatils(int communityId ,int lanuageId)  {
	    	return mainLoadDAO.loadCommunityDeatils( communityId,  lanuageId);
	    }

	    @Transactional
	    public List<VCommunityGallaryId> loadGallary(int commuId ,boolean flagFullDetail) {
	    	return mainLoadDAO.loadGallary(commuId, flagFullDetail);
	    }

	    @Transactional	
	    public List<VCommunityWhatNearBy> loadWhatNearBy(int commuId ,int languageId ,boolean flagFullDetail) {
	    	return mainLoadDAO.loadWhatNearBy(commuId, languageId, flagFullDetail);
		}
	  	    
	    @Transactional	
	    public List<VCommunitySaleRentId> loadSaleAndRent(int commuId ,int languageId ,boolean flagFullDetail) {
	    	return mainLoadDAO.loadSaleAndRent(commuId, languageId, flagFullDetail);
	    }
	    
	    @Transactional
	    public List<VCommunityLifestyle> loadLifeStyle (int commuId ,int languageId ,boolean flagFullDetail) {
	    	return mainLoadDAO.loadLifeStyle(commuId, languageId, flagFullDetail);
	    }
	    
	    @Transactional
	    public List<VCommnunityOpportunitiesId> loadOppo (int commuId ,int languageId ,boolean flagFullDetail) {
	    	return mainLoadDAO.loadOppo(commuId, languageId, flagFullDetail);
	    }

	    @Transactional
	    public List<VCommunityNewsId> getBlogNews (int commuId  ,boolean flagFullDetail) {
	    	return mainLoadDAO.getBlogNews(commuId, flagFullDetail);
	    }
	    
	    @Transactional
	    public boolean isDuplecate(String table,String column,String value ) {
	    	return mainLoadDAO.isDuplecate(table, column, value);
	    }
	    
	    
	    @Transactional
	    public List<VInboxWorklistId> getInbox (int commuId  , int[] roleList ,  String userName , boolean flagFullDetail) {
	    	
	    	boolean userFlag = false;
	    	for(int roleid:roleList){
	    		if( roleList.length==1 && roleid == HaakConst.ROLE_USER){
	    			userFlag = true;
	    			break;
	    		}
	    		
	    	}
	    	return mainLoadDAO.getInbox(commuId,SqlUtil.changeArrayInConditon(roleList) , userFlag, userName, flagFullDetail);
	    }
	    
	    
	    @Transactional
	    public List<VTaskManager> getTaskManager ( int commuID  , boolean flagPublic ,  boolean flagFullDetail) {
	    	return mainLoadDAO.getTaskManager(commuID,  flagPublic, flagFullDetail);
	    	
	    }

	    
	    @Transactional
	    public List<CommunityNew> getNewsCommunity( int commuID  ,  boolean flagFullDetail ,int lanuageID ,boolean flagLogin) {
	    	return mainLoadDAO.getNewsCommunity(commuID,  flagFullDetail, lanuageID, flagLogin);
	    }
	
	    @Transactional
	    public List<VCommunityResource> getResource( int commuID   ,  boolean flagFullDetail ,int lanuageID ,boolean flagLogin) {
	    	return mainLoadDAO.getResource(commuID,  flagFullDetail, lanuageID, flagLogin);
	    }
	    
	    @Transactional
	    public List<CommunityNew> getNewsGeneral( int commuID  ,  boolean flagFullDetail ,int lanuageID) {
	    	return mainLoadDAO.getNewsGeneral(commuID, flagFullDetail, lanuageID);
	    }
	    
	    
	    @Transactional
 		public List<CommunityContractNumber> getContractNumber( int commuID   ,  boolean flagFullDetail ,int lanuageID) {
	    	return mainLoadDAO.getContractNumber(commuID, flagFullDetail, lanuageID);
	    }
		    @Transactional
		    public List<VInboxByUser> getInboxByUser (int[] roleId ,int addressID  ,  boolean flagFullDetail) {
		    	if(roleId!=null){
		    		ArrayList oo = new ArrayList<Object>();
		    	for(int i=0; i<roleId.length ;i++){
		    		oo.add(Integer.valueOf(roleId[i]));
		    		
		    	}
		    	
		    		return mainLoadDAO.getInboxByUser(oo.toArray() , addressID,flagFullDetail);
		    	}else{
		    		return mainLoadDAO.getInboxByUser(null , addressID,flagFullDetail);
		    	}
		    }
	
		    
		    public List<VUserProfile> loadUserProfile(int commuId , int lanuageId) {
		    	return mainLoadDAO.loadUserProfile(commuId, lanuageId);
		    }
		    
		    @Transactional
		    public Map<String,MenuAndSub> loadMenuSubmenu( int language_id ,int commuId ,int[] roleId) {
		    	String menu = "" ;
		    			
		    	List<MenuAndSub> menuAndSubList = mainLoadDAO.loadMenuSubmenu(language_id, commuId, roleId);
		    	Map<String,MenuAndSub> menuParent = new HashMap<String, MenuAndSub>(); 
		    	for(MenuAndSub menuAndSub:menuAndSubList){
		    		if(menuAndSub.getMenuLevel()==1){
		    			menuParent.put(String.valueOf(menuAndSub.getMenuId()), menuAndSub);
		    		}
		    	}
		    	
		    	for(MenuAndSub menuAndSub:menuAndSubList){
		    		if(menuAndSub.getMenuLevel()==2){
		    			if(menuParent.get(String.valueOf(menuAndSub.getMenuParrentSubMenu())).getListSubMenu()==null){
		    				List<MenuAndSub> listSubMenu = new ArrayList<MenuAndSub>() ;
		    				listSubMenu.add(menuAndSub);
		    				menuParent.get(String.valueOf(menuAndSub.getMenuParrentSubMenu())).setListSubMenu(listSubMenu);
		    			}else{
		    				menuParent.get(String.valueOf(menuAndSub.getMenuParrentSubMenu())).getListSubMenu().add(menuAndSub);
		    			}
		    		}
	    		}

		    	return menuParent ;
		    }
		    
		    @Transactional
		    public List<VModuleSubmenu> getUserPrivilege(int commuId,int[] role  ) {
		    	if(role!=null){
		    		ArrayList oo = new ArrayList<Object>();
		    	for(int i=0; i<role.length ;i++){
		    		oo.add(Integer.valueOf(role[i]));
		    		
		    	}
		    return mainLoadDAO.getUserPrivilege(commuId, oo.toArray());
		    }else{
		    	return null;
		    }
		    }
		    @Transactional
		    public List<CommunityLifestyle> getCommunityLifeStyle(int commuId,int lifeTypeID) {
		    	return mainLoadDAO.getCommunityLifeStyle(commuId,lifeTypeID);
		    }
		    

		    
}
