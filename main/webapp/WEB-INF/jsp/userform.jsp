<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script type="text/javascript" src="/haaksq/resources/js/jquery.validate.js"></script>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/haaksq/resources/css/style_haaksq.css" type="text/css" media="all">
<link rel="stylesheet" href="../../resources/css/style_haaksq.css" type="text/css" media="all">
<div id="wrap">
<div id="content">
<div class="left">

	
		
	      <div >
        <article >
           <div  id="sms_step_4">
            <div  style="font-size:18px;padding-left:100px;;" >
      <div id="sms_step1_header">เพิ่มสมาชิก </div>
			<div id="newline">&nbsp;</div>
			
			
			  <script>
  			$(document).ready(function(){ $("#myform").validate({}); });
  </script>
			
 
<form:form method="post" action="/haaksq/haaksq/saveUser.html" commandName="PageInPutUser"  class="1" id="myform">

    <table height="390">


				<c:if  test="${!empty HAS_ERROR}">
							
								<h3 >ERROR : ${HAS_ERROR.errorMsg} </h3>
				</c:if>		
    
    
        
    															<tr><td><span>เลือก Community </span></td><td colspan="2">&nbsp;</td>
    															</tr>		
									               			<c:forEach items="${LISTCOMMU}" var="CacheM" >
															<tr>
															  <td>&nbsp;</td>
																<td colspan="2"><input type="radio"   name="chkCommu"   class="input"  value=${CacheM.value}  id = "chkCommu"  checked="checked" />
															    ${CacheM.name}</td>
															</tr>
									               			</c:forEach>
    
    
        <tr>
        <td width="184" height="25"><form:label path="userName">อีเมลหรือเบอร์โทรศัพท์</form:label></td>
        <td width="71" height="25" colspan="2"><form:input path="userName"  required="required"  class="userprofile_text"/></td>
    </tr>
    
         <tr>
        <td height="25"><form:label path="mobile">มือถือ</form:label></td>
        <td height="25" colspan="2"><form:input path="mobile"  required="required"  class="required digits" id="userprofile_text" maxlength="10"  /></td>
    </tr>
    
        <tr>
        <td height="25"><form:label path="firstName">ชื่อ</form:label></td>
        <td height="25" colspan="2"><form:input path="firstName"  required="required"  class="userprofile_text"/></td>
    </tr>
    
    
    
        <tr>
        <td height="25"><form:label path="lastName">นามสกุล</form:label></td>
        <td height="25" colspan="2"><form:input path="lastName"  required="required"  class="userprofile_text"/></td>
    </tr>
    
    
    
        <tr>
        <td height="25"><form:label path="nickName">ชื่อเล่น</form:label></td>
        <td height="25" colspan="2"><form:input path="nickName"  required="required"  class="userprofile_text"/></td>
    </tr>
    
    
    
        <tr>
        <td height="25"><form:label path="email">อีเมล</form:label></td>
        <td height="25" colspan="2"><form:input path="email"  required="required"  class=" required email"    id="userprofile_text"  /></td>
    </tr>
    

    <tr>
      <td height="25"><form:label path="soi">ซอย</form:label></td>
        <td height="25" colspan="2"><form:input path="soi"  required="required"  class="userprofile_text"/></td>
    </tr>

    <tr>
      <td height="25"><form:label path="moo">หมู่</form:label></td>
        <td height="25" colspan="2"><form:input path="moo"  required="required"  class="userprofile_text"/></td>
    </tr>
    <tr>
      <td height="25"><form:label path="road">ถนน</form:label></td>
        <td height="25" colspan="2"><form:input path="road"  required="required"  class="userprofile_text"/></td>
    </tr>


    <tr>
      <td height="25"><form:label path="tel">เบอร์โทรศัพท์บ้าน</form:label></td>
        <td height="25" colspan="2"><form:input path="tel"  required="required"  class="userprofile_text"/></td>
    </tr>
    <tr>
      <td height="44">&nbsp;</td>
      <td height="44"><br />
      <input name="submit" type="submit" class="sms_button" value="บันทึกข้อมูล"/>
      </td>
      <td><br />
      <input name="reset" type="reset" class="sms_button" value="กลับไปข้อมูลเดิม"  onclick="location.href='usermanage.html'"/>
      </td></tr>
    
   
    
    <tr>
      <td height="25" colspan="3">&nbsp;</td>
    </tr>
</table>

    <table>


				<c:if  test="${!empty HAS_ERROR}">
							
								<h3 >ERROR : ${HAS_ERROR.errorMsg} </h3>
				
		</c:if>		
		<c:if  test="${!empty vUserProfile}">
		
        <tr>
	        <td><form:label path="userId">อีเมล์หรือเบอร์โทรศัพท์</form:label></td>
	        <td><form:input path="userId"  required="required"/></td>
        </tr>
                <tr>
	        <td><form:label path="userId">รหัสผ่าน</form:label></td>
	        <td><form:input path="userId"  required="required"/></td>
        </tr>
        <tr>
	        <td><form:label path="firstName">ชื่อ</form:label></td>
	        <td><form:input path="firstName"  required="required"/></td>
        </tr>
        
        
        
        
        </c:if>		
    




</form:form>
 
<div id="newline">&nbsp;</div><div id="newline">&nbsp;</div>
 	
		
		
			       </div>
          </div>
        </article>
      </div>

	<link rel="stylesheet" href="/haaksq/resources/css/style_haaksq.css" type="text/css" media="all">
<link rel="stylesheet" href="../../resources/css/style_haaksq.css" type="text/css" media="all">		

					