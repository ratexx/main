
<%@page import="java.net.URL"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="GENERATOR" content="MSHTML 9.00.8112.16440">

<link rel="stylesheet" href="/haaksq/resources/css/sms_step4_rowry-ui-timepicker-addon.css" type="text/css" media="all">
<link rel="stylesheet" href="/haaksq/resources/css/style_haaksq.css" type="text/css" media="all">
<link rel="stylesheet" href="../../resources/css/style_haaksq.css" type="text/css" media="all">
<script type="text/javascript"  type="text/javascript" src="../../haaksq/resources/js/datetimepicker.js"></script>


	<script type="text/javascript" language="javascript">
	
	function calendar_logo()
	{
	   if(FORM_SMS.chktime[1].checked==true)
	   NewCal('senddate','ddmmmyyyy',true,24);
	     
	}
	
	
	
	

	function CharCreditCounter(field,tbChar,tbCredit) 
	{
		var creditChar, keycode, addChar
		
		
		
		
		addChar = 0;
		var browser_detect = navigator.userAgent.toLowerCase();
		//20120910 : Supitchaya all browser count enter key +1
//		if((browser_detect.indexOf("chrome")+1) || (browser_detect.indexOf("firefox")+1))
//		{
		    for(var i=0;i<field.value.length;i++)
		    {  
		        if(field.value.charAt(i) == "\n")
			        addChar = addChar + 1;
		    }
//		}
		
		creditChar = 160;
		document.FORM_SMS.lan.value = "Eng3";
		for (var i=0;i<field.value.length;i++)
		{  
			keycode = field.value.charCodeAt(i);
			if (keycode > 160)
			{
				creditChar = 70;
				document.FORM_SMS.lan.value = "2";
				break;
			}
		}
		
		tbChar.value = field.value.length + addChar;
		if (tbChar.value > 70 && creditChar == 70)
			creditChar = 63;
		else if (tbChar.value > 160 && creditChar == 160)
			creditChar = 153;
		tbCredit.value = Math.ceil((tbChar.value) / creditChar);
		
		if (tbCredit.value > 3) 
		{
			field.value = field.value.substring(0,creditChar*3);
			creditChar = 153;
			document.FORM_SMS.lan.value = "Eng3";
			for (var i=0;i<field.value.length;i++)
			{  
				keycode = field.value.charCodeAt(i);
				if (keycode > 160)
				{
					creditChar = 63;
					document.FORM_SMS.lan.value = "2";
					break;
				}
			}
			tbChar.value = field.value.length + addChar;
			tbCredit.value = Math.ceil((tbChar.value) / creditChar);
			alert("Exceed Maximum Credit Support!");
		}
	}

	function textCounter(field,cntfield,maxlimit) 
	{   
	    //20100618 bom: check browser chrome and firefox solve Enter ploblem and compute character.
	    var browser_detect = navigator.userAgent.toLowerCase();
		if((browser_detect.indexOf("chrome")+1)||(browser_detect.indexOf("firefox")+1))
		{ 
		    var count=0;
		    for(var i=0;i<field.value.length;i++)
		    {  
		        if(field.value.charAt(i) == "\n")
			        count = count + 1;
		    }
			if(field.value.length+count>maxlimit)
		    { 
			    var ikeyCode = field.value.charAt(field.value.length-1);
			    if( ikeyCode == "\n" &&  (field.value.length+count > maxlimit))
			    {   
			            count = count -1;
				        field.value=field.value.substring(0,(field.value.length - 1));
				        cntfield.value = maxlimit - (field.value.length + count);
					
			    }
			    else 
			    {  
			        if( field.value.length+count > maxlimit)
					{   
	                    field.value = field.value.substring(0,maxlimit-count);
	                    cntfield.value = maxlimit - (field.value.length + count);					
					}
				    else
				    {   
					    
						field.value = field.value.substring(0,(field.value.length-1));
						cntfield.value = maxlimit - (field.value.length + count);
					}
			    }
		    }
		    else
		        cntfield.value = maxlimit - (field.value.length + count);
		}
		else
	    {
		    if (field.value.length > maxlimit) // if too long...trim it!
			{    
			    var ikeyCode = field.value.charAt(field.value.length-1);
			    if( ikeyCode == "\n" && field.value.length > maxlimit )
			    {    
				    field.value=field.value.substring(0,(field.value.length - 2));
				    cntfield.value = maxlimit - (field.value.length);
			    }
			    else 
			    {   
			        field.value = field.value.substring(0,maxlimit);
			    }
			}
			// otherwise, update 'characters left' counter
		    else
			    cntfield.value = maxlimit - field.value.length;
		}
	}
	//' July 14 Sin: Allow WAP Push
	function resetCounter(descField,cntfield) 
	{
		descField.value = "";
		cntfield.value = "1";
	} 
	function creditCounter(field,descField,cntfield,thaiCheck) 
	{
		var defaultChar,creditChar,urlChar,descChar,check
		defaultChar = 66;
		creditChar = 140;
		
		urlChar = field.value.length * 2;
		check = thaiCheck.checked;
		if (check)
		{
			descChar = descField.value.length * 6;
		}
		else
		{
			descChar = descField.value.length * 2;
		}	
		
		if ((urlChar + descChar + defaultChar) > (creditChar*3)) // if too long...trim it!
		{
			//if(type = 1)
				//field.value = field.value.substring(0, creditChar-defaultChar-descChar);
			
			//if(type = 2)
				descField.value = descField.value.substring(0, descField.value.length-1);
		}
		// otherwise, update 'characters left' counter
		else
			cntfield.value = Math.ceil((urlChar + descChar + defaultChar) / creditChar);//urlChar + descChar + defaultChar; 
			
		//document.FORM_SMS.sdate.value = urlChar + descChar + defaultChar;
		
		

		
		
	}
	function reload()
	{
		for(var i=0; i < document.FORM_SMS.lan.length; i++){
			if(document.FORM_SMS.lan[i].checked)
			var val=document.FORM_SMS.lan[i].value 
	}

	self.location='content2.asp?lan=' + val ;

	}
	// Start script for open  phone book popup.---by Kong [01-December-2009]---------
	function OpenPhoneBook(user)
	{
		window.open('popupphonebook.asp?user=' + user + '','popup','width=700,height=500,scrollbars=yes,toolbar=no')
	}
	// End script for open  phone book popup.---by Kong [01-December-2009]---------

	// Start script for safe click 2 time.---by Kong [15-December-2009]---------

	function disableSubmit(creditbalance)
	{
		//20100621 bom:Modify bug submit compute character no macth credit.
		//var submit = document.getElementById('cmdSubmit').style.display="none";
		//var loading = document.getElementById('iconLoading').style.display="inline";
		var count = 0;
		var lan = document.getElementsByName("lan");
		var mobile = document.FORM_SMS.mobile;
		var msg = document.FORM_SMS.message1;//document.gerElementsByName("message1");
		var lan2;
		var lan3;
		for(var i = 0; i < lan.length; i++){ //The mobile of label to sumary. 
			if(lan.item(i).checked)
			{
				lan2 = lan.item(i).value;
			}
		}
		var browser_detect = navigator.userAgent.toLowerCase();
		if((browser_detect.indexOf("chrome")+1)||(browser_detect.indexOf("firefox")+1))
		{ 
		    for(var i=0;i<msg.value.length;i++)
		    {  
		        if(msg.value.charAt(i) == "\n")
			        count = count + 1;
		    }
		}
		if(lan2 == "0"){lan3 = 160;}
		if(lan2 == "Eng2"){lan3 = 306;} //Concat msg "E" 153/sms
		if(lan2 == "Eng3"){lan3 = 459;} 
		if(lan2 == "SMS_MSGTYPE_UTF82UTF16"){lan3 = 70;}
		if(lan2 == "1"){lan3 = 126;} //Concat msg "T" 63/sms
		if(lan2 == "2"){lan3 = 189;}
		if(lan2 == ""){lan3 = "";}
		if(msg.value.length +count > lan3)
		{
		   alert("Submit Rejected! Message length does not match with credit");
		   //self.location='content2.asp';
		   return false;
		}
		
		if(mobile.value.length == 0)
		{
		   alert("Submit Rejected! Please fill in mobile number!");
		   //self.location='content2.asp';
		   return false;
		}
		if(msg.value.length == 0)
		{
		   alert("Submit Rejected! Please fill in message!");
		   //self.location='content2.asp';
		   return false;
	    }

		var numobile = document.FORM_SMS.numobile;
		var creditCount = document.FORM_SMS.creditCount;
		//20120810 Supitchaya: Add Function to check credit before submit
		var totalcredit = (numobile.value * creditCount.value);
		if (totalcredit > creditbalance) {
		    alert("SMS Credit is not enough : " + creditbalance + " / " + totalcredit);
		    return false;
		}
		if (totalcredit > 10000) {
		    alert("Please reduce credit to less than 10,000 credits");
		    return false;
		}

		//20110916 Sin: submit confirmation
		if (confirm("Submit Confirm? Total " + totalcredit + " SMS Credits."))
		{
			var submit = document.getElementById('cmdSubmit').style.display="none";
			var loading = document.getElementById('iconLoading').style.display="inline";
		}
		else
		{
			return false;
		}
	}
	// End script for safe click 2 time.---by Kong [15-December-2009]---------


	// Start script for open SMS template popup.---by Kong [01-April-2010]---------
	function submitOpen(lan)
	{
		window.open('smstemplate.asp?lanMain=' + lan + '','SMStemplate','width=600,height=600,scrollbars=yes,toolbar=no');
	}

	function checkLan() //Check select language
	{
		var lan = document.FORM_SMS.lan;//document.getElementsByName("lan");
		var lan2;
		var lan3;
		//for(var i = 0; i < lan.length; i++){ //The mobile of label to sumary. 
		//	if(lan.item(i).checked)
		//	{
		//		lan2 = lan.item(i).value;
		//	}
		//}
		lan2 = lan.value;
		if(lan2 == "0"){lan3 = "en1";}
		if(lan2 == "Eng2"){lan3 = "en2";}
		if(lan2 == "Eng3"){lan3 = "en3";}
		if(lan2 == "SMS_MSGTYPE_UTF82UTF16"){lan3 = "th1";}
		if(lan2 == "1"){lan3 = "th2";}
		if(lan2 == "2"){lan3 = "th3";}
		if(lan2 == ""){lan3 = "";}
		return lan3;
	}



	//20100722 Bom:function counter mobile on textarea  and modify error input mobile(086742740. and 086742740a) not count
	function textMobile1(field1,nummobile)
	{
		var Arrx = field1.value;
		var arrMobile ;
		var i = 0;
		var count = 0;
		var arr;
		
		Arrx = Arrx.replace(/\r\n/g,"\n");
		
	    if(Arrx.length == 0)
		{
		  nummobile.value='0';
		}
		  else
		{
		    arrMobile = Arrx.split ('\n');
	        while (i<arrMobile.length)
		   {
		        arr = arrMobile[i]; 
		        arr = arr.replace("-",""); 
	            if ((((arr.substring(0, 3) == "668" || arr.substring(0, 3) == "669") && arr.length == 11)
	            || ((arr.substring(0, 2) == "08" ||arr.substring(0, 2) == "09") && arr.length == 10))
	            && ((!isNaN(Number(arr))) && (arr.indexOf(".") < 0))) 
				{
			        count=count+1;
			    }

			    i = i + 1;
		    }
		    nummobile.value = parseInt(count);
		}
	}

 
  </script>
