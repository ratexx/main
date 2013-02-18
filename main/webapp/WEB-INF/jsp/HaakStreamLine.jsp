
<script type="text/javascript" src="/haaksq/resources/js/jquery/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	var jq2 = jQuery.noConflict();
	var lastid = 0;
</script>		
<script>	
		function postReplyMasterOnTop(last_id) {
			//alert(last_id);
			jq2(function() {
				jq2.post("/haaksq/haaksq/ajax/getStreamList",
							{ commuId : 0 ,
							   last_id : last_id },								
					 		 //last_id : 0},
								function(data){
									
									for(var i=data.length;i>0;i--){
										//alert(data[i].id+"OOO"+data[i].message+"OOO"+data[i].createDate+"OOO"+data[i].imageUrl);
										paint_reply_parrent_lv0_ontop(data[i-1].message,data[i-1].createDate,data[i-1].imageUrl);
										last_id = data[i-1].id;
										//alert(lastid +"-"+data[i].id);
										
									}
									//alert(last_id);
									setTimeout("postReplyMasterOnTop("+last_id+")", 50000); 
								});
				});
		}

		
		function paint_reply_parrent_lv0_ontop(msg,createdate,image){
			
			var str =   " <div style=\"border: 2px solid #fff;background: #bbd3d7;\" > "+
							"<br><img src=\""+image+"\"  width=20px height=20px >"+
				  			"<br> "+msg+
				  			"<br>" +createdate+
				  			"</div>"; 
				  			jq2("#STREAM_LINE").prepend(str).fadeIn('slow');
			 				//document.getElementById("DIV_ALL_DETAILS_REPLY_MASTER").innerHTML += str;
			 				//document.getElementById("reply_parent_space").innerHTML += Date()+"<br>";
			
		}

		
		function showForm(divname){
			 $(divname).show( "drop", 300 );
		}
		function hideForm(divname){
			 $(divname).hide( "drop", 300 );
		}
			
			
			
			
		</script>
		
		
		
		<!-- Stream -->
		<div id="STREAM_LIST">Stream Here >
			<div id="STREAM_LINE"></div>
		</div>
		<!--end Stream -->
		
		
		<script>
		//hideForm("#STREAM_LIST");
		postReplyMasterOnTop(0);
		//setTimeout("postReplyMasterOnTop();", 1000);
		</script>
	
		
		