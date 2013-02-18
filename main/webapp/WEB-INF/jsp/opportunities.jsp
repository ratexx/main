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
<c:if  test="${!empty smallBlogOppo}">   
      <div >
        <article >
          <div >
            <div class="txt1">
              <h2>ประมูล คัดเลือก สรรหา <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	
          </h2>
              
					<div id="wrapper">			
						<div id="paging_container2" >
									<ul class="content">
									<c:forEach items="${smallBlogOppo}" var="VCommnunityOpportunitiesId">
						   
													<!-- ใส่ content ตรงนี้นะท่าน -->
													<li><p><strong> [${VCommnunityOpportunitiesId.oppSubCategoryName}] </strong>${VCommnunityOpportunitiesId.oppDetail} &nbsp;ติดต่อ: ${VCommnunityOpportunitiesId.oppContact} 
						   									</p>
						   							</li> 
													    
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
				
			
			

			
			
				