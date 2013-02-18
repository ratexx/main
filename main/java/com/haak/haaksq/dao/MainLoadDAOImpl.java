package com.haak.haaksq.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.mapping.Property;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haak.haaksq.constanst.HaakConst;
import com.haak.haaksq.dbutil.HibernateUtil;
import com.haak.haaksq.form.BlogAd;
import com.haak.haaksq.form.CommunityContractNumber;
import com.haak.haaksq.form.CommunityLifestyle;
import com.haak.haaksq.form.CommunityNew;
import com.haak.haaksq.form.MenuAndSub;
import com.haak.haaksq.form.MenuForm;
import com.haak.haaksq.form.SmsCredit;
import com.haak.haaksq.form.TrnPostReply;
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
import com.haak.haaksq.form.VInboxWorklist;
import com.haak.haaksq.form.VInboxWorklistId;
import com.haak.haaksq.form.VModuleSubmenu;
import com.haak.haaksq.form.VSearchUser;
import com.haak.haaksq.form.VTaskManager;
import com.haak.haaksq.form.VUserAction;
import com.haak.haaksq.form.VUserProfile;
import com.haak.haaksq.form.VWorklist;
import com.haak.haaksq.form.Worklist2;

@Repository
public class MainLoadDAOImpl  implements MainLoadDAO {
	
    @Autowired
    private SessionFactory sessionFactory; 
    
    

    
    public int getMAX(String TabCol ,String table ,int addNext) {
    	
    	String sql =   " select ifnull(max("+TabCol+"),0) from  " +table;
    						
    	Session session = sessionFactory.getCurrentSession();
    	return  Integer.parseInt( String.valueOf(session.createSQLQuery(sql).uniqueResult()))+addNext;
    			    	
    }
    
    public boolean isDuplecate(String table,String column,String value ) {
    	
    	String sql =   "select count(*) from "+table+" where "+column+" = '"+value+"' ";
    	Session session = sessionFactory.getCurrentSession();
    	int row =  Integer.parseInt( String.valueOf(session.createSQLQuery(sql).uniqueResult()));					
    	if(row!=0)	return true; else return false;
    			    	
    }    
    
    public List<Object> loadModule(int package_id , int language_id ,int menu_id) {
    	
    	String sql =   " SELECT "+
    						" v_menu_module.module_id "+
    						" FROM v_menu_module "+
    						" WHERE v_menu_module.package_id =" + package_id +
    						" and  v_menu_module.menu_id =" + menu_id +
    						" and  v_menu_module.language_id =" + language_id ;
    						
    	Session session = sessionFactory.getCurrentSession();
    	System.out.println("DAO Size" + session.createSQLQuery(sql).list().toString());
    	
    	return session.createSQLQuery(sql).list();
    			    	
    }
    
    
    
    
    public int[] getListRole(int userId) {
    	
    	String sql =   " SELECT "+
							" user_role.role_id "+
							" FROM "+
							" user_role " + 
							" where user_role.user_id ="+userId;
    						
    	Session session = sessionFactory.getCurrentSession();
    	List<Object> list = session.createSQLQuery(sql).list();
    	if(list != null || list.size()!=0){
	    	int[] rtnRoleList = new int[list.size()] ;    	
	    	for(int i=0;i<list.size();i++){    		
	    		rtnRoleList[i] = Integer.parseInt(String.valueOf(list.get(i)));
	    	}
	    	return rtnRoleList;
    	}else{
    		return null;
    	}
    	
    			    	
    }
    
    public List<MenuForm> loadMenu(int package_id , int language_id ,int commuId) {
    	
    	String sql =   " select distinct(v_menu.menu_name) as menuName , "+ 
    						" v_menu.menu_url  as menuURL , "+
    						" v_menu.menu_image_url as menuLinkImg ,"+
    						" v_menu.menu_id as menuId ,"+
    						" v_menu.package_id as packageId , "+
    						" v_menu.language_id as languageID, " + 
    						commuId + "  as commuId " +
    						" from	v_menu "+
    						" where v_menu.package_id in("+package_id+") "+ 
    						" and v_menu.language_id = " + language_id + " order by v_menu.seq" ;
    						
    	Session session = sessionFactory.getCurrentSession();
    	
    	return session.createSQLQuery(sql)   			
    			.addScalar("menuName", StandardBasicTypes.STRING)
    			.addScalar("menuURL", StandardBasicTypes.STRING)
    			.addScalar("menuLinkImg", StandardBasicTypes.STRING)
    			.addScalar("menuId", StandardBasicTypes.INTEGER)
    			.addScalar("packageId", StandardBasicTypes.INTEGER)
    			.addScalar("languageID", StandardBasicTypes.INTEGER)
    			.addScalar("commuId", StandardBasicTypes.INTEGER)
    			.setResultTransformer(Transformers.aliasToBean(MenuForm.class)).list() ;    	
    }
    
    public List<MenuAndSub> loadMenuSubmenu( int language_id ,int commuId ,int[] roleId) {
    	
    	String sql =   "select  " +
    						"	menu.menu_id as menuId ," +
    						"  menu.menu_name as menuName , " +
    			            "  menu.menu_url as menuURL ,   " +
    			            "  menu.seq as menuSeq ,   " +
    			            "  menu.level_menu as menuLevel ,   " +
    			            "  menu.seq_sub as menuSubSeq ,   " +
    			            "  menu.parrent_sub_menu as menuParrentSubMenu ,   " +
    			            "  menu.language_id  as menuLanguageId    " +
    			            "  from			 "+				
							"( "+
							"SELECT "+
							"v_menu_new.menu_id, "+
							"v_menu_new.menu_name, "+
							"v_menu_new.seq, "+
							"v_menu_new.level_menu, "+
							"v_menu_new.seq_sub, "+
							"v_menu_new.parrent_sub_menu, "+
							"v_menu_new.menu_url,  "+
							" v_menu_new.language_id " +  
							
							"FROM "+
							"v_menu_new "+
							"where v_menu_new.menu_id in ( "+
							"SELECT "+
							"v_menu_new.parrent_sub_menu "+
							"FROM "+
							"v_menu_new "+
							"INNER JOIN role_module_action ON v_menu_new.menu_id = role_module_action.module_id "+
							"WHERE "+
							//"role_module_action.role_id in ("+String.valueOf(roleId)+") and role_module_action.fg_view = 'Y' and role_module_action.community_id = "+commuId+" and  v_menu_new.language_id = "+language_id+" ) "+
							"role_module_action.role_id in (1,6) and role_module_action.fg_view = 'Y' and role_module_action.community_id = "+commuId+" and  v_menu_new.language_id = "+language_id+" ) "+
							
							"UNION "+
							"( "+
							"SELECT "+
							"v_menu_new.menu_id, "+
							"v_menu_new.menu_name, "+
							"v_menu_new.seq, "+
							"v_menu_new.level_menu, "+
							"v_menu_new.seq_sub, "+
							"v_menu_new.parrent_sub_menu, "+
							"v_menu_new.menu_url,  "+
							" v_menu_new.language_id " + 
							"FROM "+
							"v_menu_new "+
							"INNER JOIN role_module_action ON v_menu_new.menu_id = role_module_action.module_id "+
						    "WHERE "+
							//"role_module_action.role_id in ( "+roleId+") and role_module_action.fg_view = 'Y' and role_module_action.community_id = "+commuId+" and  v_menu_new.language_id = "+language_id+ ") ) menu "+
							"role_module_action.role_id in (1,6) and role_module_action.fg_view = 'Y' and role_module_action.community_id = "+commuId+" and  v_menu_new.language_id = "+language_id+ ") ) menu "+
							"order by menu.seq ";

    						
    	Session session = sessionFactory.getCurrentSession();
    	return session.createSQLQuery(sql)   			
    			.addScalar("menuName", StandardBasicTypes.STRING)
    			.addScalar("menuURL", StandardBasicTypes.STRING)
    			.addScalar("menuLevel", StandardBasicTypes.INTEGER)
    			.addScalar("menuSeq", StandardBasicTypes.INTEGER)
    			.addScalar("menuSubSeq", StandardBasicTypes.INTEGER)
    			.addScalar("menuId", StandardBasicTypes.INTEGER)
    			.addScalar("menuParrentSubMenu", StandardBasicTypes.INTEGER)
    			.addScalar("menuLanguageId", StandardBasicTypes.INTEGER)
    			.setResultTransformer(Transformers.aliasToBean(MenuAndSub.class)).list() ;    	
    }

