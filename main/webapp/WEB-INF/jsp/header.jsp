<head>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<script type="text/javascript" src="/haaksq/resources/js/haaksq.js">  </script>
  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
<div class="body1">
  <div class="main">
<!-- header -->
		<header>
		
		
			<div id="logo_box">
			 <div class="colsitemapLogo">
			 
    <div  class="logo1"> <img class="logo1" src="/haaksq/resources/img-by-haaksq/logo.jpg"/> 
 	 
    </div><div class="logo2"> ต้องการความช่วยเหลือ ติดต่อ 02 1585247, 086 302 6723 
หรือ setthasiri-sanambinnam@gmail.com !</div>
  
   
   
  </div>
  <div class="colsitemapLogo">
    <div  align="right" > 
	 <c:choose>
							          <c:when test="${null == userdetail.userName}">
														
													<form method="post" action="/haaksq/haaksq/login.htm/${commuId}/${lanuageId }"  > 
														    <table width="263">
														    
														    
														    
														  
														    <tr>
														        <td><div align="right">อีเมลหรือโทรศัพท์&nbsp; </div></td>
														        <td><div align="left"><input  type="text" name="username" class="box3" /></div></td>
														    </tr>
														    <tr>
														        <td height="27"><div align="right">รหัสผ่าน&nbsp;</div></td>
														        <td><div align="left"><input type="password" name="password" class="box3" /></div></td>
														    </tr>
														    <tr>
														        <td>
														            <div align="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;													              </div></td>
														        <td> <div align="left"><input name="submit" type="submit" value="เข้าสู่ระบบ"/></div></td>
														    </tr>
													  </table>
													</form>
								      </c:when>
							      <c:otherwise>
							        <p> <a href="/haaksq/haaksq/loadDetails.html/${commuId}/${lanuageId }" >  ${userdetail.firstName}  ${userdetail.lastName}</a></p>
							        <form method="post"  action="/haaksq/haaksq/logout.htm/${userdetail.commuID}/${lanuageId }"  > 
							        <input type="submit" value="ออกจากระบบ">
							        </form>
							        
							      </c:otherwise>
      </c:choose>
	</div>
  
	
	
	





  </div>

			</div>
			
		    <!-- Menu Start-->
			
		



<%-- 
	<a href="<c:url value="/haaksq/about.htm"/>" >About</a>|
	<a href="<c:url value="/haaksq/index"/>" >contact test</a>|
	<a href="<c:url value="/haaksq/friends.htm"/>" >Friends</a>|
	<a href="<c:url value="/haaksq/office.htm"/>" >The Office</a>|
	<a href="<c:url value="/haaksq/main/ajax/add"/>" >The Ajax</a>|
	<a href="<c:url value="/haaksq/Contact-US.htm"/>" >Contact US</a> --%>
 

			<nav>  
				<ul id="menu">     
				
				 <c:if  test="${!empty menuformList}">
				   <!-- <li><a href="<c:url value="/haaksq/home/${commuID}/1/1"/>" >Home</a></li> --> 
					<c:forEach items="${menuformList}" var="menuform">
						
						 <li><a href="<c:url value="${menuform.menuURL}/${menuform.commuId}/1/${menuform.menuId}"/>" >${menuform.menuName}</a>xxx</li>
						
					</c:forEach>
				</c:if> 
				
				
			</ul>
			</nav>
			
			
			<!-- Menu End -->
<div >
		
		
		<div class="text1"></div>
			

             

							   
				
</div>


<style>
/* These styles just pretty up the page a bit. */
body {
	font: 62.5%/1.2 Arial, Helvetica, sans-serif;
	background-color: #eee; }
#wrap {
	position: relative;
	font-size: 1.2em;
	width: 700px;
	padding: 50px 20px;
	margin: 0 auto; 
	background-color: #fff;
	position: relative; }

/* These styles create the dropdown menus. */
#navbar {
	position: absolute;
	top: 0;
	right: 0;
	margin: 0;
	padding: 0;}
#navbar li {
	list-style: none;
	float: left; }
#navbar li a {
	display: block;
	padding: 3px 8px;
	text-transform: uppercase;
	text-decoration: none; 
	color: #999;
	font-weight: bold; }
#navbar li a:hover {
	color: #000; }
#navbar li ul {
	display: none;  }
#navbar li:hover ul, #navbar li.hover ul {
	position: absolute;
	display: inline;
	left: 0;
	width: 100%;
	margin: 0;
	padding: 0; }
#navbar li:hover li, #navbar li.hover li {
	float: left; }
#navbar li:hover li a, #navbar li.hover li a {
	color: #000; }
#navbar li li a:hover {
	color: #357; }
</style>

<script>
// Javascript originally by Patrick Griffiths and Dan Webb.
// http://htmldog.com/articles/suckerfish/dropdowns/
sfHover = function() {
	var sfEls = document.getElementById("navbar").getElementsByTagName("li");
	for (var i=0; i<sfEls.length; i++) {
		sfEls[i].onmouseover=function() {
			this.className+=" hover";
		}
		sfEls[i].onmouseout=function() {
			this.className=this.className.replace(new RegExp(" hover\\b"), "");
		}
	}
}
if (window.attachEvent) window.attachEvent("onload", sfHover);


</script>

${NEW_SUB_MENU}


<!-- 	<div id="wrap">
		<ul id="navbar">
			<li><a href="#">Exhibits and Events</a>
				<ul>
					<li><a href="#">Current Exhibit</a></li>
					<li><a href="#">Coming Exhibit</a></li>
					<li><a href="#">Events</a></li>
				</ul>
			</li>
			<li><a href="#">About Us</a>
				<ul>
					<li><a href="#">About 1</a></li>
					<li><a href="#">About Two</a></li>
					<li><a href="#">Third About</a></li>
				</ul>			
			</li>
			<li><a href="#">Contact</a>
				<ul>
					<li><a href="#">Via Email</a></li>
					<li><a href="#">Stalk Us Elsewhere</a></li>
				</ul>			
			</li>
			<li><a href="#">Press</a>
				<ul>
					<li><a href="#">Bench Press</a></li>
					<li><a href="#">Military Press</a></li>
					<li><a href="#">Press 'n Seal</a></li>
				</ul>			
			</li>
		</ul>
		<p>
	</div>*/


-->



   
	</header>
<!-- / header -->
