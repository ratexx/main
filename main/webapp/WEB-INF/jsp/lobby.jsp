<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<script type="text/javascript" src="/haaksq/resources/js/jquery.validate.js"></script>	

<script type="text/javascript" src="/haaksq/resources/upload/script.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.9.1.custom/js/jquery-1.8.2.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.9.1.custom/js/jquery-ui-1.9.1.custom.min.js"></script>




<script type="text/javascript"> var jq = jQuery.noConflict();	</script>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	


  
    <script>

    $(document).ready(function(){ $("#INPUT_MASTER_FORM").validate({}); });
  </script>
  
<script type="text/javascript">
//global valiable 
var LifeID ;
var community_id = ${commuID};
var languageId = ${lanuageId};

//alert(LifeID +"ccc" + community_id + "|" +languageId );
</script>


<script type="text/javascript"> 
function add() {
	jq(function() {
		jq.post("/haaksq/haaksq/ajax/post",
					{ 	inputNumber1:  jq("#inputNumber1").val(),
				  		inputNumber2:  jq("#inputNumber2").val() },
						function(data){
							jq("#sum").append('<span id="sum">'+ data + '</span>');

					});
	});
}






function postReplyMasterOnTop() {
	//alert("xxxxxxxxx");
	jq(function() {
		jq.post("/haaksq/haaksq/ajax/replyParent",
					{ postMSGMaster:  jq("#postReplyMSGMaster").val()},
						
						function(data){
						//alert(data);
							   if(data ==null ||data.length ==0){
								   showLogin();
							   }else{
									paint_reply_parrent_lv0_ontop(data.id, data.message,data.createDate,data.parentId);
							   }
							//document.getElementById("DIV_ALL_DETAILS_REPLY_MASTER").innerHTML = "";
							//jq("#DIV_ALL_DETAILS_REPLY_MASTER").append(data);

					});
	});
}

function postReplyMaster() {
	//alert("xxxxxxxxx");
	jq(function() {
		jq.post("/haaksq/haaksq/ajax/replyParent",
					{ postMSGMaster:  jq("#postReplyMSGMaster").val()},
						
						function(data){
						//alert(data);
							   if(data ==null ||data.length ==0){
								   showLogin();
							   }else{
									paint_reply_parrent_lv0(data.id, data.message,data.createDate,data.parentId);
							   }
							//document.getElementById("DIV_ALL_DETAILS_REPLY_MASTER").innerHTML = "";
							//jq("#DIV_ALL_DETAILS_REPLY_MASTER").append(data);

					});
	});
}



function postReplyMasterLevel2(postId,msgReply) {
	//alert(document.URL);
	jq(function() {
		jq.post("/haaksq/haaksq/ajax/replyParentLevel2",
					{ postMSGMaster:  msgReply.value,
					   postParentID:  postId},
						
						function(data){
						   //alert(data);
						   if(data ==null ||data.length ==0){
							   showLogin();
						   }else{
							   //alert(data);
							   var sid = "reply_parent_space"+postId;			
							   paint_reply_parrent(postId ,data.message,data.createDate);
								//document.getElementById("DIV_ALL_DETAILS_REPLY_MASTER").innerHTML = "";
								//jq("#DIV_REPLY_LIST").append('<span id="sum">'+ data + '</span>');
								//jq().replaceAll("#DIV_ALL_DETAILS_REPLY");
								//jq("#DIV_ALL_DETAILS_REPLY_MASTER").append(msgPost);
						   }
					});
	});  
}


