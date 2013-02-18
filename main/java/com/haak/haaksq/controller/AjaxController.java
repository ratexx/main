package com.haak.haaksq.controller;




import java.util.List;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haak.haaksq.constanst.HaakConst;
import com.haak.haaksq.form.CommunityLifestyle;
import com.haak.haaksq.form.MenuForm;
import com.haak.haaksq.form.TrnPostReply;
import com.haak.haaksq.form.UserProfile;
import com.haak.haaksq.form.UserProfileForm;
import com.haak.haaksq.service.AdminAddService;
import com.haak.haaksq.service.BlogService;
import com.haak.haaksq.service.LoadPageService;

/**
 * Handles and retrieves the main requests
 */
@Controller
@SessionAttributes({"userdetail","adlist","NEW_SUB_MENU","ACCESS_CONTROL"})
@RequestMapping("/ajax")
public class AjaxController {
	
	
	 @ExceptionHandler(Exception.class)
	    public String handleException (Exception ex) {
	      System.out.println("Exception found: " + ex.getMessage());
	      ex.printStackTrace();
	      return "error.html";
	    }
	
	

	protected static Logger logger = Logger.getLogger("controller");
	
    @Autowired
    private LoadPageService loadPageService;
    
    @Autowired
    private AdminAddService adminService;
	
    @Autowired
    private BlogService blogService;
    

	
    
    @ModelAttribute("userdetail")
    public UserProfileForm newSessionUser() {
       return new UserProfileForm();
    }
    
    
    /**
     *     @RequestMapping(value = "/post", method = RequestMethod.POST)
    public @ResponseBody String  load(
    		@RequestParam(value="inputNumber1", required=true) String inputNumber1,
			@RequestParam(value="inputNumber2", required=true) String inputNumber2,
			//@PathVariable("commuId") int defaultCommuId,
			//@PathVariable("lanuageId") int lanuageId ,		
			Map<String, Object> map) {*
     * @param user
     * @param pass
     * @param map
     * @param defaultCommuId
     * @param lanuageId
     * @return
     */
    
	@RequestMapping(value = "/alogin.html"  , method = RequestMethod.POST)
	public @ResponseBody String login(
			@RequestParam(value="auser", required=true) String auser,
			@RequestParam(value="apass", required=true) String apass,
			Map<String, Object> map ){
		
			int lanuageId = 1;
			
		    UserProfileForm userProfileForm = loadPageService.login(auser, apass);
		 
		    if(userProfileForm !=null){
			 	map.put("userdetail",userProfileForm);
			 	map.put("menuform", new MenuForm());
			 	map.put("menuformList",loadPageService.loadMenu( userProfileForm.getPackageID() , lanuageId,userProfileForm.getCommuID()));
			 		
			    	for(int i=0;i<userProfileForm.getRoleList().length;i++){    		
			    		if( userProfileForm.getRoleList()[i]==1 ){
			    			map.put("PassAdmin", "YY");
			    			//return "redirect:/haaksq/adminmate.html/"+userProfileForm.getUserID()+"/"+lanuageId ;
			    			//return "adminmate.html";
			    			
			    		}
			    	}
			    return "pass";
		    }else{
		    	
		    	return null;
		    }

		    

	}
   
    
	/**
	 * Handles and retrieves the AJAX Add page
	 */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAjaxAddPage() {
    	logger.debug("Received request to show AJAX, add page");
    	
    	// This will resolve to /WEB-INF/jsp/ajax-add-page.jsp
    	return "ajax-add-page";
	}
 
    

    
    @RequestMapping(value = "/lobby.html/{commuId}/{lanuageId}/{menuId}", method = RequestMethod.GET)
    public String lobby(
    		@PathVariable("commuId") int commuId,
    		@PathVariable("lanuageId") int languageId,
    		@PathVariable("menuId") int moduleId,
    		Map<String, Object> map) {
    	logger.debug("lobby page");
    	
    	map.put("LIFE_STYLE_LIST",loadPageService.getCommunityLifeStyle(commuId,0));
    	map.put("LIFE_STYLE_TYPE_LIST",adminService.getCacheM(HaakConst.LIST_LIFE_STYLE_TYPE, 0));
    	map.put("communityLifestyle", new CommunityLifestyle());
    	
    	map.put("commuID", commuId);
    	map.put("lanuageId", languageId);
    	map.put("menuId", moduleId);
    	
    	
	    int groupCommuId =0 ;
	    //int moduleId =HaakConst.MODULE_LIFESTYLE;
	    int parentId =0;
	    int masterFlag =1;
	    
	    TrnPostReply trnPostReply = new TrnPostReply();
	    int maxRow =0;//HaakConst.MAX_ROW_REPLY_POST;
	    trnPostReply.setCommunityId(commuId);
	    trnPostReply.setCommunityGroup(groupCommuId);
	    trnPostReply.setModuleId(moduleId);
	    trnPostReply.setCreateDate(new java.util.Date(System.currentTimeMillis()));
	    trnPostReply.setLanguageId(languageId);
	    trnPostReply.setMasterFlag(masterFlag);

	    trnPostReply.setParentId(parentId);
    	
	    map.put("REPLY_MASTER_LIST", blogService.getPostLifeStyle(trnPostReply,maxRow));    		
		
		//List<TrnPostReply> trnPostReplyList = blogService.getPostLifeStyle(lifeID, languageId);

		
    	return "lobby.html";
	}
    
