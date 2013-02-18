package com.haak.haaksq.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.haak.haaksq.form.Address;
import com.haak.haaksq.form.AttachFile;
import com.haak.haaksq.form.CacheM;
import com.haak.haaksq.form.CommunityAddress;
import com.haak.haaksq.form.CommunityNew;
import com.haak.haaksq.form.PageInPutUser;
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


@Repository
public class AdminAddDAOImpl implements AdminAddDAO{
	
	
    @Autowired
    private SessionFactory sessionFactory;
    

    public void saveCommunityNews(CommunityNew commuNews){
      	
    	sessionFactory.getCurrentSession().save(commuNews);   	
    }
    
    public void deleteUser(UserProfile userProfile){
      	
    	sessionFactory.getCurrentSession().delete(userProfile);   	
    }
    
    public void saveUser(UserProfile userProfile){
      	
    	sessionFactory.getCurrentSession().save(userProfile);   	
    }

    public void saveNews(CommunityNew commuNews){
      	
    	sessionFactory.getCurrentSession().save(commuNews);   	
    }
    
    public void saveAddress(Address address){   	
    	sessionFactory.getCurrentSession().save(address);  	
    	
    }

    public void saveAttach(AttachFile attachFile){   	
    	sessionFactory.getCurrentSession().save(attachFile);  	
    	
    }
    

    public void saveAttach(UserRole userRole){   	
    	sessionFactory.getCurrentSession().save(userRole);  	
    	
    }    
    
    public void saveCommuAd(CommunityAddress commuAdd){   	
    	sessionFactory.getCurrentSession().save(commuAdd);  	
    	
    }   
    
public void updateCommuAddress(CommunityAddress commuAdd){
      	
    	sessionFactory.getCurrentSession().update(commuAdd);   	
    }    
    
public void updateUser(UserProfile userProfile){
      	
    	sessionFactory.getCurrentSession().update(userProfile);   	
    }
    
public UserProfile loadUserProfile(int user){   	
	return (UserProfile)sessionFactory.getCurrentSession().createCriteria(UserProfile.class)
			.add(Restrictions.eq("userId", user))
			//.add(Restrictions.eq("languageId",lanuage_id))
			.uniqueResult();  	
	
}   


public CommunityAddress loadCommuAddress(int addressID){   	
	return (CommunityAddress)sessionFactory.getCurrentSession().createCriteria(CommunityAddress.class)
			.add(Restrictions.eq("addressId", addressID))
			//.add(Restrictions.eq("languageId",lanuage_id))
			.uniqueResult();  	
	
}   


    public VUserProfile loadUserDetails(int user,int lanuage_id){   	
    	return (VUserProfile)sessionFactory.getCurrentSession().createCriteria(VUserProfile.class)
    			.add(Restrictions.eq("userId", user))
    			.add(Restrictions.eq("languageId",lanuage_id))
    			.uniqueResult();  	
    	
    }   
    
    
   public List<CacheM> getCacheM(String  columnValue ,String columnName , String tableName ,String where) {
    	
    	String sql =   " select  " +
    						columnName + " as name ," +
    						columnValue + "  as value " +
    						" from " + tableName + where; 
    						
    	Session session = sessionFactory.getCurrentSession();
    	return session.createSQLQuery(sql)   			
    			.addScalar("name", StandardBasicTypes.STRING)
    			.addScalar("value", StandardBasicTypes.STRING)
    			.setResultTransformer(Transformers.aliasToBean(CacheM.class)).list() ;    	
    	
    			    	
    }
   
   public List<UserProfile> getListUser(int community,int roleId){   	
   	
	   if (community ==0){
		   return sessionFactory.getCurrentSession().createCriteria(UserProfile.class)
		   			//.add(Restrictions.eq("communityId", community))
				   .addOrder(Order.asc("communityId"))
		   			.addOrder(Order.asc("userId"))
		   			.list();   
	   }else {
			   return sessionFactory.getCurrentSession().createCriteria(UserProfile.class)
			   			.add(Restrictions.eq("communityId", community))
			   			.addOrder(Order.asc("userId"))
			   			.list();   
	   }
   	
   }   
    
   
   public List<UserProfile> getListUser(Object[] user_id ,int community){

	   	return sessionFactory.getCurrentSession().createCriteria(UserProfile.class)
	   			.add(Restrictions.eq("communityId", community))
	   			.add(Restrictions.in("userId", user_id))
	   			.addOrder(Order.asc("userId"))
	   			.list();  	
	   	
	   }   
	public List<Object> getSearchUser(String key) {
		    	String sql =   " select user_id from v_search_user  where v_search_user.key_search like '%"+key+"%' "  ;
		    	Session session = sessionFactory.getCurrentSession();
		    	return (List<Object>)session.createSQLQuery(sql).list();
	  }		

	public void saveSMS(Sms sms ){   	
   	sessionFactory.getCurrentSession().save(sms);     	
   }   
  
   public void saveSmsCredit(SmsCredit smsCredit ){   	
	   	sessionFactory.getCurrentSession().save(smsCredit);  	
   }   
   public void saveSmsHistory(SmsHistory smsHistory){   	
	   	sessionFactory.getCurrentSession().save(smsHistory);  	
   }  
   
   
   public void save_img_stream(StmImg stmImg){	
	   	sessionFactory.getCurrentSession().save(stmImg);  	
   }  
     
   
   
   public void saveSmsTo(SmsTo smsTo){   	
	   	sessionFactory.getCurrentSession().save(smsTo);  	
   }   
   
   public void updateSmsCredit(SmsCredit smsCredit){   	
	   	sessionFactory.getCurrentSession().update(smsCredit);  	
  }   
   
   public List<VResultSendSms> getSMSDetail(int smsId){   	
	   	return sessionFactory.getCurrentSession().createCriteria(VResultSendSms.class)
	   			.add(Restrictions.eq("smsId", smsId))
	   			.addOrder(Order.asc("smsToId"))
	   			.list();  	
	   	
	   }   
    
}
