





<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		

              

 <br><br><br><br><br><br><br><br><br>
<form:form method="post" action="/haaksq/haaksq/vadmin.html" >
<center>
<table width="50%">
<tr>
  <td colspan="2"  valign="top"><div align="center">
    <input type="image" name="imageField" src="/haaksq/resources/images/logo.png" />
  </div></td>
  </tr>

<tr><td width="24%"  valign="top">
			
                
     <table width="430" align="center">     
     <tr>
        <td width="182" valign="bottom"><div align="right">ชื่อ:</div>        </td>
        <td width="236" ><input type="text" required="required"  name ="username"/></td>
    </tr>	
         <tr>
        <td ><div align="right">รหัสผ่าน:</div></td>
        <td><input type="password"  required="required"  name = "password"/></td>
    </tr>
         <tr>
           <td ><div align="right"></div></td>
           <td><input name="submit" type="submit" value="เข้าสู่ระบบ" />
             <input name="reset" type="reset" /></td>
         </tr>	
    <tr>
      
        <tr >
        <td colspan="2"><c:if  test="${!empty ERROR}">
          <div align="center">${ERROR}</div>
        </c:if></td>
    </tr>
    </table>
    </td>
    </tr>
</table>
</center>
</form:form>