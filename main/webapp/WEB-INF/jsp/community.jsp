				
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
				
				
				
				<div >
<!-- content -->
		<section id="content">
		<!-- blog1/1 About Company -->
		  <div >
		   <article class="colhome11">
              <div class="box1_out">
                <div class="box1">
				 <h2>เกี่ยวกับเรา    <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>
				<c:if  test="${!empty smallBlogCommu}">
             
				  
											<table class="data">
											<tr>
											  <td width="132" height="25"><strong>ชื้อโครงการ&nbsp;</strong></td>
											  <td width="809" height="25">${smallBlogCommu.communityName}</td>
											</tr>
											<tr>
											  <td height="25"><strong>รายละเอียด&nbsp;</strong></td>
											  <td height="25">${smallBlogCommu.communityDetail}</td>
											</tr>
											 
											 
											    <tr>
											      <td height="25"><strong>ประเภทโครงการ&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.communityTypeName}</td>
											    </tr>
											    <tr>
											      <td height="25"><strong>ตำบล&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.provinceName}</td>
											    </tr>
											    <tr>
											      <td height="25"><strong>อำเภอ&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.amphoeName}</td>
											    </tr>
											    <tr>
											      <td height="25"><strong>จังหวัด&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.tumbolName}</td>
											    </tr>
										         <tr>
										      <td height="25"><strong>จำนวนที่อาศัยทั้งหมด&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.unitAll}</td>
											    </tr>
										         <tr>

											      <td height="25"><strong>จำนวนที่มีผู้พักอาศัย&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.unitLive} </td>
											    </tr>
										         <tr>
   									 	      <td height="25"><strong>จำนวนที่ขายที่พักอาศัย&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.unitSales} </td>
											    </tr>
										          <tr>
   									 	      <td height="25"><strong>จำนวนที่เช่าที่พักอาศัย&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.unitResidence} </td>
											    </tr>
												       <tr>
   									 	      <td height="25"><strong>จำนวนแมว&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.cat} </td>
											    </tr>
													       <tr>
   									 	      <td height="25"><strong>จำนวนสุนัข&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.dog} </td>
											    </tr>
				   							    <tr>
   									 	      <td height="25"><strong>จำนวนช่าง&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.contractorsNo} </td>
											    </tr>
	 										 <tr>
   									 	      <td height="25"><strong>จำนวนผู้พักอาศัย&nbsp; </strong></td>
										        <td height="25">${smallBlogCommu.contractorsEmployeesNo} </td>
											    </tr>
	
										         
										          <td><strong>แผนที่&nbsp; </strong></td>
										        <td>  
										        <a   href="${smallBlogCommu.pathName}${smallBlogCommu.googleMapUrl}" target="_blank"  title=""  rel="single"  class="pirobox" style="margin:0 10px 0 0;" ><img src="${smallBlogCommu.pathName}${smallBlogCommu.googleMapUrl}" width="500px"></a>
										       </td></tr>					    
				  </table>
				  
				  
				  
				
               </c:if>		
				</div>
				</div>
			</article>
			</div>
	
				
				
				
				
				
