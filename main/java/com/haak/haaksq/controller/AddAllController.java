package com.haak.haaksq.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haak.haaksq.constanst.HaakConst;
import com.haak.haaksq.form.CommunityNew;
import com.haak.haaksq.form.ErrorM;
import com.haak.haaksq.form.PageInPutUser;
import com.haak.haaksq.form.UserProfile;
import com.haak.haaksq.form.UserProfileForm;
import com.haak.haaksq.form.VCommunity;
import com.haak.haaksq.form.VSearchUser;
import com.haak.haaksq.form.VUserProfile;
import com.haak.haaksq.form.Worklist2;
import com.haak.haaksq.service.AdminAddService;
import com.haak.haaksq.service.LoadPageService;


@Controller
@SessionAttributes({"menuformList","userdetail","adlist"})

public class AddAllController {
	
	

	protected static Logger logger = Logger.getLogger("controller");
	
    @Autowired
    private LoadPageService loadPageService;
    
    @Autowired
    private AdminAddService adminService;    
    
    
	 @ExceptionHandler(Exception.class)
	    public String handleException (Exception ex) {
	      System.out.println("Exception found: " + ex.getMessage());
	      return "error.html";
	    }
    
    @RequestMapping(value = "/admin.html", method = RequestMethod.GET)
    public String adminLogin(Map<String, Object> map) {
    	logger.debug("Received request to show AJAX, add page");
    	// This will resolve to /WEB-INF/jsp/ajax-add-page.jsp
    	 return "admin.html";
	}
    
    @RequestMapping(value = "/vadmin.html", method = RequestMethod.POST)
    public String saveNews(
    		@RequestParam(value="username", required=true) String userName,
    		@RequestParam(value="password", required=true) String pass,
    		Map<String, Object> map
    		 ) {
    	
    		UserProfileForm userProfileForm = loadPageService.login(userName, pass);
    		if(userProfileForm!=null){
    		map.put("userdetail",userProfileForm);
    		return  "naviadmin";
    		}else{
    			map.put("ERROR", "รหัสผิดพลาด");
    			return "admin.html";
    		}
    } 
	
    @RequestMapping(value = "/userform.html", method = RequestMethod.GET)
	private String   addUser(Map<String, Object> map,@ModelAttribute(value= "userdetail") UserProfileForm userdetail){
    	
    	map.put("PageInPutUser",new PageInPutUser());
		//int commuId = 1;		
		//VCommunity commuDetails= loadPageService.loadCommunityDeatils(commuId, 1);
		map.put("LISTCOMMU", adminService.getCacheM(HaakConst.LISTBOX_COMMUNITY_BY_GROUP, userdetail.getCommuID()) );
		return "inputUser.html";
	}

    
    
    @RequestMapping(value = "/input_news_form.html", method = RequestMethod.GET)
	private String   initNews(Map<String, Object> map){

    	CommunityNew commuNews = new CommunityNew();
    	commuNews.setFgPublic("Y");
    	commuNews.setFgOpen("B");
    	map.put("CommunityNew",commuNews);
		map.put("ListCommunity", adminService.getCacheM(HaakConst.LISTBOX_COMMUNITY_NAME));
		//VCommunity commuDetails= loadPageService.loadCommunityDeatils(commuId, 1);
		
		return "inputNews.html";
	}

    
    
    @RequestMapping(value = "/saveUser.html", method = RequestMethod.POST)
    public String saveUser(
    		@ModelAttribute("PageInPutUser") PageInPutUser pageInPutUser,
    		@ModelAttribute(value= "userdetail") UserProfileForm userSession,
    		@RequestParam(value="chkCommu", required=true) int chkCommu,
    		
    		Map<String, Object> map,
    		BindingResult result ) {
    	
    	System.out.println("gettt user session  saveUser>0> " + userSession.getUserName());	
    	ErrorM errorM = new ErrorM();
    	
    	if(loadPageService.isDuplecate("user_profile", "user_profile.user_name", pageInPutUser.getUserName() )){
    		errorM.setErrorMsg( HaakConst.ERROR_DUPLICATE_USER_NAME);
    		map.put("HAS_ERROR", errorM);
    		
        	map.put("LIST_USER", adminService.getListUser(userSession.getCommuID(),userSession.getRoleList()));
        	
    		return "usermanage.html";
    	}
    	
    	System.out.println("gettt user session  saveUser>1> " + userSession.getUserName());
    	//set Password temp
    	pageInPutUser.setCommunityId(chkCommu);    	
    	pageInPutUser.setPass(pageInPutUser.getMobile());    	
	 	
    	//
    	
    	System.out.println("gettt user session  saveUser>2> " + userSession.getUserName());
    	adminService.saveUser(pageInPutUser);
    	System.out.println("gettt user session  saveUser>3> " + userSession.getUserName());
    	map.put("PageInPutUser",new PageInPutUser());
    	map.put("HAS_ERROR", null);
    	map.put("LIST_USER", adminService.getListUser(userSession.getCommuID(),userSession.getRoleList()));
    	System.out.println("gettt user session  saveUser>4> " + userSession.getUserName());
		return "usermanage.html";
    } 
    

    @RequestMapping(value = "/saveNews.html", method = RequestMethod.POST)
    public String saveNews(
    		@ModelAttribute("CommunityNew") CommunityNew communityNews,
    		Map<String, Object> map,
    		BindingResult result ) {

    	adminService.saveNews(communityNews);
        return  "redirect:/haaksq/input_news_form.html";
    } 
    
