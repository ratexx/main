<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<html>
<head>
    <title>Spring MVC Multiple File Upload</title>
    
    
    <link rel="stylesheet" href="/haaksq/resources/upload/css/styles.css" type="text/css" media="all">
    
<script type="text/javascript" src="/haaksq/resources/js/jquery.validate.js"></script>	

<script type="text/javascript" src="/haaksq/resources/upload/jquery.filedrop.js"></script>
<script type="text/javascript" src="/haaksq/resources/upload/script.js"></script>

<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.9.1.custom/js/jquery-1.8.2.js"></script>
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.9.1.custom/js/jquery-ui-1.9.1.custom.min.js"></script>
 <script type="text/javascript"> var jq = jQuery.noConflict();	</script>
<script>
$(document).ready(function() {
    //add more file components if Add is clicked
    $('#addFile').click(function() {
        var fileIndex = $('#fileTable tr').children().length - 1;
        $('#fileTable').append(
                '<tr><td>'+
                '   <input type="file" name="files['+ fileIndex +']" />'+
                '</td></tr>');
    });
     
});
 
function ajaxUpload() {
	jq(function() { 
		alert("Call ajax" );
		jq.post("/haaksq/haaksq/ajaxsave.html",
					{ 	//uploadForm: 'XXXXXXXXXXXX'  
						uploadForm: jq("#uploadForm").val
						//uploadForm:      jq("#uform").val  // $('uform')
						},
						function(data){
							//jq("#sum").append('<span id="sum">'+ data + '</span>');
							//ajaxsave.html
							alert(data);

					});
	});
}

 function ajaxUpload2(){
 	
	//var photo = document.getElementById("photo");
	
	 //var file = photo.files[0];
	 alert("ddddddd");
	 alert(jq("#uploadForm"));
	$.ajax({
		type:"POST" ,
		url:"/haaksq/haaksq/ajaxsavepew.html",
		data:  jq("#uploadForm") ,
		success:function(response){
			alert("asd");
		},
		error:function(e){
			alert("Error" + e ) ;
		}
	});
}

/* function upload(){
 	
	var photo = document.getElementById("photo");
	
	 var file = photo.files[0];
 
	$.ajax({
		type:"POST" ,
		url:"/haaksq/haaksq/ajaxsave.html",
		data:"xxx=" + file ,
		success:function(response){
			alert("asd");
		},
		error:function(e){
			alert("Error" + e ) ;
		}
	});
}  */

</script>
</head>
<body>
<h1>Spring Multiple File Upload example</h1>
<!-- action="file_upload/ajaxsave"  -->
<form:form method="post"  id="uform" modelAttribute="uploadForm"  enctype="multipart/form-data">
 
    <p>Select files to upload. Press Add button to add more file inputs.</p>
 
    <input id="addFile" type="button" value="Add File" />
    <table id="fileTable">
        <tr>
          <!--   <td><input name="files[0]"  type="file" /></td> -->
             <td><input id="photo"  name="photo"  type="file" /> </td>
        </tr>
<!--         <tr>
            <td><input name="files[1]" type="file" /></td>
        </tr> -->
    </table>
    <br/><input type="submit" value="Upload"  />
   			 <input type="button" value="Upload2"  onclick="upload()" />
 			<input type="button" value="ajax Upload"  onclick="ajaxUpload2()" />
  <!--    onclick="ajaxUpload()" -->
</form:form>

xxxxxxxxxxxxxx
		<div id="dropbox">
			<span class="message">Drop images here to upload. <br /><i>(they will only be visible to you)</i></span>
		</div>
xxxxxxxxxxxxxx



</body>
</html>