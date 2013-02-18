<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<script language="JavaScript">
function choose(theField) {
var tempval=eval("document."+theField)
tempval.focus()
tempval.select()
}
message = "Haak Square %" +
"Social Network %  "+
"สำหรับชุมชนที่อยู่อาศัย %" 
 // ข้อความของคุณแต่ละชุดอย่าลืมต้องมี % ลงท้ายนะครับ
scrollSpeed = 100// ความเร็วในการวิ่ง
lineDelay = 3000 // ความเร็วในการเปลี่ยน
txt = ""
function scrollText(pos) {
if (message.charAt(pos) != '%') {
txt = txt + message.charAt(pos)
document.title = txt
pauze = scrollSpeed
}else {
pauze = lineDelay
txt = ""
if (pos == message.length-1) pos = -1
}
pos++
setTimeout("scrollText('"+pos+"')",pauze)
}
scrollText(0)
</script>


<head>   
<link type="image/x-icon"  href="/haaksq/resources/img-by-haaksq/logoH.ico" rel="icon">
	<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>

<link rel="stylesheet" href="/haaksq/resources/css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="/haaksq/resources/css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="/haaksq/resources/css/style.css" type="text/css" media="all">
<script type="text/javascript" src="/haaksq/resources/js/jquery-1.4.2.js" ></script>
<script type="text/javascript" src="/haaksq/resources/js/cufon-yui.js"></script>
<script type="text/javascript" src="/haaksq/resources/js/cufon-replace.js"></script>	
<!--<script type="text/javascript" src="js/Myriad_Pro_300.font.js"></script>-->
<!-- <script type="text/javascript" src="/haaksq/resources/js/DB_Helvethaica_X_55_Regular_400.font.js"></script> -->



<link rel="stylesheet" href="/haaksq/resources/jquery-ui-1.7.3.custom/development-bundle/themes/base/jquery.ui.all.css">
<link rel="stylesheet" href="/haaksq/resources/jquery-ui-1.7.3.custom/css/ui-lightness/jquery-ui-1.7.3.custom.css" type="text/css" />
<link rel="stylesheet" href="/haaksq/resources/css/haaksq-main.css" type="text/css" />
<link rel="stylesheet" href="/haaksq/resources/css/jquery.lightbox-0.5.css" type="text/css" />
<link rel="stylesheet" href="/haaksq/resources/css/global.css" type="text/css" />


<script type="text/javascript" src="/haaksq/resources/js/jquery.validate.js"></script>
<script type="text/javascript" src="/haaksq/resources/js/jquery/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/haaksq/resources/js/jquery/jquery-ui-1.7.3.custom.min.js"></script>
<script type="text/javascript" src="/haaksq/resources/js/jquery/jquery.bpopup-0.7.0.min.js"></script>

<script src="/haaksq/resources/jquery-ui-1.7.3.custom/development-bundle/ui/effects.core.js"></script>
<script src="/haaksq/resources/jquery-ui-1.7.3.custom/development-bundle/ui/jquery.ui.core.js"></script> 
<script src="/haaksq/resources/jquery-ui-1.7.3.custom/development-bundle/ui/effects.bounce.js"></script>
<script src="/haaksq/resources/jquery-ui-1.7.3.custom/development-bundle/ui/jquery.ui.widget.js"></script>
<script src="/haaksq/resources/jquery-ui-1.7.3.custom/development-bundle/ui/jquery.ui.accordion.js"></script>
<script src="/haaksq/resources/jquery-ui-1.7.3.custom/development-bundle/ui/jquery.ui.datepicker.js"></script>
<script src="/haaksq/resources/jquery-ui-1.7.3.custom/development-bundle/ui/jquery.ui.mouse.js"></script>
<script src="/haaksq/resources/jquery-ui-1.7.3.custom/development-bundle/ui/jquery.ui.slider.js"></script>


<script src="/haaksq/resources/js/slides.min.jquery.js"></script>


<script src="/haaksq/resources/js/jquery/jquery.lightbox-0.5.js"></script>


<link rel="stylesheet" href="/haaksq/resources/jquery-ui-1.7.3.custom/css/ui-lightness/demos.css" type="text/css" />
	

<link href="/haaksq/resources/css/css_pirobox/style_5/style.css" rel="stylesheet" type="text/css" />


<!-- <script type="text/javascript">
$(document).ready(function() {
	$.piroBox_ext({
	piro_speed :700,
	bg_alpha : 0.5,
	piro_scroll : true,
	piro_drag :false,
	piro_nav_pos: 'bottom'
});
});
</script> -->
  



