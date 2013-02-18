<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
	      <div >
        <article class="colhome11">
          <div class="box1_out">
            <div class="box1">	
	<h2>เพิ่มข่าวสาร</h2>
 
<form:form method="post" action="/haaksq/haaksq/saveNews.html" commandName="CommunityNew">

    <table width="803">


				<c:if  test="${!empty HAS_ERROR}">
							
								<h3 >ERROR : ${HAS_ERROR.errorMsg} </h3>
				
				</c:if>		
    

  	<tr>
        <td width="156" height="25">Public ? </td>
        <td width="510" height="25"><form:radiobutton path="fgPublic" value="Y"   />Yes <form:radiobutton path="fgPublic" value="N"/>No </td>
    </tr>
      	<tr>
        <td height="25">ช่องทางการส่งข่าวสาร </td>
        <td height="25"><form:radiobutton path="fgOpen" value="B"   />Both <form:radiobutton path="fgOpen" value="O"/>Open <form:radiobutton path="fgOpen" value="C"/>Close </td>
    </tr>


  	<tr>
        <td height="25"><form:label path="communityId">เลือกชุมชนที่จะส่ง
</form:label></td>
        <td height="25">        
        <select name="communityId"  class="inputselect">
        
 			<c:forEach items="${ListCommunity}" var="CacheM"><option value="${CacheM.value }">${CacheM.name }</option></c:forEach>			        
        	
		</select>
        </td>
    </tr>
    
  	<tr>
        <td height="25"><form:label path="fromSource">แหล่งที่มาของข่าวสาร</form:label></td>
        <td height="25"><form:input path="fromSource"  required="required" class="input2"/></td>
    </tr>

  	<tr>
        <td height="25"><form:label path="newSubject">หัวข้อของข่าวสาร</form:label></td>
        <td height="25"><form:input path="newSubject"  required="required" class="input2" /></td>
    </tr>

  	<tr>
        <td height="25"><form:label path="newDetail">รายละเอียด</form:label></td>
        <td height="25"><form:textarea path="newDetail"  rows="3" cols="20"  required="required"  class="textarea2"/></td>
    </tr>
 	<tr>
        <td height="25"><form:label path="lifestyleLink">url ของรูปที่ใช้แสดง</form:label></td>
        <td height="25"><form:input path="lifestyleLink" class="input2"/></td>
    </tr>

  	<tr>
        <td height="25"><form:label path="lifestyleUrl">url ของข่าวสาร</form:label></td>
        <td height="25"><form:input path="lifestyleUrl"  class="input2"/></td>
    </tr>

  	<tr>
        <td height="25"><form:label path="lifestyleGoogleMap">lifestyleGoogleMap</form:label></td>
        <td height="25"><form:input path="lifestyleGoogleMap" class="input2"  /></td>
    </tr>

  	<tr>
        <td height="25"><form:label path="googleMapLatitude">googleMapLatitude</form:label></td>
        <td height="25"><form:input path="googleMapLatitude" class="input2" /></td>
    </tr>

  	<tr>
        <td height="25"><form:label path="googleMapLongtitude">googleMapLongtitude</form:label></td>
        <td height="25"><form:input path="googleMapLongtitude" class="input2" /></td>
    </tr>

    	<tr>
        <td height="25"><form:label path="googleMapUrl">googleMapUrl</form:label></td>
        <td height="25"><form:input path="googleMapUrl" class="input2" /></td>
    </tr>
    
    <tr>
        <td height="25" colspan="2">
            <input type="submit" value="บันทึกข้อมูล" class="button_submit"/> <input type="reset" value="กลับไปข้อมูลเดิม" class="button_submit"/>
        </td>
    </tr>
</table>





</form:form>
    </div>
          </div>
        </article>
      </div>
   
 

 	
		
		
			

						