<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<%-- 
	<a href="<c:url value="/haaksq/about.htm"/>" >About</a>|
	<a href="<c:url value="/haaksq/index"/>" >contact test</a>|
	<a href="<c:url value="/haaksq/friends.htm"/>" >Friends</a>|          
	<a href="<c:url value="/haaksq/office.htm"/>" >The Office</a>|
	<a href="<c:url value="/haaksq/main/ajax/add"/>" >The Ajax</a>|
	<a href="<c:url value="/haaksq/Contact-US.htm"/>" >Contact US</a> --%>

 <c:if  test="${!empty menuformList}">
	<c:forEach items="${menuformList}" var="menuform">
		<a href="<c:url value="${menuform.menuURL}/${menuform.commuId}/1/${menuform.menuId}"/>" >${menuform.menuName}asdfsdfsdfasdfa</a>|
	</c:forEach>
</c:if> 

   