<script type="text/javascript"  type="text/javascript" src="/haaksq/resources/js/SMSPushMessage_MessageConversion.js"></script>
<script type="text/javascript"  type="text/javascript" src="/haaksq/resources/js/UnicodeConvertor.js"></script>
<BODY >
<div id="wrap">
<div id="sms_header">
  <div>
    <div id="sms_logo"><img src="/haaksq/resources/images/sms_header_logo.jpg" ></div>
	 <div id="sms_cradit_button" >
	   <input type="button" value="ซื้อเครดิต SMS" class="sms_button_credit">
	 </div>
	 
  </div>
</div>

<div>
</div>
<div class="newline"></div>
<div id="content">
<div class="left">
  

	 
	 

						<c:if  test="${!empty MAS_ROLE}">		
									<script type="text/javascript" language="javascript">
									
						function set_timesnow(form){
						
								form.senddate.value = "11-11-1111 11:11:11";
								form.senddate.style.display='none'; 
									}
					
								
									function set_times(form){
										
									
										
										if(form.chktime[1].checked==true){
											form.senddate.style.display='block'; 
											form.senddate.value = "";
										   
											
										}	
										
										if(form.chktime[1].checked==false){
										
											form.senddate.style.display='none'; 
											form.senddate.value = "";
										}	
										
									}
					
									
									
									
									function submit_form_send(form){
										
									
										var fgMobile = false;
																		 
										 var cbResults = 'Checkboxes: ';
										    var radioResults = 'Radio buttons: ';
										    for (var i = 0; i < form.elements.length; i++ ) {
										        if (form.elements[i].type == 'checkbox') {
										            if (form.elements[i].checked == true) {
										            	fgMobile = true;
										            	
										            }
										        }
										 
										    }
										
										   
										
									
									
											  if (form.sms.value == "") 
											  { 
											    alert('กรุณาใส่ข้อความ SMS'); 
											    form.sms.focus();
											    return false;
											  } 
											  else if (fgMobile == false) 
											  { 
												    alert('กรุณาเลือกผู้ที่จะส่ง SMS'); 
												    return false;
												  } 
											  else if (form.text_sms_summary_2.value >= form.text_sms_summary_3.value )
											  { 
												    alert('ไม่สามารถส่ง SMS ได้เนื่องจากจำนวน SMS เกินเครดิต'); 
												    return false;
												  } 
												  else 
											  { 
											    //alert(fields.length + " items selected"); 
											    form.submit();
											  } 
											  
										
									
											}									
									
									
									
									
									
									function submit_form_role(form){
										 var fgCommunity = false;
										 var fgRole = false;
										 
										
										 if (form.chkCommu.selectedIndex == 0) {
												alert("Please select community");
												return false;
											}
										 else 	 if (form.chkRole.selectedIndex == 0) {
												alert("Please select role");
												return false;
											}
										
									  else 
											  { 
											    //alert(fields.length + " items selected"); 
											    form.submit();
											  } 
											}
									
									
										
									function CalSMS(FormName, FieldName, CheckValue)
									{
										
										
										
									var countSelect = 0;
										if(!document.forms[FormName])
											return;
										var objCheckBoxes = document.forms[FormName].elements[FieldName];
										if(!objCheckBoxes)
											return;
										var countCheckBoxes = objCheckBoxes.length;
									
										if(!countCheckBoxes){
											if (objCheckBoxes.checked == true)
											countSelect = countSelect + 1;
											
										}
										else
											// set the check value for all check boxes
											for(var i = 0; i < countCheckBoxes; i++)
											   if (objCheckBoxes[i].checked == true)
												   countSelect = countSelect + 1;
											   
							
								
										
										document.forms[FormName].text_sms_summary_1.value = countSelect;
										document.forms[FormName].text_sms_summary_2.value = countSelect * document.forms[FormName].creditCount.value;
										document.forms[FormName].text_sms_summary_3.value =  document.forms[FormName].sms_credit_count.value -  (countSelect* document.forms[FormName].creditCount.value);
										
								
									}			
										
									
									
									
									function SetAllCheckBoxes(FormName, FieldName, CheckValue)
									{
										if(!document.forms[FormName])
											return;
										var objCheckBoxes = document.forms[FormName].elements[FieldName];
										if(!objCheckBoxes)
											return;
										var countCheckBoxes = objCheckBoxes.length;
										if(!countCheckBoxes)
											objCheckBoxes.checked = CheckValue;
										else
											// set the check value for all check boxes
											for(var i = 0; i < countCheckBoxes; i++)
										{
												objCheckBoxes[i].checked = CheckValue;
												
										}
										
									}			
										
									
									
									$( function() {
											$( '.checkAll' ).live( 'change', function() {
												$( '.cb-element' ).attr( 'checked', $( this ).is( ':checked' ) ? 'checked' : '' );
												$( this ).next().text( $( this ).is( ':checked' ) ? 'Uncheck All' : 'Check All' );
											});
											$( '.invertSelection' ).live( 'click', function() {
												$( '.cb-element' ).each( function() {
													$( this ).attr( 'checked', $( this ).is( ':checked' ) ? '' : 'checked' );
												}).trigger( 'change' );
									
											});
											$( '.cb-element' ).live( 'change', function() {
												$( '.cb-element' ).length == $( '.cb-element:checked' ).length ? $( '.checkAll' ).attr( 'checked', 'checked' ).next().text( 'Uncheck All' ) : $( '.checkAll' ).attr( 'checked', '' ).next().text( 'Check All' );
									
											});
										});
										
							
										
									</script>
							
									<form name="FORM_SENDER" action="/haaksq/haaksq/haaksms-reseceive.html"  method="POST">
										<div id="sms_step_1">
	 <div id="sms_step1_icon">
	   <input type="image" name="imageField" src="/haaksq/resources/images/sms_step1_icon.jpg">
	 </div>
	 <div id="sms_step1_group">
	      <div id="sms_step1_header">เลือกชุมชนและกลุ่มผู้รับ</div>
		  <div id="newline"></div>
		  <div id="sms_step1_detail_1">เลือกชุมชน</div><div id="sms_step1_select_1"><select name="chkCommu" class="sms_select_style">
									               			<option>      Please select      </option>
                                                              <c:forEach items="${LISTCOMMU}" var="CacheM" >
                                                                	<c:choose>
																	    <c:when test="${CHECKED_COMMU == CacheM.value}">
																	         <option value="${CacheM.value}"  selected="selected" >${CacheM.name}</option>
																	    </c:when>
																	     <c:otherwise>
																	      <option value="${CacheM.value}" >${CacheM.name}</option>
																	    </c:otherwise>
																	</c:choose>
																
                                                              </c:forEach>
                                                            </select>
		  </div>
		  <div id="newline"></div>
		  <div id="sms_step1_detail_2">เลือกกลุ่มผู้รับ</div><div id="sms_step1_select_2"><select name="chkRole"  id="chkRole" class="sms_select_style">
																<option>      Please select      </option>
                                                                  <c:forEach items="${MAS_ROLE}" var="masRole">
                                                                     
                                                                        <c:choose>
                                                                        
                                                                     
                                                                  		 <c:when test="${CHECKED_ROLE[0] == masRole.roleId}">
																	      <option value="${masRole.roleId}"  selected="selected" >${masRole.roleName}</option> 
																	    </c:when>
																	     <c:otherwise>
																	       <option value="${masRole.roleId}" >${masRole.roleName}</option> 
																	    </c:otherwise>
                                                                  		</c:choose>
                                                                  
                                                                  
                                                                  
                                                                  
                                                                  </c:forEach>
                                                                </select>	
		  </div>
																<div id="sms_step1_button"><input type="button" class="sms_button"onclick=submit_form_role(FORM_SENDER); value="ยืนยัน"></div>
	 </div>
