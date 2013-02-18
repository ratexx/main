package com.haak.haaksq.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.id.IntegralDataTypeHolder;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haak.haaksq.constanst.HaakConst;
import com.haak.haaksq.form.CommunityLifestyle;
import com.haak.haaksq.form.SmsHistory;
import com.haak.haaksq.form.TrnPostReply;
import com.haak.haaksq.form.VBoardStructureId;
import com.haak.haaksq.form.BlogBOD;
import com.haak.haaksq.form.BlogCommunity;
import com.haak.haaksq.form.BlogContact;
import com.haak.haaksq.form.UserProfileForm;

@Repository
public class BlogDAOImpl implements BlogDAO{
	
    @Autowired
    private SessionFactory sessionFactory;

    
    
    
    
   public BlogCommunity getBlogCommunity(int communityId ,int lanuageId,boolean fullDetail) {
    	
    	String sql =   " SELECT "+
    						" v_community.community_id AS communityId," +
							" v_community.community_name AS communityName," +
							" v_community.community_type_name AS communityTypeName," +
							" v_community.province_name AS provinceName," +
							" v_community.amphoe_name AS amphoeName," +
							" v_community.tumbol_name AS tumbolName," +
							//" v_community.file_name AS fileName," +
							//" v_community.file_type_name AS fileTypeName," +
							" v_community.google_map_url AS googleMapUrl," +
							//" v_community.path_name AS pathName," +
							" v_community.file_name as fileName , "+
							"v_community.path_name as pathName, "+
							" v_community.google_map_latitude AS googleMapLatitude," +
							" v_community.google_map_longtitude AS googleMapLongtitude" ;
							if(fullDetail){
								
							}
							
					sql = sql +	" from v_community " +
							" Where v_community.community_id =" +communityId;
    						
    	Session session = sessionFactory.getCurrentSession();
    	
    	return (BlogCommunity)session.createSQLQuery(sql)   			
    			.addScalar("communityId", StandardBasicTypes.INTEGER)
    			.addScalar("communityName", StandardBasicTypes.STRING)
    			.addScalar("communityTypeName", StandardBasicTypes.STRING)
    			.addScalar("provinceName", StandardBasicTypes.STRING)
    			.addScalar("amphoeName", StandardBasicTypes.STRING)
    			.addScalar("tumbolName", StandardBasicTypes.STRING)    		
    			.addScalar("fileName", StandardBasicTypes.STRING)
    			.addScalar("pathName", StandardBasicTypes.STRING)
    			.addScalar("googleMapUrl", StandardBasicTypes.STRING)  
    			.addScalar("googleMapLatitude", StandardBasicTypes.STRING)
    			.addScalar("googleMapLongtitude", StandardBasicTypes.STRING).setMaxResults(1) 
    			.setResultTransformer(Transformers.aliasToBean(BlogCommunity.class)).uniqueResult() ;

    			
    			
    			

   }
        
    	   public BlogContact getBlogContacty(int packageId ,int lanuageId,boolean fullDetail) {
    		   
    		   BlogContact blogContact = new BlogContact();
    		   blogContact.setContactDetail("เธชเธ�เน�เธ�เธ•เธดเธ”เธ•เน�เธญ");
    		   blogContact.setContactURL("ContactForm.htm");
    		   
    		   return blogContact;
    	    	
    	   }

    	   public BlogBOD getBlogBOD(int packageId ,int lanuageId,boolean fullDetail) {
    		   
    		   BlogBOD blogBOD = new BlogBOD();
    		   blogBOD.setBodDetail("เธชเธ�เน�เธ�เธ•เธดเธ”เธ•เน�เธญ");
    		   blogBOD.setBodURL("BOD.htm");
    		   
    		   return blogBOD;
    	    	
    	   }
    	   
    	   public List<VBoardStructureId> getBOD(int commuID , int lanuageId,boolean fullDetail){
    		   
    	    	String sql =   " SELECT " +
    	    			" v_board_structure.position_name as positionName, " +
    	    			" v_board_structure.position_level as positionLevel, " +
    	    			" v_board_structure.community_id as communityId, " +
    	    			" v_board_structure.first_name as firstName, " +
    	    			" v_board_structure.last_name as lastName, " +
    	    			" v_board_structure.user_name as userName, " +
    	    			" v_board_structure.email as email, " +
    	    			" v_board_structure.language_id as languageId, " +
    	    			" v_board_structure.path_name as pathName, " +
    	    			" v_board_structure.file_detail as fileDetail, " +
    	    			" v_board_structure.attach_url as attachUrl, " +
    	    			" v_board_structure.file_name as fileName" +
    	    			" FROM " +
    	    			" v_board_structure " +
    	    			" where v_board_structure.community_id = " + commuID +
    	    			" and v_board_structure.language_id = "+lanuageId ;

						
				Session session = sessionFactory.getCurrentSession();
				
				if(fullDetail){
					return session.createSQLQuery(sql)   			
							.addScalar("positionName", StandardBasicTypes.STRING)
							.addScalar("positionLevel", StandardBasicTypes.INTEGER)
							.addScalar("communityId", StandardBasicTypes.INTEGER)
							.addScalar("firstName", StandardBasicTypes.STRING)
							.addScalar("lastName", StandardBasicTypes.STRING)
							.addScalar("userName", StandardBasicTypes.STRING)
							.addScalar("email", StandardBasicTypes.STRING)
							.addScalar("languageId", StandardBasicTypes.INTEGER)    		
							.addScalar("pathName", StandardBasicTypes.STRING)
							.addScalar("fileDetail", StandardBasicTypes.STRING)
							.addScalar("attachUrl", StandardBasicTypes.STRING)  
							.addScalar("fileName", StandardBasicTypes.STRING)
							//.addScalar("googleMapLongtitude", StandardBasicTypes.STRING).setMaxResults(1) 
							.setResultTransformer(Transformers.aliasToBean(VBoardStructureId.class)).list() ;
				}else{
					return session.createSQLQuery(sql)   			
							.addScalar("positionName", StandardBasicTypes.STRING)
							.addScalar("positionLevel", StandardBasicTypes.INTEGER)
							.addScalar("communityId", StandardBasicTypes.INTEGER)
							.addScalar("firstName", StandardBasicTypes.STRING)
							.addScalar("lastName", StandardBasicTypes.STRING)
							.addScalar("userName", StandardBasicTypes.STRING)
							.addScalar("email", StandardBasicTypes.STRING)
							.addScalar("languageId", StandardBasicTypes.INTEGER)    		
							.addScalar("pathName", StandardBasicTypes.STRING)
							.addScalar("fileDetail", StandardBasicTypes.STRING)
							.addScalar("attachUrl", StandardBasicTypes.STRING)  
							.addScalar("fileName", StandardBasicTypes.STRING)
							//.addScalar("googleMapLongtitude", StandardBasicTypes.STRING).setMaxResults(1) 
							.setResultTransformer(Transformers.aliasToBean(VBoardStructureId.class)).list() ;
				}
					
    	   } 
    	   
    	   
    	   
