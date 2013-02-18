package com.haak.haaksq.service;

import java.util.Date;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.haak.haaksq.dao.ContactDAO;
import com.haak.haaksq.dao.MainLoadDAO;
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
 
@Service
public class ContactServiceImpl implements ContactService {
 
	   @Autowired
	    private MainLoadDAO mainLoadtDAO ;
	
    @Autowired
    private ContactDAO contactDAO ;
    private BlogNews blogNews;
 
    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }
 
    @Transactional
    public List<Contact> listContact() {
 
        return contactDAO.listContact();
    }
    
    @Transactional
    public List<Contact> getContact() {
 
        return contactDAO.getContactList();
    }    
    
 
    @Transactional
    public void removeContact(Integer id) {
        contactDAO.removeContact(id);
    }
    
    @Transactional
    public List<BlogNews>  getBlogNews(String commuId) {
        return contactDAO.getBlogNews(commuId);
    }    
    
    @Transactional
    public List<VAboutId>  getBlogCommuDetailsFull(String commuId) {
        return contactDAO.getBlogContactDetailsFull(commuId);
    }       
    
    
    @Transactional
    public List<MstWorklistSubject> getContactFormSubject(int commuId ,boolean publicFlag) {
    	return contactDAO.getContactFormSubject(commuId, publicFlag);
    }
    
    @Transactional
    public String saveWorklist(Worklist2 worklist2) {
    	contactDAO.saveWorklist(worklist2);
    	return "Success";
    }    
    
    @Transactional
    public Worklist2 loadInboxItem(int id){
    	return contactDAO.getWorkList2ByID(id);
    }
    @Transactional
    public VInboxByUser getInboxDetailByID (int id) {
    	return contactDAO.getInboxDetailByID(id);
    }
    
    @Transactional
    public VTaskManager getTaskManagerDetailByID ( int id){
    	return contactDAO.getTaskManagerDetailByID(id);
    }
    
    @Transactional
    public void replyInboxByID(int id,String jobDetails ,int userReply){
    	Worklist2 w2 =	contactDAO.getWorkList2ByID(id);
    	w2.setJobDetails(jobDetails);
    	w2.setWorklistSeq(2);
    	w2.setModifyDate(new Date(System.currentTimeMillis()));
    	w2.setModifyBy(userReply);
    	contactDAO.replyInbox(w2);
    }
    
    @Transactional
    public List<MstRole> getMasRole() {
    	return contactDAO.getMasRole();
    }
    
    @Transactional
    public List<VSmsemailProfiles> getUserForReceiver( Integer[] commuId , Integer[] roleId) {
    	return contactDAO.getUserForReceiver(commuId, roleId);
    }

    
    @Transactional
    public List<VUserDetailImg> getUserImgDetails(int commuId,boolean flagFullDetail ) {
    	return contactDAO.getUserImgDetails(commuId,flagFullDetail ) ;
    }
    
}