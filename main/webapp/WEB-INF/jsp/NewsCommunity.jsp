<%@page import="java.net.URL"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



	 	<!-- blog 101  NewsCommunity-->
<c:if  test="${!empty smallBlogNewsCommunity}">   
      <div >
        <article class="colhome11">
          <div class="box1_out">
            <div class="box1">
              <h2>ข่าวสารชุมชน    <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>
              
                   	<table height="113">
               					<c:forEach items="${smallBlogNewsCommunity}" var="CommunityNew">
			   					      <tr >
									
										 <td><a   href="${CommunityNew.lifestyleLink}"  title=""  rel="single"  class="pirobox" style="margin:0 10px 0 0;" ><img src="${CommunityNew.lifestyleLink}" width=50px height=50px></a>										 </td>
										 <td>
										 <strong>[${CommunityNew.newSubject}]</strong><br>
									   <strong>รายละเอียด: </strong>  ${CommunityNew.newDetail} <br>
										    <strong>แหล่งที่มา:</strong>  ${CommunityNew.fromSource}<br>
										   <strong>วันที่:</strong> <fmt:formatDate value="${CommunityNew.createDate }" pattern="dd/MM/yyyy"  />   <br>
									    </td>
									<tr>	    
				  </c:forEach>
  			  </table>
               
              
            
           </div>
          </div>
        </article>
      </div>
	 </c:if>