    		public List<TrnPostReply> getPostLifeStyle(TrnPostReply trnPostReply,int maxRow,int parentFlag) {
    			/**
    			 * parentFlag  0 : All 
    			 * parentFlag  1 : Parent Only
    			 * parentFlag  2 : child only
    			 * */
    			Criteria cs= sessionFactory.getCurrentSession().createCriteria(TrnPostReply.class);
    			
    				//if( trnPostReply.getParentId() != 0)	cs.add(Restrictions.eq("masterFlag",  1));
    				if( trnPostReply.getCommunityId() != 0)	cs.add(Restrictions.eq("communityId", trnPostReply.getCommunityId()));
		 			if( trnPostReply.getCommunityGroup() != 0)	cs.add(Restrictions.eq("communityGroup",trnPostReply.getCommunityGroup()));
		 			//if( trnPostReply.getMasterFlag() != 0)	cs.add(Restrictions.eq("masterFlag",  trnPostReply.getMasterFlag()));
    				if(trnPostReply.getModuleId() != 0)	cs.add(Restrictions.eq("moduleId", trnPostReply.getModuleId()));
		 			if(trnPostReply.getLanguageId() != 0)	cs.add(Restrictions.eq("languageId", trnPostReply.getLanguageId()));
		 			if(maxRow != 0)	cs.setMaxResults(maxRow);
		 			if(parentFlag != 0)	{
		 				if(parentFlag == 1)	{//parent only
		 					cs.add(Restrictions.eqProperty("id", "parentId" ));
		 					cs.addOrder(Order.desc("id"));
		 				}else if(parentFlag == 2){// child only
		 					cs.add(Restrictions.neProperty("id", "parentId" )) ;
		 					cs.addOrder(Order.asc("id"));
		 				}else{
		 					//nothing
		 				}
		 			}
		 			cs.add(Restrictions.eq("masterFlag",  trnPostReply.getMasterFlag()));
		 			cs.add(Restrictions.eq("moduleSubId",  trnPostReply.getModuleSubId()));
		 			cs.add(Restrictions.eq("isDelete", 0));
		 			//cs.addOrder(Order.desc("id"));
     		 	
		  			//cs.setFirstResult(0);
		 			
		 			
		 			//cs.setFetchSize(HaakConst.SHOW_BLOG_LIMIT_ROW);
		 			
    			return cs.list();
     		    }
    	   
    		public void postMsg(TrnPostReply trnPostReply) {
    			
     		 	sessionFactory.getCurrentSession().save(trnPostReply);
     		 	trnPostReply.setParentId(trnPostReply.getId());
     		 	sessionFactory.getCurrentSession().update(trnPostReply);
   		    }

    		public void saveTrnPostReply(TrnPostReply trnPostReply) {
    			sessionFactory.getCurrentSession().save(trnPostReply);
   		    }
    		public void saveUpdateParentEqualID(TrnPostReply trnPostReply) {
    			
    			
    			sessionFactory.getCurrentSession().save(trnPostReply);
    			trnPostReply.setParentId(trnPostReply.getId());
     		 	sessionFactory.getCurrentSession().update(trnPostReply);
   		    }
    		public void saveCommunityLifeStyle(CommunityLifestyle communityLifestyle){   	
    		   	sessionFactory.getCurrentSession().save(communityLifestyle);  	
    	   }  
    		
    		
    	   
    		public CommunityLifestyle getCommunityLifestyle(int lifeStyleID) {
    			Criteria cs= sessionFactory.getCurrentSession().createCriteria(CommunityLifestyle.class);
	 			cs.add(Restrictions.eq("communityLifestyleId", lifeStyleID));
	 			return (CommunityLifestyle)cs.uniqueResult();
     		}

    		public List<TrnPostReply> getStreamLine(int commuId ,Long lastID) {
    			
    			Criteria cs= sessionFactory.getCurrentSession().createCriteria(TrnPostReply.class);
    			if(commuId != 0 )cs.add(Restrictions.eq("communityId", commuId));
    			cs.add(Restrictions.eq("isDelete", 0));
    			cs.add(Restrictions.gt("id",lastID));
	  			cs.setFirstResult(0);
	 			cs.setMaxResults(HaakConst.MAX_STREAM_ROW);
	 			cs.setFetchSize(HaakConst.MAX_STREAM_ROW);
	 			cs.addOrder(Order.desc("id"));
    			
    			return cs.list();
     		}

    
}