    @RequestMapping(value = "/byLifeType.html", method = RequestMethod.GET)
    public String getByLifeType(
    		@RequestParam(value="LIFE_TYPE_ID", required=true) int lifeTypeId,
    		Map<String, Object> map) {
    	logger.debug("lobby page");
    	map.put("LIFE_STYLE_LIST",loadPageService.getCommunityLifeStyle(1,lifeTypeId));
    	map.put("LIFE_STYLE_TYPE_LIST",adminService.getCacheM(HaakConst.LIST_LIFE_STYLE_TYPE, 0));
    	map.put("communityLifestyle", new CommunityLifestyle());
    	int commuId =1;
	    int groupCommuId =0 ;
	    int moduleId =HaakConst.MODULE_LIFESTYLE;
	    int parentId =0;
	    int languageId =1;
	    int masterFlag =1;
	    int subModule = 0;
	    
	    TrnPostReply trnPostReply = new TrnPostReply();
	    int maxRow =0;//HaakConst.MAX_ROW_REPLY_POST;
	    trnPostReply.setCommunityId(commuId);
	    trnPostReply.setCommunityGroup(groupCommuId);
	    trnPostReply.setModuleId(moduleId);
	    trnPostReply.setCreateDate(new java.util.Date(System.currentTimeMillis()));

	    trnPostReply.setLanguageId(languageId);
	    trnPostReply.setMasterFlag(masterFlag);

	    trnPostReply.setParentId(parentId);
	    trnPostReply.setModuleSubId(subModule);
    	
	    map.put("REPLY_MASTER_LIST", blogService.getPostLifeStyle(trnPostReply,maxRow));    		
    	
    	return "lobby.html";
	}


