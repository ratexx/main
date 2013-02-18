

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


				

       

        <script>

                $(function(){

                        $('#slides').slides({

                                preload: true,

                                preloadImage: '/haaksq/resources/img-by-haaksq/loading.gif',

                                play: 5000,

                                pause: 2500,

                                hoverPause: true,

                                animationStart: function(current){

                                        $('.caption').animate({

                                                bottom:-35

                                        },100);

                                        if (window.console && console.log) {

                                                // example return of current slide number

                                                console.log('animationStart on slide: ', current);

                                        };

                                },

                                animationComplete: function(current){

                                        $('.caption').animate({

                                                bottom:0

                                        },200);

                                        if (window.console && console.log) {

                                                // example return of current slide number

                                                console.log('animationComplete on slide: ', current);

                                        };

                                },

                                slidesLoaded: function() {

                                        $('.caption').animate({

                                                bottom:0

                                        },200);

                                }

                        });

                });

        </script>

</head>

<body>
	  <div >
		   <article class="colhome11">
              <div class="box1_out">
                <div class="box1">
				 <h2>แกลเลอรี่ <a href="../../../home/${commuId}/${lanuageId}/1" class="button"><span><span>หน้าหลัก</span></span></a> <img src="images/img3.png" class="img" alt="">	</h2>	 	
		
        <div id="container">
                <div id="example">
                     
                        <div id="slides">
                                <div class="slides_container">
										 <c:forEach items="${gallaryBlogList}" var="VCommunityGallaryId">
                                        <div class="slide">
                                                <a href="${VCommunityGallaryId.pathName}${VCommunityGallaryId.fileName}" title="${VCommunityGallaryId.fileDetail}"  rel="single"  class="pirobox" style="margin:0 10px 0 0;" >  <img src=" ${VCommunityGallaryId.pathName}${VCommunityGallaryId.fileName}"  width="570" height="270"  alt="${VCommunityGallaryId.fileDetail}"/> </a> 
                                                <div class="caption">
                                                        <p>&ldquo;${VCommunityGallaryId.fileName} >> ${VCommunityGallaryId.fileDetail}&rdquo;</p>
                                                </div>
                                        </div>
                                        </c:forEach>
                                </div>
                                <a href="#" class="prev"><img src="/haaksq/resources/img-by-haaksq/arrow-prev.png" width="24" height="43" alt="Arrow Prev"></a>
                                <a href="#" class="next"><img src="/haaksq/resources/img-by-haaksq/arrow-next.png" width="24" height="43" alt="Arrow Next"></a>
                        </div>
                        <img src="/haaksq/resources/img-by-haaksq/example-frame.png" width="739" height="341"  id="frame">
                </div>
        </div>


     </div>
				</div> 
			</article>
			</div>		   
        
        
				