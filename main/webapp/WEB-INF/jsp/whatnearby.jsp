
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
				 <h2>สถานที่ใกล้เคียง    <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>	
	             <c:if  test="${!empty smallBlogWhatNearByList}">	
			
		<table>
				<c:forEach items="${smallBlogWhatNearByList}" var="VCommunityWhatNearById">	
			      <tr>
			      		 <td>
											 <a   href="${VCommunityWhatNearById.lifestyleLink}"  target="_blank"  title=""  rel="single"  class="pirobox" style="margin:0 10px 0 0;" ><img src="${VCommunityWhatNearById.lifestyleLink}" width=50px height=50px></a>
						 </td>
				 <td>
					<c:choose>
															<c:when test="${VCommunityWhatNearById.lifestyleUrl  == null}">
																		<strong> ${VCommunityWhatNearById.lifestyleFullName}</strong> 
																
															</c:when>
															<c:when test="${VCommunityWhatNearById.lifestyleUrl  ==''}">
																		<strong> ${VCommunityWhatNearById.lifestyleFullName}</strong> 
																
															</c:when>  	  
				
															<c:otherwise>
															 <strong><a href="${VCommunityWhatNearById.lifestyleUrl}"   > ${VCommunityWhatNearById.lifestyleFullName}</a></strong> 
			
															</c:otherwise>
															</c:choose>
				
				
				
				
				
				
				 <strong>ระยะ</strong>		${VCommunityWhatNearById.distanceFromHoa}  กม. <br>
 				<strong>รายละเอียด:</strong> ${VCommunityWhatNearById.lifestyleDetail}<br>
 				<strong>แนะนำ:</strong> ${VCommunityWhatNearById.recommende }<br>
			  <strong> ที่อยู่:</strong> ${VCommunityWhatNearById.address} <strong>เบอร์ติดต่อ:</strong> ${VCommunityWhatNearById.contractNo } 
			   </td>
			   </tr>
	

									</c:forEach>	
					</table>	
		
			
	
				

				
                      </c:if>		
				</div>
				</div>
			</article>
			</div>