function paint_reply_parrent_lv0_ontop(sids ,msg,createdate,parentId){
	
	var sid = "reply_parent_space"+sids;
	var str =   " <div style=\"border: 2px solid #fff;background: #339900;\" > "+
					"<br><img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\"  width=20px height=20px >"+
		  			"<br> "+msg+
		  			"<br>" +createdate+
		  			"<span id=\"reply_parent_space"+sids +"\"></span>"+
		  			"</div>" + 
		  			 "<div id=\"postreplybox\" style=\"border: 1px solid #ccc; width:300px; height:40px;background: #cecece ;position:relative; left:50px;\" >"+
					" <img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\"  width=30px height=30px > "+
					" <input type=\"text\"  id=\"reply_parent_master"+parentId+"\" size=\"30\"  value=\"แสดงความคิดเห็น\"  > "+
					" <input type=\"submit\" value=\"Post\" onclick=\"postReplyMasterLevel2("+parentId+",reply_parent_master"+parentId+");\" /> <br>"+
	    			" </div><br> "; 
		  			//alert('reply_parrent' + str);
		  			//$("#reply_parent_space").append(str);
		  			jq("#DIV_ALL_DETAILS_REPLY_MASTER").prepend(str);
	 				//document.getElementById("DIV_ALL_DETAILS_REPLY_MASTER").innerHTML += str;
	 				//document.getElementById("reply_parent_space").innerHTML += Date()+"<br>";
	
}


function paint_reply_parrent_lv0(sids ,msg,createdate,parentId){
	
	var sid = "reply_parent_space"+sids;
	var str =   " <div style=\"border: 2px solid #fff;background: #339900;\" > "+
					"<br><img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\"  width=20px height=20px >"+
		  			"<br> "+msg+
		  			"<br>" +createdate+
		  			"<span id=\"reply_parent_space"+sids +"\"></span>"+
		  			"</div>" + 
		  			 "<div id=\"postreplybox\" style=\"border: 1px solid #ccc; width:300px; height:40px;background: #cecece ;position:relative; left:50px;\" >"+
					" <img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\"  width=30px height=30px > "+
					" <input type=\"text\"  id=\"reply_parent_master"+parentId+"\" size=\"30\"  value=\"แสดงความคิดเห็น\" > "+
					" <input type=\"submit\" value=\"Post\" onclick=\"postReplyMasterLevel2("+parentId+",reply_parent_master"+parentId+");\" /> <br>"+
	    			" </div><br> "; 
		  			//alert('reply_parrent' + str);
		  			//$("#reply_parent_space").append(str);
		  			//jq("#DIV_ALL_DETAILS_REPLY_MASTER").append(data);
	 				document.getElementById("DIV_ALL_DETAILS_REPLY_MASTER").innerHTML += str;
	 				//document.getElementById("reply_parent_space").innerHTML += Date()+"<br>";
	
}

function paint_reply_parrent(sids ,msg,createdate){
	var sid = "reply_parent_space"+sids;
	var str =   "<div style=\"border: 1px solid #ccc; width:300px; height:100px; background: #dcfbca;position:relative; left:50px;\"  > " +
					"<br><img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\"  width=20px height=20px >"+
		  			"<br> "+msg+
		  			"<br>" +createdate+
		  			"</div>"; 
		  			//alert('reply_parrent' + str);
		  			//$("#reply_parent_space").append(str);
	 				document.getElementById(sid).innerHTML += str;
	 				//document.getElementById("reply_parent_space").innerHTML += Date()+"<br>";
	
}


</script>