    public UserProfileForm login(String userName , String pass) {
    	
    	String sql =   " SELECT "+
							" v_user_login_p.community_id as commuID,"+
							" v_user_login_p.user_name as userName,"+
							" v_user_login_p.first_name as firstName,"+
							" v_user_login_p.last_name as lastName,"+
							" v_user_login_p.nick_name as nickName,"+
							" v_user_login_p.email as email,"+ 
							" v_user_login_p.user_id  as userID,"+
							" v_user_login_p.package_id as packageID,"+
							" v_user_login_p.address_id as addressID"+
							
							" FROM "+
							" v_user_login_p"+
							" WHERE v_user_login_p.pass = '" +pass+"'" + 
							" and v_user_login_p.user_name = '" +userName+"'" ;
    						
    	Session session = sessionFactory.getCurrentSession();
    	UserProfileForm rtnUserProfileForm = new UserProfileForm();
    	rtnUserProfileForm = (UserProfileForm)session.createSQLQuery(sql)   			
    			.addScalar("userID", StandardBasicTypes.INTEGER)
    			.addScalar("commuID", StandardBasicTypes.INTEGER)
    			.addScalar("userName", StandardBasicTypes.STRING)
    			.addScalar("firstName", StandardBasicTypes.STRING)
    			.addScalar("lastName", StandardBasicTypes.STRING)
    			.addScalar("nickName", StandardBasicTypes.STRING)
    			.addScalar("email", StandardBasicTypes.STRING)    			
    			.addScalar("packageID", StandardBasicTypes.INTEGER)
    			.addScalar("addressID", StandardBasicTypes.INTEGER).setResultTransformer(Transformers.aliasToBean(UserProfileForm.class)).uniqueResult() ;
    	
    
    	
    	return rtnUserProfileForm;
    }
    
    
    
    public List<VUserAction> loadUserDetails(String user_id) {

    	
    	
     	
    	String sql = 
    			"SELECT " + 
    			"v_user_action.package_name as packageName  , "+
    			"v_user_action.menu_name as menuName,"+
    			"v_user_action.module_name as moduleName,"+
    			"v_user_action.package_id as packageId,"+
    			"v_user_action.menu_id as menuId,"+
    			"v_user_action.community_id as communityId,"+
    			"v_user_action.first_name as firstName,"+
    			"v_user_action.role_id as roleId,"+
    			"v_user_action.user_name as userName,"+
    			"v_user_action.last_name as lastName,"+
    			"v_user_action.user_id as userId,"+
    			"v_user_action.pass as pass "+
    			" FROM v_user_action  "+ 
    			" where v_user_action.user_name = '" + user_id +"'"; 
    			

    			
   
    	
    	Session session = sessionFactory.getCurrentSession();
    	
   	
    	return session.createSQLQuery(sql)   			
    			.addScalar("packageName", StandardBasicTypes.STRING)
    			.addScalar("menuName", StandardBasicTypes.STRING)
    			.addScalar("moduleName", StandardBasicTypes.STRING)
    			.addScalar("packageId", StandardBasicTypes.INTEGER)
    			.addScalar("menuId", StandardBasicTypes.INTEGER)
    			.addScalar("communityId", StandardBasicTypes.INTEGER)
    			.addScalar("firstName", StandardBasicTypes.STRING)
    			.addScalar("roleId", StandardBasicTypes.INTEGER)
    			.addScalar("userName", StandardBasicTypes.STRING).setResultTransformer(Transformers.aliasToBean(VUserAction.class)).list() ;

    }
 

public List<VUserProfile> loadUserProfile(int commuId , int lanuageId) {
 	return sessionFactory.getCurrentSession().createCriteria(VUserProfile.class)
 			//.add(Restrictions.eq("userId", userId)).list();
 			.add(Restrictions.eq("communityId", commuId))
 			.add(Restrictions.eq("languageId", 2))
 			.list();
 			
		
    }

    
    public List<BlogAd> loadAd(int commuId,String publicFlag) {
    	
    	String sql = 
    			"SELECT " + 
    			"v_ad.ad_community_id as commuId  , "+
    			"v_ad.ad_id as adId,"+
    			"v_ad.ad_filename as adFileName,"+
    			"v_ad.ad_path as adPath,"+
    			"v_ad.ad_url as adUrl,"+
    			"v_ad.fg_public as adFlagPublic "+
    			" FROM v_ad "+ 
    			" where v_ad.ad_community_id = " +commuId + 
    			" and v_ad.fg_public='"+publicFlag+"'"; 
    			

    			
   
    	
    	Session session = sessionFactory.getCurrentSession();
    	
   	
    	return session.createSQLQuery(sql)   			
    			.addScalar("commuId", StandardBasicTypes.INTEGER)
    			.addScalar("adId", StandardBasicTypes.INTEGER)
    			.addScalar("adFileName", StandardBasicTypes.STRING)
    			.addScalar("adPath", StandardBasicTypes.STRING)
    			.addScalar("adUrl", StandardBasicTypes.STRING)
    			.addScalar("adFlagPublic", StandardBasicTypes.STRING).setResultTransformer(Transformers.aliasToBean(BlogAd.class)).list() ;

    }
    

    
    public  VCommunity  loadCommunityDeatils(int communityId ,int lanuageId) {
	 	
	 	return (VCommunity) sessionFactory.getCurrentSession().createCriteria(VCommunity.class)
	 			//.add(Restrictions.eq("userId", userId)).list();
	 			.add(Restrictions.eq("communityId", communityId))
	 			.add(Restrictions.eq("fileTypeId", 2))
	 			.uniqueResult();
	 	
 }   
    
    
    
