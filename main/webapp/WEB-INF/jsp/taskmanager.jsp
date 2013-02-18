<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<script type="text/javascript" src="/haaksq/resources/js/jquery/jquery.pajinate.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$('#paging_container2').pajinate();
			});		

		</script>

	

	   			
	 	<!-- blog 14  Task manager-->
<c:if  test="${!empty smallBlogTaskManager}">   
      <div >
        <article >
          <div >
            <div class="txt1">
              <h2>แจ้งซ่อม ขอความช่วยเหลือ <a href="../../../blog/${commuId}/${lanuageId}/8" class="button"><span><span>แจ้งซ่อม ขอความช่วยเหลือ “ที่นี่ “ </span></span></a> <img src="images/img3.png" class="img" alt="">	
           </h2>
              
					<div id="wrapper">			
						<div id="paging_container2" >
									<ul class="content">
									<c:forEach items="${smallBlogTaskManager}" var="VWorklist">
						   <li><p>
						   									 
								  							
								  							
															<c:choose>
															<c:when test="${ROLE_ADMIN !=null}">
															<a href="<c:url value="/haaksq/loadDetailTaskMAnager/${VWorklist.worklistId}/${commuId}/${lanuageId}"/>">
														<strong>วันและเวลา:</strong><fmt:formatDate value="${VWorklist.createDate }" pattern="dd/MM/yyyy mm:ss"    /> น. <br>
																<strong>ผู้ขอบริการ:</strong>[${VWorklist.fromUserName}] <br>
																<strong>หัวข้อรับแจ้ง ขอความช่วยเหลือ:</strong>${VWorklist.worklistSubjectName} <br>
																<strong>รายละเอียด:</strong>${VWorklist.worklistDetail} <br>
																<strong>สถานะ:</strong><br>
																<strong>เสร็จเมื่อ:</strong><fmt:formatDate value="${VWorklist.modifyDate }" pattern="dd/MM/yyyy mm:ss"    /> น. <br>
															</a>
															</c:when>
															
															<c:otherwise>
																<strong>วันและเวลา:</strong><fmt:formatDate value="${VWorklist.createDate }" pattern="dd/MM/yyyy mm:ss"    /> น. <br>
																<strong>ผู้ขอบริการ:</strong>[${VWorklist.fromUserName}] <br>
																<strong>หัวข้อรับแจ้ง ขอความช่วยเหลือ:</strong>${VWorklist.worklistSubjectName} <br>
																<strong>รายละเอียด:</strong>${VWorklist.worklistDetail} <br>
																<strong>สถานะ:</strong><br>
																<strong>เสร็จเมื่อ:</strong><fmt:formatDate value="${VWorklist.modifyDate }" pattern="dd/MM/yyyy mm:ss"    /> น. <br>
																<strong>รายละเอียดของงาน:</strong>${VWorklist.jobDetails} <br>
															</c:otherwise>
															</c:choose>
								  							
								  							
								  							
						   </p></li>
													<!-- ใส่ content ตรงนี้นะท่าน 
													<br></li> -->
													    
							  </c:forEach>
								 
							</ul>					
							<div class="page_navigation"></div>				
						</div>	
					</div>
            	 </div>
          </div>
        </article>
      </div>
	 </c:if>
	
	
	
	

	


		

	

	
	
	