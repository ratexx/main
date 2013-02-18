<%@page import="java.net.URL"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
			
		<script type="text/javascript" src="/haaksq/resources/js/jquery/jquery.pajinate.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$('#paging_container2').pajinate();
			});		

		</script>


				

	   			
	 	<!-- blog 14  Task manager-->
<c:if  test="${!empty smallBlogNews}">   
      <div >
        
          <div class="txt1">
            <div >
              <h2>บ่น เสนอแนะ ร้องเรียน <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>
              
					<div id="wrapper">			
						<div id="paging_container2" >
									<ul class="content">
									<c:forEach items="${smallBlogNews}" var="VCommunityNewsId">
						   
													<!-- ใส่ content ตรงนี้นะท่าน -->
													<li><p><strong>[${VCommunityNewsId.newSubject}]</strong> 
																			  ${VCommunityNewsId.newDetail} >						   
																			  ${VCommunityNewsId.createDate}>
						   												<b>${VCommunityNewsId.fromSource}</b>
						   									</p>
						   							</li> 
													    
							  </c:forEach>
								 
							</ul>					
							<div class="page_navigation"></div>				
						</div>	
					</div>
            	
            </div>
          </div>
   
      </div>
	 </c:if>
				
			
			

			
			
	