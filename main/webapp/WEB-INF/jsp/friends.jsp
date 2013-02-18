<%-- 
    Document   : friends
    Created on : Dec 19, 2008, 1:55:47 AM
    Author     : eswar@vaannila.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>






<div id="myDIV" class="demo" style="background-color:orange;display:none">My DIV
<h3 class="ui-widget-header ui-corner-all">Adver2</h3>
</div>
<div class="demo">

<p>Date: <input type="text" id="datepicker"></p>
</div>




<div class="demo">

<div id="accordion">
	<h3><a href="#section1">Section 1</a></h3>
	<div>
		<p>Mauris mauris ante, blandit et, ultrices a, susceros. Nam mi. Proin viverra leo ut odio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.</p>
	</div>
	<h3><a href="#section2">Section 2</a></h3>
	<div>
		<p>Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In suscipit faucibus urna. </p>
	</div>
	<h3><a href="#section3">Section 3</a></h3>
	<div>
		<p>Nam enim risus, molestie et, porta ac, aliquam ac, risus. Quisque lobortis. Phasellus pellentesque purus in massa. Aenean in pede. Phasellus ac libero ac tellus pellentesque semper. Sed ac felis. Sed commodo, magna quis lacinia ornare, quam ante aliquam nisi, eu iaculis leo purus venenatis dui. </p>
		<ul>
			<li>List item</li>
			<li>List item</li>
			<li>List item</li>
			<li>List item</li>
			<li>List item</li>
			<li>List item</li>
			<li>List item</li>
		</ul>
		<a href="#othercontent">Link to other content</a>
	</div>
</div>

</div><!-- End demo -->



<div class="demo-description">
<p>Setting <code>autoHeight: false</code> allows to accordion panels to keep their native height.</p>
<p>In addition, the <code>navigation</code> option is enabled, opening the panel based on the current location, eg. no-auto-height.html#panel2 would open the second panel on page load. It also finds anchors within the content, so #othercontent will open the third section, as it contains a link with that href.</p>
</div><!-- End demo-description -->

<div class="demo-description">
<p>
Click headers to expand/collapse content that is broken into logical sections, much like tabs.
Optionally, toggle sections open/closed on mouseover.
</p>
<p>
The underlying HTML markup is a series of headers (H3 tags) and content divs so the content is
usable without JavaScript.
</p>
</div><!-- End demo-description -->

  



    </body>
</html>




