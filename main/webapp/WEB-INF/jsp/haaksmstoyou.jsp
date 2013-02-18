<%@page import="java.net.URL"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.7.3.custom/js/jquery-ui-1.7.3.custom.min.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.7.3.custom/js/jquery-ui-timepicker-addon.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.7.3.custom/js/jquery-1.3.2.min.js"></script>
<link rel="stylesheet" href="/haaksq/resources/jquery-ui-1.7.3.custom/css/ui-lightness/jquery-ui-timepicker-addon.css" type="text/css" media="all">




			<script type="text/javascript">
	    $(function(){  

	       // $("#datepicker").datepicker();
	    	$("#senddate").datetimepicker(
	    			{
	    				changeMonth: true,
	    	            changeYear: true,
	    				timeFormat: 'hhmm',
	    				showSecond: false,
	    				dateFormat:'ymmdd',
	    				separator: ''
	    			});
	    });


	    
	    
	    
	</script>


	<script type="text/javascript">
	    var jq = jQuery.noConflict();
	 // Start
	    $(document).ready(function(){
	    	// Validate Form
	    	$("FORM_ROLE").each(function(){
	    		$(this).validate();
	    	});
	     }
	    );
	    


	 
	</script>
	
	
	
	
	

<c:if  test="${!empty RECEIVER}">	


	

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
					  var x=document.forms["FORM_SMS"]["senddate"].value;
					  var x2=document.forms["FORM_SMS"]["msgsms"].value;
					  if (fields.length == 0) 
					  { 
					    alert('nothing selected'); 
					    return false;
					  } 
					  
					  if (x==null || x=="")
					    {
					    alert("เวลาส่ง  must be filled out");
					    return false;
					    }
					  if (x2==null || x2=="")
					    {
					    alert("ข้อความ must be filled out");
					    return false;
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
		
		
		

	
	
	<form name="FORM_SMS" action="/haaksq/haaksq/haaksmssend.html"  method="POST" >
	
<div id="count"></div>
		<textarea  name="msgsms"  id="msgsms"  required="required" ></textarea>
		
		<br>
		<p>Date: </p><input id="senddate"  name="senddate"  required="required"   type="text">YYMMDDhhmm


				<table >
								<tr>
									<td><span><a href="javascript:void(0);" class="invertSelection">ทั้งหมด</a></span></td>
									<td>|<a href="/haaksq/haaksq/haaksms.html">ย้อนกลับ</a>|</td>
									<td><input type="button"  value="ส่ง"   onclick=submit_form(FORM_SMS);></td>
								</tr>
								</table>
								<table>
								<tr>
		               			<c:forEach items="${RECEIVER}" var="VSmsemailProfiles"  varStatus="rowCounter">

										<td><input type="checkbox"  class="cb-element"  name="mobileno"   class="required"  value=${VSmsemailProfiles.mobile}  id = "mobileno" > ${VSmsemailProfiles.mobile} - ${VSmsemailProfiles.userName} </td>
									<c:choose>
									<c:when test="${rowCounter.count % 5 == 0}">
									</tr>
										<tr>
									</c:when>
									</c:choose>
		               			</c:forEach>
		               			</tr>
		               			</table>
		               			
         </form>
 </c:if>














