<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">






	 	<!-- blog 14  smallBlogContactNumber-->
<c:if  test="${!empty smallBlogContactNumber}">   
      <div >
        <article class="colhome11">
          <div class="box1_out">
            <div class="box1">
              <h2>เบอร์สำคัญ   <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>
              
                <p>
               				<c:forEach items="${smallBlogContactNumber}" var="CommunityContractNumber">
			   
										
										<strong>${CommunityContractNumber.contractNumberName} [${CommunityContractNumber.contractNumberDetail}]</strong>
										<br>
										<br>    
				  </c:forEach>
                </p>
          
          </div>
        </article>
      </div>
	 </c:if>		

