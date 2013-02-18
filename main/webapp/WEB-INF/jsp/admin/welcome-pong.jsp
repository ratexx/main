<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<section id="content">
<div class="text4">“ติดตาม ค้นหา เสนอแนะ และช่วยสร้างชุมชนเราให้น่าอยู่ได้ที่นี่ ”</div>
	

	 	<!-- blog 101  NewsCommunity-->
<c:if  test="${!empty smallBlogNewsCommunity}">   
      <div >
        <article class="colhome31">
          <div class="box1_out">
            <div class="box1">
              <h2>ข่าวสารชุมชน</h2>
              	<div id="slideShowItems">
               
               				<table>
               				<c:forEach items="${smallBlogNewsCommunity}" var="CommunityNew">
			   					    <tr class="tr-welcome">
									
										 <td ><a   href="${CommunityNew.lifestyleLink}"  target="_blank"  title=""  rel="single"  class="pirobox" style="margin:0 10px 0 0;" ><img src="${CommunityNew.lifestyleLink}" width=50px height=50px></a><strong>[${CommunityNew.newSubject}]</strong>
										 ${CommunityNew.newDetail} </td>
									<tr>	    
				  </c:forEach>
				  			</table>
               
                </div>
            <a href="../../../blog/${commuId}/${lanuageId}/101" class="button"><span><span>ทั้งหมด</span></span></a></div>
          </div>
        </article>
      </div>
	 </c:if>

	 	<!-- blog 102  smallBlogNewsGeneral-->
<c:if  test="${!empty smallBlogNewsGeneral}">   
      <div  >
        <article class="colhome32">
          <div class="box1_out">
            <div class="box1">
              <h2>ข่าวทั่วไป</h2>
              <div id="slideShowItems">
            
               				
			   	<table>
               			<c:forEach items="${smallBlogNewsGeneral}" var="VsmallBlogNewsGeneral">
			   					    <tr class="tr-welcome">
										 
										 <td> <a   href="${VsmallBlogNewsGeneral.lifestyleLink}" target="_blank"  title=""  rel="single"  class="pirobox" style="margin:0 10px 0 0;" ><img src="${VsmallBlogNewsGeneral.lifestyleLink}" width=50px height=50px></a>
										 <strong>[${VsmallBlogNewsGeneral.newSubject}]</strong> 
										 ${VsmallBlogNewsGeneral.newDetail} 
										 - ${VsmallBlogNewsGeneral.fromSource}
										 ${VsmallBlogNewsGeneral.createDate}</td>
									<tr>	    
				  </c:forEach>
				  			</table>
										
						
										    
		
                </div>
            <a href="../../../blog/${commuId}/${lanuageId}/102" class="button"><span><span>ทั้งหมด</span></span></a></div>
          </div>
        </article>
      </div>
	 </c:if>		
	
 		<!-- blog1/2 Gallary -->
	<c:if  test="${!empty gallaryBlogList}">			
		  <div >
		   <article class="colhome33">
              <div class="box1_out">
                <div class="box1">
				 <h2>แกลเลอรี่</h2>

                  			

			     <div >
		
				<div class="scroll-pane ui-widget ui-widget-header ui-corner-all ">
					<div class="scroll-content " >
			<div id="gallery">
			 <ul>
			<c:forEach items="${gallaryBlogList}" var="VCommunityGallaryId">
			   
			        <li>
			            <a href="${VCommunityGallaryId.pathName}${VCommunityGallaryId.fileName}" title="${VCommunityGallaryId.fileDetail}">
			                <img src=" ${VCommunityGallaryId.pathName}${VCommunityGallaryId.fileName}" width="72" height="72" alt="${VCommunityGallaryId.fileDetail} "/>
			            </a>
			        </li>
			    
			</c:forEach>			        
			</ul>
			</div>
					</div>
					<div class="scroll-bar-wrap ui-widget-content ui-corner-bottom gallery_detail">
						<div class="scroll-bar"></div>
					</div>
				</div>
			</div>
		
			
                  <a href="../../../blog/${commuId}/${lanuageId}/2" class="button"><span><span>ทั้งหมด</span></span></a> 
				  
				</div>
			 </div>
			</article>
		  </div>