<script>




	function paint_showReply(msg,createdate,image){
		
		
		  var data;
		  data =" <div style=\"border: 2px solid #fff;background: #dcfbca;\"" +
		  "<img src=\"http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg\"  width=50px height=50px >" +
		  "<br>USER-NAME"+
		  "<br>"+msg+
		  "<br>" +createdate +  "</div>";
		  jq("#DIV_ALL_DETAILS_REPLY").append(data);
		 				//document.getElementById("reply_parent_space").innerHTML += Date()+"<br>";
		
	}


	
	
	function showReply(divname,lifeID){
		
		LifeID = lifeID;
		jq(function() {
			jq.post("/haaksq/haaksq/ajax/getReplyLifeList",
						{ 	LifeID: lifeID },//jq("#LifeID").val() },
							function(data){
								document.getElementById("DIV_ALL_DETAILS_REPLY").innerHTML = "";
								//jq("#DIV_ALL_DETAILS_REPLY").append(data);
								for(var i=0;i<data.length;i++){
									//alert(data[i].message+"*"+data[i].createDate+"*"+data[i].imageUrl);
									paint_showReply(data[i].message,data[i].createDate,data[i].imageUrl);	
								}
						});
		});		
		$(divname).show( "drop", 300 );
	}
	
	function showCommunityLifeStyleDetail(lifeID){
		
		LifeID = lifeID;
		jq(function() {
			jq.post("/haaksq/haaksq/ajax/getCommunityLifeStyleDetail",
						{ 	LifeID: lifeID },//jq("#LifeID").val() },
							function(data){
							document.getElementById("lifestyledetails").innerHTML = 
							"<img src='' width=200px height=200px >"	+
	 						"<br>ชื่อร้าน : "+data.lifestyleFullName+
	 						"<br>รายละเอียด : "+data.lifestyleDetail +
	 						"<br>ระยะห่าง : "+data.distanceFromHoa+
	 						"<br>ขึ้นชื่อ : "+data.address+
	 						"<br>เบอร์โทร : "+data.contractNo +
	 						"<br>MAP : "+data.lifestyleGoogleMap ;

							
							
							
						});
		});		
		$(divname).show( "drop", 300 );
	}
	
	function postreply() {

		jq(function() {
			jq.post("/haaksq/haaksq/ajax/postreply",
						{ 	LifeID: LifeID,
							postMSG:  jq("#postReplyMSG").val() },
							
							function(data){
								   if(data ==null ||data.length ==0){
									   showLogin();
								   }else{
										paint_showReply(data.message,data.createDate,data.imageUrl);
								   }
								//document.getElementById("DIV_ALL_DETAILS_REPLY").innerHTML = "";
								//jq("#DIV_REPLY_LIST").append('<span id="sum">'+ data + '</span>');
								//jq().replaceAll("#DIV_ALL_DETAILS_REPLY");
								//jq("#DIV_ALL_DETAILS_REPLY").append(data);

						});
		});
	}

	
	function aLogin() {

		jq(function() {
			jq.post("/haaksq/haaksq/ajax/alogin.html",
						{ 	auser: jq("#ausername").val() ,
							apass:  jq("#apassword").val() },
							
							function(data){
								   //alert(data);
								   if(data ==null ||data.length ==0){
									   
									   document.getElementById("ERROR_MSG").innerHTML += "หรัสผิดพลาด Login Fall;" ;
									   
								   }else{
									   //alert(data);
									   location.reload();
								   }
							}							
			
			);
		});
	}
	
	
	function showReplyMaster(divname,lifeID){
		
		LifeID = lifeID;
		jq(function() {
			jq.post("/haaksq/haaksq/ajax/getReplyMasterLifeList",
						{ 	LifeID: lifeID },//jq("#LifeID").val() },
							function(data){
								document.getElementById("DIV_ALL_DETAILS_REPLY").innerHTML = "";
								//jq("#DIV_REPLY_LIST").append('<span id="sum">'+ data + '</span>');
								//jq().replaceAll("#DIV_ALL_DETAILS_REPLY");
								jq("#DIV_ALL_DETAILS_REPLY").append(data);
								//jq(data).replaceAll("#ALL_DETAILS_REPLY");
								 
						});
		});		
		$(divname).show( "drop", 300 );
	}
	
	function passLoginByClick(divname) {

		jq(function() {
			jq.post("/haaksq/haaksq/ajax/chkLoginByClick.html","",
							function(data){
							alert("DATA" + data);
							   if(data ==null ||data.length ==0 ||data != 'YES'){
								   alert("POPUP Login");
								   showLogin();
							   }else{
								   alert("no POPUP Login" + data);
								   $(divname).show( "drop", 300 );
									
							   }
							}		
			);
		});
	}
	
	
	function modalOpenForm(divname){
		 $(divname).bPopup();
	      //  $(divname).bPopup({content:'iframe', contentContainer:'#LOGIN_POPUP',
	        //	onOpen: window.open('<c:url value="/haaksq/showajax.html"/>',"", "left=100,top=100,width=250,height=150")});

	        
	}	

	function showFormMaster(divname){
		alert(passLoginByClick());
		 if(passLoginByClick()){
			 $(divname).show( "drop", 300 );
			 
		 }else{
			 showLogin();
		 }
		 
	}	
	
	function showForm(divname){
		 $(divname).show( "drop", 300 );
	}
	function hideForm(divname){
		 $(divname).hide( "drop", 300 );
	}
	
	
	function showLogin(){
		
		modalOpenForm("#LOGIN_POPUP");
		// location.reload();
	}
