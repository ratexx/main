package com.haak.haaksq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

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
 
public interface ContactService {
 
    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
    public List<Contact> getContact();
    public List<BlogNews> getBlogNews(String commuId) ;
    public List<VAboutId>  getBlogCommuDetailsFull(String commuId) ;  
    public List<MstWorklistSubject> getContactFormSubject(int commuId ,boolean publicFlag) ;
    public String saveWorklist(Worklist2 worklist) ;
    public void replyInboxByID(int id,String jobDetails, int userReply);
    public Worklist2 loadInboxItem(int id);
    public VInboxByUser getInboxDetailByID (int id) ;
    public VTaskManager getTaskManagerDetailByID ( int id);
    
    public List<MstRole> getMasRole() ;
    public List<VSmsemailProfiles> getUserForReceiver(Integer[] commuId , Integer[] roleId);
    public List<VUserDetailImg> getUserImgDetails(int commuId,boolean flagFullDetail ) ;
}
