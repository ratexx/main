<%@page import="java.net.URL"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.7.3.custom/js/jquery-ui-1.7.3.custom.min.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.7.3.custom/js/jquery-ui-timepicker-addon.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.7.3.custom/js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.7.3.custom/js/jquery.smscounter.min.js"></script>
<link rel="stylesheet" href="/haaksq/resources/jquery-ui-1.7.3.custom/css/ui-lightness/jquery-ui-1.7.3.custom.css" type="text/css" media="all">
<link rel="stylesheet" href="/haaksq/resources/jquery-ui-1.7.3.custom/css/ui-lightness/jquery-ui-timepicker-addon.css" type="text/css" media="all">





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


<script type="text/javascript">


function submit_form(form){

	{ 
		  var fields = $("input[name='chkRole']").serializeArray(); 
		  if (fields.length == 0) 
		  { 
		    alert('please selecte Role'); 
		  } 
		  else 
		  { 
		    //alert(fields.length + " items selected"); 
		    form.submit();
		  } 
		}

	
}
//

function add() {
	jq(function() {
		// Call a URL and pass two arguments
		// Also pass a call back function
		// See http://api.jquery.com/jQuery.post/
		// See http://api.jquery.com/jQuery.ajax/
		// You might find a warning in Firefox: Warning: Unexpected token in attribute selector: '!' 
		// See http://bugs.jquery.com/ticket/7535
		jq.post("/haaksq/haaksq/haaksms.html",{ 	inputNumber1:  jq("#mobileno").val(),inputNumber2:  jq("#msg").val() },
						function(data){
							// data contains the result
							// Assign result to the sum id
							jq("#sum").replaceWith('<span id="sum">'+ data + '</span>');
					});
	});
}
</script>






<c:if  test="${!empty MAS_ROLE}">		
	<span id="sum">	</span>
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
		</script>

		<form name="FORM_ROLE" action="/haaksq/haaksq/haaksms.html"  method="POST">
				<table>
								<tr><td></td><td><span><a href="javascript:void(0);" class="invertSelection">ทั้งหมด</a></span></td></tr>		
		               			<c:forEach items="${MAS_ROLE}" var="masRole">
								<tr>
									<td><input type="checkbox"  class="cb-element"  name="chkRole"   class="required"  value=${masRole.roleId}  id = "chkRole" > </td><td>${masRole.roleName}</td>
								</tr>
		               			</c:forEach>
										
								<tr><td></td><td><input type="button" onclick=submit_form(FOsubmit_form)>
         </form>
 </c:if>










<c:if  test="${!empty RECEIVER}">	

	<style>
	body{text-align:center;}
	textarea{height:50px;margin:30px;width:100px;}
</style>
	
	<span id="sum">	</span>
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

	<form name="FORM_SMS" action="/haaksq/haaksq/sendsms.html"  method="POST" >
	
<!-- 		msg<input type="text" required="required" name="msg"  id="msg"> -->
		<textarea  name="sms"  id="sms" required="required" ></textarea>
<div id="count"></div>
		
		<br>
		<p>Date: <input id="senddate"  name="senddate" required="required"   type="text">YYMMDDhhmm</p>


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

	</form>








