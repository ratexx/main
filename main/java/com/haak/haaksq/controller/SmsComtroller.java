package com.haak.haaksq.controller;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.joda.DateTimeParser;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;



import com.haak.haaksq.constanst.HaakConst;
import com.haak.haaksq.form.CacheM;
import com.haak.haaksq.form.PageInPutUser;
import com.haak.haaksq.form.UserProfileForm;
import com.haak.haaksq.form.VUserProfile;
import com.haak.haaksq.service.AdminAddService;
import com.haak.haaksq.service.ContactService;
import com.haak.haaksq.service.LoadPageService;


@Controller
@SessionAttributes({"menuformList","userdetail","adlist"})

public class SmsComtroller {
	protected static Logger logger = Logger.getLogger("controller");

    @Autowired
    private AdminAddService adminService;  
	
    @Autowired
    private ContactService contactService;  

    @Autowired
    private LoadPageService loadPageService;  

    
    @ExceptionHandler(Exception.class)
    public String handleException (Exception ex) {
    
    ex.printStackTrace();
      System.out.println("Exception found: " + ex.getMessage());

		return "admin.html";

    }
    
/*    @RequestMapping(value="/loadpagesms.html" , method = RequestMethod.GET)
	public String test(HttpServletRequest re ,
			HttpServletResponse resp,
			Map<String, Object> map
			){
			   
    	   //map.put("MAS_ROLE" , contactService.getMasRole());
    	
		return "haaksms.html";

	}	
    
    @RequestMapping(value="/haaksms.html" ,method = RequestMethod.GET)
	public String searchRole(@ModelAttribute("userdetail")UserProfileForm user,
			Map<String, Object> map
			){
    	  logger.debug("User" + user.getUserName());
    	  
    	   map.put("MAS_ROLE" ,contactService.getMasRole());
   		return "haaksms.html";
	}	
    */
    
    @RequestMapping(value="/haaksms-reseceive.html" ,method = RequestMethod.POST)
	public String receiveSms(@ModelAttribute("userdetail")UserProfileForm user,
    		@RequestParam(value="chkCommu", required=true) int chkCommu,
    		@RequestParam(value="chkRole", required=true) Integer[] chkRole,
    		
			Map<String, Object> map
			){
    	logger.debug("haaksms-reseceive.html");  
    	int forUDDC = 2;
    	int languageID = 1;
		boolean flagAdmin = false;
    	
    	for(int i=0;i<user.getRoleList().length;i++){    		
    		if( user.getRoleList()[i]==HaakConst.ROLE_ADMIN  ){
    			map.put("PassAdmin", "YY");
    			flagAdmin = true;
    			
    		}
    	}
    	
    	if(flagAdmin == false){
    		
    		map.put("ERROR", "สำหรับ Admin เท่านั้น");
    		return "haaksms2u.html";
    	}
    	
    	map.put("CHECKED_ROLE", chkRole);
    	map.put("CHECKED_COMMU", chkCommu);

    	map.put("COMMU_ID", chkCommu);
    	map.put("LISTCOMMU", adminService.getCacheM(HaakConst.LISTBOX_COMMUNITY_BY_GROUP, user.getCommuID()) );
    	map.put("CREDIT_SMS", adminService.getCacheM(HaakConst.LIST_SMS_COMMUNITY_CREDIT,chkCommu) );
    	map.put("MAS_ROLE" ,contactService.getMasRole());
    	
    	Integer[] commuId =new Integer[]{chkCommu};
    	map.put("RECEIVER",contactService.getUserForReceiver(commuId,chkRole));
    	
    	//map.put("MAS_ROLE" ,contactService.getMasRole());
   		return "haaksms2u.html";
	}	    
    
