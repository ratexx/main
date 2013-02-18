

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
                <h2>แกลเลอรี่</h2>
                <c:if  test="${!empty gallaryBlogList}">
                  <div >
            
                        
                            <c:forEach items="${gallaryBlogList}" var="VCommunityGallaryId">
                               <a href="${VCommunityGallaryId.pathName}${VCommunityGallaryId.fileName}" title="${VCommunityGallaryId.fileDetail}" target="_blank">  <img src=" ${VCommunityGallaryId.pathName}${VCommunityGallaryId.fileName}" width="50%" height="50%" alt="${VCommunityGallaryId.fileDetail}"/> </a> 
                               
                            </c:forEach>
                      
        
                  </div>
                       <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>Home</span></span></a> <img src="images/img3.png" class="img" alt=""> </c:if>
              </div>
            </div>
          </article>
        </div>
				