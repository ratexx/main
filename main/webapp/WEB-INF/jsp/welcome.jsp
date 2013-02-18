<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<div ><section id="content">
<div class="text4">“ติดตาม ค้นหา เสนอแนะ และช่วยสร้างชุมชนเราให้น่าอยู่ได้ที่นี่ ”</div>
	<div class="text2">“เราต้องการความช่วยเหลือและความคิดเห็นของคุณ”</div>
		   <img alt="mic" src="${smallBlogCommu.pathName}${smallBlogCommu.fileName}" align="top" >
<!-- content -->
		
		
		
		<!-- blog1/1 About Company -->
<c:if  test="${!empty smallBlogCommu}">		
		
		  <div >
		   <article class="colhome21">
              <div class="box1_out">
                <div class="box1">
				 <h2>เกี่ยวกับเรา</h2>

             
				  
											<table class="data">
											<tr>
											  <td bgcolor="#E0E0E0"><strong>ชื้อโครงการ&nbsp;</strong></td>
											  <td bgcolor="#E0E0E0">${smallBlogCommu.communityName}</td>
											</tr>
											    <tr>
											      <td><strong>ประเภทโครงการ&nbsp; </strong></td>
											      <td>${smallBlogCommu.communityTypeName}</td>
											    </tr>
											   <tr>
											      <td bgcolor="#E0E0E0"><strong>ตำบล&nbsp; </strong></td>
											      <td bgcolor="#E0E0E0">${smallBlogCommu.tumbolName}</td>
											   </tr>	
											
											    <tr>
											      <td><strong>อำเภอ&nbsp; </strong></td>
											      <td>${smallBlogCommu.amphoeName}</td></tr>
											 	<tr>
											      <td bgcolor="#E0E0E0"><strong>จังหวัด&nbsp; </strong></td>
											      <td bgcolor="#E0E0E0">${smallBlogCommu.provinceName}</td>
											 	</tr>	
												  		    
												<tr>
											      <td><strong>เนื้อที่&nbsp; </strong></td>
											      <td>${smallBlogCommu.communitySize}</td></tr>	
												  		    
												  		    
												  		    
												  		    
				  </table>
				  
				  
				  
				
                <a href="../../../blog/${commuId}/${lanuageId}/12" class="button"><span><span>Read More</span></span></a></div>
			 </div>
			</article>
		  </div>
	</c:if>		
			
			<!-- blog1/2 Gallary -->
	<c:if  test="${!empty gallaryBlogList}">			
		  <div >
		   <article class="colhome22">
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
		
			
                  <a href="../../../blog/${commuId}/${lanuageId}/2" class="button"><span><span>Read More</span></span></a> 
				</div>
			 </div>
			</article>
		  </div>
</c:if>		
			
    </section>
		  
		  <div class="div_newline">
	</div>
<!-- content -->



		<section id="content" class="div_newline">
		
	<c:if  test="${!empty smallBlogOppo}">			
			<!-- blog2/1 Opportunities -->
		  <div >
		   <article class="colhome31">
              <div class="box1_out">
                <div class="box1">
				 <h2>ประมูล</h2>

					
						
								<p>		
										<c:forEach items="${smallBlogOppo}" var="VCommnunityOpportunitiesId">
			   
										
										${VCommnunityOpportunitiesId.communityOppId}. <strong>[${VCommnunityOpportunitiesId.oppSubCategoryName}] </strong>${VCommnunityOpportunitiesId.oppDetail} &nbsp;<br>
										</c:forEach>
								</p>
					
						        <a href="../../../blog/${commuId}/${lanuageId}/7" class="button"><span><span>Read More</span></span></a></div>
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
	
					
						
								<p>		
									<c:forEach items="${smallBlogBOD}" var="VBoardStructureId">
			   
										
										 ${VBoardStructureId.firstName} ${VBoardStructureId.lastName} [<strong>${VBoardStructureId.positionName}</strong>]<br>
										    
								  </c:forEach>
									
			
								</p>
					
		        <a href="../../../blog/${commuId}/${lanuageId}/10" class="button"><span><span>Read More</span></span></a></div>
			 </div>
			</article>
			</div>
		  </c:if>							
			
		<!-- blog2/23 LifeStyle -->
		
	<c:if  test="${!empty smallBlogLifeStyle}">	
			  <div >
		   <article class="colhome33">
              <div class="box1_out">
                <div class="box1">
				 <h2>LifeStyle</h2>

					
						
								<p>		
									<c:forEach items="${smallBlogLifeStyle}" var="VCommunityLifestyleId"><strong>${VCommunityLifestyleId.lifestyleName }</strong> [${VCommunityLifestyleId.lifestyleTypeName}]  ระยะ ${VCommunityLifestyleId.distanceFromHoa} กม. <br />		
								  </c:forEach>	
								</p>
					
		        <a href="../../../blog/${commuId}/${lanuageId}/4" class="button"><span><span>Read More</span></span></a></div>
			 </div>
			</article>
			</div>
	</c:if>				
    </section>
		  
		  
