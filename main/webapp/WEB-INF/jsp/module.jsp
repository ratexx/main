<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if  test="${!empty smallBlogCommu}">
			<div id="blog_small_community" class="ui-widget-content ui-corner-all" >
				<h3 class="ui-widget-header ui-corner-all">Small Blog Community : 	Module	1.About Community</h3>
					<p>			
							
							<table class="data">
							<tr><td>communityName  </td><td>${smallBlogCommu.communityName}</td></tr>
							    <tr><td>communityTypeName  </td><td>${smallBlogCommu.communityTypeName}</td></tr>
							    <tr><td>provinceName  </td><td>${smallBlogCommu.provinceName}</td></tr>
							    <tr><td>amphoeName  </td><td>${smallBlogCommu.amphoeName}</td></tr>
							    <tr><td>tumbolName  </td><td>${smallBlogCommu.tumbolName}</td></tr>
							    <tr><td>fileName  </td><td>${smallBlogCommu.fileName}</td></tr>
							    <tr><td>fileTypeName  </td><td>${smallBlogCommu.fileTypeName}</td></tr>
							    <tr><td>pathName  </td><td>${smallBlogCommu.pathName}</td></tr>
							    <tr><td>googleMapLatitude  </td><td>${smallBlogCommu.googleMapLatitude}</td></tr>
							    <tr><td>googleMapLongtitude  </td><td>${smallBlogCommu.googleMapLongtitude}</td>	</tr>		
							    <tr><td>googleMapUrl  </td><td>${smallBlogCommu.googleMapUrl}</td></tr>					    
							    	<tr><td></td><td><a href="/haaksq/haaksq/home/1"> login page </a> <...More...</td></tr>							    
							</table>
							
							    
							    							    							    

							
					</p>
			</div>	

</c:if>

<c:if  test="${!empty smallBlogFormContact}">
			<div id="blog_small_contact" class="ui-widget-content ui-corner-all" >
				<h3 class="ui-widget-header ui-corner-all">Small Blog Community : 	Module	2.Contact Form</h3>
					<p>			
							<table class="data">
							    <tr><td>contactDetail  </td><td>${smallBlogFormContact.contactDetail}</td></tr>
							    <tr><td>contactURL  </td><td>${smallBlogFormContact.contactURL}</td></tr>
							    <tr><td>contactURL_IMG  </td><td>${smallBlogFormContact.contactURL_IMG}</td></tr>
						    	<tr><td></td><td>...More...</td></tr>							    
							</table>

					</p>
			</div>	

</c:if>

<c:if  test="${!empty smallBlogBOD}">
			<div id="blog_small_BOD" class="ui-widget-content ui-corner-all" >
				<h3 class="ui-widget-header ui-corner-all">Small Blog Community : 	Module	2.Contact Form</h3>
					<p>			
							<table class="data">
							    <tr><td>BodDetail  </td><td>${smallBlogBOD.bodDetail}</td></tr>
							    <tr><td>BodURL  </td><td>${smallBlogBOD.bodURL}</td></tr>
							    <tr><td>Bod_IMG  </td><td>${smallBlogBOD.bod_IMG}</td></tr>
						    	<tr><td></td><td>...More...</td></tr>							    
							</table>

					</p>
			</div>	

</c:if>


