<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/haaksq/resources/js/jquery.validate.js"></script>						

			
				<div >
<!-- content -->
		<section id="content">
		<!-- blog1/1 About Company -->
		  <div >
		   <article class="colhome11">
              <div class="box1_out">
                <div class="box1">
			
		
	<h2>ติดต่อ    <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>
  <script>
  			$(document).ready(function(){ $("#ContactForm").validate({}); });
  </script>
    <form:form method="post" action="/haaksq/haaksq/saveContactUS/${commuID}/${lanuageId}"  commandName="Worklist2"  name="ContactForm"  id="ContactForm"  class="1">

    <table>

<tr>
        <td width="100" height="25" > 
       
        หัวข้อ        </td>
        <td height="25"> <form:select path="toUserName"  class="inputselect">
			<form:options items="${SubjectList}"   itemValue="fgPublic"  itemLabel="worklistSubjectName"      />
		</form:select>กรุณาเลือกหัวข้อให้ตรงกับความต้องการของคุณ และใส่ข้อมูลให้ครบ 
		</td>
    </tr>

    <tr>
        <td width="100" height="25"><form:label path="fromUserName">ผู้ติดต่อ</form:label></td>
        <td height="25"><form:input path="fromUserName"  required="required" class="input"/></td>
    </tr>

    <tr>
        <td width="100" height="25"><form:label path="fromEmail">อีเมล</form:label></td>
        <td height="25"><form:input path="fromEmail"  required="required"   id="input2" class="required email" /></td>
    </tr>
    <tr>
        <td width="100" height="25"><form:label path="phone">เบอร์โทรศัพท์</form:label></td>
        <td height="25"><form:input path="phone"  required="required" class="input"/></td>
    </tr>
    <tr>
        <td width="100" height="25"><form:label path="worklistDetail">รายละเอียด</form:label></td>
        <td height="25"><div ><form:textarea path="worklistDetail" rows="3" cols="20"  required="required" class="textarea2"  /></div></td>
    </tr>
    
     <tr>
        <td width="100" height="25"></td>
        <td height="25"><input name="submit" type="submit" class="button_submit" value="ส่งข้อมูล" /></td>
    </tr>
   
</table>
  
				
				
</form:form>
 

 	
		
		</div>
				</div>
			</article>
			</div>