<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<spring:url  var="css" value="/resources/css" />
<spring:url  var="js" value="/resources/js" />
<spring:url  var="images" value="/resources/images" />

<html>
<head><link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js">
</script>
 
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
 </script>
<meta name="viewport" content="width=device-width, initial-scale=1"></head>
<body>
<%@ include file = "header.jsp" %>
<div class="container">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
       <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

       <div class="carousel-inner">
      <div class="item active">
        <img src="${images}/lib1.jpg"  style="width:100%;">
      </div>

      <div class="item">
        <img src="${images}/lib2.jpg"  style="width:100%;">
      </div>
    
      <div class="item">
        <img src="${images}/lib3.jpg"  style="width:100%;">
      </div>
    </div>

   
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>




<%@ include file = "footer.jsp" %>
</body>
</html>