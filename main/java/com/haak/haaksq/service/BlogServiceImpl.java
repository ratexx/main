package com.haak.haaksq.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.haak.haaksq.dao.BlogDAO;
import com.haak.haaksq.form.BlogBOD;
import com.haak.haaksq.form.BlogCommunity;
import com.haak.haaksq.form.BlogContact;
import com.haak.haaksq.form.CommunityLifestyle;
import com.haak.haaksq.form.Contact;
import com.haak.haaksq.form.TrnPostReply;
import com.haak.haaksq.form.VBoardStructureId;


@Service
public class BlogServiceImpl implements BlogService{
	
	
    @Autowired
    private BlogDAO BlogDAO ;
    
    @Transactional
    public BlogCommunity getBlogCommunity(int communityId ,int lanuageId,boolean fullDetail) {
 	  return BlogDAO.getBlogCommunity( communityId , lanuageId,fullDetail) ;
    }

    @Transactional
    public  BlogContact getBlogContactForm(int packageId ,int lanuageId,boolean fullDetail) {
 	  return BlogDAO.getBlogContacty( packageId , lanuageId,fullDetail) ;
    }
    
    @Transactional
    public  BlogBOD getBlogBOD(int packageId ,int lanuageId,boolean fullDetail) {
 	  return BlogDAO.getBlogBOD( packageId , lanuageId,fullDetail) ;
    }    
    
    @Transactional
    public List<VBoardStructureId> getBOD(int commuID , int lanuageId,boolean fullDetail){
 	  return BlogDAO.getBOD(commuID, lanuageId, fullDetail) ;
    }
    
    @Transactional
    public void postMsg(TrnPostReply trnPostReply) {
    	BlogDAO.postMsg(trnPostReply);
    }
    
    @Transactional
    public void postMsgMaster(TrnPostReply trnPostReply) {
    	BlogDAO.saveUpdateParentEqualID(trnPostReply);

    }
    
    @Transactional
    public List<TrnPostReply> getPostLifeStyleAll(TrnPostReply trnPostReply,int maxRow) {
    	
    	return  BlogDAO.getPostLifeStyle(trnPostReply,maxRow,0);
    }
    
    @Transactional
    public List<TrnPostReply> getPostLifeStyle(TrnPostReply trnPostReply,int maxRow) {
    	 
    	List<TrnPostReply> tmpList = new ArrayList<TrnPostReply>();
    	tmpList.addAll(BlogDAO.getPostLifeStyle(trnPostReply,maxRow,1));
    	tmpList.addAll(BlogDAO.getPostLifeStyle(trnPostReply,maxRow,2));
    	return  tmpList;
    }
    
    @Transactional
	public void saveCommunityLifeStyle(CommunityLifestyle communityLifestyle){
	   	BlogDAO.saveCommunityLifeStyle(communityLifestyle);
	   	
   }  
    @Transactional
    public void saveTrnPostReply(TrnPostReply trnPostReply) {
    	BlogDAO.saveTrnPostReply(trnPostReply);
    }
    
    @Transactional
    public CommunityLifestyle getCommunityLifestyle(int lifeStyleID ) {
 	  return BlogDAO.getCommunityLifestyle( lifeStyleID) ;
    }
    
    @Transactional
    public List<TrnPostReply> getStreamLine(int commuId ,Long lastID) {
    	return BlogDAO.getStreamLine(commuId,lastID);
    }

    
}
