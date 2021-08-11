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
		<link href="https://fonts.googleapis.com/css2?family=Indie+Flower&family=Montserrat&family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
		<link rel="stylesheet" href="css/start-game.css">
		<script src="https://kit.fontawesome.com/550ddecd5b.js" crossorigin="anonymous"></script>
	</head>
	<body>
		<header class="in-game-header">
			<h1 class="result-msg">${resultMessage}</h1>
		</header>
		<section class="correct-animal">
			<article class="animal-article">
				<div class="content">
					<picture>
						<source media="(max-width: 506px)" srcset="${imagePath}-400x150.jpg">
						<source media="(max-width: 900px)" srcset="${imagePath}-800x300.jpg">
						<source media="(max-width: 1600px)" srcset="${imagePath}-1120x420.jpg">
						<img src="${imagePath}.jpg" alt="${animalName}">
					</picture>
					<div class="description-container">
						<h3 class="animal-name">${animalName}</h3>
						<p class="animal-description">
							<strong class="why-they-matter">Why They Matter</strong> - ${whyTheyMatter}
						</p>
					</div>
				</div>
			</article>
			<div class="button-container shaded">
				<div class="thanks-msg">Thanks for playing!</div>
				<div class="button not-form">
					<a class="link" href="${pageContext.request.contextPath}/home.jsp">PLAY AGAIN</a>
				</div>
			</div>
		</section>
	</body>
</html>