    @RequestMapping(value="/haaksms2u.html" ,method = RequestMethod.GET)
	public String sms2u(@ModelAttribute("userdetail")UserProfileForm user,

			Map<String, Object> map
			){
    	
    	int forUDDC = 2;
    	int languageID = 1;
		boolean flagAdmin = false;
    	
    	for(int i=0;i<user.getRoleList().length;i++){    		
    		if( user.getRoleList()[i]==HaakConst.ROLE_ADMIN ||
    				user.getRoleList()[i]==HaakConst.ROLE_ADMIN_GROUP ||
    						user.getRoleList()[i]==HaakConst.ROLE_ADMIN_COMMUNITY
    				){

    			map.put("PassAdmin", "YY");
    			flagAdmin = true;
    			
    		}
    	}
    	
    	if(flagAdmin == false){
    		
    		map.put("ERROR", "สำหรับ Admin เท่านั้น");
    		return "admin.html";
    	}
    	
    	
    	map.put("CacheM", new CacheM());
    	map.put("LISTCOMMU", adminService.getCacheM(HaakConst.LISTBOX_COMMUNITY_BY_GROUP, user.getCommuID()) );
    	map.put("MAS_ROLE" ,contactService.getMasRole());
    	
    	//Integer[] role =new Integer[]{1,6};
    	//map.put("RECEIVER",contactService.getUserForReceiver(forUDDC,role));

    	//map.put("MAS_ROLE" ,contactService.getMasRole());
   		return "haaksms2u.html";
	}	
    
    private String convert(String s, String encoding) {  
    	  
    	StringBuffer buf = new StringBuffer();  
    	  
    	try {  
    	byte[] bytes = s.getBytes(encoding);  
    	for (int i = 0; i < bytes.length; i++) {  
    		
    	String byteAsHex = Integer.toHexString(0xFF & bytes[i]);
    	
    	for (int ii = byteAsHex.length(); ii <2 ;ii++ ){
    		byteAsHex = "0"+byteAsHex;
    		
    	}
    	//buf.append("0");  
    	buf.append(byteAsHex);  
    	}  
    	}  
    	catch (Exception e) {  
    	System.out.println("That's not a valid encoding");  
    	}  
    	  
    	return buf.toString();  
    	  
    	} 
    
