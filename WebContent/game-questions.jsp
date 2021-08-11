<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1.0">
		<title>Game Questions</title>
		<link rel="preconnect" href="https://fonts.googleapis.com">
	    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	    <link href="https://fonts.googleapis.com/css2?family=Indie+Flower&family=Montserrat&family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
	    <link href="https://fonts.googleapis.com/css2?family=Fredoka+One&display=swap" rel="stylesheet">
	    <link rel="stylesheet" href="css/start-game.css">
	    <script src="https://kit.fontawesome.com/550ddecd5b.js" crossorigin="anonymous"></script>
	    <script defer src="js/guessingGame.js" type="text/javascript"></script>
	</head>
<body>
<div class="game-container">
	<div class="home-button">
		<a id="home-link" href="${pageContext.request.contextPath}/home.jsp" onclick="return confirm('Do you want to end the game?')"><i class="fas fa-leaf"></i></a>
	</div>
     <div class="question-container">
        <div class="question">
          <div class="q-number">
            ${questionNumber}.
          </div>
          <div class="q-text">
            ${question}
          </div>
        </div>
	</div>
	<div class="options">
        <div class="answer-button">
			<form class="button" action="javaGuessingGameServlet" method="get">
				<input type="hidden" name="command" value="next">
				<input class="link" type="submit" name="answer" value="YES">
			</form>
		</div>
		<div class="answer-button">
			<form class="button" action="javaGuessingGameServlet" method="get">
				<input type="hidden" name="command" value="next">
				<input class="link" type="submit" name="answer" value="NO">
			</form>
		</div>
	</div>
</div>
</body>
</html>