package com.haak.haaksq.service;

import java.util.List;

import com.haak.haaksq.form.BlogBOD;
import com.haak.haaksq.form.BlogCommunity;
import com.haak.haaksq.form.BlogContact;
import com.haak.haaksq.form.CommunityLifestyle;
import com.haak.haaksq.form.TrnPostReply;
import com.haak.haaksq.form.VBoardStructureId;

public interface BlogService {
	public BlogCommunity getBlogCommunity(int communityId ,int lanuageId,boolean fullDetail) ;
	 public  BlogContact getBlogContactForm(int packageId ,int lanuageId,boolean fullDetail) ;
	 public  BlogBOD getBlogBOD(int packageId ,int lanuageId,boolean fullDetail) ;
	 public List<VBoardStructureId> getBOD(int commuID , int lanuageId,boolean fullDetail);
	 
	 public void postMsg(TrnPostReply trnPostReply) ;
	 public void postMsgMaster(TrnPostReply trnPostReply) ;
	 //public List<TrnPostReply> getPostLifeStyle(int groupCommuId,int commuId,int moduleId,int parentId ,int languageId,int masterFlag) ;
	 public List<TrnPostReply> getPostLifeStyleAll(TrnPostReply trnPostReply,int maxRow) ;
	 public List<TrnPostReply> getPostLifeStyle(TrnPostReply trnPostReply,int maxRow) ;
	 public void saveCommunityLifeStyle(CommunityLifestyle communityLifestyle);
	 public void saveTrnPostReply(TrnPostReply trnPostReply) ;
	 public CommunityLifestyle getCommunityLifestyle(int lifeStyleID ) ;
	 
	 public List<TrnPostReply> getStreamLine(int commuId,Long lastID) ;
	 
}
