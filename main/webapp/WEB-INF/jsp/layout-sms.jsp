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

<link rel="stylesheet" href="/haaksq/resources/css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="/haaksq/resources/css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="/haaksq/resources/css/style.css" type="text/css" media="all">
<script type="text/javascript" src="/haaksq/resources/js/jquery-1.4.2.js" ></script>
<script type="text/javascript" src="/haaksq/resources/js/jquery/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/haaksq/resources/js/jquery.validate.js"></script>
<script type="text/javascript" src="/haaksq/resources/js/cufon-yui.js"></script>
<script type="text/javascript" src="/haaksq/resources/js/cufon-replace.js"></script>	




<!--<script type="text/javascript" src="js/Myriad_Pro_300.font.js"></script>-->
<!-- <script type="text/javascript" src="/haaksq/resources/js/DB_Helvethaica_X_55_Regular_400.font.js"></script> -->


<table>
<tr><td colspan="2"><tiles:insertAttribute name="menu" /></td></tr>
<tr><td><tiles:insertAttribute name="body" /></td><td><tiles:insertAttribute name="body2" /></td></tr>
</table>
