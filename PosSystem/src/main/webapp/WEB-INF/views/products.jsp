<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h5>Products</h5>
				<div></div>

				<nav class="navbar navbar-inverse">
					<div class="container-fluid">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle"
								data-toggle="collapse" data-target="#myNavbar">
								<span class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="">Products</a>
						</div>
						<div class="collapse navbar-collapse" id="myNavbar">
							<ul class="nav navbar-nav">
								<li class="active"><a href="#">Home</a></li>
								<li><a href="<spring:url value='/about' />" >About</a></li>
								<li><a href="<spring:url value='/about' />">Category</a></li>
								<li><a href="<spring:url value='/about' />">Contact</a></li>
							</ul>
							<ul class="nav navbar-nav navbar-right">
								<li><a href="#"><span
										class="glyphicon glyphicon-log-in"></span> Concise</a></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</div>
	</section>

	<section class="container" id="products">
		<div class="row">
			<c:forEach items="${products}" var="product">

				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<img
							src="<c:url value="/resource/images/${product.productId}.png"></c:url>"
							alt="image" style="width: 100%">
						<div class="caption">
							<h3>${product.name}</h3>
							<p>${product.description}</p>
							<p>${product.unitPrice}USD</p>
							<p>Available ${product.unitsInStock} units in stock</p>
							<p>
								<a
									href=" <spring:url value="/products/product?id=${product.productId}" />
									
									class="
									btnbtn-primary"> <span
									class="glyphicon-info-sign glyphicon">Details</span> Details
								</a>
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
