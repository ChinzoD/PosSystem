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
				<h1>Products</h1>
			</div>
		</div>
	</section>
	<div>
		<img
			src="<c:url value="/resource/images/${product.productId}.png"></c:url>"
			alt="image" style="width: 100%" />
	</div>

	<div>
		<h3>${product.name}</h3>
		<p>${product.description}</p>
		<p>
			<strong>category</strong> : ${product.category}
		</p>
		<p>
			<strong> Currently available </strong> : ${product.unitsInStock}
		</p>
		<h4>${product.price}USD</h4>
			<a href="<spring:url value="/products" />" class="btn btn-default">
				<span class="glyphicon-hand-left glyphicon"></span> back
			</a>

	</div>
</body>
</html>