<!-- content -->
		<section id="content" class="div_newline">
		
	<c:if  test="${!empty smallBlogWhatNearByList}">		
			<!-- blog3/1 What near by -->
		  <div >
		   <article class="colhome31">
              <div class="box1_out">
                <div class="box1">
				 <h2>สถานที่ใกล้เคียง</h2>

					
						
								<p>		
									<c:forEach items="${smallBlogWhatNearByList}" var="VCommunityWhatNearById">
			   
									<strong>${VCommunityWhatNearById.lifestyleFullName}</strong> [${VCommunityWhatNearById.lifestyleTypeName}]  ระยะ		${VCommunityWhatNearById.distanceFromHoa}  กม. <br>
								  </c:forEach>	
								</p>
					
		        <a href="../../../blog/${commuId}/${lanuageId}/5" class="button"><span><span>Read More</span></span></a></div>
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
				 <h2>ซื้อ/ขาย</h2>

								<p>		
								<c:forEach items="${smallBlogSaleAndRent}" var="VCommunitySaleRentId"><strong>[${VCommunitySaleRentId.salesRentName }] </strong>เนื้อที่ ${VCommunitySaleRentId.landSpace }  9ตรม. ราคา ${VCommunitySaleRentId.valueAmount } บาท <br>					    
				 			</c:forEach>		
								</p>
					
		        <a href="../../../blog/${commuId}/${lanuageId}/3" class="button"><span><span>Read More</span></span></a></div>
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

					
						
					
					
			    <a href="../../../blog/${commuId}/${lanuageId}/8" class="button"><span><span>Read More</span></span></a></div>
			 </div>
			</article>
			</div>
	</c:if>		
    </section>
		  
		  
		  <!-- content -->
		<section id="content" class="div_newline">
		
				<c:if  test="${!empty smallBlogNews}">		
			<!-- blog4/1 News -->
		  <div >
		   <article class="colhome11">
              <div class="box1_out">
                <div class="box1">
				 <h2>ข่าวสาร</h2>

					
						
				  <p>		
						  <c:forEach items="${smallBlogNews}" var="VCommunityNewsId">
						  <strong>[${VCommunityNewsId.newSubject}]</strong> 
						  ${VCommunityNewsId.newDetail} >
						   
						   ${VCommunityNewsId.createDate}>
						   <b>${VCommunityNewsId.fromSource}  </b><br></c:forEach>
				  </p>
					
		        <a href="../../../blog/${commuId}/${lanuageId}/0" class="button"><span><span>Read More</span></span></a></div>
			 </div>
			</article>
		  </div>
		  
	</c:if>			  
	</section>
			
			<!-- content -->
		<section id="content"  class="div_newline">
		
			

<c:if  test="${!empty smallBlogInbox}">   
      <div >
        <article class="colhome11">
          <div class="box1_out">
            <div class="box1">
              <h2>Inbox</h2>
              
                <p>
               				<c:forEach items="${smallBlogInbox}" var="VInboxWorklistId">
			   
										
										<strong>[${VInboxWorklistId.worklistSubjectName}]</strong> ${VInboxWorklistId.worklistDetail} ตอบ:${VInboxWorklistId.jobDetails}<br>
										    
				  </c:forEach>
                </p>
            <a href="../../../blog/${commuId}/${lanuageId}/9" class="button"><span><span>Read More</span></span></a></div>
          </div>
        </article>
      </div>
	 </c:if>
	   			<!-- blog3/1 What near by -->
	   			
	 	<!-- blog 14  Task manager-->
<c:if  test="${!empty smallBlogTaskManager}">   
      <div >
        <article class="colhome11">
          <div class="box1_out">
            <div class="box1">
              <h2>Task Manager</h2>
              
                <p>
               				<c:forEach items="${smallBlogTaskManager}" var="VWorklist">
			   
										
										<strong>[${VWorklist.worklistSubjectName}]</strong> ${VWorklist.worklistName} -${VWorklist.worklistDetail}<br>
										    
				  </c:forEach>
                </p>
            <a href="../../../blog/${commuId}/${lanuageId}/100" class="button"><span><span>Read More</span></span></a></div>
          </div>
        </article>
      </div>
	 </c:if>



	   			<!-- blog3/1 What near by -->  			
	
	<c:if  test="${!empty smallBlogBOD}"></c:if>						   			
	   			
	   			
	</section>
	  </main>