</c:if>		
			
    </section>
	
		  
		  
		  
		  <div class="div_newline">
	</div>
<!-- content -->

						 	<!-- blog 14  Task manager-->
					<c:if  test="${!empty smallBlogTaskManager}">   
					      <div >
					        <article class="colhome22">
					          <div class="box1_out">
					            <div class="box1">
					              <h2>แจ้งซ่อม ขอความช่วยเหลือ </h2>
					              	<div id="slideShowItems">
					                <p>
					               				<c:forEach items="${smallBlogTaskManager}" var="VWorklist">


														<strong>[${VWorklist.worklistSubjectName}]</strong> <strong>ถาม</strong>: ${VWorklist.worklistDetail} <strong>ตอบ:</strong> ${VWorklist.jobDetails} (<fmt:formatDate value="${VWorklist.createDate }" pattern="dd/MM/yyyy HH:mm"  /> น.)<br>
															    
									 
															    
									  </c:forEach>
					                </p>
					                </div>
					            <a href="../../../blog/${commuId}/${lanuageId}/15" class="button"><span><span>ทั้งหมด</span></span></a></div>
					          </div>
					        </article>
					      </div>
						 </c:if>
		   			
	   		
											
					<c:if  test="${!empty smallBlogInbox}">   
					      <div >
					        <article class="colhome02">
					          <div class="box1_out">
					            <div class="box1">
					              <h2>บ่น เสนอแนะ ร้องเรียน</h2>
					              	<div id="slideShow">
													<div id="slideShowItems">
					                <p>
					               				<c:forEach items="${smallBlogInbox}" var="VInboxWorklistId">
								   
															
															<strong>[${VInboxWorklistId.worklistSubjectName}]</strong> <strong>ถาม:</strong> ${VInboxWorklistId.worklistDetail} <strong>ตอบ:</strong> ${VInboxWorklistId.jobDetails} (<fmt:formatDate value="${VInboxWorklistId.createDate }" pattern="dd/MM/yyyy HH:mm"  /> น.)<br>
															    
									  </c:forEach>
					                </p>
					                </div>
					                </div>
					            <a href="../../../blog/${commuId}/${lanuageId}/9" class="button"><span><span>ทั้งหมด</span></span></a></div>
					          </div>
					        </article>
					      </div>
						 </c:if>
	  	  <div class="div_newline"> 
	</div>
		  <!-- blog1/1 About Company -->
<c:if  test="${!empty smallBlogCommu}">		
		
		  <div >
		   <article class="colhome01">
              <div class="box1_out">
                <div class="box1">
				 <h2>เกี่ยวกับเรา</h2>

              
				  
											<table class="data">
											<tr>
											  <td ><strong>ชื้อโครงการ&nbsp;</strong></td>
											  <td >${smallBlogCommu.communityName}</td>
											</tr>
											    <tr>
											      <td><strong>ประเภทโครงการ&nbsp; </strong></td>
											      <td>${smallBlogCommu.communityTypeName}</td>
											    </tr>
											   <tr>
											      <td ><strong>ตำบล&nbsp; </strong></td>
											      <td >${smallBlogCommu.tumbolName}</td>
											   </tr>	
											
											    <tr>
											      <td><strong>อำเภอ&nbsp; </strong></td>
											      <td>${smallBlogCommu.amphoeName}</td></tr>
											 	<tr>
											      <td ><strong>จังหวัด&nbsp; </strong></td>
											      <td >${smallBlogCommu.provinceName}</td>
											 	</tr>	
												  		    
												<tr>
											      <td><strong>เนื้อที่&nbsp; </strong></td>
											      <td>${smallBlogCommu.communitySize}</td></tr>	
												  		    
												  		    
												  		    
												  		    
				  </table>
				  
				  
				  
				
                <a href="../../../blog/${commuId}/${lanuageId}/12" class="button"><span><span>ทั้งหมด</span></span></a></div>
			 </div>
			</article>
		  </div>
