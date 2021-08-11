<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1.0">
		<title>Guessing Game</title>
		<link rel="preconnect" href="https://fonts.googleapis.com">
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
		<link href="https://fonts.googleapis.com/css2?family=Indie+Flower&family=Montserrat&family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
		<link rel="stylesheet" href="css/start-game.css">
		<script src="https://kit.fontawesome.com/550ddecd5b.js" crossorigin="anonymous"></script>
		<script defer src="js/guessingGame.js" type="text/javascript"></script>
	</head>
<body>
	<header class="in-game-header">
		<div class="home-button">
        	<a class="home-link" href="${pageContext.request.contextPath}/home.jsp" onclick="return confirm('Do you want to end the game?')"><i class="fas fa-leaf"></i></a>
		</div>
		<h1>Which animal were you thinking of?</h1>
	</header>
	<section class="animals">
		<ul class="wrong-guess-list">
			<li class="">
				<form action="javaGuessingGameServlet" method="get">
					<input type="hidden" name="command" value="answer">
					<input type="submit" name="user-animal" value="Amur Leopard">
				</form>
			</li>
			<li class="">
				<form action="javaGuessingGameServlet" method="get">
					<input type="hidden" name="command" value="answer">
					<input type="submit" name="user-animal" value="Black Rhino">
				</form>
			</li>
			<li class="">
				<form action="javaGuessingGameServlet" method="get">
					<input type="hidden" name="command" value="answer">
					<input type="submit" name="user-animal" value="Hawksbill Turtle">
				</form>
			</li>
			<li class="">
				<form action="javaGuessingGameServlet" method="get">
					<input type="hidden" name="command" value="answer">
					<input type="submit" name="user-animal" value="Orangutan">
				</form>
			</li>
			<li class="">
				<form action="javaGuessingGameServlet" method="get">
					<input type="hidden" name="command" value="answer">
					<input type="submit" name="user-animal" value="Sumatran Elephant">
				</form>
			</li>
			<li class="">
				<form action="javaGuessingGameServlet" method="get">
					<input type="hidden" name="command" value="answer">
					<input type="submit" name="user-animal" value="Sunda Tiger">
				</form>
			</li>
			<li class="">
				<form action="javaGuessingGameServlet" method="get">
					<input type="hidden" name="command" value="answer">
					<input type="submit" name="user-animal" value="Vaquita">
				</form>
			</li>
			<li class="">
				<form action="javaGuessingGameServlet" method="get">
					<input type="hidden" name="command" value="answer">
					<input type="submit" name="user-animal" value="Bluefin Tuna">
				</form>
			</li>
			<li class="">
				<form action="javaGuessingGameServlet" method="get">
					<input type="hidden" name="command" value="answer">
					<input type="submit" name="user-animal" value="Galapagos Penguin">
				</form>
			</li>
			<li class="last-item">
				<form action="javaGuessingGameServlet" method="get">
					<input type="hidden" name="command" value="answer">
					<input type="submit" name="user-animal" value="Sea Lion">
				</form>
			</li>
		</ul>
	</section>
</body>
</html>