package com.haak.haaksq.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;



import com.haak.haaksq.constanst.HaakConst;
import com.haak.haaksq.form.BlogAd;

import com.haak.haaksq.form.BlogNews;

import com.haak.haaksq.form.LoginForm;
import com.haak.haaksq.form.MenuAndSub;
import com.haak.haaksq.form.MenuForm;
import com.haak.haaksq.form.VModuleSubmenu;
import com.haak.haaksq.form.VUserDetailImg;

import com.haak.haaksq.form.UserProfileForm;


import com.haak.haaksq.form.VUserProfile;
import com.haak.haaksq.form.Worklist2;

import com.haak.haaksq.service.AdminAddService;
import com.haak.haaksq.service.BlogService;
import com.haak.haaksq.service.ContactService;
import com.haak.haaksq.service.LoadPageService;
  

@Controller
@SessionAttributes({"userdetail","adlist","NEW_SUB_MENU","ACCESS_CONTROL"})

public class MainLoadController {
	
	 @ExceptionHandler(Exception.class)
	    public String handleException (Exception ex) {
	      System.out.println("Exception found: " + ex.getMessage());
	      ex.printStackTrace();
	      return "error.html";
	    }
    @Autowired
    private ContactService contactService ;
    
    @Autowired
    private LoadPageService loadPageService;
	
    @Autowired
    private BlogService blogService;
    
    @Autowired
    private AdminAddService adminService;    
	
	protected static Logger logger = Logger.getLogger("controller");

	
    

    
    @ModelAttribute("userdetail")
    public UserProfileForm newSessionUser() {
       return new UserProfileForm();
    }
	 
    @RequestMapping(value = "/gallery.htm/{commuId}", method = RequestMethod.GET)
    public String getGallery(Map<String, Object> map,@PathVariable("commuId") Integer commuId ) {
    	logger.debug("Received request to show AJAX, add page");
    	 return "gallery";
	}
    
    

    
    @RequestMapping(value = "/login.htm", method = RequestMethod.GET)
    public String getLogin() {
    	logger.debug("Received request to show AJAX, add page");
    	
    	// This will resolve to /WEB-INF/jsp/ajax-add-page.jsp
    	 return "contract-us";
	}

    @RequestMapping("/welcome.htm_2")
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
    
    
    
    @RequestMapping(value = "/home2/{commuId}/{lanuageId}/{menuId}", method = RequestMethod.GET) 
 	public String home2(Map<String, Object> map,
 			@PathVariable("commuId") int commuId,
 			@PathVariable("lanuageId") int lanuageId,
 			@PathVariable("menuId") int MenuID,
 			@ModelAttribute(value= "userdetail") UserProfileForm userdetail
 			){
    	
    	//init page
    	//VCommunity commuDetails= loadPageService.loadCommunityDeatils(commuId, 1);
    	boolean flagLogin = false;
    	boolean flagFullDetails = false;
    	List<VModuleSubmenu>  vModuleSubmenuList = new ArrayList<VModuleSubmenu>();
    	//int commuid get from request
    	if (userdetail != null && userdetail.getUserName() !=null){
    		flagLogin = true;
    	}
    	//--end init page    	

    	//login Process     	
    	if (flagLogin){
    		map.put("NEW_SUB_MENU", getStringSubMenu(loadPageService.loadMenuSubmenu( lanuageId ,commuId ,userdetail.getRoleList()),commuId,lanuageId,MenuID));
    		vModuleSubmenuList = loadPageService.getUserPrivilege(commuId, userdetail.getRoleList());
//    		map.put("MENU_LIST", loadPageService.loadMenuSubmenu( lanuageId ,commuId ,userdetail.getRoleList()),commuId,lanuageId,MenuID);
    	}else {
    		vModuleSubmenuList = loadPageService.getUserPrivilege(commuId, new int[]{0});
    		map.put("NEW_SUB_MENU", getStringSubMenu(loadPageService.loadMenuSubmenu( lanuageId ,commuId ,new int[]{6}),commuId,lanuageId,MenuID));
    		map.put("MENU_LIST",loadPageService.loadMenuSubmenu( lanuageId ,commuId ,new int[]{6}));
    	}
    	map.put("ACCESS_CONTROL", vModuleSubmenuList);
    	map.put("menuform", new MenuForm());
    	map.put("adobj", new BlogAd());
    	map.put("commuID", commuId);
    	map.put("lanuageId", lanuageId);

    	for(VModuleSubmenu vModuleSubmenu:vModuleSubmenuList  ){
			 int moduleId =vModuleSubmenu.getModuleId();
	    	if( moduleId == 9 && flagLogin != true){
	    		 //loadBlog(map,9 , commuId, lanuageId,packageID , false,userdetail);
	    	}else{
	    		//loadBlog(map, moduleId, commuId, lanuageId,packageID , flagFullDetails,userdetail);
	    		loadBlog(map, moduleId, commuId, lanuageId, flagFullDetails,userdetail);
	    	}
		}

		if(flagLogin){
			//loadBlog(map, 100, commuId, lanuageId,packageID , flagFullDetails,userdetail);
			loadBlog(map, 100, commuId, lanuageId, flagFullDetails,userdetail);
		}
    	return "welcome2.htm" ;
    }

    
    