</c:if>		
		  
		  
				
<!-- content -->
		<section id="content" class="div_newline">
		
	<c:if  test="${!empty smallBlogWhatNearByList}">		
			<!-- blog3/1 What near by -->
		  <div >
		   <article class="colhome31">
              <div class="box1_out">
                <div class="box1">
				 <h2>สถานที่ใกล้เคียง</h2>

						<div id=slideShowItems>
						
								
			   			<table>
               				<c:forEach items="${smallBlogWhatNearByList}" var="VCommunityWhatNearById">
			   					      <tr class="tr-welcome">
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
															 <strong><a href="${VCommunityWhatNearById.lifestyleUrl}"    target="_blank"> ${VCommunityWhatNearById.lifestyleFullName}</a></strong> 
			
															</c:otherwise>
															</c:choose>	
									
									  ระยะ ${VCommunityWhatNearById.distanceFromHoa} กม. 	
								  
										 </td>
									<tr>	    
				  </c:forEach>
				  			</table>
										
					</div>
		        <a href="../../../blog/${commuId}/${lanuageId}/5" class="button"><span><span>ทั้งหมด</span></span></a></div>
			 </div>
			</article>
		  </div>
	</c:if>			
		<!-- blog3/2 sale and rent -->
		
	<c:if  test="${!empty smallBlogSaleAndRent}">		
		<div >
		   <article class="colhome32">
              <div class="box1_out">
                <div class="box1">
				 <h2>ซื้อ ขาย</h2>
				 <div id=slideShowItems>
								<p>		
								<c:forEach items="${smallBlogSaleAndRent}" var="VCommunitySaleRentId"><strong>[${VCommunitySaleRentId.salesRentName }] </strong>เนื้อที่ ${VCommunitySaleRentId.landSpace }  ตรว. ราคา  <fmt:formatNumber value="${VCommunitySaleRentId.valueAmount }" type="number" pattern="###,###,##0" /> บาท <br>					    
				 			</c:forEach>		
								</p>
				</div>	
		        <a href="../../../blog/${commuId}/${lanuageId}/3" class="button"><span><span>ทั้งหมด</span></span></a></div>
			 </div>
		  </article>
		</div>
