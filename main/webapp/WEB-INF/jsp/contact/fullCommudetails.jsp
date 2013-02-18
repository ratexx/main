
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



<c:if  test="${!empty vAboutIDList}">

	<div id="blog_commu_full_details" class="ui-widget-content ui-corner-all" onclick =runEffect2();runEffect(); style="display:none">
				<h3 class="ui-widget-header ui-corner-all">Community Details : </h3>
				<p>
				xxxx xxxxxx xxxxxxx
				</p>



<table class="data">
<c:forEach items="${vAboutIDList}" var="vAboutID">
    <tr>
		<tr><td><img alt="mic" src="${vAboutID.pathName}${vAboutID.fileName}" align="top" ></td></tr>
        <tr><td>${vAboutID.communityId}communityId</td></tr>
		<tr><td>${vAboutID.communityName}communityName</td></tr>
		<tr><td>${vAboutID.communitySize}communitySize</td></tr>
		<tr><td>${vAboutID.companyOwner}companyOwner</td></tr>
		<tr><td>${vAboutID.startPrise}startPrise</td></tr>
		<tr><td>${vAboutID.endPrise}endPrise</td></tr>
		<tr><td>${vAboutID.addressId}addressId</td></tr>
		<tr><td>${vAboutID.addressNo}addressNo</td></tr>
		<tr><td>${vAboutID.soi}soi</td></tr>
		<tr><td>${vAboutID.moo}moo</td></tr>
		<tr><td>${vAboutID.road}road</td></tr>
		<tr><td>${vAboutID.state}state</td></tr>
		<tr><td>${vAboutID.zipcode}zipcode</td></tr>
		<tr><td>${vAboutID.country}country</td></tr>
		<tr><td>${vAboutID.telephone}telephone</td></tr>
		<tr><td>${vAboutID.mobile}mobile</td></tr>
		<tr><td>${vAboutID.communityTypeName}communityTypeName</td></tr>
		<tr><td>${vAboutID.provinceId}provinceId</td></tr>
		<tr><td>${vAboutID.provinceName}provinceName</td></tr>
		<tr><td>${vAboutID.amphoeName}amphoeName</td></tr>
		<tr><td>${vAboutID.tumbolName}tumbolName</td></tr>
		<tr><td>${vAboutID.amphoeId}amphoeId</td></tr>
		<tr><td>${vAboutID.fileName}fileName</td></tr>
		<tr><td>${vAboutID.pathName}pathName</td></tr>
		<tr><td>${vAboutID.fileTypeName}fileTypeName</td></tr>
        
        
        
    </tr>
</c:forEach>
</table>

</div>	
</c:if>