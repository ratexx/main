<%@page import="java.net.URL"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link href="../../resources/css/style_haaksq.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="/haaksq/resources/css/style_haaksq.css" type="text/css" media="all">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<div id="wrap">
	<div id="content">
		<div class="left">
		 <div id="sms_step_4">
		  <div id="sms_summary_header" >ส่งข้อความโทรศัพท์ SMS แล้ว x </div>
		   <div id="sms_summary_text_status_header" >สถานะการส่ง</div><div id="sms_summary_text_status_detail" >ส่งสำเร็จ</div>
		    <div id="newline" ></div>
			   
			   	<c:if  test="${empty SEND_DATE}">
					<div id="sms_summary_text_status_header" >วันที่ส่ง</div>
					<div id="sms_summary_text_status_detail" >${SEND_DATE}</div>
					<div id="newline" ></div>
    			</c:if>
			   
			<div id="sms_summary_text" >ข้อความที่ส่งไป</div>
			<div id="newline" ></div>
			 <div id="sms_summary_text_send" >${SMS_MSG}</div>
			 <div id="newline" ></div>
		    <div id="sms_summary_group2">  
		  
			 <div id="text_sms_summary">จำนวนผู้รับข้อความครั้งนี้				  </div>
			 <div id="text_sms_summary_value">
			   <input type="text" id="text_sms_summary_1" name="text_sms_summary_1" class="sms_text_value_data"  readonly="readonly" value="${TOTAL_MOBILE}">
		   &nbsp;คน</div>
			   	<div id="newline" ></div>
		     <div id="text_sms_summary">จำนวน SMS ที่ใช้ไปครั้งนี้&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div> 
		     <div id="text_sms_summary_value">
		    <input type="text" id="text_sms_summary_2" name="text_sms_summary_2" class="sms_text_value_data" readonly="readonly" value="${USE_CREDIT}">
&nbsp;ครั้ง </div>
			 	<div id="newline" ></div>
		     <div id="text_sms_summary">จำนวน SMS เครดิตคงเหลือ 	</div>  
		     <div id="text_sms_summary_value">
		       <input type="text" id="text_sms_summary_3" name="text_sms_summary_3" class="sms_text_value_data" readonly="readonly" value="${SMS_QUOTA_CREDIT}">
&nbsp;ครั้ง</div>
			  <div id="text_sms_summary">หลังจากส่งข้อความนี้</div>
		 
		  </div>
		  
		    <div class="newline"> &nbsp; 
    <div> 
		  
		  
		</div>
		<div id="newline" ></div>
	</div>
</div>
</div>