</c:if>				
				
	<c:if  test="${!empty smallBlogLifeStyle}">	
			  <div >
		   <article class="colhome33">
              <div class="box1_out">
                <div class="box1">
				 <h2>กิน ดื่ม เที่ยว </h2>

						<div id=slideShowItems>
						
							<table>
               				<c:forEach items="${smallBlogLifeStyle}" var="VCommunityLifestyleId">
			   					      <tr class="tr-welcome">
										 <td>
										 
										 
										 <a   href="${VCommunityLifestyleId.lifestyleLink}" target="_blank"   title=""  rel="single"  class="pirobox" style="margin:0 10px 0 0;" ><img src="${VCommunityLifestyleId.lifestyleLink}" width=50px height=50px></a>
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
															 <strong><a href="${VCommunityLifestyleId.lifestyleUrl}"   target="_blank" > ${VCommunityLifestyleId.lifestyleName}</a></strong> 
			
															</c:otherwise>
															</c:choose>	
									
									  ระยะ ${VCommunityLifestyleId.distanceFromHoa} กม. 	
								  
										 </td>
									<tr>	    
				  </c:forEach>
				  			</table>
						
						
					</div>
		        <a href="../../../blog/${commuId}/${lanuageId}/4" class="button"><span><span>ทั้งหมด</span></span></a></div>
			 </div>
			</article>
			</div>
	</c:if>		
	
    
		 </section> 	  

		<section id="content" class="div_newline">
		
	<c:if  test="${!empty smallBlogOppo}">			
			<!-- blog2/1 Opportunities -->
		  <div >
		   <article class="colhome31">
              <div class="box1_out">
                <div class="box1">
				 <h2>ประมูล</h2>

					<div id=slideShowItems>
						
								<p>		
										<c:forEach items="${smallBlogOppo}" var="VCommnunityOpportunitiesId">
			   
										
									<strong>[${VCommnunityOpportunitiesId.oppSubCategoryName}] </strong>${VCommnunityOpportunitiesId.oppDetail} &nbsp;<br>
										</c:forEach>
								</p>
					</div>
						        <a href="../../../blog/${commuId}/${lanuageId}/7" class="button"><span><span>ทั้งหมด</span></span></a></div>
              </div>
			</article>
		  </div>
		  </c:if>							
		<!-- blog2/2 BOD -->
		
	<c:if  test="${!empty smallBlogBOD}">		
			  <div >
		   <article class="colhome32">
              <div class="box1_out">
                <div class="box1">
				 <h2>กรรมการ</h2>
	
					<div id=slideShowItems>
						
						
						<table>
               	<c:forEach items="${smallBlogBOD}" var="VBoardStructureId">
			   					    <tr class="tr-welcome">
									
									                                 <td height="55" ><a   href="${VBoardStructureId.pathName}${VBoardStructureId.fileName}"  target="_blank"  title=""  rel="single"  class="pirobox" style="margin:0 10px 0 0;" ><img src="${VBoardStructureId.pathName}${VBoardStructureId.fileName}" width=50px height=50px ></a></td>
																	<td>	[<strong>${VBoardStructureId.positionName}</strong>]  ${VBoardStructureId.firstName} ${VBoardStructureId.lastName} <br>
									</td>
									<tr>	    
				  </c:forEach>
				  			</table>
						
						
						
				</div>
		        <a href="../../../blog/${commuId}/${lanuageId}/10" class="button"><span><span>ทั้งหมด</span></span></a></div>
			 </div>
			</article>
			</div>
		  </c:if>							
			
			<!-- blog3/3 Contact US -->
					   <c:if  test="${!empty newContactForm}">	
			
			  <div >
		   <article class="colhome33">
              <div class="box1_out">
                <div class="box1">
				 <h2>ติดต่อ</h2>

						<div id=slideShowItems><p>บ่นและร้องเรียน<br />
						  ขอข้อมูลทั่วไป<br />
						  ขอเอกสารหรือแบบฟอร์ม<br />
						  แจ้งตรวจเช็ค ซ่อมแซม <br />
						  ขอความช่วยเหลือทั่วไป<br />
						  ติดต่อผู้จัดการชุมชน<br />
					    ติดต่อคณะกรรมการ</p></div>
			            <a href="../../../blog/${commuId}/${lanuageId}/8" class="button"><span><span>ทั้งหมด</span></span></a></div>
			 </div>
			</article>
			</div>
	</c:if>		
	
	
	
	<c:if  test="${!empty smallBlogresource}">   
      <div >
        <article class="colhome11">
          <div class="box1_out">
            <div class="box1">
              <h2>Document Center    <a href="../../../blog/${commuId}/${lanuageId}/13" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>
              
                   	<table>
               					<c:forEach items="${smallBlogresource}" var="VCommunityResource">
			   					      <tr>
									
										 
										 <td>
										 <strong>NAME:[${VCommunityResource.resourceName}]</strong>
									   <strong>รายละเอียด: </strong>  ${VCommunityResource.resourceDetail}
										    <strong>แหล่งที่มา:</strong>  ${VCommunityResource.fileDetail}
										      <strong>รายละเอียด: </strong>  ${VCommunityResource.pathName} 
										    <strong>แหล่งที่มา:</strong>  ${VCommunityResource.fileName}
										   <strong>วันที่:</strong> <fmt:formatDate value="${VCommunityResource.createDate }" pattern="dd/MM/yyyy"  /> 
										 </td>
									<tr>	    
				  </c:forEach>
				  			</table>
               
              
            
           </div>
          </div>
        </article>
      </div>
	 </c:if>
	
			
    </section>
		  
	
		  
		  <!-- content -->
		<section id="content" class="div_newline">
		

	

						   			<!-- blog3/1 What near by -->
					
			


	 
		<section id="content" class="div_newline">
		
		</section>
			