    @RequestMapping(value = "/home/{commuId}/{lanuageId}/{menuId}", method = RequestMethod.GET) 
 	public String home(Map<String, Object> map,
 			@PathVariable("commuId") int commuId,
 			@PathVariable("lanuageId") int lanuageId,
 			@PathVariable("menuId") int MenuID,
 			@ModelAttribute(value= "userdetail") UserProfileForm userdetail
 			){
    	
    	//init page
    	//VCommunity commuDetails= loadPageService.loadCommunityDeatils(commuId, 1);
    	boolean flagLogin = false;
    	boolean flagFullDetails = false;
    	List<VModuleSubmenu>  vModuleSubmenuList = new ArrayList<VModuleSubmenu>();
    	//int commuid get from request
    	if (userdetail != null && userdetail.getUserName() !=null){
    		flagLogin = true;
    	}
    	//--end init page    	

    	//login Process     	
    	if (flagLogin){
    		map.put("NEW_SUB_MENU", getStringSubMenu(loadPageService.loadMenuSubmenu( lanuageId ,commuId ,userdetail.getRoleList()),commuId,lanuageId,MenuID));
    		vModuleSubmenuList = loadPageService.getUserPrivilege(commuId, userdetail.getRoleList());
    		map.put("listNewUser",contactService.getUserImgDetails(commuId,false));
//    		map.put("MENU_LIST", loadPageService.loadMenuSubmenu( lanuageId ,commuId ,userdetail.getRoleList()),commuId,lanuageId,MenuID);
    	}else {
    		vModuleSubmenuList = loadPageService.getUserPrivilege(commuId, new int[]{0});
    		map.put("NEW_SUB_MENU", getStringSubMenu(loadPageService.loadMenuSubmenu( lanuageId ,commuId ,new int[]{6}),commuId,lanuageId,MenuID));
    		map.put("MENU_LIST",loadPageService.loadMenuSubmenu( lanuageId ,commuId ,new int[]{6}));
    		map.put("listNewUser",contactService.getUserImgDetails(commuId,false));
    	}
    	map.put("ACCESS_CONTROL", vModuleSubmenuList);
    	map.put("menuform", new MenuForm());
    	map.put("adobj", new BlogAd());
    	map.put("commuID", commuId);
    	map.put("lanuageId", lanuageId);

    	
    	
    	
    	

    	for(VModuleSubmenu vModuleSubmenu:vModuleSubmenuList  ){
			 int moduleId =vModuleSubmenu.getModuleId();
	    	if( moduleId == 9 && flagLogin != true){
	    		 //loadBlog(map,9 , commuId, lanuageId,packageID , false,userdetail);
	    	}else{
	    		//loadBlog(map, moduleId, commuId, lanuageId,packageID , flagFullDetails,userdetail);
	    		loadBlog(map, moduleId, commuId, lanuageId, flagFullDetails,userdetail);
	    	}
		}

		if(flagLogin){
			//loadBlog(map, 100, commuId, lanuageId,packageID , flagFullDetails,userdetail);
			loadBlog(map, 100, commuId, lanuageId, flagFullDetails,userdetail);
		}
    	return "welcome.htm" ;
    }
    
