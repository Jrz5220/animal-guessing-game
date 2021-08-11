<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1.0">
	    <title>Animal Guessing Game</title>
	    <link rel="preconnect" href="https://fonts.googleapis.com">
	    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	    <link href="https://fonts.googleapis.com/css2?family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
	    <link rel="stylesheet" href="css/index.css">
	</head>
	<body>
		<header class="main-header">
			<h1>ANIMAL GUESSING GAME</h1>
		</header>
		<section class="main-section">
			<div class="button floating start-game">
				<a class="link" href="${pageContext.request.contextPath}/home.jsp">Start Game</a>
			</div>
		</section>
	</body>
</html>