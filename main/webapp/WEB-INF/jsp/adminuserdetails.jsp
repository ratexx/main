<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/haaksq/resources/css/style_haaksq.css" type="text/css" media="all">
<link rel="stylesheet" href="../../resources/css/style_haaksq.css" type="text/css" media="all">
<div id="wrap">
<div id="content">
<div class="left">


	      <div >
        <article >
           <div  id="sms_step_4">
            <div  style="font-size:18px;padding-left:100px;;" >
              
		    <div id="sms_step1_header">ข้อมูลส่วนตัว </div>
			<div id="newline">&nbsp;</div>
 



  <script>
  			$(document).ready(function(){ $("#myform").validate({}); });
  </script>

<form:form method="post" action="/haaksq/haaksq/AdminUpdateDetail.html/${vUserProfile.userId }" commandName="vUserProfile"  class="1">
    <table>


				<c:if  test="${!empty HAS_ERROR}">
							
								<h3 >ERROR : ${HAS_ERROR.errorMsg} </h3>
				
		</c:if>		
		<c:if  test="${!empty vUserProfile}">
		
		
		
        </c:if>		
 				
 				
 				
 				
				<tr><td width="174" height="25" ><form:label path="userName">อีเมล</form:label></td><td width="542" height="25"><form:input path="userName"  required="required" class="userprofile_text"/></td></tr>
				<tr><td height="25"><form:label path="pass">รหัสผ่าน</form:label></td><td height="25"><form:input path="pass"  required="required" class="userprofile_text" /></td></tr>
				<tr><td height="25"><form:label path="firstName">ชื่อ</form:label></td><td height="25"><form:input path="firstName"  required="required" class="userprofile_text"/></td></tr>
				<tr><td height="25"><form:label path="lastName">นามสกุล</form:label></td><td height="25"><form:input path="lastName"  required="required" class="userprofile_text"/></td></tr>
				<tr><td height="25"><form:label path="nickName">ชื่อเล่น</form:label></td><td height="25"><form:input path="nickName"  required="required" class="userprofile_text"/></td></tr>
 				<tr><td height="25"><form:label path="mobileNo">มือถือ</form:label></td><td height="25"><form:input path="mobileNo"  required="required"   id="userprofile_text" class="required digits"   maxlength="10"   /></td></tr>
				<tr><td height="25"><form:label path="email">อีเมล</form:label></td><td height="25"><form:input path="email"  required="required"   id="userprofile_text" class=" required email" /></td></tr>
				<tr><td height="25"><form:label path="sports">กีฬา</form:label></td><td height="25"><form:input path="sports" class="userprofile_text" /></td></tr>
				<tr><td height="25"><form:label path="hobbies">งานอดิเรก</form:label></td><td height="25"><form:input path="hobbies" class="userprofile_text" /></td></tr>
				<tr><td height="25"><form:label path="profession">อาชีพ</form:label></td><td height="25"><form:input path="profession" class="userprofile_text" /></td></tr>
				<tr><td height="25"><form:label path="telephoneNo">โทรศัพท์</form:label></td><td height="25"><form:input path="telephoneNo" class="userprofile_text"  /></td></tr>
				<tr><td height="25"><form:label path="faxNo">แฟกซ์</form:label></td><td height="25"><form:input path="faxNo"  id="userprofile_text"  class="digits"  /></td></tr>
				
				<tr><td height="25"><form:label path="addressNo">ที่อยู่</form:label></td><td height="25"><form:input path="addressNo"  required="required"  disabled="true" class="userprofile_text" /></td></tr>
				<tr><td height="25"><form:label path="noOfCars">มีรถทั้งหมด</form:label></td><td height="25"><form:input path="noOfCars"   id="userprofile_text"  class="digits" /></td></tr>
				<tr><td height="25"><form:label path="noOfDogs">มีสุนัขทั้งหมด</form:label></td><td height="25"><form:input path="noOfDogs"   id="userprofile_text" class="digits"  /></td></tr>
				<tr><td height="25"><form:label path="noOfCats">มีแมวทั้งหมด</form:label></td><td height="25"><form:input path="noOfCats"  id="userprofile_text" class="digits" /></td></tr>
				<tr><td height="25"><form:label path="otherPets">มีสัตว์เลี้ยงอื่น ๆ โปรดระบุ</form:label></td><td height="25"><form:input path="otherPets"  class="digits"   id="userprofile_text" /></td></tr>

				

         <tr>
        <td height="25"></td>
        <td height="25" >

		<input name="submit"  type="submit"  value="Submit" class="sms_button"/>  </td>
    </tr>
</table>
<div id="newline">&nbsp;</div>
</form:form>
     		
            </div>
          </div>
        </article>
      </div>

   </div>
   </div>
   </div>


</head>
<body>
  


 	
		
		
			

					