	@RequestMapping(value = "/login.htm/{commuId}/{lanuageId}"  , method = RequestMethod.POST)
	public String login(@RequestParam(value="username", required=true) String user,
			@RequestParam(value="password", required=true) String pass,
			Map<String, Object> map,
			@PathVariable("commuId") int defaultCommuId,
			@PathVariable("lanuageId") int lanuageId ){
		
		    UserProfileForm userProfileForm = loadPageService.login(user, pass);
		 
		    if(userProfileForm !=null){
			 	map.put("userdetail",userProfileForm);
			 	map.put("menuform", new MenuForm());
			 	map.put("menuformList",loadPageService.loadMenu( userProfileForm.getPackageID() , lanuageId,userProfileForm.getCommuID()));
			 		
			    	for(int i=0;i<userProfileForm.getRoleList().length;i++){    		
			    		if( userProfileForm.getRoleList()[i]==1 ){
			    			map.put("PassAdmin", "YY");
			    			//return "redirect:/haaksq/adminmate.html/"+userProfileForm.getUserID()+"/"+lanuageId ;
			    			return "adminmate.html";
			    			
			    		}
			    	}
			    
			 	
			 	
		    
			 	return "redirect:/haaksq/home/"+userProfileForm.getCommuID()+"/"+lanuageId+"/1";
		    }
		    else{
		    	return "redirect:/haaksq/home/"+defaultCommuId+"/"+lanuageId +"/1";
		    }
		    //return "contract-us";
	}
	
	@RequestMapping(value = "/logout.htm/{commuId}/{lanuageId}"  , method = RequestMethod.POST)
	public String logout(@ModelAttribute("userdetail")UserProfileForm user , Map<String, Object> map, SessionStatus session,
			@PathVariable("commuId") int defaultCommuId,
			@PathVariable("lanuageId") int lanuageId ){
				if(user != null){
					session.setComplete();
				}
				map.put("commuID", defaultCommuId);
				map.put("lanuageId", lanuageId);
		 return "logout";
	}

	private Map<String, Object> loadBlog(Map<String, Object> map ,int moduleId ,int commuId,int lanuageID,boolean fullDetail,UserProfileForm userDetail){
		

		 switch (moduleId) {
		 
		case 0://news
				map.put("smallBlogNews", loadPageService.getBlogNews(commuId, fullDetail)); 		
				map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_NEWS);
				break;
		     
		case 2://gallaryBlog
			map.put("gallaryBlogList", loadPageService.loadGallary(commuId, fullDetail));
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_GALLERY);
			break;					
	
