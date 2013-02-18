<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring MVC Multiple File Upload</title>
    
    
<script type="text/javascript" src="/haaksq/resources/js/jquery.validate.js"></script>	
<script type="text/javascript" src="/haaksq/resources/jquery-ui-1.9.1.custom/js/jquery-1.8.2.js"></script>
<script type="text/javascript" src="/haaksq/resources/js/jquery.upload-1.0.2.js"></script>
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


function ajaxupload() {
	alert("ajupload");
	jq(function() {
		jq.post("/haaksq/haaksq/ajupload",
				{  uploadForm :$('#uploadForm').val()},
					
						function(data){
						alert(data);
					});
	});
}



</script>

  <script type="text/javascript">
    $(function() {
        $('#file1').change(function() {
            $(this).upload("/haaksq/haaksq/ajupload", function(res) {
                $(res).insertAfter(this);
            }, 'html');
        });
    });
  </script>

 

</head>
<body>
<h1>Spring Multiple File Upload example</h1>
 
 
 
  <input name="file" id="file1" type="file">
<form:form method="post" action="ajupload"
        modelAttribute="uploadForm" enctype="multipart/form-data" >
 
    <p>Select files to upload. Press Add button to add more file inputs.</p>
 
    <input id="addFile" type="button" value="Add File" />
    <table id="fileTable">
        <tr>
            <td><input name="files[0]" type="file" /></td>
        </tr>
<!--         <tr>
            <td><input name="files[1]" type="file" /></td>
        </tr> -->
    </table>
    <br/><input type="submit" value="Upload"  onclick="ajaxupload()"/>
</form:form>
</body>
</html>