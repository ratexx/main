<%@page import="java.net.URL"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-16"    pageEncoding="UTF-16"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">


<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.7.3.custom/js/jquery-ui-1.7.3.custom.min.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.7.3.custom/js/jquery-ui-timepicker-addon.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.7.3.custom/js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.7.3.custom/js/jquery.smscounter.min.js"></script>
<link rel="stylesheet" href="/haaksq/resources/jquery-ui-1.7.3.custom/css/ui-lightness/jquery-ui-1.7.3.custom.css" type="text/css" media="all">
<link rel="stylesheet" href="/haaksq/resources/jquery-ui-1.7.3.custom/css/ui-lightness/jquery-ui-timepicker-addon.css" type="text/css" media="all">






	<form name="FORM_SMS" action="/haaksq/haaksq/testsms.html"  method="POST" >
	
<!-- 		msg<input type="text" required="required" name="msg"  id="msg"> -->
		<textarea  name="msgsms"  id="sms" required="required" ></textarea>
		<input type="submit"   >

	</form>