<script>



	$(function() {
		$( "#accordion" ).accordion();
	});
</script>

<script>

    $(document).ready(function (){/* on load */
    	cccc();
    	runEffect();
    	runEffect2();
    	showdate();
    	//accore();
    });


	function showdate() {
		$( "#datepicker" ).datepicker({
			showButtonPanel: true
		});
	};

    
    function cccc(){
	$("#myDIV").show("slow"); 
	$("#blog_commu_full_details").show("slow");
	
   };
   
	function runEffect() {
		var selectedEffect ="bounce";
		var options = {};
		if ( selectedEffect === "scale" ) {
			options = { percent: 100 };
		} else if ( selectedEffect === "size" ) {
			options = { to: { width: 280, height: 185 } };
		}
		$("#effect").show( "bounce", options, 500, callback );
	};
	
	function runEffect2() {
		var selectedEffect ="bounce";
		var options = {};
		if ( selectedEffect === "scale" ) {
			options = { percent: 100 };
		} else if ( selectedEffect === "size" ) {
			options = { to: { width: 280, height: 185 } };
		}
		$("#effect2").show( "bounce", options, 600, callback );
	};	

	function callback() {
/* 		setTimeout(function() {
			$( "#effect:visible" ).removeAttr( "style" ).fadeOut();
		}, 1000 ); */
	};

	function hidese() {
		 		
					$( "#effect:visible" ).removeAttr( "style" ).fadeOut();
				 
			};
   
   
   
</script>



<!-- Script for Gallery -->
	<script>
	$(function() {
		//scrollpane parts
		var scrollPane = $( ".scroll-pane" ),
			scrollContent = $( ".scroll-content" );
		
		//build slider
		var scrollbar = $( ".scroll-bar" ).slider({
			slide: function( event, ui ) {
				if ( scrollContent.width() > scrollPane.width() ) {
					scrollContent.css( "margin-left", Math.round(
						ui.value / 100 * ( scrollPane.width() - scrollContent.width() )
					) + "px" );
				} else {
					scrollContent.css( "margin-left", 0 );
				}
			}
		});
		
		//append icon to handle
		var handleHelper = scrollbar.find( ".ui-slider-handle" )
		.mousedown(function() {
			scrollbar.width( handleHelper.width() );
		})
		.mouseup(function() {
			scrollbar.width( "100%" );
		})
		.append( "<span class='ui-icon ui-icon-grip-dotted-vertical'></span>" )
		.wrap( "<div class='ui-handle-helper-parent'></div>" ).parent();
		
		//change overflow to hidden now that slider handles the scrolling
		scrollPane.css( "overflow", "hidden" );
		
		//size scrollbar and handle proportionally to scroll distance
		function sizeScrollbar() {
			var remainder = scrollContent.width() - scrollPane.width();
			var proportion = remainder / scrollContent.width();
			var handleSize = scrollPane.width() - ( proportion * scrollPane.width() );
			scrollbar.find( ".ui-slider-handle" ).css({
				width: handleSize,
				"margin-left": -handleSize / 2
			});
			handleHelper.width( "" ).width( scrollbar.width() - handleSize );
		}
		
		//reset slider value based on scroll content position
		function resetValue() {
			var remainder = scrollPane.width() - scrollContent.width();
			var leftVal = scrollContent.css( "margin-left" ) === "auto" ? 0 :
				parseInt( scrollContent.css( "margin-left" ) );
			var percentage = Math.round( leftVal / remainder * 100 );
			scrollbar.slider( "value", percentage );
		}
		
		//if the slider is 100% and window gets larger, reveal content
		function reflowContent() {
				var showing = scrollContent.width() + parseInt( scrollContent.css( "margin-left" ), 10 );
				var gap = scrollPane.width() - showing;
				if ( gap > 0 ) {
					scrollContent.css( "margin-left", parseInt( scrollContent.css( "margin-left" ), 10 ) + gap );
				}
		}
		
		//change handle position on window resize
		$( window ).resize(function() {
			resetValue();
			sizeScrollbar();
			reflowContent();
		});
		//init scrollbar size
		setTimeout( sizeScrollbar, 10 );//safari wants a timeout
	});
	</script>

<!--  Gallery -->
    <script type="text/javascript">
    $(function() {
        $('#gallery a').lightBox();
    });
    </script>



<body >



 	<tiles:insertAttribute name="header" /> 	
 	    <div style="width:80%;float:left;">
 		<tiles:insertAttribute name="body" />
	</div>  
	<div style="width:20%;float:left;">
		<tiles:insertAttribute name="adv" />
	</div>   

</body>
</html>