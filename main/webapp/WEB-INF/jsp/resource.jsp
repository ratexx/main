<%@page import="java.net.URL"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



	 	<!-- blog 101  NewsCommunity-->
<c:if  test="${!empty smallBlogresource}">   
      <div >
        <article class="colhome11">
          <div class="box1_out">
            <div class="box1">
              <h2>ศูนย์ข้อมูล <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>
              
                   	<table>
					        <tr>
							  	 <td width="273"><strong>ชื่อเอกสาร</strong></td>
								  <td width="251"> <strong>รายละเอียด</strong>  </td>
								  <td width="172"><strong>วันที่</strong></td>
								   <td width="79"><strong>Download</strong></td>
					  <tr>	    
		
			   					      
               					<c:forEach items="${smallBlogresource}" var="VCommunityResource">
			   					    <tr>
										 <td>${VCommunityResource.resourceName}</td>
									      <td>${VCommunityResource.resourceDetail}</td>
										  <td><fmt:formatDate value="${VCommunityResource.createDate }" pattern="dd/MM/yyyy mm:ss" /> น.</td> 
			    						  <td> <a href="${VCommunityResource.pathName}${VCommunityResource.fileName}" > Download</a></td>
									<tr>	    
				  </c:forEach>
				  			</table>
               
              
            
           </div>
          </div>
        </article>
      </div>
	 </c:if>



