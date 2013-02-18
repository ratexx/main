<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<html>
<head>
    <title>Spring MVC Multiple File Upload</title>
    
    
    <link rel="stylesheet" href="/haaksq/resources/upload/main.css" type="text/css" media="all">
    <script type="text/javascript" src="/haaksq/resources/upload/script.js"></script>
<script type="text/javascript" src="/haaksq/resources/js/jquery.validate.js"></script>	

<script type="text/javascript" src="/haaksq/resources/upload/jquery.filedrop.js"></script>


<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.9.1.custom/js/jquery-1.8.2.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.9.1.custom/js/jquery-ui-1.9.1.custom.min.js"></script>
 <script type="text/javascript"> var jq = jQuery.noConflict();	</script>
 
 
 <script >

 function upj(){
	 var formdata = jq("#aform");
		jq(function() {
			jq.post("saveIMGETC.html",
						{ 	images : formdata },
							function(data){ alert("xxxxxxxxxxxxxxxxxx");
						});
		});		
		//$(divname).show( "drop", 300 );
	}

 /*
 function upj(){
	 var formdata = jq("#aform");
	 //var formdata = new FormData();
	$.ajax({
		url: "saveIMGETC.html",
		//url: "saveIMGETC.html?ipclient='xxx.xxx.xxx.xxx'",
		type: "POST",
		data: formdata,
		//data: {images :formdata,ipclient :"xxx.xxx.xxx.xxx" },
		processData: false,
		contentType: false,
		success:  function (res) {
		document.getElementById("response").innerHTML = res; 
		},
		error:function(e){
			alert("Error" + e ) ;
		}
	});
 }
 
 */
 </script>
	
</head>
	<div id='upload-etc'>
       <div class="container">
            <div class="contr"><h2>You can select the file (image) and click Upload button</h2></div>

            <div class="upload_form_cont">
                <form id="upload_form" enctype="multipart/form-data" method="post" action="upload.php">
                    <div>
                        <div><label for="image_file">Please select image file</label></div>
                        <div><input type="file" name="image_file" id="image_file" onchange="fileSelected();" /></div>
                    </div>
                    <div>
                        <input type="button" value="Upload" onclick="startUploading()" />
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
                    </div>
                </form>

                <img id="preview" />
            </div>
        </div>
	</div>

<script type="text/javascript">
$(function(){
    var winopen = null;
    $("#opentest").bind("click", function(){
           if (winopen == null || winopen.closed){
            winopen = window.open("../../haaksq/haaksq/showajax.html","", "left=100,top=100,width=250,height=150");
        }
        var field1 = $("#field1").val(),
            field2 = $("#field2").val(),
            ntry = 3,
            sendMsg = function(){
                if (winopen.document.readyState != "complete"){
                    if (ntry >= 0)
                        setTimeout(sendMsg, 1000);
                    ntry--;
                    return;
                }
                $(winopen.document.body).find("#field1").html(field1);
                $(winopen.document.body).find("#field2").html(field2);
          }
        sendMsg();
    });
});






</script>

    <input id="field1" />
    <input id="field2" />

    <button id="opentest">test</button>




</html>