    @RequestMapping(value = "/saveLifeStyle.html", method = RequestMethod.POST)
    public String saveLifeStyle(
    		Map<String, Object> map,
    		//@ModelAttribute(value= "userdetail") UserProfileForm userdetail,
    		@ModelAttribute(value= "communityLifestyle") CommunityLifestyle communityLifestyle,
    		BindingResult result) {
    	logger.debug("saveLifeStyle");
    	int commuId =1;
    	int userId = 300;
    	
    	//if(chkLoginNotLogin(userdetail))return null;
    	communityLifestyle.setCommunityId(commuId);
    	communityLifestyle.setCreateBy(userId);
    	communityLifestyle.setCreateDate(new java.util.Date(System.currentTimeMillis()));
    	communityLifestyle.setModifyBy(userId);
    	communityLifestyle.setModifyDate(new java.util.Date(System.currentTimeMillis()));
    	
    	blogService.saveCommunityLifeStyle(communityLifestyle);
    	map.put("LIFE_STYLE_LIST",loadPageService.getCommunityLifeStyle(commuId,0));
    	map.put("LIFE_STYLE_TYPE_LIST",adminService.getCacheM(HaakConst.LIST_LIFE_STYLE_TYPE, 0));
    	map.put("COMMU_LIFESTYLE", new CommunityLifestyle());

    	return "lobby.html";
	}

    
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public @ResponseBody String  load(
    		@RequestParam(value="inputNumber1", required=true) String inputNumber1,
			@RequestParam(value="inputNumber2", required=true) String inputNumber2,
			//@PathVariable("commuId") int defaultCommuId,
			//@PathVariable("lanuageId") int lanuageId ,		
			Map<String, Object> map) {
    		String msgPost = "<br>xxxxxxx<img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\">" +inputNumber1;
    		logger.debug(" past post >>" + inputNumber1 +"|" +inputNumber2);
	return msgPost;
	}
    
    
    
    
    @RequestMapping(value = "/chkLoginByClick.html", method = RequestMethod.POST)
    public @ResponseBody String  chkLoginByClick(
    		@ModelAttribute(value= "userdetail") UserProfileForm userdetail,
			Map<String, Object> map) {
    	    logger.debug(" chkLoginByClick > " +chkLoginNotLogin(userdetail));
    	    if(chkLoginNotLogin(userdetail))return null;
    	    return "YES";
	} 

    
    
    @RequestMapping(value = "/getListReply", method = RequestMethod.POST)
    public @ResponseBody String  load(
    		@RequestParam(value="moduleId", required=true) int moduleId,
			Map<String, Object> map) {
    	    logger.debug(" past post >>" +moduleId);

    	    String msgPost ="";
    	    
    	    int groupCommuId =0 ;
    	    int commuId =0;
    	    //int moduleId =0;
    	    int parentId =0;
    	    int languageId =1;
    	    int masterFlag =0;
    	    TrnPostReply trnPostReply = new TrnPostReply();
    	    int maxRow =HaakConst.MAX_ROW_REPLY_POST;
    	    trnPostReply.setCommunityId(commuId);
    	    trnPostReply.setCommunityGroup(groupCommuId);

    	    trnPostReply.setCreateDate(new java.util.Date(System.currentTimeMillis()));

    	    trnPostReply.setLanguageId(languageId);
    	    trnPostReply.setMasterFlag(masterFlag);

    	    trnPostReply.setModuleId(moduleId);
    	    trnPostReply.setParentId(parentId);
    	    
    	    List<TrnPostReply> trnPostReplyList =  blogService.getPostLifeStyle(trnPostReply,maxRow);
    	    for(TrnPostReply trnPostReply2:trnPostReplyList){
    	    	msgPost += "<br><img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\" width=50px height=50px  >" + trnPostReply2.getMessage();  
    	    }
    	    
    		

	return msgPost;
	} 
    
    @RequestMapping(value = "/getCommunityLifeStyleDetail", method = RequestMethod.POST)
    public @ResponseBody CommunityLifestyle  getCommunityLifeStyleDetail(
    		@RequestParam(value="LifeID", required=true) int inputNumber1) {
    		return blogService.getCommunityLifestyle(inputNumber1);
	}

    
    @RequestMapping(value = "/getStreamList", method = RequestMethod.POST)
    public @ResponseBody List<TrnPostReply>  getStreamList(
    		@RequestParam(value="commuId", required=true) int commuId,
    		@RequestParam(value="last_id", required=true) Long lastID,
			Map<String, Object> map) {
    		logger.debug(" getStreamList >>" + lastID );
    	    return blogService.getStreamLine(commuId,lastID);
	}
    
    
    
