<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/haaksq/resources/css/style_haaksq.css" type="text/css" media="all">
		<script type="text/javascript" src="/haaksq/resources/js/jquery/jquery.pajinate.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$('#paging_container2').pajinate();
			});		

		</script>

<div id="wrap">
<div id="content">
<div class="left">
	   	
						
							<c:if test='${!empty HAS_ERROR }'>
								Result not found !
							</c:if>			 <div id="newline">&nbsp;</div> 	
							              	 <form action="/haaksq/haaksq/searchkey.html" method="POST">
              	 	<div id="sms_step1_detail_1" style="width:500px;"> ค้นหาสมาชิกในชุมชน :  <input type="text"  name ="wordparse" class="sms_step3_calendar_style" />  <input type="submit" class="sms_button"/><span style="float:left">
              	 	 
              	 	</span></div>
              	 	<div style="float:left">
              	 	 </div>
              	 </form>	
				 <div id="newline">&nbsp;</div> 	
<c:if  test="${!empty LIST_USER}">   
      <div  id="sms_step_4">
        <article >
          <div >
            <div >
              <div id="sms_step1_header">รายชื่อสมาชิกในชุมชน</div>
			<div id="newline">&nbsp;</div> 	
			  
			  
              	 	   <input type="submit" class="sms_button" value="เพิ่มข้อมูล"  onclick="document.location = '/haaksq/haaksq/userform.html'" />
            	
			  
			
              
					<div style="margin-left:10px;">			
						<div id="paging_container2" >
									<ul class="content">
									  <table width="568" border="1" cellspacing="0" cellpadding="0">
                                        <tr>
                                          <td width="103">No</td>
                                          <td width="164">บ้านเลขที่</td>
                                          <td width="166">ชื่อ นามสกุล </td>
                                          <td width="125">เบอร์โทร</td>
                                          <td width="125">ลบ</td>
                                        </tr>
                                    
									  <div id="newline">&nbsp;</div> 	
									
									
									<c:forEach items="${LIST_USER}" var="UserProfile" varStatus="rowCounter">
						   
											
			  
                
               
                  <c:choose>
                  <c:when test="${rowCounter.count % 2 == 0}">
              
			  						 <tr>
                                          <td width="103"><a href="/haaksq/haaksq/loadDetails.html/${UserProfile.userId}">${rowCounter.count}</a></a></td>
                                           <td width="164"><a href="/haaksq/haaksq/loadDetails.html/${UserProfile.userId}">${UserProfile.addressId}</a></td>
                                          <td width="166"><a href="/haaksq/haaksq/loadDetails.html/${UserProfile.userId}">${UserProfile.firstName} ${UserProfile.lastName}</td>
                                          <td width="125"><a href="/haaksq/haaksq/loadDetails.html/${UserProfile.userId}">${UserProfile.mobileNo}</a></td>
                                          <td width="125"><a href="/haaksq/haaksq/deluser.html/${UserProfile.userId}" onclick = "if (! confirm('ต้องการลบข้อมูลหรือไม่')) return false;">	   <input type="image" name="imageField"  src="/haaksq/resources/images/delete_icon.png"></a></td>
                                        </tr>
			  	

		
                  </c:when>
                  </c:choose>
              	
                  <c:choose>
                  <c:when test="${rowCounter.count % 2 != 0}">
     									 <tr>
                                          <td width="103"><a href="/haaksq/haaksq/loadDetails.html/${UserProfile.userId}">${rowCounter.count}</a></td>
                                           <td width="164"><a href="/haaksq/haaksq/loadDetails.html/${UserProfile.userId}">${UserProfile.addressId}</a></td>
                                          <td width="166"><a href="/haaksq/haaksq/loadDetails.html/${UserProfile.userId}">${UserProfile.firstName} ${UserProfile.lastName}</td>
                                          <td width="125"><a href="/haaksq/haaksq/loadDetails.html/${UserProfile.userId}">${UserProfile.mobileNo}</a></td>
                                             <td width="125"><a href="/haaksq/haaksq/deluser.html/${UserProfile.userId}" onclick = "if (! confirm('ต้องการลบข้อมูลหรือไม่')) return false;">	   <input type="image" name="imageField"   src="/haaksq/resources/images/delete_icon.png"></a></td>
                                     </tr>
			   
                  </c:when>
                  </c:choose>
							  </c:forEach>
							  
							  
				  </table>			  
								<div id="newline">&nbsp;</div> 	  
							</ul>		
	
							        <div class="page_navigation"></div>				
					  </div>	
					</div>
            		
            </div>
          </div>
        </article>
      </div>
	 </c:if>
	 
	 </div>
	 </div>
	  </div>