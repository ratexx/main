<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
Ad Here
 <c:if  test="${!empty adlist}">
	<c:forEach items="${adlist}" var="adobj">
	
		<div id="effect" class="ui-widget-content ui-corner-all" onclick =runEffect();>
				<h3 class="ui-widget-header ui-corner-all">Adver</h3>
				<p>
					adName : ${adobj.adFileName}<br>
					adPath : ${adobj.adPath}<br>
					adPath : ${adobj.adUrl}<br>
					1.ต้องมีชนิดของ Ad เช่น Swf, img <br>
					เพื่อดูว่าต้องเรียกใช้แบบไหน<br> 
					2.ต้องมีคำบรรยาย Add หรือคำโฆษณาสั้นๆ </p>
		</div>
		
	</c:forEach>
</c:if> 

	


<!-- 	<div id="effect2" class="ui-widget-content ui-corner-all" onclick =runEffect2();>
		<h3 class="ui-widget-header ui-corner-all">Adver2</h3>
		<p>
			xxxx xxxxxx xxxxxxx
		</p>
	</div>
	
		<div id="effect" class="ui-widget-content ui-corner-all" onclick =runEffect();>
		<h3 class="ui-widget-header ui-corner-all">Adver</h3>
		<p>
			xxxx xxxxxx xxxxxxx
		</p>
	</div> -->