    private String chkTime(String originalString){
    	
		  Locale locale = Locale.getDefault();
		  System.out.println("Before setting, Locale is = " + locale);
		  // Setting default locale  
		  locale = Locale.US;
		  Locale.setDefault(locale);
		  System.out.println("After setting, Locale is = " + locale);

    	Date dateNow = new Date();

    	
    	try{

    		  DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    		//DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    		  Date inputDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(originalString);

    		  
    		  
    		  
    		  Date date2 = new Date(inputDate.getTime());
			  //DateTime scheduledatetime = formatter.parseDateTime(dateString);
    		  logger.debug("VVVVVVVVVVVVVVVVv" +  dateFormat.format(dateNow).toString() +"-------------" + dateFormat.format(date2).toString());
			  
			  if( inputDate.compareTo(dateNow) < 0){
				  return dateFormat.format(dateNow).toString();
			  }else{
				  return dateFormat.format(inputDate).toString();
			  }

    	}catch(Exception e){
			  //return  new SimpleDateFormat("ddMMinyyyyHHmmss").parse(dateNow.toString()).toString();
    		return null;
    		
    	}
  	  //String DBDatetime = //schedule date from datebase;

  			  // parse the string
  			//10-12-2012 15:59:44
  			  
    	
    }
    
    
    @RequestMapping(value="/haaksmssend.html" ,method = RequestMethod.POST)
	public String sendSms(
			@RequestParam(value="sms") String msgsms,
			@RequestParam(value="mobileno") String[] listmobileno,
			@RequestParam(value="mobileno") String mobilenolist,
			@RequestParam(value="senddate") String senddate,
			@RequestParam(value="USE_CREDIT") int  useCredit,
			@RequestParam(value="SMS_QUOTA_CREDIT") int  smsQuotaCredit,			
			@RequestParam(value="COMMU_ID") int  commuId,
			@RequestParam(value="text_sms_summary_2") int  totalSMS,
			
			@ModelAttribute("userdetail")UserProfileForm user,
			Map<String, Object> map
			){
    		
    		if(smsQuotaCredit - totalSMS < 0){
    			return "haaksmssum.html";
    		}
    	
    		try{
    			logger.debug("listmobileno"+listmobileno.toString());
    			logger.debug("listmobileno"+listmobileno.length);
    			logger.debug("COMMU_ID" + commuId);
    			logger.debug("totalSMS" + totalSMS);
    			
    			String msgConverted = new String(msgsms.getBytes("UTF-16"), "UTF-16");
    			
    			
    				String urlen=
					HaakConst.SMS_URL+
							HaakConst.SMS_USER_NAME+"&"+
							HaakConst.SMS_PASSWORD+"&"+
							HaakConst.SMS_LANUAGE_FLAG+"1&"+
							HaakConst.SMS_SENDER+ "&"+ 
							HaakConst.SMS_MESSAGE+convert(msgsms, "UTF-16")+	"&"+
							HaakConst.SMS_MOBILE_NO+mobilenolist ;
							
    						if(chkTime(senddate)!=null){
    							urlen +="&"+HaakConst.SMS_SCHEDULED + chkTime(senddate) ;
    						}
    				
    				logger.debug(" send date xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx " +urlen);	
    				
    			
    			
/*  			URL oracle = new URL( urlen)  ;
    	        
    	        BufferedReader in = new BufferedReader(
    	        new InputStreamReader(oracle.openStream()));

    	        String inputLine;
    	        while ((inputLine = in.readLine()) != null)
    	            System.out.println(inputLine);
    	        in.close();*/
    				
    				adminService.saveLogSMS(commuId, msgsms, listmobileno, user.getUserID(), totalSMS);
    				map.put("SMS_MSG", msgsms);
    				map.put("SEND_DATE", senddate);
    				map.put("USE_CREDIT", totalSMS);
    				//map.put("TOTAL_USED_SMS",  listmobileno.length*totalSMS);
    				map.put("TOTAL_MOBILE", listmobileno.length);
    				
    				map.put("SMS_QUOTA_CREDIT",smsQuotaCredit-totalSMS);
    				

    				    			
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    	  
   		return "haaksmssum.html";
	}	
    /*
    @RequestMapping(value="/testsms.html" ,method = RequestMethod.POST)
	public String testSendSms(HttpServletRequest re ,
			HttpServletResponse resp,
			@RequestParam(value="msgsms") String msgsms,
			Map<String, Object> map
			){

    		try{
    			
    
    			
    			
    			String s1 = new String(msgsms.getBytes("UTF-16"), "UTF-16");
    			String urlen = "http://122.155.5.132/receive/qrbulksmsapi.asp?username=haaksq&password=haaksq&sendername=YourBrand&lan=1&message="+
    			convert(msgsms, "UTF-16")+
    		//	  "&mobile=0818326194";
  			    "&mobile=0818326194,0847006932,0898167430";
    			//String xx= new String("0E010E020E050E040E050E060E070E080E090E0A0E0B0E0C0E0D0E0E0E0F0E100E110E120E130E140E150E160E170E180E190E1A0E1B0E1C0E1D0E1E0E1F0E200E210E220E230E250E270E280E290E2A0E2B0E2C0E2D0E2E"., "UTF-8");
    			System.out.println("s1" + convert(msgsms, "UTF-16"));
    			
    			
/*    			URL oracle = new URL( urlen)  ;
    	        
    	        BufferedReader in = new BufferedReader(
    	        new InputStreamReader(oracle.openStream()));

    	        String inputLine;
    	        while ((inputLine = in.readLine()) != null)
    	            System.out.println(inputLine);
    	        in.close();*/
    			/*	    			
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    	  
   		return "testsms.html";
	}	
    */

    
    /*
    @RequestMapping(value="/haaksms.html" ,method = RequestMethod.POST)
	public String getUser(
			@RequestParam(value="chkRole")String[] chkList,
			Map<String, Object> map 
			){
    	
    		
    	
    		Integer[] chk =new Integer[chkList.length];
    		int loop = 0;
    		
    		for(String x:chkList){
    			chk[loop] = Integer.parseInt(x);
    			loop +=1;
    		}

    		//map.put("RECEIVER",contactService.getUserForReceiver(1,chk));
    		
   		return "haaksms.html";
	}	

    
    */
    /*
    @RequestMapping(value="/sendsms.html",method = RequestMethod.POST )
	public String test(HttpServletRequest re ,
			HttpServletResponse resp,
			@RequestParam(value="mobileno") String mobileno,
			@RequestParam(value="msg") String msg,
			@RequestParam(value="senddate") String senddate
			){
			   
    	
    	
		try{
			

			
			String urlen=
					HaakConst.SMS_URL+"?"+
							HaakConst.SMS_USER_NAME+"&"+
							HaakConst.SMS_PASSWORD+"&"+
							//HaakConst.SMS_MSISDN+mobileno.trim()+"&"+
							HaakConst.SMS_MESSAGE+ java.net.URLEncoder.encode(msg.trim(), "UTF-8")+"&"+
							HaakConst.SMS_SENDER+"&"+ 
							HaakConst.SMS_SCHEDULED + senddate 
					;
/*	        URL oracle = new URL( urlen)  ;
	        
	        BufferedReader in = new BufferedReader(
	        new InputStreamReader(oracle.openStream()));

	        String inputLine;
	        while ((inputLine = in.readLine()) != null)
	            System.out.println(inputLine);
	        in.close();*/
	    	
			
		/*
			
			System.out.println( " Call SMS" +urlen);
			
			
		}catch(Exception e){
			System.out.println( " catch error");
			e.printStackTrace();
			
		}	   
		System.out.println( " Return Now !!!");
		return "error.html";

	}	
*/
    
    
	@RequestMapping(value="/smscallback.html", method = RequestMethod.GET)
	public String returnFromApiSMS(HttpServletRequest re ,
		   @RequestParam(value="status", defaultValue="hello") String status ,
		   @RequestParam(value="detail", defaultValue="hello") String detail ,
		   @RequestParam(value="msisdn" ) String msisdn ,
		   @RequestParam(value="transaction", defaultValue="hello") String transaction ,
		   @RequestParam(value="UsedCredit", defaultValue="hello") String usedCredit ,
		   @RequestParam(value="RemainCredit", defaultValue="hello") String remainCredit
	) {
		//Set<String> appNameSet = mainService.getAppName().keySet();
		//model.addAttribute("message", "Call MAin.html");
		//model.put("SuperSearchViewCenterList",mainService.getApp()); 		
		
		String ccc = null ; 
		System.out.println("+++++status+++++++" + status);
		System.out.println("+++++detail+++++++" + detail);
		System.out.println("+++++msisdn+++++++" + msisdn);
		System.out.println("+++++transaction+++++++" + transaction);
		System.out.println("+++++UsedCredit+++++++" + usedCredit);
		System.out.println("+++++remainCredit+++++++" + remainCredit);
		
		return "error.html";

	}	
    
    /*
	 @RequestMapping(value = "/send", method = RequestMethod.POST)
	    public @ResponseBody Map<String, Object> map(
	    		HttpServletRequest re ,
	 		   @RequestParam(value="status", defaultValue="hello") String status ,
	 		   @RequestParam(value="detail", defaultValue="hello") String detail ,
	 		   @RequestParam(value="msisdn" ) String msisdn ,
	 		   @RequestParam(value="transaction", defaultValue="hello") String transaction ,
	 		   @RequestParam(value="UsedCredit", defaultValue="hello") String usedCredit ,
	 		   @RequestParam(value="RemainCredit", defaultValue="hello") String remainCredit ,
	 		  Map<String, Object> map) {
			logger.debug("Received request to add two numbers");
			
			map.put("RESP_SMS",msisdn);
			// Delegate to service to do the actual adding
			//Integer sum = springService.add(inputNumber1, inputNumber2);
			
			// @ResponseBody will automatically convert the returned value into JSON format
			// You must have Jackson in your classpath
			return map;
		}
	*/
    

}