    @RequestMapping(value = "/adminmate.html", method = RequestMethod.GET)
	private String   mainPageAdmin(Map<String, Object> map,
			@ModelAttribute(value= "userdetail") UserProfileForm userdetail
			){
		return "adminmate.html";
	}
    
    @RequestMapping(value = "/usermanage.html", method = RequestMethod.GET)
	private String   userManage(Map<String, Object> map,
			@ModelAttribute(value= "userdetail") UserProfileForm userdetail
			){
    	
    	int forUDDC = 2;
    	int languageID = 1;
		boolean flagAdmin = false;
    	
    	for(int i=0;i<userdetail.getRoleList().length;i++){    		
    		if( userdetail.getRoleList()[i]==HaakConst.ROLE_ADMIN ||
    				userdetail.getRoleList()[i]==HaakConst.ROLE_ADMIN_GROUP ||
    				userdetail.getRoleList()[i]==HaakConst.ROLE_ADMIN_COMMUNITY
    				){
    			 
    			map.put("PassAdmin", "YY");
    			flagAdmin = true;
    			
    		}
    	}
    	
    	if(flagAdmin == false){
    		
    		map.put("ERROR", "สำหรับ Admin เท่านั้น");
    		return "admin.html";
    	}
    	
    	System.out.println("gettt user session>> " + userdetail.getUserName());
    	map.put("LIST_USER", adminService.getListUser(userdetail.getCommuID(),userdetail.getRoleList()));
    	
		return "usermanage.html";
	}
    
    
    @RequestMapping(value = "/addnewuser.html", method = RequestMethod.GET)
    public String addUserdetails(
    		Map<String, Object> map ,
    		@ModelAttribute(value= "userdetail") UserProfileForm userdetail) {      	
    	
    	    userdetail.getUserName();
        	map.put("vUserProfile", new UserProfile());
        	map.put("HAS_ERROR", null);
            return "newuser.html";
     } 
    
    @RequestMapping(value = "/loadDetails.html/{userID}", method = RequestMethod.GET)
    public String loadUserdetails(
    		@ModelAttribute(value= "userdetail") UserProfileForm userSession,
    		@PathVariable("userID") int userID,
    		Map<String, Object> map ) {      	
    	   UserProfileForm newUser = new UserProfileForm();
    	   newUser.setUserID(userID);
    		int lanuage_id = 1;
        	map.put("vUserProfile",adminService.loadUserDetails(newUser,lanuage_id));
        	map.put("HAS_ERROR", null);
        	System.out.println("gettt user session>> " + userSession.getUserName());
        	return "adminuserdetails.html";
     } 
    
    
    @RequestMapping(value = "/deluser.html/{userID}", method = RequestMethod.GET)
    public String deleteUser(
    		@ModelAttribute(value= "userdetail") UserProfileForm userSession,    		
    		@PathVariable("userID") int userID,
    		Map<String, Object> map ) {      	
    	   UserProfileForm newUser = new UserProfileForm();
    	   newUser.setUserID(userID);
    		int lanuage_id = 1;
    		
    		adminService.deleteUser(userID);
    		
    		map.put("LIST_USER", adminService.getListUser(userSession.getCommuID(),userSession.getRoleList()));
        	map.put("HAS_ERROR", null);
        	
        	return "usermanage.html";
     } 
    
    @RequestMapping(value = "/AdminUpdateDetail.html/{userID}", method = RequestMethod.POST)
    public String UpdateUser(
    		@ModelAttribute("vUserProfile") VUserProfile user, 
    		@ModelAttribute(value= "userdetail") UserProfileForm userSession,
    		@PathVariable("userID") int userID,
    		//@ModelAttribute(value= "userdetail") UserProfileForm userSession,
    		Map<String, Object> map,
    		BindingResult result ) {
    		
    		//System.out.println(" ggggg " + userSession.getUserName());
    		
    		user.setUserId(userID);
    		adminService.updateUser(user, 1);	

    		int lanuage_id = 1;
        	//map.put("vUserProfile",adminService.loadUserDetails(userSession,lanuage_id));
        	map.put("HAS_ERROR", null);
        	map.put("LIST_USER", adminService.getListUser(userSession.getCommuID(),userSession.getRoleList()));
        	
    		return "usermanage.html";
    		
    	
        
    } 
    
    
    @RequestMapping(value = "/searchkey.html", method = RequestMethod.POST)
    public String searchUser(
    		@ModelAttribute(value= "userdetail") UserProfileForm userdetail  ,
    		@RequestParam(value="wordparse", required=true) String key,
    		Map<String, Object> map) {
    		
    		List<UserProfile> rtn = adminService.searchUser(key ,userdetail.getCommuID());
    	
    		if(rtn == null || rtn.size() ==0){
    			map.put("LIST_USER", null );
    			map.put("HAS_ERROR", "Data not Found");
    		}else{
    			map.put("LIST_USER", rtn );
    		}
    		
    			

    		int lanuage_id = 1;
        	//map.put("vUserProfile",adminService.loadUserDetails(userSession,lanuage_id));
        	map.put("HAS_ERROR", null);
        	return "usermanage.html";
    		
    	
        
    } 
    
    protected void initBinder( ServletRequestDataBinder binder) {
	SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyy/MM/DD");  
	dateFormat.setLenient(false);
	binder.registerCustomEditor(Date.class, null, new CustomDateEditor(dateFormat, true));
	}
   

    
}
