

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<div >
<!-- content -->
		<section id="content">
		<!-- blog1/1 About Company -->
		  <div >
		   <article class="colhome11">
              <div class="box1_out">
                <div class="box1">
				 <h2>LifeStyle    <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>	 	
		<c:if  test="${!empty smallBlogLifeStyle}">
			
			<table>
               			<c:forEach items="${smallBlogLifeStyle}" var="VCommunityLifestyleId">
			   					      <tr>
									
										 <td>
										 
										 
										 <a   href="${VCommunityLifestyleId.lifestyleLink}"  target="_blank"  title=""  rel="single"  class="pirobox" style="margin:0 10px 0 0;" ><img src="${VCommunityLifestyleId.lifestyleLink}" width=50px height=50px></a>
										 </td>
										 <td>
										 <c:choose>
														<c:when test="${VCommunityLifestyleId.lifestyleUrl  == null}">
																		<strong> ${VCommunityLifestyleId.lifestyleName}</strong> 
																
															</c:when>
															<c:when test="${VCommunityLifestyleId.lifestyleUrl  ==''}">
																		<strong> ${VCommunityLifestyleId.lifestyleName}</strong> 
																
															</c:when>  	  
				
															<c:otherwise>
															 <strong><a href="${VCommunityLifestyleId.lifestyleUrl}"    target="_blank"> ${VCommunityLifestyleId.lifestyleName}</a></strong> 
			
															</c:otherwise>
															</c:choose>

			
			
			[${VCommunityLifestyleId.lifestyleTypeName}] 
			<strong>ระยะ</strong> ${VCommunityLifestyleId.distanceFromHoa} กม.  	<br>	
			<strong>รายละเอียด:</strong>  ${VCommunityLifestyleId.lifestyleDetail }<br>
			  <strong> แนะนำ:</strong> ${VCommunityLifestyleId.recommende }<br>
			  <strong> ที่อยู่</strong>: ${VCommunityLifestyleId.address} <strong>เบอร์ติดต่อ:</strong> ${VCommunityLifestyleId.contractNo } 
			  <br> <br>
										 </td>
									<tr>	    
				  </c:forEach>
				  			</table>
			
	
				
			
	
				

				
               			 </c:if>		
				</div>
				</div>
			</article>
			</div>