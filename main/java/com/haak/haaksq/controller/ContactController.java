package com.haak.haaksq.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.haak.haaksq.constanst.HaakConst;
import com.haak.haaksq.form.BlogNews;
import com.haak.haaksq.form.Contact;
import com.haak.haaksq.form.FormReplyInbox;
import com.haak.haaksq.form.LoginForm;
import com.haak.haaksq.form.UserProfileForm;
import com.haak.haaksq.form.VAboutId;
import com.haak.haaksq.form.Worklist2;
import com.haak.haaksq.service.ContactService;
import com.haak.haaksq.service.LoadPageService;
 
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
 
@Controller
@SessionAttributes({"menuformList","userdetail","adlist"})



public class ContactController {
 
    @Autowired
    private ContactService contactService ;
    
 
    @RequestMapping("/index2")
    public String listContacts(Map<String, Object> map) {
 
        map.put("contact", new Contact());
        map.put("contactList", contactService.listContact());
 
        return "contact";
    }
    
    @RequestMapping("/index")
    public String getContacts(Map<String, Object> map) {
 
        map.put("contact", new Contact());
        map.put("contactList", contactService.getContact());
 
        return "contact";
    }    
 
    
    
    @RequestMapping("/Contact-US.htm")
    public String loadContacts(Map<String, Object> map) {
 
    	String tmp_commu_id = "00001";
    	
        //map.put("contact", new Contact());
        //map.put("contactList", contactService.getContact());
    	map.put("BlogNews", new BlogNews());
    	map.put("loginm", new LoginForm());
        map.put("BlogNewsList", contactService.getBlogNews(tmp_commu_id));
        List<BlogNews>  gg  = contactService.getBlogNews(tmp_commu_id);
        System.out.println("test thai" +gg.get(0).getDetails());
        
 
        return "contract-us";
    }    
    
    
    
    @RequestMapping("/full-Details-Community.htm")
    public String getContactsDetailsFull(Map<String, Object> map) {
 
    	String tmp_commu_id = "1";
    	
        //map.put("contact", new Contact());
        //map.put("contactList", contactService.getContact());
    	map.put("vAboutID", new VAboutId());
        map.put("vAboutIDList", contactService.getBlogCommuDetailsFull(tmp_commu_id));
                
 
        return "fullcommu";
    }       
    
    
    
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact")
    Contact contact, BindingResult result) {
 
        contactService.addContact(contact);
 
        return "redirect:/haaksq/index";
    }
 
    @RequestMapping("/delete/{contactId}")
    public String deleteContact(@PathVariable("contactId")
    Integer contactId) {
 
        contactService.removeContact(contactId);
 
        return "redirect:/haaksq/index";
    }
    
    @RequestMapping("/loadDetailInbox/{id}/{commuId}/{lanuageId}")
    public String loadDetailInbox(@PathVariable("id")
    Integer id,
    @PathVariable("commuId") int commuId,
	@PathVariable("lanuageId") int lanuageId ,
    Map<String, Object> map ,
    @ModelAttribute(value= "userdetail") UserProfileForm userDetail
    ) {
    	

    	
    	
    	FormReplyInbox newFormInbox = new FormReplyInbox();
    	//map .put("inBoxItemDetail",contactService.loadInboxItem(id));
    	map .put("inBoxItemDetail",contactService.getInboxDetailByID(id));
    	map.put("FormReplyInbox", newFormInbox);
    	
    	
    	map.put("commuId", commuId);
		map.put("lanuageId", lanuageId);
        return HaakConst.PAGE_INBOX;
    }    
    


    @RequestMapping("/loadDetailTaskMAnager/{id}/{commuId}/{lanuageId}")
    public String loadDetailTaskManager(@PathVariable("id")
    Integer id,
    @PathVariable("commuId") int commuId,
	@PathVariable("lanuageId") int lanuageId ,
    Map<String, Object> map ,
    @ModelAttribute(value= "userdetail") UserProfileForm userDetail
    ) {
    	

    	
    	
    	FormReplyInbox newFormInbox = new FormReplyInbox();
    	//map .put("inBoxItemDetail",contactService.loadInboxItem(id));
    	map .put("inBoxItemDetail",contactService.getTaskManagerDetailByID(id));
    	map.put("FormReplyInbox", newFormInbox);
    	
    	
    	map.put("commuId", commuId);
		map.put("lanuageId", lanuageId);
        return HaakConst.PAGE_INBOX;
    }    
 
    
    
    @RequestMapping(value = "/UpdateDetailInbox/{id}" , method = RequestMethod.POST )
    public String UpdateDetailInbox(@PathVariable("id")
    Integer id,
    Map<String, Object> map,
    @ModelAttribute("FormReplyInbox") FormReplyInbox fM,
    @ModelAttribute(value= "userdetail") UserProfileForm userDetail
    
    ) {
    	
    	contactService.replyInboxByID(id, fM.getInboxDetails(),userDetail.getUserID());
    	//map .put("inBoxItemDetail",contactService.loadInboxItem(id));
    	return "redirect:/haaksq/home/1/1/1";
        //return HaakConst.PAGE_INBOX;
    }    
    
    
}