</div>	
				          </form>
	  </c:if>	

  


 
<c:if  test="${!empty RECEIVER}"> <span id="sum"> </span>
            <script type="text/javascript" language="javascript">
										$( function() {
											$( '.checkAll' ).live( 'change', function() {
												$( '.cb-element' ).attr( 'checked', $( this ).is( ':checked' ) ? 'checked' : '' );
												$( this ).next().text( $( this ).is( ':checked' ) ? 'Uncheck All' : 'Check All' );
											});
											$( '.invertSelection' ).live( 'click', function() {
												$( '.cb-element' ).each( function() {
													$( this ).attr( 'checked', $( this ).is( ':checked' ) ? '' : 'checked' );
												}).trigger( 'change' );
									
											});
											$( '.cb-element' ).live( 'change', function() {
												$( '.cb-element' ).length == $( '.cb-element:checked' ).length ? $( '.checkAll' ).attr( 'checked', 'checked' ).next().text( 'Uncheck All' ) : $( '.checkAll' ).attr( 'checked', '' ).next().text( 'Check All' );
									
											});
										});
										
										
										function submit_form(form){
							
											{ 
												  var fields = $("input[name='mobileno']").serializeArray(); 
												  if (fields.length == 0) 
												  { 
												    alert('nothing selected'); 
												  } 
												  else 
												  { 
												    //alert(fields.length + " items selected"); 
												    form.submit();
												  } 
												}
							
											
										}
										//
										
									</script>
            <script type="text/javascript">
								    $(function(){  
							
								       //$("#datepicker").datepicker();
								    	$("#senddate").datetimepicker(
								    		{
								    				changeMonth: true,
								    	            changeYear: true,
								    				timeFormat: 'hhmm',
								    				showSecond: false,
								    				dateFormat:'ymmdd',
								    				separator: ''
								    			});
								    	
								    	
								    	//$('#datepicker').datetimepicker({
								    		//altField: "#alt_example_4_alt",
								    		//altFieldTimeOnly: false ,
								    		//timeFormat: 'hhmm' ,
								    		//dateFormat:'ymmdd'
								    	//});
							
								    });
							
								    $(function(){
								    	$("#sms").smsCounter("#count");
								    });
								    
								    
								    
								</script>
            <form name="FORM_SMS" action="/haaksq/haaksq/haaksmssend.html"  method="POST" >
              <INPUT name="lan"    value="2" type="hidden">
              <input type="hidden" value="${COMMU_ID}"  name = "COMMU_ID" >
              <input type="hidden" value="1"  name = "USE_CREDIT" >
         
           
										<div id="sms_step_2">
	 <div id="sms_step1_icon">
	   <input type="image" name="imageField" src="/haaksq/resources/images/sms_step2_icon.jpg">
	 </div>
	 <div id="sms_step2_group">
	      <div id="sms_step1_header">ใส่ข้อความ</div>
		  <div id="newline"></div>
		       <c:forEach items="${CREDIT_SMS}" var="CacheM" > 
					<input type="hidden" value="${CacheM.value}"  name = "SMS_QUOTA_CREDIT" >
					<div id="sms_step2_detail_1">ชื่อชุมชน</div>
					<div id="sms_step2_community">${CacheM.name}
					</div>
					  <div id="newline"></div>
					<div id="sms_step2_detail_2">จำนวน SMS ที่สามารถใช้งานได้ </div>
					<div id="sms_step2_sms_counter">${CacheM.value}<input id="sms_credit_count" name="sms_credit_count" type="hidden" value="${CacheM.value}">
					</div>
		       </c:forEach>
			 
			     <div id="newline"></div>
				 <div id="sms_step2_sms_counter">  <div>
				   <textarea   onKeyDown="CharCreditCounter(document.FORM_SMS.sms,document.FORM_SMS.charCount,document.FORM_SMS.creditCount),CalSMS('FORM_SMS', 'mobileno', true)"
									name="sms"  id="sms" required="required" class="sms_step2_textarea" ></textarea>
				</div>
				 <div id="newline"></div>
			     <div id="count"></div>
    			<div>
              <INPUT id="charCount" name="charCount" readOnly="" maxLength="3" 
      value="0" size="3" type="text">
              จำนวนตัวอักษร
              <INPUT id="creditCount" name="creditCount" 
      readOnly="" maxLength="3" value="0" size="3" type="text">
              จำนวนข้อความ SMS
			   </div>
			   
			   </div>
     </div>
										</div>	
				   
 <div id="sms_step_1">
	 <div id="sms_step1_icon">
	   <input type="image" name="imageField" src="/haaksq/resources/images/sms_step3_icon.jpg">
	 </div>
	 <div id="sms_step3_group">
	      <div id="sms_step1_header">ตั้งเวลาการส่ง</div>
		  <div id="newline">
		    
		  </div><div id="sms_step1_detail_1">  <input name="chktime" checked="checked" id="chktimenow" type="radio" onclick=set_timesnow(FORM_SMS) value="1">
		  ส่งทันที
		  <a 
      href="#">  </a>
                <div id="sms_step3_calendar"></div>
	  
	  <div></div>
              
                
		  </div><div id="newline"> </div>
		  <div id="sms_step1_detail_1">  <input name="chktime" id="chktime" type="radio" onclick=set_times(FORM_SMS) value="2">
                ตั้งเวลาส่งล่วงหน้า
                <a 
      href="#">  </a>
              <div id="sms_step3_calendar"></div>
	  
	  <div></div>
              
                
		  </div>
		
		    <div id="sms_step3_calendar">

              <img  id="calendar_icon" name="calendar_icon" src="/haaksq/resources/images/sms_calendar_icon.jpg" class="sms_step3_calendar" onClick="calendar_logo();" >
         
		  </div><div id="newline">
                <input id="senddate" style="display:none"  name="senddate" required="required"  maxlength="25" size="25"   type="text" class="sms_step3_calendar_style" onClick="javascript:NewCal('senddate','ddmmmyyyy',true,24)">
              
              
              </div>
		  </div>
		  
		  
		  
		  
		  
		  
 </div>	
 
 <div id="sms_step_4">
	 <div id="sms_step1_icon">
	   <input type="image" name="imageField" src="/haaksq/resources/images/sms_step4_icon.jpg">
	 </div>
	 <div id="sms_step4_group">
	      <div id="sms_step1_header">เลือกและยืนยันผู้รับ</div>
		  <div id="newline">
		    
		  </div>
		  <div id="sms_step4_button">
		    <input name="button2" type="button" class="sms_button" onClick="SetAllCheckBoxes('FORM_SMS', 'mobileno', true),CalSMS('FORM_SMS', 'mobileno', true);" value="เลือกทั้งหมด">
		    <input name="button3" type="button" class="sms_button" onClick="SetAllCheckBoxes('FORM_SMS', 'mobileno', false),CalSMS('FORM_SMS', 'mobileno', true);" value="เลือกออกทั้งหมด"> 
		    <input name="button4" type="button" class="sms_button" onClick="location.href='/haaksq/haaksq/haaksms2u.html'" value="ย้อนกลับ">
		  </div>
		
		    <div id="sms_step3_calendar"></div><div id="newline"></div>
			
			
					
			
			<div id="sms_step4_row_head" >
			 <div id="sms_step4_column1_head"></div> <div id="sms_step4_column1_head">No</div> <div id="sms_step4_column2_head">บ้านเลขที่</div>  <div id="sms_step4_column3_head">ชื่อ นามสกุล</div> <div id="sms_step4_column4_head">เบอร์ติดต่อ</div>
			</div>
			
			<c:forEach items="${RECEIVER}" var="VSmsemailProfiles"  varStatus="rowCounter">
			
			
			
			
                  
                
               
                  <c:choose>
                  <c:when test="${rowCounter.count % 2 == 0}">
              
			  	<div id="sms_step4_row2">
			   <div id="sms_step4_column12"></div> <div id="sms_step4_column12"> <input type="checkbox"  class="cb-element"  
			   name="mobileno"   class="required"  value="${VSmsemailProfiles.mobile}"  id="mobileno"  onClick="CalSMS('FORM_SMS', 'mobileno', true);">
			   </div> 
			   <div id="sms_step4_column22">${VSmsemailProfiles.addressNo}</div>  <div id="sms_step4_column32"> ${VSmsemailProfiles.userName}</div> <div id="sms_step4_column42"> ${VSmsemailProfiles.mobile}</div>
			</div>
	
			  
			  
                  </c:when>
                  
                  
                  </c:choose>
              
                  <c:choose>
                  <c:when test="${rowCounter.count % 2 != 0}">
              
			  	<div id="sms_step4_row">
			   <div id="sms_step4_column1"></div> <div id="sms_step4_column1"> <input type="checkbox"  class="cb-element"  
			   name="mobileno"   class="required"  value="${VSmsemailProfiles.mobile}"  id="mobileno" onClick="CalSMS('FORM_SMS', 'mobileno', true);" ></div> 
			   <div id="sms_step4_column2">${VSmsemailProfiles.addressNo}</div>  <div id="sms_step4_column3"> ${VSmsemailProfiles.userName}</div> <div id="sms_step4_column4"> ${VSmsemailProfiles.mobile}</div>
			</div>
			
		
			  	 
			  
			  
                  </c:when>
                  
                  
                  </c:choose>
            </c:forEach>
       
	   
	      
	   
		  </div>
		 
		  
		  
		  
		     <div class="newline"> </div>
		  <div id="sms_summary_group">  
		  
			 <div id="text_sms_summary">จำนวนผู้รับข้อความครั้งนี้				  </div>
			 <div id="text_sms_summary_value">
			   <input type="text" id="text_sms_summary_1" name="text_sms_summary_1" class="sms_text_value_data" value="0">
		   &nbsp;คน</div>
			   	<div id="newline" ></div>
		     <div id="text_sms_summary">จำนวน SMS ที่ใช้ไปครั้งนี้&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div> 
		     <div id="text_sms_summary_value">
		    <input type="text" id="text_sms_summary_2" name="text_sms_summary_2" class="sms_text_value_data"  value="0">
&nbsp;ครั้ง </div>
			 	<div id="text_sms_summary">จำนวน SMS เครดิตคงเหลือ 	</div>  
		     <div id="text_sms_summary_value">
		       <input type="text" id="text_sms_summary_3" name="text_sms_summary_3" class="sms_text_value_data" value="0">
&nbsp;ครั้ง</div>
			  <div id="text_sms_summary">หลังจากส่งข้อความนี้</div>
		 
		  </div>
  <div class="newline"> &nbsp; 
    <div> 
      <div align="center">
        <input name="button" type="button"  class="sms_button"   onClick=submit_form_send(FORM_SMS);  value="ส่งข้อวาม">
      </div>
    </div>
		    <div class="newline"> &nbsp; 
  </div>
 </div>
 	  

	                                    </c:if>
	<c:if  test="${!empty RECEIVER}">
            </form>
    </c:if>

</div>

</div>
<div style="clear: both;"></div>
<div id="footer">

</div>


</div>