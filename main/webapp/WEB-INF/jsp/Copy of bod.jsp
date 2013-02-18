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
				 <h2>กรรมการ</h2>


	             <c:if  test="${!empty smallBlogBOD}"><div >

								<p>		
									<c:forEach items="${smallBlogBOD}" var="VBoardStructureId">
										 ${VBoardStructureId.firstName} ${VBoardStructureId.lastName}  ${VBoardStructureId.email}   [<strong>${VBoardStructureId.positionName}</strong>]<br>
								  </c:forEach>
								</p>
						      <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>Read More</span></span></a> <img src="images/img3.png" class="img" alt="">
	
	</c:if>	
					</div>
				</div>
			</article>
			</div>		