    @RequestMapping(value = "/getReplyLifeList", method = RequestMethod.POST)
    public @ResponseBody List<TrnPostReply>  getReplyLifeList(
    		@RequestParam(value="LifeID", required=true) int inputNumber1,
			Map<String, Object> map) {

    		String msgPost = "";
    	    int groupCommuId =0 ;
    	    int commuId =0;
    	    //int moduleId =0;
    	    int parentId =0;
    	    int languageId =1;
    	    int masterFlag =0;
    	    int subModule = inputNumber1;
    	    
    	    TrnPostReply trnPostReply = new TrnPostReply();
    	    int maxRow =HaakConst.MAX_ROW_REPLY_POST;
    	    trnPostReply.setCommunityId(commuId);
    	    trnPostReply.setCommunityGroup(groupCommuId);

    	    trnPostReply.setCreateDate(new java.util.Date(System.currentTimeMillis()));

    	    trnPostReply.setLanguageId(languageId);
    	    trnPostReply.setMasterFlag(masterFlag);

    	    trnPostReply.setParentId(parentId);
    	    trnPostReply.setModuleSubId(subModule);
    	    
    	     
    	    map.put("COMMUNITY_LIFE_STYLE", blogService.getCommunityLifestyle(inputNumber1)) ;
    	    List<TrnPostReply> trnPostReplyList =  blogService.getPostLifeStyleAll(trnPostReply,maxRow);    		
/*    	    String imgAvatar = "<img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\"  width=50px height=50px >";
    		for(TrnPostReply trnPostReply2:trnPostReplyList){
    			msgPost += "<div style=\"border: 2px solid #fff;background: #dcfbca;\"" +
    							  "<br>"+ imgAvatar +" &nbsp USER-NAME"+
    							  "<br>"+trnPostReply2.getMessage()+
    							  "<br>" +trnPostReply2.getCreateDate() +
    							  "</div>";
    		} */

    		logger.debug(" LifeID post >>" + inputNumber1 +"|" +msgPost);
    	    return trnPostReplyList;
	}

    
    
    @RequestMapping(value = "/getReplyMasterLifeList", method = RequestMethod.POST)
    public @ResponseBody String  getReplyMasterLifeList(
    		@RequestParam(value="LifeID", required=true) int inputNumber1,
    	
			Map<String, Object> map) {
    	
    		String msgPost = "";
    	    int groupCommuId =0 ;
    	    int commuId =0;
    	    //int moduleId =0;
    	    int parentId =0;
    	    int languageId =1;
    	    int masterFlag =1;
    	    
    	    TrnPostReply trnPostReply = new TrnPostReply();
    	    int maxRow =HaakConst.MAX_ROW_REPLY_POST;
    	    trnPostReply.setCommunityId(commuId);
    	    trnPostReply.setCommunityGroup(groupCommuId);
    	    
    	    trnPostReply.setCreateDate(new java.util.Date(System.currentTimeMillis()));

    	    trnPostReply.setLanguageId(languageId);
    	    trnPostReply.setMasterFlag(masterFlag);
    	    trnPostReply.setParentId(parentId);
    	    
    	    List<TrnPostReply> trnPostReplyList =  blogService.getPostLifeStyle(trnPostReply,maxRow);    		
    	    
    	    
    	    
    	    String imgAvatar = "<img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\"  width=50px height=50px >";
    		for(TrnPostReply trnPostReply2:trnPostReplyList){
    			msgPost += "<div style=\"border: 2px solid #fff;background: #f2f892;\"" +
    							  "<br>"+ imgAvatar +" &nbsp USER-NAME"+
    							  "<br>"+trnPostReply2.getMessage()+
    							  "<br>" +trnPostReply2.getCreateDate() +
    							  "</div>";
    		} 

    		logger.debug(" past post >>" + inputNumber1 +"|" +msgPost);
	return msgPost;
	}
    
