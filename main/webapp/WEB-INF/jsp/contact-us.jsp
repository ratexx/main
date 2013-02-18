<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
ที่นี่มันคือที่ไหนนี่
<table cellspacing="20">
	<tr >
		<td>
			<div id="commu_details" class="ui-widget-content ui-corner-all" onclick =runEffect2();>
				<h3 class="ui-widget-header ui-corner-all">Commu :หมู่บ้านหรรษา</h3>
				<p>
				ที่นี่มันคือที่ไหนนี่
				<a href="<c:url value="/haaksq/full-Details-Community.htm"/>" >ดูทั้งหมด</a>|
				</p>
			</div>
		</td>
		<td>
			<div  class="ui-widget-content ui-corner-all " >
			<h3 class="ui-widget-header ui-corner-all">Gallery</h3>
				<div class="scroll-pane ui-widget ui-widget-header ui-corner-all ">
					<div class="scroll-content " >
			<div id="gallery">
			    <ul>
			        <li>
			            <a href="/haaksq/resources/image-slide/image1.jpg" title="รูปภาพ">
			                <img src="/haaksq/resources/image-slide/thumb_image1.jpg" width="72" height="72" alt="" />
			            </a>
			        </li>
			        <li>
			            <a href="/haaksq/resources/image-slide/image2.jpg" title="Utilize a flexibilidade dos seletores da jQuery e crie um grupo de imagens como desejar. $('#gallery a').lightBox();">
			                <img src="/haaksq/resources/image-slide/thumb_image2.jpg" width="72" height="72" alt="" />
			            </a>
			        </li>
			        <li>
			            <a href="/haaksq/resources/image-slide/image3.jpg" title="Utilize a flexibilidade dos seletores da jQuery e crie um grupo de imagens como desejar. $('#gallery a').lightBox();">
			                <img src="/haaksq/resources/image-slide/thumb_image3.jpg" width="72" height="72" alt="" />
			            </a>
			        </li>
			        <li>
			            <a href="/haaksq/resources/image-slide/image4.jpg" title="Utilize a flexibilidade dos seletores da jQuery e crie um grupo de imagens como desejar. $('#gallery a').lightBox();">
			                <img src="/haaksq/resources/image-slide/thumb_image4.jpg" width="72" height="72" alt="" />
			            </a>
			        </li>
			        <li>
			            <a href="/haaksq/resources/image-slide/image5.jpg" title="Utilize a flexibilidade dos seletores da jQuery e crie um grupo de imagens como desejar. $('#gallery a').lightBox();">
			                <img src="/haaksq/resources/image-slide/thumb_image5.jpg" width="72" height="72" alt="" />
			            </a>
			        </li>
			        <li>
			            <a href="/haaksq/resources/img-by-haaksq/micky.jpg" title="Utilize a flexibilidade dos seletores da jQuery e crie um grupo de imagens como desejar. $('#gallery a').lightBox();">
			                <img src="/haaksq/resources/img-by-haaksq/micky.jpg" width="72" height="72" alt="" />
			            </a>
			        </li>


			    </ul>
			</div>
					</div>
					<div class="scroll-bar-wrap ui-widget-content ui-corner-bottom gallery_detail">
						<div class="scroll-bar"></div>
					</div>
				</div>
			</div><!-- End demo -->
		</td>
	</tr>
</table>
<br>	
<table cellspacing="20">
	<tr>
		<td>
			<div id="opportunities_details" class="ui-widget-content ui-corner-all" onclick =runEffect2();>
				<h3 class="ui-widget-header ui-corner-all">Opportunities : </h3>
				<p>
				xxxx xxxxxx xxxxxxx
				</p>
			</div>		
		</td>
		<td>
			<div id="sell_buy_details" class="ui-widget-content ui-corner-all" onclick =runEffect2();>
				<h3 class="ui-widget-header ui-corner-all">Sell Buy : </h3>
				<p>
				xxxx xxxxxx xxxxxxx
				</p>
			</div>		
		</td>
		<td>
			<div id="lifeStyle_details" class="ui-widget-content ui-corner-all" onclick =runEffect2();>
				<h3 class="ui-widget-header ui-corner-all">LifeStyle : </h3>
				<p>
				xxxx xxxxxx xxxxxxx
				</p>
			</div>		
		</td>
	</tr>
</table>
<br>

<c:if  test="${!empty BlogNewsList}">
<table class="data">
<tr>
    <th>Name</th>
    <th>Email</th>

</tr>
<c:forEach items="${BlogNewsList}" var="BlogNews">
    <tr>
        <td>${BlogNews.header}</td>
        <td>${BlogNews.details}</td>
    </tr>
</c:forEach>
</table>
</c:if>

<!-- 
<table>
	<tr>
		<td>
			<div id="gallery">
			    <ul>
			        <li>
			            <a href="/haaksq/resources/image-slide/image1.jpg" title="Utilize a flexibilidade dos seletores da jQuery e crie um grupo de imagens como desejar. $('#gallery').lightBox();">
			                <img src="/haaksq/resources/image-slide/thumb_image1.jpg" width="72" height="72" alt="" />
			            </a>
			        </li>
			        <li>
			            <a href="/haaksq/resources/image-slide/image2.jpg" title="Utilize a flexibilidade dos seletores da jQuery e crie um grupo de imagens como desejar. $('#gallery a').lightBox();">
			                <img src="/haaksq/resources/image-slide/thumb_image2.jpg" width="72" height="72" alt="" />
			            </a>
			        </li>
			        <li>
			            <a href="/haaksq/resources/image-slide/image3.jpg" title="Utilize a flexibilidade dos seletores da jQuery e crie um grupo de imagens como desejar. $('#gallery a').lightBox();">
			                <img src="/haaksq/resources/image-slide/thumb_image3.jpg" width="72" height="72" alt="" />
			            </a>
			        </li>
			        <li>
			            <a href="/haaksq/resources/image-slide/image4.jpg" title="Utilize a flexibilidade dos seletores da jQuery e crie um grupo de imagens como desejar. $('#gallery a').lightBox();">
			                <img src="/haaksq/resources/image-slide/thumb_image4.jpg" width="72" height="72" alt="" />
			            </a>
			        </li>
			        <li>
			            <a href="/haaksq/resources/image-slide/image5.jpg" title="Utilize a flexibilidade dos seletores da jQuery e crie um grupo de imagens como desejar. $('#gallery a').lightBox();">
			                <img src="/haaksq/resources/image-slide/thumb_image5.jpg" width="72" height="72" alt="" />
			            </a>
			        </li>
			    </ul>
			</div>
		</td>
	</tr>
</table>
 -->
	
	
	