 /*public  VCommunity  loadCommunityDeatils(int communityId ,int lanuageId) {
    	
    	String sql =   " SELECT " +
    			" v_community.community_id as communityId," +
    			" v_community.community_name as communityName," +
    			" v_community.community_type_name as communityTypeName ," +
    			" v_community.province_name as provinceName ," +
    			" v_community.amphoe_name as amphoeName ," +
    			" v_community.tumbol_name as tumbolName ," +
				" v_community.file_name as fileName , "+
				"v_community.path_name as pathName, "+
    			" v_community.google_map_longtitude as googleMapLatitude ," +
    			" v_community.google_map_url as googleMapUrl ," +
    			" v_community.community_shot_detail as  communityShotDetail ," +
    			" v_community.package_id as  packageId" +
    			" from v_community " +
    			" where v_community.community_id = " + communityId+ 
    			" and v_community.file_type_id = 0 "; 
    						
    	Session session = sessionFactory.getCurrentSession();
    	

    	
    	
    	return (VCommunity)session.createSQLQuery(sql)   			
    			.addScalar("communityId", StandardBasicTypes.INTEGER)
    			.addScalar("communityName", StandardBasicTypes.STRING)
    			.addScalar("communityTypeName", StandardBasicTypes.STRING)
    			.addScalar("provinceName", StandardBasicTypes.STRING)
    			.addScalar("amphoeName", StandardBasicTypes.STRING)
    			.addScalar("tumbolName", StandardBasicTypes.STRING)    		
    			.addScalar("pathName", StandardBasicTypes.STRING)
    			.addScalar("fileName", StandardBasicTypes.STRING)    	    			
    			.addScalar("googleMapLatitude", StandardBasicTypes.STRING)
    			.addScalar("googleMapUrl", StandardBasicTypes.STRING)
    			.addScalar("communityShotDetail", StandardBasicTypes.STRING)    	
    			.addScalar("packageId", StandardBasicTypes.INTEGER).setMaxResults(1)
    			.setResultTransformer(Transformers.aliasToBean(VCommunity.class)).uniqueResult() ;
    	
    }
*/ 
 
