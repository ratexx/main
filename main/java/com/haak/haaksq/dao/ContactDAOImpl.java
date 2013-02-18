package com.haak.haaksq.dao;

import java.util.Iterator;
import java.util.List;

import com.haak.haaksq.constanst.HaakConst;
import com.haak.haaksq.form.BlogNews;
import com.haak.haaksq.form.Contact;
import com.haak.haaksq.form.MstRole;
import com.haak.haaksq.form.MstWorklistSubject;
import com.haak.haaksq.form.VAboutId;
import com.haak.haaksq.form.VInboxByUser;
import com.haak.haaksq.form.VSmsemailProfiles;
import com.haak.haaksq.form.VTaskManager;
import com.haak.haaksq.form.VUserDetailImg;

import com.haak.haaksq.form.Worklist2;

 
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
@Repository
public class ContactDAOImpl implements ContactDAO {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }
 
    public List<Contact> listContact() {
 
        return sessionFactory.getCurrentSession().createQuery("from Contact")
                .list();
    }

    public List<BlogNews> getBlogNews(String commuId) {
    	
    	String sql = "select bn.header ,bn.details from blog_News bn where bn.commu_id =  "+commuId; 
    	Session session = sessionFactory.getCurrentSession();
    	
    	return session.createSQLQuery(sql)
    			.addScalar("header", StandardBasicTypes.STRING)
    			.addScalar("details", StandardBasicTypes.STRING)
    			.setResultTransformer(Transformers.aliasToBean(BlogNews.class)).list();
    	
    	 
    	 /*Session session = sessionFactory.getCurrentSession().createQuery().setResultTransformer(arg0)(arg0);
    	 //for (int i = 0; i < query.list().size(); i++) {
			System.out.println("............."+ query.list().get(i));
    	 }
    	 
    	//return lContact;
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
        */
    	//return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }    
    
    
    public List<VAboutId> getBlogContactDetailsFull(String commuId) {
    
    	
    	
    	String sql = 
    		   " SELECT "+    			
    			" v.community_id as communityId, "+
    			" v.community_name as communityName, "+
    			"v.community_size as communitySize ,"+
    			"v.company_owner as companyOwner,"+
    			"v.start_prise as startPrise,"+
    			"v.end_prise as endPrise ,"+
    			"v.address_id as addressId,"+
    			"v.address_no as addressNo  ,"+
    			"v.soi as soi,"+
    			"v.moo as moo,"+
    			"v.road as road,"+
    			"v.state as state,"+
    			"v.zipcode as zipcode,"+
    			"v.country as country,"+
    			"v.telephone as telephone ,"+
    			"v.mobile as mobile,"+
    			"v.community_type_name as communityTypeName,"+
    			"v.province_id as provinceId ,"+
    			"v.province_name as provinceName,"+
    			"v.amphoe_name as amphoeName ,"+
    			"v.tumbol_name as tumbolName,"+
    			"v.file_type_name as fileTypeName ,"+
    			"v.amphoe_id as  amphoeId, "+
    			"v.file_name as fileName , "+
    			"v.path_Name as pathName"+
    			
    			" FROM "+
    			"v_about  v"+
    		    " WHERE "+
    			" v.community_id =  "+commuId;
    			
   
    	
    	Session session = sessionFactory.getCurrentSession();
    	
   	
    	return session.createSQLQuery(sql)   			
    			.addScalar("communityId", StandardBasicTypes.INTEGER)
    			.addScalar("communityName", StandardBasicTypes.STRING)
    			.addScalar("communitySize", StandardBasicTypes.STRING)
    			.addScalar("companyOwner", StandardBasicTypes.STRING)
    			.addScalar("startPrise", StandardBasicTypes.LONG)
    			.addScalar("endPrise", StandardBasicTypes.LONG)
    			.addScalar("addressId", StandardBasicTypes.INTEGER)
    			.addScalar("addressNo", StandardBasicTypes.STRING)
    			.addScalar("soi", StandardBasicTypes.STRING)
    			.addScalar("moo", StandardBasicTypes.STRING)
    			.addScalar("road", StandardBasicTypes.STRING)
    			.addScalar("state", StandardBasicTypes.STRING)
    			.addScalar("zipcode", StandardBasicTypes.STRING)
    			.addScalar("country", StandardBasicTypes.STRING)
    			.addScalar("telephone", StandardBasicTypes.STRING)
    			.addScalar("mobile", StandardBasicTypes.STRING)
    			.addScalar("communityTypeName", StandardBasicTypes.STRING)
    			.addScalar("provinceId", StandardBasicTypes.STRING)
    			.addScalar("provinceName", StandardBasicTypes.STRING)
    			.addScalar("amphoeName", StandardBasicTypes.STRING)
    			.addScalar("tumbolName", StandardBasicTypes.STRING)
    			.addScalar("fileTypeName", StandardBasicTypes.STRING)
    			.addScalar("amphoeId", StandardBasicTypes.STRING)
    			.addScalar("pathName", StandardBasicTypes.STRING)
    			.addScalar("fileName", StandardBasicTypes.STRING).setResultTransformer(Transformers.aliasToBean(VAboutId.class)).list();
    	
    	 
    	 /*Session session = sessionFactory.getCurrentSession().createQuery().setResultTransformer(arg0)(arg0);
    	 //for (int i = 0; i < query.list().size(); i++) {
			System.out.println("............."+ query.list().get(i));
    	 }
    	 
    	//return lContact;
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
        */
    	//return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }    
    
    
    
    public List<Contact> getContactList() {
    	
    	String sql = "select tt.firstname as firstname from HAAKSQUARE_DB.Contacts as tt"; 
    	Session session = sessionFactory.getCurrentSession();
    	
    	//return session.createSQLQuery(sql).addScalar("firstname", Hibernate.STRING).setResultTransformer(Transformers.aliasToBean(Contact.class)).list();
    	
    	 
    	 /*Session session = sessionFactory.getCurrentSession().createQuery().setResultTransformer(arg0)(arg0);
    	 //for (int i = 0; i < query.list().size(); i++) {
			System.out.println("............."+ query.list().get(i));
    	 }
    	 
    	//return lContact;
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
        */
    	return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }
    
    
    public List<MstWorklistSubject> getContactFormSubject(int commuId ,boolean publicFlag) {
    	
    	String publicCondition = " is not null  ";
    	if(publicFlag){
    		publicCondition = " = ('Y') ";
    	}
    	
    	String sql = "SELECT "+
    			" CONCAT(mst_worklist_subject.worklist_subject_id,'|',mst_worklist_subject.role_id ) as fgPublic  , "+ 
    			" mst_worklist_subject.worklist_subject_name as worklistSubjectName , "+
    			//" mst_worklist_subject.community_id as communityId  , "+
    			" mst_worklist_subject.role_id as roleId   "+
    			//" mst_worklist_subject.fg_public as fgPublic , "+
    			//" mst_worklist_subject.modify_by as modifyBy , "+
    			//" mst_worklist_subject.modify_date as modifyDate , "+
    			//" mst_worklist_subject.create_by as createBy , "+
    			//" mst_worklist_subject.create_date as createDate "+
    			" FROM "+
    			" mst_worklist_subject " +
    			" WHERE mst_worklist_subject.community_id = " + commuId + " and mst_worklist_subject.fg_public " + publicCondition; 
    			;
 
    	Session session = sessionFactory.getCurrentSession();
    	
    	return session.createSQLQuery(sql)
    			//.addScalar("worklistSubjectId", StandardBasicTypes.INTEGER)
    			.addScalar("worklistSubjectName", StandardBasicTypes.STRING)
    			//.addScalar("communityId", StandardBasicTypes.INTEGER)
    			.addScalar("roleId", StandardBasicTypes.INTEGER)
    			.addScalar("fgPublic", StandardBasicTypes.STRING)
    			//.addScalar("modifyBy", StandardBasicTypes.INTEGER)
    			//.addScalar("modifyDate", StandardBasicTypes.DATE)
    			//.addScalar("createBy", StandardBasicTypes.STRING)
    			//.addScalar("createDate", StandardBasicTypes.DATE)
    			.setResultTransformer(Transformers.aliasToBean(MstWorklistSubject.class)).list();
    	
    	 
    }    
    
 
    public void removeContact(Integer id) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(
                Contact.class, id);
        if (null != contact) {
            sessionFactory.getCurrentSession().delete(contact);
        }
 
    }
    
    public void saveWorklist(Worklist2 worklist2) {
    	
    	//WorklistHome wh = new WorklistHome();
        //wh.persist(worklist);
    	sessionFactory.getCurrentSession().save(worklist2);
    }
    

    public Worklist2 getWorkList2ByID(int id) {    	
        return    (Worklist2)sessionFactory.getCurrentSession()
        		.createCriteria(Worklist2.class)
        		.add(Restrictions.eq("id", id))
        		.uniqueResult();
        		
    }    
    public void replyInbox(Worklist2 worklist2) {
        sessionFactory.getCurrentSession().update(worklist2);
    }
    
   public VInboxByUser getInboxDetailByID (int id) {
 			
 		
 					return (VInboxByUser)sessionFactory.getCurrentSession().createCriteria(VInboxByUser.class)
		 			.add(Restrictions.eq("id", id))		 			
		 			.uniqueResult();
			
   }
   
   
	public VTaskManager getTaskManagerDetailByID ( int id) {
			 	return  (VTaskManager)sessionFactory.getCurrentSession().createCriteria(VTaskManager.class)
			 			.add(Restrictions.eq("id", id))     
			 			.uniqueResult();
	} 	
    
	
    public List<MstRole> getMasRole() {
    	return  sessionFactory.getCurrentSession().createCriteria(MstRole.class).list();
    }
	
    public List<VSmsemailProfiles> getUserForReceiver(Integer[] commuId , Integer[] roleId) {    	
        return   sessionFactory.getCurrentSession()
        		.createCriteria(VSmsemailProfiles.class)
        		.add(Restrictions.in("communityId", commuId))
        		.add(Restrictions.in("roleId",roleId))
 			 	.addOrder(Order.desc("userName"))
        		.list();
        		
    }   
    
    
    public List<VUserDetailImg> getUserImgDetails(int commuId,boolean flagFullDetail ) {
			
    		
    		Criteria sess =  sessionFactory.getCurrentSession().createCriteria(VUserDetailImg.class);
			sess.add(Restrictions.eq("communityId", commuId));
			sess.add(Restrictions.eq("fileTypeId", 10));		
		  	if(flagFullDetail ==false){
	  			sess.setFirstResult(0)
	 			.setMaxResults(HaakConst.SHOW_BLOG_IMG_USER)
	 			.setFetchSize(HaakConst.SHOW_BLOG_IMG_USER);
		  	}			
			
		  	
			return sess.addOrder(Order.desc("id.userId")).list(); 
			
}

    
    
    
}