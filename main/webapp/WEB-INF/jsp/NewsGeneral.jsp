<%@page import="java.net.URL"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


 	<!-- blog 102  smallBlogNewsGeneral-->
<c:if  test="${!empty smallBlogNewsGeneral}">   
      <div >
        <article class="colhome11">
          <div class="box1_out">
            <div class="box1">
              <h2>ข่าวสารทั่วไป    <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>Home</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>
              
              
              	<table>
               					<c:forEach items="${smallBlogNewsGeneral}" var="VsmallBlogNewsGeneral">
			   					      <tr>
									
										 <td><a   href="${VsmallBlogNewsGeneral.lifestyleLink}"  title=""  rel="single"  class="pirobox" style="margin:0 10px 0 0;" ><img src="${VsmallBlogNewsGeneral.lifestyleLink}" width=50px height=50px></a>
										 </td>
										 <td>
										 <strong>[${VsmallBlogNewsGeneral.newSubject}]</strong><br>
									   <strong>รายละเอียด:</strong> ${VsmallBlogNewsGeneral.newDetail} <br>
										    <strong>แหล่งที่มา:</strong>  ${VsmallBlogNewsGeneral.fromSource}<br>
										   <strong>วันที่:</strong><fmt:formatDate value="${VsmallBlogNewsGeneral.createDate }" pattern="dd/MM/yyyy"  />  <br>
										 </td>
									<tr>	    
				  </c:forEach>
				  			</table>
               
                
             				    
				 
           	</div>
          </div>
        </article>
      </div>
	 </c:if>		