</script>




<div id="LOGIN_POPUP">
		<table width="263">
					<tr>
					<td></td>
				        <td ><span id="ERROR_MSG"></span></td>
				        
				    </tr>
				    <tr>
				        <td><div align="right">อีเมลหรือโทรศัพท์&nbsp; </div></td>
				        <td><div align="left"><input  type="text" id="ausername" class="box3" /></div></td>
				    </tr>
				    <tr>
				        <td height="27"><div align="right">รหัสผ่าน&nbsp;</div></td>
				        <td><div align="left"><input type="password" id="apassword" class="box3" /></div></td>
				    </tr>
				    <tr>
				        <td>
				            <div align="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;													              </div></td>
				        <td> <div align="left"><input name="submit" type="button" value="Login" onclick="aLogin()" ></div></td>
				    </tr>
				    <tr>
				        <td colspan="2">หรือสมัครใหม่</td>
				        
				    </tr>
				    
			  </table>
</div>


<table>
<tr valign="top">
	<td>    
			<div  id="DIV_LIFE_STYLE_LIST"  style="border: 1px solid #ccc;width:400px; height:800px;overflow:scroll;">
			<table>
				<tr>
					<td>
						<h3 class="ui-widget-header ui-corner-all">LifeStyle</h3>
						<c:forEach items="${LIFE_STYLE_TYPE_LIST}" var="cacheM">
							<a href="/haaksq/haaksq/ajax/byLifeType.html?LIFE_TYPE_ID=${cacheM.name }" ><img  src="" width="30px" height="30px" border="1"  alt="${cacheM.value}"></a>
						</c:forEach>
						<!-- <a href="#" id="button2" class="ui-state-default ui-corner-all" onclick="showForm('#INPUT_MASTER');">+Add+</a> -->
						<a href="#" id="button2" class="ui-state-default ui-corner-all" onclick=" passLoginByClick('#INPUT_MASTER');">+Add+</a>
						<BR>

					</td>
				</tr>
			
			

				<tr>
					<td>
						<div id="INPUT_MASTER">
						<h3 class="ui-widget-header ui-corner-all">เพิ่ม</h3>
						
								<form:form method="post" action="/haaksq/haaksq/ajax/saveLifeStyle.html" commandName="communityLifestyle"  id="INPUT_NAME">
								<table>
								<tr>
									<td>ประเภท</td><td><select name="lifestyleTypeId">	
																			<c:forEach items="${LIFE_STYLE_TYPE_LIST}" var="cacheM">	
																				<option value="${cacheM.name}">${cacheM.value}</option>
																			</c:forEach>	
																		</select>
																</td>
								</tr>
								<tr>
									<td><form:label path="lifestyleFullName">ชื่อสถานที่</form:label></td>
									<td>
									<form:input  path="lifestyleFullName"  required="required"  id="INPUT_NAME"   />
								    
								</td></tr>
								<tr><td>รายละเอียด</td><td><form:input path="lifestyleDetail"  required="required"  id="INPUT_DETAIL" type="text" size="15"  class="required"  /></td></tr>
								<tr><td>ระยะห่าง</td><td><form:input path="distanceFromHoa"  required="required"  id="INPUT_DISTANCE" type="text" size="15"  class="required"  /></td></tr>
								<tr><td>ขึ้นชื่อ</td><td><form:input path="recommende"  required="required"  id="INPUT_RECOMMEND" type="text" size="15" class="required" /></td></tr>
								<tr><td>ที่อยู่</td><td><form:input path="address"  required="required"  id="INPUT_ADDRESS" type="text" size="15"  class="required" /></td></tr>
								<tr><td>เบอร์โทร</td><td><form:input path="contractNo"  required="required"  id="INPUT_MOBILE" type="text" size="15"  class="required number" /></td></tr>
								<tr><td>URL</td><td><form:input path="lifestyleUrl"  required="required"  id="INPUT_URL" type="text" size="15" class="required url" /></td></tr>
								<tr><td>MAP</td><td><form:input path="lifestyleGoogleMap"  required="required"  id="INPUT_GOOGLE_MAP" type="text"  size="15"  class="required url"  /></td></tr>
								<tr><td>MAP</td><td><form:input path="lifestyleLink"  required="required"  id="INPUT_LINK" type="text"  size="15"  value="xxx"  /></td></tr>
								
								<tr><td></td><td><input type="submit"  value="Add" /> </td></tr>
								
								</table>
								</form:form>
								
						<!-- remove here </div> -->
						<div id="upload-etc">
					       <div class="container">
					            <div class="contr"></div>
					
					            <div class="upload_form_cont">
					                <form id="upload_form" enctype="multipart/form-data" method="post" action="upload.php">
					                    <div>
					                        <div><label for="image_file">Please select image file</label></div>
					                        <div><input type="file" name="image_file" id="image_file" onchange="fileSelected();" /></div>
					                    </div>
					                    <div>
					                        <input type="button" value="Upload" onclick="startUploading('/haaksq/haaksq/saveIMGETC.html')" />
					                    </div>
					                    <div id="fileinfo">
					                        <div id="filename"></div>
					                        <div id="filesize"></div>
					                        <div id="filetype"></div>
					                        <div id="filedim"></div>
					                    </div>
					                    <div id="error">You should select valid image files only!</div>
					                    <div id="error2">An error occurred while uploading the file</div>
					                    <div id="abort">The upload has been canceled by the user or the browser dropped the connection</div>
					                    <div id="warnsize">Your file is very big. We can't accept it. Please select more small file</div>
					
					                    <div id="progress_info">
					                        <div id="progress"></div>
					                        <div id="progress_percent">&nbsp;</div>
					                        <div class="clear_both"></div>
					                        <div>
					                            <div id="speed">&nbsp;</div>
					                            <div id="remaining">&nbsp;</div>
					                            <div id="b_transfered">&nbsp;</div>
					                            <div class="clear_both"></div>
					                        </div>
					                        <div id="upload_response"></div>
					                        <%=request.getContextPath()%>
					                        <img src="<spring:url value='/imgpro/1/2/5/H_1360336937994.jpg'/>"/>
					                    </div>
					                </form>
					
					                <img id="preview" />
					            </div>
					        </div>
						</div>		
						<!-- remove here  -->
						<a href="#" id="button2" class="ui-state-default ui-corner-all" onclick="hideForm('#INPUT_MASTER');">X</a>
					</div>				
					</td>
				</tr>
				
				

					<td>
							<div id="LIST_LIFE_STYLE_LEFT"  style = "background: #ffff99;">
				        
				               <c:forEach items="${LIFE_STYLE_LIST}" var="COML">
						   
													<a href="#"   onclick="showReply('#DIV_REPLY_LIST',${COML.communityLifestyleId}),showCommunityLifeStyleDetail(${COML.communityLifestyleId});">
														<label >
															 <strong>[${COML.lifestyleFullName}]</strong> 
															 ${COML.createDate}
														</label>
													</a>
													<br>  
							  </c:forEach>
							  </div>
					</td>
				</tr>	

				<tr>
					<td>
				        
					    <div id="postreplybox" >
					        <h3 class="ui-widget-header ui-corner-all">พูดคุยในหมวดนี้</h3>
					        <p>
					          	เชิญบ่น<br/>
									<textarea rows="2" cols="50"  id="postReplyMSGMaster" ></textarea>
									<!-- <input id="inputNumber1" type="text" size="20" >  --><br>
									<input type="submit" value="Post" onclick="postReplyMasterOnTop();" /> <br>
					        </p>
					    </div>
					</td>
				</tr>	
				
			<tr>
					<td>
							<div id=DIV_ALL_DETAILS_REPLY_MASTER>
							
							
							<c:forEach items="${REPLY_MASTER_LIST}" var="trnPostReply">

													<c:if  test="${trnPostReply.id  == trnPostReply.parentId}">
													<div style="border: 2px solid #fff;background: #339900;" >
														 <img src="http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg"  width=50px height=50px >
														  <br>${trnPostReply.message}
														  <br>${trnPostReply.createDate} 
															<span id="reply_parent_space${trnPostReply.parentId}"></span>
													</div>
										 			</c:if>
										 			<c:if  test="${trnPostReply.id  != trnPostReply.parentId}">
										 				  
										 				  <script >paint_reply_parrent("${trnPostReply.parentId}" , "${trnPostReply.message}","${trnPostReply.createDate}");</script>	
													</c:if>	

										 			<c:if  test="${trnPostReply.id  == trnPostReply.parentId}"> 
																				
														  					    <div id="postreplybox" style="border: 1px solid #ccc; width:300px; height:40px;background: #cecece ;position:relative; left:50px;" >
																							<img src="http://localhost:8080/haaksq/resources/img-by-haaksq/logo.jpg"  width=30px height=30px >
																							<input type="text"  id="reply_parent_master${trnPostReply.parentId}" size="30"  value="แสดงความคิดเห็น" >
																							<input type="submit" value="Post" onclick="postReplyMasterLevel2(${trnPostReply.parentId},reply_parent_master${trnPostReply.parentId});" /> <br>
																			    </div><br>
										 			</c:if>	

							  </c:forEach>
							  </div> 

					</td>
				</tr>
				<tr>
							

				
			</table>
			</div>
	</td>
	 <td>
 			<div  id="DIV_REPLY_LIST"  style=width:400px; height:300px;overflow:scroll;">
 			<table>
 			<tr>
 				<td>
 					
						<div id=lifestyledetails></div>
 				</td>
 			</tr>
 			
 			
 			<div id="DETAILS_REPLY">
 				<tr>
 					<td>
									
									
									<h3 class="ui-widget-header ui-corner-all">เค้าว่ากันว่า</h3>
									<div id=DIV_ALL_DETAILS_REPLY></div>
									
									
 					</td>
 				</tr>
 				</div>
 				<tr>
 					<td>
					    <div id="postreplybox" style="width:350px; height:100px;">
					        <h3 class="ui-widget-header ui-corner-all">Show</h3>
					        <p>
					          	เชิญบ่น<br/>
									<textarea rows="2" cols="50"  id="postReplyMSG" ></textarea>
									<!-- <input id="inputNumber1" type="text" size="20" >  --><br>
									<input type="submit" value="Post" onclick="postreply(),hideForm();" /> <br>
								<a href="#" id="button2" class="ui-state-default ui-corner-all" onclick="hideForm('#DIV_REPLY_LIST')">X</a>
					        </p>
					    </div>
 					
 					
 					</td>
 				</tr>
 			</table>
			</div>
 	</td>


 
 </table>
 

<script>
	$( "#effect" ).hide();
	$( "#DIV_REPLY_LIST" ).hide();
	$( "#INPUT_MASTER" ).hide();
	$( "#LOGIN_POPUP" ).hide();
	
	
</script>