		case 3://SaleAndRent
			map.put("smallBlogSaleAndRent", loadPageService.loadSaleAndRent(commuId,lanuageID ,fullDetail));
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_SALE_AND_RENT);
			break;				
			
		case 4://LifeStyle
			map.put("smallBlogLifeStyle", loadPageService.loadLifeStyle(commuId,lanuageID ,fullDetail));
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_LIFE_STYLE);
			break;					

		case 5://WhatNearBy
			map.put("smallBlogWhatNearByList", loadPageService.loadWhatNearBy(commuId,lanuageID ,fullDetail));
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_WHAT_NEAR_BY);
			break;				

		case 7://Opportunities
			map.put("smallBlogOppo", loadPageService.loadOppo(commuId,lanuageID ,fullDetail));
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_OPPORTUNITIES);
			break;					
			
			
			case 8://Contact Form
				
				boolean publicFlag = true;
				String defaultName = "Guest" ;
				if(userDetail !=null && userDetail.getUserName() !=null &&userDetail.getUserName().trim().length()!=0){
					publicFlag = false;
					defaultName =  userDetail.getFirstName() + " " + userDetail.getLastName() ;
				} 
				
				
				if(fullDetail){
					Worklist2 wl =  new Worklist2();
					wl.setFromUserName(defaultName);
					map.put("Worklist2", wl);
					map.put("SubjectList" ,contactService.getContactFormSubject(commuId, publicFlag));
					
					
				}			
				map.put("newContactForm", "contactform.htm/"+commuId);
				map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_CONTACT_FORM);
				map.put("commuID", commuId);
				map.put("lanuageId", lanuageID);
				break;					
	/*		case 3://community blog
				map.put("smallBlogBOD", getSmallBlogModuleThree(false, 3, lanuageId)); 
				break;		*/			
								

		case 9://inbox
			
			if(userDetail !=null && userDetail.getUserName() !=null &&userDetail.getUserName().trim().length()!=0){
				for(int role: userDetail.getRoleList()){
					if(role==4){
						map.put("ROLE_ADMIN","Y");
					}
				}
			} 
			if(userDetail !=null && userDetail.getUserName() !=null &&userDetail.getUserName().trim().length()!=0){
				map.put("smallBlogInbox", loadPageService.getInboxByUser(userDetail.getRoleList(), userDetail.getAddressID(), fullDetail));
			}else{
				map.put("smallBlogInbox", loadPageService.getInboxByUser(null, commuId, fullDetail));
			}	
			
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_INBOX);
			break;		
		
		case  10://SaleAndRent
			map.put("smallBlogBOD", blogService.getBOD(commuId, lanuageID, fullDetail));
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_BOD);
			break;		
			
		case 13://resource
			
			if(userDetail !=null && userDetail.getUserName() !=null &&userDetail.getUserName().trim().length()!=0){
				map.put("smallBlogresource", loadPageService.getResource(commuId,  fullDetail, lanuageID, true)); 		
			}else{
				map.put("smallBlogresource", loadPageService.getResource(commuId,  fullDetail, lanuageID, false)); 		
			}
			
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_RESOURCE);
			break;		
			
		case 12://About
			map.put("smallBlogCommu", loadPageService.loadCommunityDeatils(commuId, 1)); 		
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_COMMUNITY_DETAILS);
			break;

		case 14://About
			map.put("smallBlogContactNumber", loadPageService.getContractNumber(commuId, fullDetail, lanuageID)); 		
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_CONTACT_NUMBER);
			break;			
			
		case 15://TaskManager
			map.put("smallBlogTaskManager", loadPageService.getTaskManager(commuId, true,fullDetail)); 		
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_TASK_MANAGER);
			if(userDetail !=null && userDetail.getUserName() !=null &&userDetail.getUserName().trim().length()!=0){
				for(int role: userDetail.getRoleList()){
					if(role==4){
						map.put("ROLE_ADMIN","Y");
					}
				}
			} 
			
			
			break;			
		case 101://NewsCommunity
			
			if(userDetail !=null && userDetail.getUserName() !=null &&userDetail.getUserName().trim().length()!=0){
				map.put("smallBlogNewsCommunity", loadPageService.getNewsCommunity(commuId,  fullDetail, lanuageID, true)); 		
			}else{
				map.put("smallBlogNewsCommunity", loadPageService.getNewsCommunity(commuId,  fullDetail, lanuageID, false)); 		
			}
			
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_NEWS_COMMUNITY);
			break;		
		case 102://NewsGeneral
			
			map.put("smallBlogNewsGeneral", loadPageService.getNewsGeneral(commuId, fullDetail, lanuageID)); 
			map.put(HaakConst.KEY_RETURN_PAGE, HaakConst.PAGE_NEWS_GENERAL);
			
			System.out.println(" New gen size >" + loadPageService.getNewsGeneral(commuId, fullDetail, lanuageID).size());
			
			break;		
			
			
			
		default:
			break;
		}

		
		
		return map;
		
	}
	    


    

    @RequestMapping(value = "/saveContactUS/{commuId}/{lanuageId}", method = RequestMethod.POST)
    public String saveContactUS(@ModelAttribute("Worklist2")
    Worklist2 worklist2, BindingResult result , 		
    @PathVariable("commuId") int commuId,
	@PathVariable("lanuageId") int lanuageId,
	@ModelAttribute(value= "userdetail") UserProfileForm userdetail
	) {
    	
    	
    	//check session   

    	int userID = 0;
    	if (userdetail != null && userdetail.getUserName() !=null){
    		System.out.println("USer  is " + userdetail.getUserName());
    		userID = userdetail.getUserID();
    	}else {
    		System.out.println("Session is null " );
    	}
    	
    	
    	String[] touser = worklist2.getToUserName().split("\\|");
    	worklist2.setWorklistSubjectId(Integer.valueOf(touser[0]));
    	worklist2.setToUserName(touser[1]);
    	worklist2.setCommunityId(commuId);
    	worklist2.setWorklistTypeId(1);
    	
    	worklist2.setWorklistStatusId(1);
    	worklist2.setModifyDate(new Date(System.currentTimeMillis()));
    	worklist2.setCreateDate(new Date(System.currentTimeMillis()));
    	worklist2.setAddressId(userdetail.getAddressID());
    	worklist2.setFromUserId(userID);
    	
    	contactService.saveWorklist(worklist2);
 
        return "redirect:/haaksq/home/"+commuId+"/"+lanuageId+"/1";
    } 
    
    
    //@ExceptionHandler(Exception.class)
    @RequestMapping(value = "/blog/{commuId}/{lanuageId}/{moduleId}", method = RequestMethod.GET) 
 	public String getFullBlog(Map<String, Object> map,
 			@PathVariable("commuId") int commuId,
 			@PathVariable("lanuageId") int lanuageId,
 			@PathVariable("moduleId") int moduleId,
 			//@PathVariable("packageId") int packageId,
 			@ModelAttribute(value= "userdetail") UserProfileForm userdetail,
 			@ModelAttribute(value= "ACCESS_CONTROL") List<VModuleSubmenu >vModuleSubmenuList
 			
 			){
    	
    	
    	
    	map.put("commuId", commuId);
    	map.put("lanuageId", lanuageId);
    	//map.put("smallBlogCommu", loadPageService.loadCommunityDeatils(commuId, 1)); 	
    	map.put("moduleId", moduleId);
    	boolean fullDetail = true;
    	//userdetail.get
    	if(vModuleSubmenuList != null){
	    	for(VModuleSubmenu vModuleSubmenu:vModuleSubmenuList ){
	    		if(moduleId ==100||moduleId ==101||moduleId ==102){
	    			loadBlog( map , moduleId , commuId, lanuageId,fullDetail,userdetail);
	    			break;
	    		} else if(moduleId == vModuleSubmenu.getModuleId()){
	    			 loadBlog( map , moduleId , commuId, lanuageId,fullDetail,userdetail);
	    			 break;
	    		}
	    	}
	    	
	    	map.put("commuId", commuId);
	    	map.put("lanuageId", lanuageId);
	    	map.put("moduleId", moduleId);
	    	return (String)map.get(HaakConst.KEY_RETURN_PAGE);
	    	
	    	
    	}else {
    		return "welcome.htm" ;
    	}

    	
    }
    
    

    
    @RequestMapping(value = "/UpdateDetail.html/{commuId}/{lanuageId}", method = RequestMethod.POST)
    public String UpdateUser(
    		@ModelAttribute("vUserProfile") VUserProfile user, 
    		@ModelAttribute(value= "userdetail") UserProfileForm userSession,
    		@PathVariable("commuId") int commuId,
 			@PathVariable("lanuageId") int lanuageId,
    		Map<String, Object> map,
    		BindingResult result ) {
    		
    		user.setUserId(userSession.getUserID());
    	
    	
    		adminService.updateUser(user, 1);	

    		int lanuage_id = 1;
        	map.put("vUserProfile",adminService.loadUserDetails(userSession,lanuage_id));
        	map.put("HAS_ERROR", null);
        	map.put("commuId", commuId);
	    	map.put("lanuageId", lanuageId);
            return "userdetails.html";    	
    		
    	
        
    } 
    
    
    @RequestMapping(value = "/loadDetails.html/{commuId}/{lanuageId}", method = RequestMethod.GET)
    public String loadUserdetails(
    		@ModelAttribute(value= "userdetail") UserProfileForm userSession,
    		@PathVariable("commuId") int commuId,
 			@PathVariable("lanuageId") int lanuageId,
    		Map<String, Object> map ) {      	
    		
    		int lanuage_id = 1;
        	map.put("vUserProfile",adminService.loadUserDetails(userSession,lanuage_id));
        	map.put("HAS_ERROR", null);
        	map.put("commuId", commuId);
	    	map.put("lanuageId", lanuageId);
            return "userdetails.html";
     } 
    
    
    private String getStringSubMenu(Map<String,MenuAndSub> mapMenuAndSub ,int commuId ,int language ,int menuid){ 
    	
    	
    	String rtnMenu = "";
    	
    	rtnMenu +="<div id=\"wrap\">";
		rtnMenu +="<ul id=\"navbar\">";
    	for(String key: mapMenuAndSub.keySet()){
    		MenuAndSub menuAndSub = mapMenuAndSub.get(key);
    		
    		rtnMenu +="<li>"+"<a href=\""+menuAndSub.getMenuURL()+"/" +commuId +"/" +language+"/" +menuid+ "\" >"+ menuAndSub.getMenuName()+" | </a>";
    			if(menuAndSub.getListSubMenu()!=null){
    				rtnMenu +="<ul>";
		    		for(MenuAndSub sub:menuAndSub.getListSubMenu()){
		    			rtnMenu +="<li>"+"<a href=\""+sub.getMenuURL()+"/" +commuId +"/" +language+"/" +sub.getMenuId()+ "\" >"+ sub.getMenuName()+" | </a></li>";
		    		}
		    		rtnMenu +="</ul>";
    			}
    		rtnMenu +="</li>";

    	}

		rtnMenu +="</ul>";
		rtnMenu +="</div>";
/*	<div id="wrap">
		<ul id="navbar">
			<li><a href="#">Exhibits and Events</a>
				<ul>
					<li><a href="#">Current Exhibit</a></li>
					<li><a href="#">Coming Exhibit</a></li>
					<li><a href="#">Events</a></li>
				</ul>
			</li>
			<li><a href="#">About Us</a>
				<ul>
					<li><a href="#">About 1</a></li>
					<li><a href="#">About Two</a></li>
					<li><a href="#">Third About</a></li>
				</ul>			
			</li>
			<li><a href="#">Contact</a>
				<ul>
					<li><a href="#">Via Email</a></li>
					<li><a href="#">Stalk Us Elsewhere</a></li>
				</ul>			
			</li>
			<li><a href="#">Press</a>
				<ul>
					<li><a href="#">Bench Press</a></li>
					<li><a href="#">Military Press</a></li>
					<li><a href="#">Press 'n Seal</a></li>
				</ul>			
			</li>
		</ul>
		<p>
	</div>*/
    	
    	
    	return rtnMenu;
    }
    
    
	
}
