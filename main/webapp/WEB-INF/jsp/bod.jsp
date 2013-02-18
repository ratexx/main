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
				 <h2>กรรมการ    <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>


	             <c:if  test="${!empty smallBlogBOD}"><div >
       					<table border="0" cellpadding="2" cellspacing="2">
                                 
						
									<c:forEach items="${smallBlogBOD}" var="VBoardStructureId">
										 <tr>
                                    <td height="55" ><a   href="${VBoardStructureId.pathName}${VBoardStructureId.fileName}"  title=""  rel="single"  class="pirobox" style="margin:0 10px 0 0;" ><img src="${VBoardStructureId.pathName}${VBoardStructureId.fileName}" width=50px height=50px ></a></td>
                                    <td height="55">${VBoardStructureId.firstName} ${VBoardStructureId.lastName}<br>
                                    E-mail: ${VBoardStructureId.email}
                                     </td>
                              
                                    <td height="55">[<strong>${VBoardStructureId.positionName}</strong>]</td>
                                  
                                  </tr>
									
				   </c:forEach>   </table>
						
			
	
	                     
                             
	                           
	                              <c:forEach items="${smallBlogBOD}" var="VBoardStructureId"><br>
                                  </c:forEach>
                
	                            </c:if>	
					</div>
				</div> 
			</article>
			</div>		