 public List<VCommunityGallaryId> loadGallary(int commuId ,boolean flagFullDetail) {
 	
 	String sql = 
 			"SELECT" +
 			" v_community_gallary.file_name as  fileName, " +
 			"v_community_gallary.path_name as pathName, " +
 			"v_community_gallary.attach_id as attachId, " +
 			"v_community_gallary.community_id as communityId, " +
 			"v_community_gallary.attach_seq as attachSeq, " +
 			"v_community_gallary.file_detail as fileDetail, " +
 			"v_community_gallary.attach_url as attachUrl " +
 			"FROM v_community_gallary " +
 			"where v_community_gallary.community_id = " + commuId;
 			

 			

 	
 	Session session = sessionFactory.getCurrentSession();
 	
	
 	return session.createSQLQuery(sql)   			
 			.addScalar("communityId", StandardBasicTypes.INTEGER)
 			.addScalar("attachId", StandardBasicTypes.INTEGER)
 			.addScalar("attachSeq", StandardBasicTypes.INTEGER) 			
 			.addScalar("fileName", StandardBasicTypes.STRING)
 			.addScalar("pathName", StandardBasicTypes.STRING)
 			.addScalar("fileDetail", StandardBasicTypes.STRING)
 			.addScalar("attachUrl", StandardBasicTypes.STRING).setResultTransformer(Transformers.aliasToBean(VCommunityGallaryId.class)).list() ;

 }
 
 
 public List<VCommunityWhatNearBy> loadWhatNearBy(int commuId ,int languageId ,boolean flagFullDetail) {
	 	
	 
	 Criteria sess = sessionFactory.getCurrentSession().createCriteria(VCommunityWhatNearBy.class) ;
	  	sess.add(Restrictions.eq("communityId", commuId));
	  	 
	  	if(flagFullDetail ==false){
	  			sess.setFirstResult(0)
	 			.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
	 			.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW);
	  	}
	  	return sess.addOrder(Order.desc("communityLifestyleId")).list();
/*	 	String sql = 
	 			"SELECT " +
	 			" v_community_what_near_by.community_lifestyle_id as communityLifestyleId , " +
	 			" v_community_what_near_by.community_id as communityId, " +
	 			" v_community_what_near_by.lifestyle_name as lifestyleName, " +
	 			" v_community_what_near_by.lifestyle_type_name as lifestyleTypeName, " +
	 			" v_community_what_near_by.lifestyle_full_name as lifestyleFullName, " +
	 			" v_community_what_near_by.lifestyle_detail as lifestyleDetail, " +
	 			" v_community_what_near_by.distance_from_HOA as distanceFromHoa ,  " +
	 			" v_community_what_near_by.lifestyle_link as lifestyleLink,  " +
	 			" v_community_what_near_by.lifestyle_url as lifestyleUrl, " +
	 			" v_community_what_near_by.lifestyle_google_map as lifestyleGoogleMap, " +
	 			" v_community_what_near_by.google_map_latitude as googleMapLatitude, " +
	 			" v_community_what_near_by.google_map_longtitude as googleMapLongtitude,  " +
	 			" v_community_what_near_by.google_map_url as googleMapUrl,  " +
	 			" v_community_what_near_by.lift_style_url as liftStyleUrl, " +
	 			" v_community_what_near_by.life_style_google_map as lifeStyleGoogleMap  " +

	 			"  FROM " +
	 			" v_community_what_near_by " +
	 			" WHERE v_community_what_near_by.community_id = " + commuId +
	 			" and v_community_what_near_by.language_id = "  + languageId ;
	 			

	 			

	 	
	 	Session session = sessionFactory.getCurrentSession();
	 	
	 	if(flagFullDetail){
	 	
	 	return  session.createSQLQuery(sql)
	 			.addScalar("communityLifestyleId", StandardBasicTypes.INTEGER)
	 			.addScalar("communityId", StandardBasicTypes.INTEGER)			
	 			.addScalar("lifestyleName", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleTypeName", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleFullName", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleDetail", StandardBasicTypes.STRING)
	 			.addScalar("distanceFromHoa", StandardBasicTypes.LONG)
	 			.addScalar("lifestyleLink", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleUrl", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleGoogleMap", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLatitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLongtitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapUrl", StandardBasicTypes.STRING)	 			
	 			.addScalar("liftStyleUrl", StandardBasicTypes.STRING)
	 			.addScalar("lifeStyleGoogleMap", StandardBasicTypes.STRING)	 	
	 			.setResultTransformer(Transformers.aliasToBean(VCommunityWhatNearById.class))
	 			.list() ;
	 	}else{
		 	return  session.createSQLQuery(sql)
		 			.addScalar("communityLifestyleId", StandardBasicTypes.INTEGER)
		 			.addScalar("communityId", StandardBasicTypes.INTEGER)			
		 			.addScalar("lifestyleName", StandardBasicTypes.STRING)
		 			.addScalar("lifestyleTypeName", StandardBasicTypes.STRING)
		 			.addScalar("lifestyleFullName", StandardBasicTypes.STRING)
		 			.addScalar("lifestyleDetail", StandardBasicTypes.STRING)
		 			.addScalar("distanceFromHoa", StandardBasicTypes.LONG)
		 			.addScalar("lifestyleLink", StandardBasicTypes.STRING)
		 			.addScalar("lifestyleUrl", StandardBasicTypes.STRING)
		 			.addScalar("lifestyleGoogleMap", StandardBasicTypes.STRING)
		 			.addScalar("googleMapLatitude", StandardBasicTypes.STRING)
		 			.addScalar("googleMapLongtitude", StandardBasicTypes.STRING)
		 			.addScalar("googleMapUrl", StandardBasicTypes.STRING)	 			
		 			.addScalar("liftStyleUrl", StandardBasicTypes.STRING)
		 			.addScalar("lifeStyleGoogleMap", StandardBasicTypes.STRING)	 	
		 			.setResultTransformer(Transformers.aliasToBean(VCommunityWhatNearById.class))
		 			.setFetchSize(HaakConst.MAX_IMG_WHAT_NEAR_BY)
		 			.list() ;	 		
	 	}*/
	 }
    
 

 
 public List<VCommunitySaleRentId> loadSaleAndRent (int commuId ,int languageId ,boolean flagFullDetail) {
	 	
	 	String sql = 
	 			" SELECT" +
	 			" v_community_sale_rent.community_sale_rent_id  as communitySaleRentId  ," +
	 			" v_community_sale_rent.community_id as  communityId  ," +
	 			" v_community_sale_rent.sales_rent_name as salesRentName , " +
	 			" v_community_sale_rent.community_type_name as communityTypeName ," +
	 			" v_community_sale_rent.value_amount as valueAmount ," +
	 			" v_community_sale_rent.land_space as landSpace," +
	 			" v_community_sale_rent.live_space as liveSpace," +
	 			" v_community_sale_rent.bed_room as bedRoom , " +
	 			" v_community_sale_rent.bath_room as bathRoom, " +
	 			" v_community_sale_rent.sales_rent_detail as salesRentDetail, " +
	 			" v_community_sale_rent.exterior_option as exteriorOption, " +
	 			" v_community_sale_rent.interior_option as interiorOption," +
	 			" v_community_sale_rent.contract as contract ," +
	 			" v_community_sale_rent.file_name as fileName," +
	 			" v_community_sale_rent.path_name as pathName ," +
	 			" v_community_sale_rent.attach_url as attachUrl," +
	 			" v_community_sale_rent.sales_rent_url as salesRentUrl," +
	 			" v_community_sale_rent.attach_seq as attachSeq ," +
	 			" v_community_sale_rent.file_detail as fileDetail," +
	 			" v_community_sale_rent.language_id as languageId" +
	 			" FROM " +
	 			" v_community_sale_rent" +
	 			" WHERE v_community_sale_rent.language_id ="   + languageId + 
	 			" and v_community_sale_rent.community_id = " + commuId +
	 			" order by v_community_sale_rent.community_Sale_Rent_Id  desc "; 

	 	
	 	Session session = sessionFactory.getCurrentSession();
	 	
	 	if(flagFullDetail){
	 	
	 	return  session.createSQLQuery(sql)
	 			.addScalar("communitySaleRentId", StandardBasicTypes.INTEGER)
	 			.addScalar("communityId", StandardBasicTypes.INTEGER)			
	 			.addScalar("salesRentName", StandardBasicTypes.STRING)
	 			.addScalar("communityTypeName", StandardBasicTypes.STRING)
	 			.addScalar("valueAmount", StandardBasicTypes.LONG)
	 			.addScalar("landSpace", StandardBasicTypes.LONG)
	 			.addScalar("liveSpace", StandardBasicTypes.LONG)
	 			.addScalar("bedRoom", StandardBasicTypes.INTEGER)
	 			.addScalar("bathRoom", StandardBasicTypes.INTEGER)
	 			.addScalar("salesRentDetail", StandardBasicTypes.STRING)
	 			.addScalar("exteriorOption", StandardBasicTypes.STRING)
	 			.addScalar("interiorOption", StandardBasicTypes.STRING)
	 			.addScalar("contract", StandardBasicTypes.STRING)	 			
	 			.addScalar("fileName", StandardBasicTypes.STRING)
	 			.addScalar("pathName", StandardBasicTypes.STRING)		 			
	 			.addScalar("attachUrl", StandardBasicTypes.STRING)	 			
	 			.addScalar("salesRentUrl", StandardBasicTypes.STRING)
	 			.addScalar("attachSeq", StandardBasicTypes.INTEGER)	 
	 			.addScalar("fileDetail", StandardBasicTypes.STRING)
	 			.addScalar("languageId", StandardBasicTypes.INTEGER)	 
	 			.setResultTransformer(Transformers.aliasToBean(VCommunitySaleRentId.class))
	 			.list() ;
	 	}else{ return
	 		 session.createSQLQuery(sql)
	 			.addScalar("communitySaleRentId", StandardBasicTypes.INTEGER)
	 			.addScalar("communityId", StandardBasicTypes.INTEGER)			
	 			.addScalar("salesRentName", StandardBasicTypes.STRING)
	 			.addScalar("communityTypeName", StandardBasicTypes.STRING)
	 			.addScalar("valueAmount", StandardBasicTypes.LONG)
	 			.addScalar("landSpace", StandardBasicTypes.LONG)
	 			.addScalar("liveSpace", StandardBasicTypes.LONG)
	 			.addScalar("bedRoom", StandardBasicTypes.INTEGER)
	 			.addScalar("bathRoom", StandardBasicTypes.INTEGER)
	 			.addScalar("salesRentDetail", StandardBasicTypes.STRING)
	 			.addScalar("exteriorOption", StandardBasicTypes.STRING)
	 			.addScalar("interiorOption", StandardBasicTypes.STRING)
	 			.addScalar("contract", StandardBasicTypes.STRING)	 			
	 			.addScalar("fileName", StandardBasicTypes.STRING)
	 			.addScalar("pathName", StandardBasicTypes.STRING)		 			
	 			.addScalar("attachUrl", StandardBasicTypes.STRING)	 			
	 			.addScalar("salesRentUrl", StandardBasicTypes.STRING)
	 			.addScalar("attachSeq", StandardBasicTypes.INTEGER)	 
	 			.addScalar("fileDetail", StandardBasicTypes.STRING)
	 			.addScalar("languageId", StandardBasicTypes.INTEGER)
	 			.setResultTransformer(Transformers.aliasToBean(VCommunitySaleRentId.class))
 			 	.setFirstResult(0)
 			 	.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
 			 	//.setFirstResult(HaakConst.SHOW_BLOG_LIMIT_ROW)
 			 	.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW)			

	 			.list() ;
	 	
	 	}
 }
 

 
 public List<VCommunityLifestyle> loadLifeStyle (int commuId ,int languageId ,boolean flagFullDetail) {
	 	
		
  	Criteria sess = sessionFactory.getCurrentSession().createCriteria(VCommunityLifestyle.class) ;
  	sess.add(Restrictions.eq("communityId", commuId));
  	 
  	if(flagFullDetail ==false){
  			sess.setFirstResult(0)
 			.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
 			.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW);
  	}
  	 return sess.addOrder(Order.desc("communityLifestyleId")).list();
	 
	/* 	String sql = 
	 			"SELECT" +
					" v_community_lifestyle.community_lifestyle_id as communityLifestyleId, " +
					" v_community_lifestyle.community_id as communityId, " +
					" v_community_lifestyle.lifestyle_name as lifestyleName, " +
					" v_community_lifestyle.distance_from_HOA as distanceFromHoa , " +
					" v_community_lifestyle.lifestyle_url as lifestyleUrl, " +
					" v_community_lifestyle.lifestyle_google_map as lifestyleGoogleMap, " +
					" v_community_lifestyle.lifestyle_detail as lifestyleDetail, " +
					" v_community_lifestyle.lifestyle_link as lifestyleLink, " +
					" v_community_lifestyle.google_map_latitude as googleMapLatitude, " +
					" v_community_lifestyle.google_map_longtitude as googleMapLongtitude, " +
					" v_community_lifestyle.google_map_url as googleMapUrl, " +
					" v_community_lifestyle.lifestyle_id as lifestyleId, " +
					" v_community_lifestyle.file_name as fileName, " +
					" v_community_lifestyle.path_name as pathName , " +
					" v_community_lifestyle.file_detail as fileDetail , " +
					" v_community_lifestyle.attach_url as attachUrl, " +
					" v_community_lifestyle.language_id as languageId, " +
					" v_community_lifestyle.lifestyle_type_name as lifestyleTypeName, " +
					" v_community_lifestyle.link_id linkId " +
					" FROM " +
					" v_community_lifestyle " ; 

	 	
	 	Session session = sessionFactory.getCurrentSession();
	 	
	 	if(flagFullDetail){
	 	
	 	return  session.createSQLQuery(sql)
	 			.addScalar("communityLifestyleId", StandardBasicTypes.INTEGER)
	 			.addScalar("communityId", StandardBasicTypes.INTEGER)			
	 			.addScalar("lifestyleName", StandardBasicTypes.STRING)
	 			.addScalar("distanceFromHoa", StandardBasicTypes.LONG)
	 			.addScalar("lifestyleUrl", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleGoogleMap", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleDetail", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleLink", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLatitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLongtitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapUrl", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleId", StandardBasicTypes.INTEGER)
	 			.addScalar("fileName", StandardBasicTypes.STRING)	 			
	 			.addScalar("pathName", StandardBasicTypes.STRING)
	 			.addScalar("fileDetail", StandardBasicTypes.STRING)		 			
	 			.addScalar("attachUrl", StandardBasicTypes.STRING)	 			
	 			.addScalar("lifestyleTypeName", StandardBasicTypes.STRING)
	 			.addScalar("languageId", StandardBasicTypes.INTEGER)	
	 			.addScalar("linkId", StandardBasicTypes.INTEGER)	 
	 			.setResultTransformer(Transformers.aliasToBean(VCommunityLifestyleId.class))
	 			.list() ;
	 	}else{	 	return  session.createSQLQuery(sql)
	 			.addScalar("communityLifestyleId", StandardBasicTypes.INTEGER)
	 			.addScalar("communityId", StandardBasicTypes.INTEGER)			
	 			.addScalar("lifestyleName", StandardBasicTypes.STRING)
	 			.addScalar("distanceFromHoa", StandardBasicTypes.LONG)
	 			.addScalar("lifestyleUrl", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleGoogleMap", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleDetail", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleLink", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLatitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLongtitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapUrl", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleId", StandardBasicTypes.INTEGER)
	 			.addScalar("fileName", StandardBasicTypes.STRING)	 			
	 			.addScalar("pathName", StandardBasicTypes.STRING)
	 			.addScalar("fileDetail", StandardBasicTypes.STRING)		 			
	 			.addScalar("attachUrl", StandardBasicTypes.STRING)	 			
	 			.addScalar("lifestyleTypeName", StandardBasicTypes.STRING)
	 			.addScalar("languageId", StandardBasicTypes.INTEGER)	
	 			.addScalar("linkId", StandardBasicTypes.INTEGER)	 
	 			.setResultTransformer(Transformers.aliasToBean(VCommunityLifestyleId.class))
	 			.list() ;
	 	}*/
 }
 

 
 public List<VCommnunityOpportunitiesId> loadOppo (int commuId ,int languageId ,boolean flagFullDetail) {
	 	
	 	String sql = 
	 			
	 			" SELECT "+
	 			" v_commnunity_opportunities.opp_category_id as  oppCategoryId ,"+
	 			" v_commnunity_opportunities.opp_sub_category_id as oppSubCategoryId  ,"+
	 			" v_commnunity_opportunities.community_opp_id as communityOppId  ,"+
	 			" v_commnunity_opportunities.community_id as communityId  ,"+
	 			" v_commnunity_opportunities.opp_seq as  oppSeq ,"+
	 			" v_commnunity_opportunities.fg_public as fgPublic  ,"+
	 			" v_commnunity_opportunities.opp_detail as oppDetail  ,"+
	 			" v_commnunity_opportunities.opp_contact as  oppContact ,"+
	 			" v_commnunity_opportunities.opp_link as  oppLink ,"+
	 			" v_commnunity_opportunities.opp_url as  oppUrl ,"+
	 			" v_commnunity_opportunities.opp_google_map as oppGoogleMap  ,"+
	 			" v_commnunity_opportunities.google_map_latitude as googleMapLatitude  ,"+
	 			" v_commnunity_opportunities.google_map_longtitude as googleMapLongtitude  ,"+
	 			" v_commnunity_opportunities.google_map_url as googleMapUrl  ,"+
	 			" v_commnunity_opportunities.opp_category_name as oppCategoryName  ,"+
	 			" v_commnunity_opportunities.opp_sub_category_name as oppSubCategoryName  ,"+
	 			" v_commnunity_opportunities.language_id as languageId "+
	 			" FROM " +
	 			" v_commnunity_opportunities "+ 
	 			" where v_commnunity_opportunities.language_id = " + languageId+ 
	 			" and v_commnunity_opportunities.community_id = " +commuId +
	 			" order by v_commnunity_opportunities.community_opp_id desc ";
	 	

	 	
	 	Session session = sessionFactory.getCurrentSession();
	 	
	 	if(flagFullDetail){
	 	
	 	return  session.createSQLQuery(sql)
	 			.addScalar("oppCategoryId", StandardBasicTypes.INTEGER)
	 			.addScalar("oppSubCategoryId", StandardBasicTypes.INTEGER)			
	 			
	 			.addScalar("communityOppId", StandardBasicTypes.INTEGER)
	 			.addScalar("communityId", StandardBasicTypes.INTEGER)		
	 			.addScalar("oppSeq", StandardBasicTypes.INTEGER)

	 			
	 			.addScalar("fgPublic", StandardBasicTypes.STRING)
	 			.addScalar("oppDetail", StandardBasicTypes.STRING)
	 			.addScalar("oppContact", StandardBasicTypes.STRING)
	 			.addScalar("oppLink", StandardBasicTypes.STRING)
	 			.addScalar("oppUrl", StandardBasicTypes.STRING)
	 			.addScalar("oppGoogleMap", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLatitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLongtitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapUrl", StandardBasicTypes.INTEGER)
	 			.addScalar("oppCategoryName", StandardBasicTypes.STRING)	 			
	 			.addScalar("oppSubCategoryName", StandardBasicTypes.STRING)

	 			.addScalar("languageId", StandardBasicTypes.INTEGER)	
	 
	 			.setResultTransformer(Transformers.aliasToBean(VCommnunityOpportunitiesId.class))
	 			.list() ;
	 	}else{	 		 	return  session.createSQLQuery(sql)
	 			.addScalar("oppCategoryId", StandardBasicTypes.INTEGER)
	 			.addScalar("oppSubCategoryId", StandardBasicTypes.INTEGER)			
	 			
	 			.addScalar("communityOppId", StandardBasicTypes.INTEGER)
	 			.addScalar("communityId", StandardBasicTypes.INTEGER)		
	 			.addScalar("oppSeq", StandardBasicTypes.INTEGER)

	 			
	 			.addScalar("fgPublic", StandardBasicTypes.STRING)
	 			.addScalar("oppDetail", StandardBasicTypes.STRING)
	 			.addScalar("oppContact", StandardBasicTypes.STRING)
	 			.addScalar("oppLink", StandardBasicTypes.STRING)
	 			.addScalar("oppUrl", StandardBasicTypes.STRING)
	 			.addScalar("oppGoogleMap", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLatitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLongtitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapUrl", StandardBasicTypes.INTEGER)
	 			.addScalar("oppCategoryName", StandardBasicTypes.STRING)	 			
	 			.addScalar("oppSubCategoryName", StandardBasicTypes.STRING)

	 			.addScalar("languageId", StandardBasicTypes.INTEGER)	
	 
	 			.setResultTransformer(Transformers.aliasToBean(VCommnunityOpportunitiesId.class))
	 			.setFirstResult(0)
 			 	.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
 			 	//.setFirstResult(HaakConst.SHOW_BLOG_LIMIT_ROW)
 			 	.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW)		
	 			.list() ;
	 	}
 }
 
 

 
 public List<VCommunityNewsId> getBlogNews (int commuId  ,boolean flagFullDetail) {
	 	
	 	String sql = 
	 			
	 			" SELECT "+
				" v_community_news.community_new_id as communityNewId  ,"+
				" v_community_news.fg_public as  fgPublic ,"+
				" v_community_news.community_id as communityId  ,"+
				" v_community_news.new_seq as newSeq ,"+
				" v_community_news.new_subject as newSubject  ,"+
				" v_community_news.new_detail as newDetail  ,"+
				" v_community_news.lifestyle_link as lifestyleLink  ,"+
				" v_community_news.lifestyle_url as  lifestyleUrl ,"+
				" v_community_news.lifestyle_google_map as  lifestyleGoogleMap ,"+
				" v_community_news.google_map_latitude as  googleMapLatitude ,"+
				" v_community_news.google_map_longtitude as googleMapLongtitude  ,"+
				" v_community_news.google_map_url   as googleMapUrl ,"+
				" v_community_news.create_by   as createBy ,"+
			    " v_community_news.create_date   as createDate ,"+
			    " v_community_news.from_source   as fromSource "+
				" FROM " + 
				" v_community_news " +
				" where v_community_news .fg_public = 'Y'  " + 
				" union all " +
	 			" SELECT "+
				" v_community_news.community_new_id as communityNewId  ,"+
				" v_community_news.fg_public as  fgPublic ,"+
				" v_community_news.community_id as communityId  ,"+
				" v_community_news.new_seq as newSeq ,"+
				" v_community_news.new_subject as newSubject  ,"+
				" v_community_news.new_detail as newDetail  ,"+
				" v_community_news.lifestyle_link as lifestyleLink  ,"+
				" v_community_news.lifestyle_url as  lifestyleUrl ,"+
				" v_community_news.lifestyle_google_map as  lifestyleGoogleMap ,"+
				" v_community_news.google_map_latitude as  googleMapLatitude ,"+
				" v_community_news.google_map_longtitude as googleMapLongtitude  ,"+
				" v_community_news.google_map_url   as googleMapUrl ,"+
				" v_community_news.create_by   as createBy ,"+
			    " v_community_news.create_date   as createDate ,"+
			    " v_community_news.from_source   as fromSource "+
				" FROM " + 
				" v_community_news " +
				" where v_community_news .community_id = " +commuId+ 
				" and  v_community_news .fg_public = 'N' ";

	 	
	 	Session session = sessionFactory.getCurrentSession();
	 	
	 	if(flagFullDetail){
	 	
	 	return  session.createSQLQuery(sql)
	 			.addScalar("communityNewId", StandardBasicTypes.INTEGER)
	 			.addScalar("fgPublic", StandardBasicTypes.STRING)			
	 			
	 			.addScalar("communityId", StandardBasicTypes.INTEGER)
	 			.addScalar("newSeq", StandardBasicTypes.INTEGER)		
     			.addScalar("newSubject", StandardBasicTypes.STRING)
	 			.addScalar("newDetail", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleLink", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleUrl", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleGoogleMap", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLatitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLongtitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapUrl", StandardBasicTypes.STRING)
	 			.addScalar("createBy", StandardBasicTypes.INTEGER)
	 			.addScalar("fromSource", StandardBasicTypes.STRING)
	 			.addScalar("createDate", StandardBasicTypes.DATE)	 			
	 			.setResultTransformer(Transformers.aliasToBean(VCommunityNewsId.class))
	 			.list() ;
	 	}else{	 		 	 	
	 		return  session.createSQLQuery(sql)
	 			.addScalar("communityNewId", StandardBasicTypes.INTEGER)
	 			.addScalar("fgPublic", StandardBasicTypes.STRING)	 			
	 			.addScalar("communityId", StandardBasicTypes.INTEGER)
	 			.addScalar("newSeq", StandardBasicTypes.INTEGER)		
     			.addScalar("newSubject", StandardBasicTypes.STRING)
	 			.addScalar("newDetail", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleLink", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleUrl", StandardBasicTypes.STRING)
	 			.addScalar("lifestyleGoogleMap", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLatitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapLongtitude", StandardBasicTypes.STRING)
	 			.addScalar("googleMapUrl", StandardBasicTypes.STRING)
	 			.addScalar("createBy", StandardBasicTypes.INTEGER)
	 			.addScalar("fromSource", StandardBasicTypes.STRING)
	 			.addScalar("createDate", StandardBasicTypes.DATE)	 		 			
	 			.setResultTransformer(Transformers.aliasToBean(VCommunityNewsId.class))
 		 		.setFirstResult(0)
 			 	.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
 			 	.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW)
	 			.list() ;
	 	}
 }
 
 

 
 public List<VInboxWorklistId> getInbox (int commuId  , String roleIDCondition , boolean userFlag, String userName , boolean flagFullDetail) {
	 	
	 	String sql = 
	 			
	 			" SELECT  "+
				" v_inbox_worklist.worklist_type_name as  worklistTypeName ,"+
				" v_inbox_worklist.worklist_name as  worklistName ,"+
				" v_inbox_worklist.worklist_detail as worklistDetail  ,"+
				" v_inbox_worklist.from_user_name as fromUserName  ,"+
				" v_inbox_worklist.from_name as fromName  ,"+
				" v_inbox_worklist.from_email as fromEmail  ,"+
				" v_inbox_worklist.to_user_name as  toUserName ,"+
				" v_inbox_worklist.worklist_subject_name as  worklistSubjectName ,"+
				" v_inbox_worklist.community_id as communityId  ,"+
				" v_inbox_worklist.role_id as roleId  ,"+
				" v_inbox_worklist.fg_public as fgPublic  ,"+
				" v_inbox_worklist.Worklist_Id as worklistId ,"+
				" v_inbox_worklist.worklist_status_id as worklistStatusId "+
				" FROM "+
				" v_inbox_worklist " + 
				" WHERE v_inbox_worklist.community_id = " +commuId ;
				if(userFlag){
					sql +=" and v_inbox_worklist.to_user_name = '"+ userName +"'";					
				}else{
					sql +=" and v_inbox_worklist.role_id in " + roleIDCondition ;
				}
				 
				
				

	 	
	 	Session session = sessionFactory.getCurrentSession();
	 	
	 	
	 	return  session.createSQLQuery(sql)
	 			.addScalar("worklistTypeName", StandardBasicTypes.STRING)
	 			.addScalar("worklistName", StandardBasicTypes.STRING)			
	 			
	 			.addScalar("worklistDetail", StandardBasicTypes.STRING)
	 			.addScalar("fromUserName", StandardBasicTypes.STRING)		
     			.addScalar("fromName", StandardBasicTypes.STRING)
	 			.addScalar("fromEmail", StandardBasicTypes.STRING)
	 			.addScalar("toUserName", StandardBasicTypes.STRING)
	 			.addScalar("worklistSubjectName", StandardBasicTypes.STRING)
	 			
	 			.addScalar("communityId", StandardBasicTypes.INTEGER)
	 			.addScalar("roleId", StandardBasicTypes.INTEGER)
	 			.addScalar("fgPublic", StandardBasicTypes.STRING)
	 			.addScalar("worklistStatusId", StandardBasicTypes.INTEGER)
	 			.addScalar("worklistId", StandardBasicTypes.INTEGER)
	 			
	 			.setResultTransformer(Transformers.aliasToBean(VInboxWorklistId.class))
	 			.list() ;
 }
 

 
 //public List<VInboxByUser> getInboxByUser (Object[] roleId , int userId  ,  boolean flagFullDetail) {
 		public List<VInboxByUser> getInboxByUser (Object[] roleId , int addressID  ,  boolean flagFullDetail) {
 			
 		
 		if(roleId==null){
 			
 	 		if(flagFullDetail){
					return  sessionFactory.getCurrentSession().createCriteria(VInboxByUser.class)
		 			//.add(Restrictions.eq("userId", userId)).list();
		 			.add(Restrictions.eq("addressId", addressID))
		 			.addOrder(Order.desc("id")) 		 			
		 			.list();
			
		}	else {
			return  sessionFactory.getCurrentSession().createCriteria(VInboxByUser.class)
		 			//.add(Restrictions.eq("userId", userId)).list();
		 			.add(Restrictions.eq("addressId", addressID))
		 			.addOrder(Order.desc("id"))
		 			.setFirstResult(0)
			 		.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
			 		.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW)
		 			.list();
			
		}

 		}
 			
 			
 		if(flagFullDetail){
 					return  sessionFactory.getCurrentSession().createCriteria(VInboxByUser.class)
 		 			//.add(Restrictions.eq("userId", userId)).list();
 		 			.add(Restrictions.or(Restrictions.eq("addressId", addressID) ,Restrictions.in("roleId",roleId )))
 		 			.addOrder(Order.desc("id")) 		 			
 		 			.list();
 			
 		}	else {
 			return  sessionFactory.getCurrentSession().createCriteria(VInboxByUser.class)
 		 			//.add(Restrictions.eq("userId", userId)).list();
 		 			.add(Restrictions.or(Restrictions.eq("addressId", addressID) ,Restrictions.in("roleId",roleId )))
 		 			.addOrder(Order.desc("id"))
 		 			.setFirstResult(0)
 			 		.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
 			 		.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW)
 		 			.list();
 			
 		}
	 	
	 	
 }
 


 		
 		public List<CommunityNew> getNewsCommunity( int commuID   ,  boolean flagFullDetail ,int lanuageID ,boolean flagLogin) {
 			
		  	 VCommunity vCommu =  this.loadCommunityDeatils(commuID, lanuageID); 
		  	Criteria sess = sessionFactory.getCurrentSession().createCriteria(CommunityNew.class) ;
		  	sess.add(Restrictions.eq("communityId", commuID));
		  	
		  	 if(flagLogin){
		  		 sess.add(Restrictions.in("fgPublic", new String[]{ HaakConst.FLAG_PUBLIC,HaakConst.FLAG_PRIVATE}));     
		  		 
		  	 }else{
		  		sess.add(Restrictions.eq("fgPublic", HaakConst.FLAG_PUBLIC));
		  	 }
		  	 
		  	if(flagFullDetail ==false){
		  			sess.setFirstResult(0)
		 			.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
		 			.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW);
		  	}
		  	 return sess.addOrder(Order.desc("communityNewId")).list();

		}

 		

 		
 		public List<CommunityNew> getNewsGeneral( int commuID  ,  boolean flagFullDetail ,int lanuageID) {
 			
 		  	 VCommunity vCommu =  this.loadCommunityDeatils(commuID, lanuageID);
 			if(flagFullDetail){
 				return  sessionFactory.getCurrentSession().createCriteria(CommunityNew.class)
 						.add(Restrictions.eq("communityId", 0))
 						//.add(Restrictions.eq("fgOpen", vCommu.getFgOpen()))     
 						.add(Restrictions.in("fgOpen", new String[]{ HaakConst.FLAG_COMMUNITY_TYPE_BOTH,vCommu.getFgOpen() }))
 			 			.addOrder(Order.desc("communityNewId"))
 			 			.list();
			}else{
					return  sessionFactory.getCurrentSession().createCriteria(CommunityNew.class)
	 						.add(Restrictions.eq("communityId", 0))							
							.add(Restrictions.in("fgOpen", new String[]{ HaakConst.FLAG_COMMUNITY_TYPE_BOTH,vCommu.getFgOpen() }))    
	 			 			.addOrder(Order.desc("communityNewId"))
 			 			.setFirstResult(0)
 			 			.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
 			 			.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW) 	 			 			
	 			 			.list();	
			}

 		}
 
 
 		
 		
 		public List<VTaskManager> getTaskManager ( int commuID  , boolean flagPublic ,  boolean flagFullDetail) {
 			String PUBLIC = "Y";
 			if(flagPublic == false){
 				PUBLIC = "N";
 			}
 			
 			if(flagFullDetail){
 				System.out.print("FROM BLOG");
 			 	return  sessionFactory.getCurrentSession().createCriteria(VTaskManager.class)
 			 			.add(Restrictions.eq("communityId", commuID))
 			 			.add(Restrictions.eq("fgPublic", PUBLIC))     
 			 			.addOrder(Order.desc("worklistId"))
 			 			.list();
 			 			
 				
 			}else{
 				System.out.print("FROM HOME");
 				return  sessionFactory.getCurrentSession().createCriteria(VTaskManager.class)
 			 			.add(Restrictions.eq("communityId", commuID))
 			 			.add(Restrictions.eq("fgPublic", PUBLIC))    
 			 			.addOrder(Order.desc("worklistId"))
 			 			.setFirstResult(0)
 			 			.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
 			 			//.setFirstResult(HaakConst.SHOW_BLOG_LIMIT_ROW)
 			 			.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW)
 			 			.list(); 	
 			}

 }
 
 


 		public List<CommunityContractNumber> getContractNumber( int commuID   ,  boolean flagFullDetail ,int lanuageID) {
 			
		  	 VCommunity vCommu =  this.loadCommunityDeatils(commuID, lanuageID); 
		  	Criteria sess = sessionFactory.getCurrentSession().createCriteria(CommunityContractNumber.class) ;
		  	sess.add(Restrictions.eq("communityId", commuID));
		  	if(flagFullDetail ==false){
		  			sess.setFirstResult(0)
		 			.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
		 			.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW);
		  	}
		  	 return sess.addOrder(Order.asc("contractNumberCategoryId")).list();

		}
 		
 
 		public List<VCommunityResource> getResource( int commuID   ,  boolean flagFullDetail ,int lanuageID ,boolean flagLogin) {
 			
		  	 VCommunity vCommu =  this.loadCommunityDeatils(commuID, lanuageID); 
		  	Criteria sess = sessionFactory.getCurrentSession().createCriteria(VCommunityResource.class) ;
		  	sess.add(Restrictions.eq("communityId", commuID));
		  	
		  	 if(flagLogin){
		  		 sess.add(Restrictions.in("fgPublic", new String[]{ HaakConst.FLAG_PUBLIC,HaakConst.FLAG_PRIVATE}));     
		  		 
		  	 }else{
		  		sess.add(Restrictions.eq("fgPublic", HaakConst.FLAG_PUBLIC));
		  	 }
		  	 
		  	if(flagFullDetail ==false){
		  			sess.setFirstResult(0)
		 			.setMaxResults(HaakConst.SHOW_BLOG_LIMIT_ROW)
		 			.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW);
		  	}
		  	 return sess.addOrder(Order.desc("communityResourceId")).list();

		}
 		
 		public SmsCredit loadSmsCredit(int commuId) {
 		 	return (SmsCredit)sessionFactory.getCurrentSession().createCriteria(SmsCredit.class)
 		 			//.add(Restrictions.eq("userId", userId)).list();
 		 			.add(Restrictions.eq("communityId", commuId))
 		 			
 		 			.uniqueResult();
 		 			
 				
 		    }
 		
 		public List<VModuleSubmenu> getUserPrivilege(int commuId,Object[] role  ) {
 		 	return sessionFactory.getCurrentSession().createCriteria(VModuleSubmenu.class)
 		 			//.add(Restrictions.eq("userId", userId)).list();
 		 			.add(Restrictions.eq("communityId", commuId))
 		 			.add(Restrictions.in ("roleId", role))
 		 			.list();
 		 			
 				
 		    }

 		public List<CommunityLifestyle> getCommunityLifeStyle(int commuId ,int lifeTypeId) {
 			Criteria cc = 	 sessionFactory.getCurrentSession().createCriteria(CommunityLifestyle.class);
 			if(lifeTypeId==0){
		 			return cc.add(Restrictions.eq("communityId", commuId))
		 					.addOrder(Order.desc("communityLifestyleId")).list();
		 			
 			}else
 		 			        cc.add(Restrictions.eq("lifestyleTypeId", lifeTypeId));
 				return cc.add(Restrictions.eq("communityId", commuId))
 						.addOrder(Order.desc("communityLifestyleId")).list();
 				
 		    }





}