    @RequestMapping(value = "/postreply", method = RequestMethod.POST)
    public @ResponseBody TrnPostReply  postreply(
    		@RequestParam(value="LifeID", required=true) int lifeID,
    		@RequestParam(value="postMSG", required=true) String postMSG,
			Map<String, Object> map ,
			HttpServletRequest request , 
			@ModelAttribute(value= "userdetail") UserProfileForm userdetail,
			HttpServletResponse response) {

    	if(chkLoginNotLogin(userdetail))return null;
    		int userId =1;
    		String msgPost = "";
    		
    	    int groupCommuId =0 ;
    	    int commuId =1;
    	    int moduleId =HaakConst.MODULE_LIFESTYLE;
    	    int parentId =0;
    	    int languageId =1;
    	    int masterFlag =0;
    	    String macIp = "";
    	    int maxRow =HaakConst.MAX_ROW_REPLY_POST;
    	    TrnPostReply trnPostReply = new TrnPostReply();
    	    int moduleSub = lifeID;
    	    
    	    trnPostReply.setCommunityId(commuId);
    	    trnPostReply.setCommunityGroup(groupCommuId);
    	    trnPostReply.setCreateBy(userId);
    	    trnPostReply.setCreateDate(new java.util.Date(System.currentTimeMillis()));
    	    trnPostReply.setMacIpAddress(macIp);
    	    trnPostReply.setLanguageId(languageId);
    	    trnPostReply.setMasterFlag(masterFlag);
    	    trnPostReply.setMessage(postMSG);
    	    trnPostReply.setModuleId(moduleId);
    	    trnPostReply.setParentId(parentId);
    	    trnPostReply.setModuleSubId(moduleSub);
    	    
    		blogService.postMsg(trnPostReply) ;
    	    List<TrnPostReply> trnPostReplyList =  blogService.getPostLifeStyle(trnPostReply,maxRow);    		

//    		List<TrnPostReply> trnPostReplyList = blogService.getPostLifeStyle(lifeID, languageId);
    		String imgAvatar = "<img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\"  width=50px height=50px >";
    		for(TrnPostReply trnPostReply2:trnPostReplyList){
    			msgPost +=  "<div style=\"border: 2px solid #fff;background: #dcfbca;\"" +
    							  "<br>"+ imgAvatar +" &nbsp USER-NAME"+
    							  "<br>"+trnPostReply2.getMessage()+
    							  "<br>" +trnPostReply2.getCreateDate()+

    							  "</div> ";
    		}     		

    		
    		logger.debug(" past post >>" + lifeID +"|" + postMSG +"|" +request.getLocalAddr());
    		
	//return msgPost;
    return		trnPostReply;
	}
    
    
    @RequestMapping(value = "/replyParent")
    //public @ResponseBody String  postReplyMaster(
    public @ResponseBody TrnPostReply  postReplyMaster(
    		@RequestParam(value="postMSGMaster", required=true) String postMSG,
    		@ModelAttribute(value= "userdetail") UserProfileForm userdetail,
			Map<String, Object> map ,
			HttpServletRequest request) {
    		
    		if(chkLoginNotLogin(userdetail))return null;
    		String msgPost="";
    		int userId =1;
    		//int maxRow =10;

    		
    	    int groupCommuId =0 ;
    	    int commuId =1;
    	    int moduleId =HaakConst.MODULE_LIFESTYLE;
    	    
    	    int languageId =1;
    	    int masterFlag =1;
    	    //int lifeID =0;
    	    String macIp = "";
    	    
    	    TrnPostReply trnPostReply = new TrnPostReply();
    	    int maxRow =0;//HaakConst.MAX_ROW_REPLY_POST;
    	    trnPostReply.setCommunityId(commuId);
    	    trnPostReply.setCommunityGroup(groupCommuId);
    	    trnPostReply.setCreateBy(userId);
    	    trnPostReply.setCreateDate(new java.util.Date(System.currentTimeMillis()));
    	    trnPostReply.setMacIpAddress(macIp);
    	    trnPostReply.setLanguageId(languageId);
    	    trnPostReply.setMasterFlag(masterFlag);
    	    trnPostReply.setMessage(postMSG);
    	    trnPostReply.setModuleId(moduleId);
    	    
    	    
    	    blogService.postMsgMaster(trnPostReply) ;
/*    	    List<TrnPostReply> trnPostReplyList =  blogService.getPostLifeStyle(trnPostReply,maxRow);    		
    		
    		//List<TrnPostReply> trnPostReplyList = blogService.getPostLifeStyle(lifeID, languageId);
    		String imgAvatar = "<img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\"  width=50px height=50px >";
    		for(TrnPostReply trnPostReply2:trnPostReplyList){
    			msgPost +=  "<div style=\"border: 2px solid #fff;background: #339900;\"" +
    							  "<br>"+ imgAvatar +" &nbsp USER-NAME"+
    							  "<br>"+trnPostReply2.getMessage()+
    							  "<br>" +trnPostReply2.getCreateDate()+ 
					  					  "<div id=\"postreplybox\" style=\"width:360px; height:40px;background: #ccffcc; margin:0 auto;text-align:right;\" >"+
										  "<img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\"  width=30px height=30px >"+
										  "<input type=\"text\"  id=\"reply_parent_master\" size=\"30\"  value=\"แสดงความคิดเห็น\" >"+
										  "<input type=\"submit\" value=\"Post\" onclick=\"postReplyMaster();\" /> <br>"+
								          "</div><br>"+    							  
    							  "</div> ";
    		}     		*/
    		
    		
    		logger.debug(" past post >>" +"|" + postMSG +"|" +request.getLocalAddr());
	//return msgPost;
    return trnPostReply;
	}

        
    
