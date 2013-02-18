<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		
	<h2>user form </h2>
 
 
 <style type="text/css">
		* { font-family: Verdana; font-size: 96%; }
		label { width: 10em; float: left; }
		label.error { float: none; color: red; padding-left: .5em; vertical-align: top; }
		p { clear: both; }
		.submit { margin-left: 12em; }
		em { font-weight: bold; padding-right: 1em; vertical-align: top; }
</style>

 <script type="text/javascript">
jQuery.validator.setDefaults({
	//debug: true,
	success: "valid"
});;
</script>

  <script>
  			$(document).ready(function(){ $("#myform").validate({}); });
  </script>

<form:form method="post" action="/haaksq/haaksq/UpdateDetail.html" commandName="vUserProfile"  id="myform">
    <table>


				<c:if  test="${!empty HAS_ERROR}">
							
								<h3 >ERROR : ${HAS_ERROR.errorMsg} </h3>
				
		</c:if>		
		<c:if  test="${!empty vUserProfile}">
		
		
		
        </c:if>		
 				
 				
 				
 				
				<tr><td><form:label path="userName">userName</form:label></td><td><form:input path="userName"  required="required"/></td></tr>
				<tr><td><form:label path="pass">pass</form:label></td><td><form:input path="pass"  required="required"  /></td></tr>
				<tr><td><form:label path="firstName">firstName</form:label></td><td><form:input path="firstName"  required="required"/></td></tr>
				<tr><td><form:label path="lastName">lastName</form:label></td><td><form:input path="lastName"  required="required"/></td></tr>
				<tr><td><form:label path="nickName">nickName</form:label></td><td><form:input path="nickName"  required="required"/></td></tr>
 				<tr><td><form:label path="mobileNo">mobileNo</form:label></td><td><form:input path="mobileNo"  required="required"  class="required digits"   maxlength="10"   /></td></tr>
				<tr><td><form:label path="email">email</form:label></td><td><form:input path="email"  required="required"  class=" required email"/></td></tr>
				<tr><td><form:label path="sports">sports</form:label></td><td><form:input path="sports" /></td></tr>
				<tr><td><form:label path="hobbies">hobbies</form:label></td><td><form:input path="hobbies"  /></td></tr>
				<tr><td><form:label path="profession">profession</form:label></td><td><form:input path="profession"  /></td></tr>
				<tr><td><form:label path="telephoneNo">telephone</form:label></td><td><form:input path="telephoneNo"  /></td></tr>
				<tr><td><form:label path="faxNo">fax</form:label></td><td><form:input path="faxNo"  class="digits"  /></td></tr>
				
				<tr><td><form:label path="addressNo">addressNo</form:label></td><td><form:input path="addressNo"  required="required"   /></td></tr>
				<tr><td><form:label path="noOfCars">noOfCars</form:label></td><td><form:input path="noOfCars"   class="digits" /></td></tr>
				<tr><td><form:label path="noOfDogs">noOfDogs</form:label></td><td><form:input path="noOfDogs"   class="digits"  /></td></tr>
				<tr><td><form:label path="noOfCats">noOfCats</form:label></td><td><form:input path="noOfCats"  class="digits"  /></td></tr>
				<tr><td><form:label path="otherPets">otherPets</form:label></td><td><form:input path="otherPets"  class="digits"  /></td></tr>

				

         <tr>
        <td height="43"></td>
        <td><input name="submit"  type="submit"  value="Submit" />  </td>
    </tr>
</table>

</form:form>




</head>
<body>
  


 	
		
		
			

						<a href="../../../home/${commuId}/${lanuageId}">Home</a>