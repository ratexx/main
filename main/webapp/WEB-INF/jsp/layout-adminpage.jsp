<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<head>   



<link type="image/x-icon"  href="/haaksq/resources/img-by-haaksq/logoH.ico" rel="icon">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>

<script type="text/javascript" src="/haaksq/resources/js/jquery/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/haaksq/resources/js/jquery.validate.js"></script>

<!--<script type="text/javascript" src="js/Myriad_Pro_300.font.js"></script>-->
<!-- <script type="text/javascript" src="/haaksq/resources/js/DB_Helvethaica_X_55_Regular_400.font.js"></script> -->



<tiles:insertAttribute name="menu" /> <br>
<tiles:insertAttribute name="body" />
