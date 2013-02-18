
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">




	   			
	 	<!-- blog 14  Task manager-->

      <div >
        <article class="colhome11">
          <div class="box1_out">
            <div class="box1">
             
<c:if  test="${!empty smallBlogInbox}">              
 <h2>บ่น เสนอแนะ ร้องเรียน 	<a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">		</h2>
					<div >			
						<div id="paging_container2" >
									<ul class="content">
									<c:forEach items="${smallBlogInbox}" var="vInboxByUser">
						   
													<!-- ใส่ content ตรงนี้นะท่าน -->
													<li>
														<p>															
														<c:choose>
															<c:when test="${ROLE_ADMIN !=null}">
															<a href="<c:url value="/haaksq/loadDetailInbox/${vInboxByUser.worklistId}/${commuId}/${lanuageId}"/>">
																<strong>[${vInboxByUser.worklistSubjectName}] </strong>${vInboxByUser.fromUserName}
																<br><strong>วันที่ถาม: </strong><fmt:formatDate value="${vInboxByUser.createDate }" pattern="dd/MM/yyyy HH:mm"  /> น.  
																<br><strong>ถาม: </strong>${vInboxByUser.worklistDetail}  
																<br><strong>วันที่ตอบ: </strong><fmt:formatDate value="${vInboxByUser.modifyDate }" pattern="dd/MM/yyyy HH:mm"  /> น.
																<br><strong>ตอบ: </strong>${vInboxByUser.jobDetails}  
																<br>
								  							</a>
								  							</c:when>
															
															<c:otherwise>
															<strong>[${vInboxByUser.worklistSubjectName}] </strong>${vInboxByUser.fromUserName}
																<br><strong>วันที่ถาม: </strong><fmt:formatDate value="${vInboxByUser.createDate }" pattern="dd/MM/yyyy HH:mm"  /> น.  
																<br><strong>ถาม: </strong>${vInboxByUser.worklistDetail}  
																<br><strong>วันที่ตอบ: </strong><fmt:formatDate value="${vInboxByUser.modifyDate }" pattern="dd/MM/yyyy HH:mm"  /> น.
																<br><strong>ตอบ: </strong>${vInboxByUser.jobDetails}  
															</c:otherwise>
															</c:choose>
														</p>
													</li> 
													    
							  </c:forEach>
								 
							</ul>					 
							<div class="page_navigation"></div>				
						</div>	
					</div>
            	</c:if>
            	
            	
 <c:if  test="${!empty inBoxItemDetail}">
<h2>[ตอบปัญหา]	<a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">		</h2>
            	  <p>
			
										<form:form method="post" action="/haaksq/haaksq/UpdateDetailInbox/${inBoxItemDetail.worklistId }" commandName="FormReplyInbox">
										
	      <table cellpadding="2" cellspacing="4">
										
																					

										    
	           <tr>
		         <td width="77" height="25"><div align="right">หัวข้อเรื่อง:&nbsp; </div></td>
		         <td width="659" height="25"><form:label path="inboxSubject">${inBoxItemDetail.worklistSubjectName }</form:label></td>
		    </tr>
		         <tr>
										           <td height="25"><div align="right">ถามโดย:&nbsp;  </div></td>
										           <td height="25">${inBoxItemDetail.fromUserName };</td>
            </tr>
		         <tr>
                   <td height="25"><div align="right">วันที่ถาม:&nbsp;  </div></td>
		           <td height="25"> <fmt:formatDate value="${inBoxItemDetail.createDate }" pattern="dd/MM/yyyy HH:mm"  /> น.</td>
            </tr>
            <tr>
		        <td height="25"><div align="right">หัวข้อ:&nbsp; </div></td>
		        <td height="25"> <form:label path="inboxSubject">${inBoxItemDetail.worklistDetail }</form:label></td>
		    </tr>
	          <tr>
		        <td height="25"><div align="right">ตอบกลับ:&nbsp;</div></td>
		        <td height="25">${inBoxItemDetail.jobDetails} <fmt:formatDate value="${inBoxItemDetail.modifyDate }" pattern="dd/MM/yyyy HH:mm"  /> น.<br> 
		        <form:textarea path="inboxDetails"  required="required"  rows="3" cols="20" class="textarea2"   /></td>
		    </tr>
										    								 		    
		    <tr>
		        <td colspan="2">
		            <br />
		            <input type="submit" value="Save" class="button_submit"/> <input type="reset" value="Reset" class="button_submit"/>	            </td>
		    </tr>
		  </table>
										</form:form>			
				                   
</c:if>	

            </div>
          </div>
        </article>
      </div>

				
	
		