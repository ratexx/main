<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/haaksq/resources/js/jquery.validate.js"></script>

	      <div >
        <article class="colhome11">
          <div class="box1_out">
            <div class="box1">
              
		
	<h2>ข้อมูลส่วนตัว <a href="../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">
	</h2>
 



  <script>
  			$(document).ready(function(){ $("#myform").validate({}); });
  </script>

<form:form method="post" action="/haaksq/haaksq/UpdateDetail.html/${commuId}/${lanuageId}" commandName="vUserProfile"  class="1" id="myform">
    <table>


				<c:if  test="${!empty HAS_ERROR}">
							
								<h3 >ERROR : ${HAS_ERROR.errorMsg} </h3>
				
		</c:if>		
		<c:if  test="${!empty vUserProfile}">
		
		
		
        </c:if>		
 				
 				
 				
 				
				<tr><td width="174" height="25"><form:label path="userName">อีเมล</form:label></td><td width="542" height="25"><form:input path="userName"  required="required" class="input2"/></td></tr>
				<tr><td height="25"><form:label path="pass">รหัสผ่าน</form:label></td><td height="25"><form:input path="pass"  required="required" class="input2"  maxlength="10" /></td></tr>
				<tr><td height="25"><form:label path="firstName">ชื่อ</form:label></td><td height="25"><form:input path="firstName"  required="required" class="input2"/></td></tr>
				<tr><td height="25"><form:label path="lastName">นามสกุล</form:label></td><td height="25"><form:input path="lastName"  required="required" class="input2"/></td></tr>
				<tr><td height="25"><form:label path="nickName">ชื่อเล่น</form:label></td><td height="25"><form:input path="nickName"  required="required" class="input2"/></td></tr>
 				<tr><td height="25"><form:label path="mobileNo">มือถือ</form:label></td><td height="25"><form:input path="mobileNo"  required="required"   id="input2" class="required digits"   maxlength="10"   /></td></tr>
				<tr><td height="25"><form:label path="email">อีเมล</form:label></td><td height="25"><form:input path="email"  required="required"   id="input2" class=" required email" /></td></tr>
				<tr><td height="25"><form:label path="sports">กีฬา</form:label></td><td height="25"><form:input path="sports" class="input2" /></td></tr>
				<tr><td height="25"><form:label path="hobbies">งานอดิเรก</form:label></td><td height="25"><form:input path="hobbies" class="input2" /></td></tr>
				<tr><td height="25"><form:label path="profession">อาชีพ</form:label></td><td height="25"><form:input path="profession" class="input2" /></td></tr>
				<tr><td height="25"><form:label path="telephoneNo">โทรศัพท์</form:label></td><td height="25"><form:input path="telephoneNo" class="input2"  /></td></tr>
				<tr><td height="25"><form:label path="faxNo">แฟกซ์</form:label></td><td height="25"><form:input path="faxNo"  id="input2"  class="digits"  /></td></tr>
				
				<tr><td height="25"><form:label path="addressNo">ที่อยู่</form:label></td><td height="25"><form:input path="addressNo"  required="required"  disabled="true" class="input2" /><form:hidden path="addressNo"  required="required"   class="input2" /></td></tr>
				<tr><td height="25"><form:label path="noOfCars">มีรถทั้งหมด</form:label></td><td height="25"><form:input path="noOfCars"   id="input2"  class="digits" /></td></tr>
				<tr><td height="25"><form:label path="noOfDogs">มีสุนัขทั้งหมด</form:label></td><td height="25"><form:input path="noOfDogs"   id="input2" class="digits"  /></td></tr>
				<tr><td height="25"><form:label path="noOfCats">มีแมวทั้งหมด</form:label></td><td height="25"><form:input path="noOfCats"  id="input2" class="digits" /></td></tr>
				<tr><td height="25"><form:label path="otherPets">มีสัตว์เลี้ยงอื่น ๆ โปรดระบุ</form:label></td><td height="25"><form:input path="otherPets"  class="digits"   id="input2" /></td></tr>

				

         <tr>
        <td height="25"></td>
        <td height="25"><input name="submit"  type="submit"  value="บันทึกข้อมูล" class="button_submit"/>  </td>
    </tr>
</table>

</form:form>
     		
            </div>
          </div>
        </article>
      </div>



</head>
<body>
  


 	
		
		
			

						