    @RequestMapping(value = "/replyParentLevel2")
    //public @ResponseBody String  postReplyMasterLevel2(
    public @ResponseBody TrnPostReply  postReplyMasterLevel2(
    
			@RequestParam(value="postParentID", required=true) int parentId,
    		@RequestParam(value="postMSGMaster", required=true) String postMSG,
    		@ModelAttribute(value= "userdetail") UserProfileForm userdetail,
			Map<String, Object> map ,
			HttpServletRequest request) {
    		
    	
    	
/*    	if (userdetail != null && userdetail.getUserName() !=null){
    		flagLogin = true;
    	}else{
    		return null;
    	}*/
    	if(chkLoginNotLogin(userdetail))return null;
    	
    		int userId =1;
    		//int maxRow =10;

    		
    	    int groupCommuId =0 ;
    	    int commuId =1;
    	    int moduleId =HaakConst.MODULE_LIFESTYLE;
    	    
    	    int languageId =1;
    	    int masterFlag =1;
    	    //int lifeID =0;
    	    String macIp = "";
    	    
    	    TrnPostReply trnPostReply = new TrnPostReply();
    	    trnPostReply.setCommunityId(commuId);
    	    trnPostReply.setCommunityGroup(groupCommuId);
    	    trnPostReply.setCreateBy(userId);
    	    trnPostReply.setCreateDate(new java.util.Date(System.currentTimeMillis()));
    	    trnPostReply.setMacIpAddress(macIp);
    	    trnPostReply.setLanguageId(languageId);
    	    trnPostReply.setMasterFlag(masterFlag);
    	    trnPostReply.setMessage(postMSG);
    	    trnPostReply.setModuleId(moduleId);
    	    trnPostReply.setParentId(parentId);
    	    
    	    
    	    blogService.saveTrnPostReply(trnPostReply) ;

    		logger.debug(" past post >>" +"|" + postMSG +"|" +request.getLocalAddr());
	//return msgPost;
    		
    return trnPostReply;
	}

    private boolean chkLoginNotLogin(UserProfileForm userdetail){
    	if (userdetail == null || userdetail.getUserName() ==null || userdetail.getUserName().length() ==0){
    		return true;
    	}
    	return false;    	
    }
    
}
