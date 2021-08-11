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
	    <script defer src="js/guessingGame.js" type="text/javascript"></script>
	</head>
	<body>
		<div id="help" class="help-container">
			<div class="owl-with-speech">
				<div class="speech-bubble">
					Hello! To play this game, you must think about an animal from the <strong>Endangered Species list</strong>. I will try to guess which animal it is.
          			When you're ready to play, click the start button.
				</div>
				<div class="owl-wrap">
					<img class="owl-img" src="images/owl-412x640.png" alt="Owl">
				</div>
			</div>
		</div>
		
		<div id="blur-content" class="blur">
			<nav class="navbar">
				<div class="brand-title"><a href="${pageContext.request.contextPath}/index.jsp">Guessing Game</a></div>
				<a href="#" class="toggle-button">
					<span class="bar"></span>
					<span class="bar"></span>
					<span class="bar"></span>
				</a>
				<div class="navbar-links">
					<ul>
						<li class="animals-link">
							<a class="toggle-animals" href="#">Animals</a>
							<ul class="animals-list">
								<li class="animal-item"><a href="#amur-leopard">Amur Leopard</a></li>
								<li class="animal-item"><a href="#black-rhino">Black Rhino</a></li>
								<li class="animal-item"><a href="#hawksbill-turtle">Hawksbill Turtle</a></li>
								<li class="animal-item"><a href="#orangutan">Orangutan</a></li>
								<li class="animal-item"><a href="#sumatran-elephant">Sumatran Elephant</a></li>
								<li class="animal-item"><a href="#sunda-tiger">Sunda Tiger</a></li>
								<li class="animal-item"><a href="#vaquita">Vaquita</a></li>
								<li class="animal-item"><a href="#bluefin-tuna">Bluefin-tuna</a></li>
								<li class="animal-item"><a href="#galapagos-penguin">Galapagos Penguin</a></li>
								<li class="animal-item"><a href="#sea-lion">Sea Lion</a></li>
							</ul>
						</li>
						<li id="help-btn" class="help-link"><a href="#">Help</a></li>
					</ul>
				</div>
			</nav>
			<header class="main-header">
				<h1>Endangered Species</h1>
				<p>
					You can read more about these and other endangered animals at 
					<a class="wwf-link" href="https://www.worldwildlife.org/species/directory?direction=desc&sort=extinction_status" target="_blank">WWF's Species Directory</a>.
				</p>
				<div class="button-wrap">
					<form class="button" action="javaGuessingGameServlet" method="get">
						<input type="hidden" name="command" value="start">
						<input class="link" type="submit" value="START GAME">
					</form>
				</div>
				<div class="arrow floating">
					<span>View Animals</span>
					<i class="fas fa-chevron-down"></i>
				</div>
			</header>
			<section class="animals">
				<article id="amur-leopard" class="animal-article">
					<div class="content">
						<div>
							<a href="#top"><i class="fas fa-leaf home-page-leaf"></i></a>
						</div>
						<picture>
							<source media="(max-width: 506px)" srcset="images/animals/amur-leopard/amur-leopard-400x150.jpg">
							<source media="(max-width: 900px)" srcset="images/animals/amur-leopard/amur-leopard-800x300.jpg">
							<source media="(max-width: 1600px)" srcset="images/animals/amur-leopard/amur-leopard-1120x420.jpg">
							<img src="images/animals/amur-leopard/amur-leopard.jpg" alt="Amur Leopard">
						</picture>
						<div class="description-container">
							<h3 class="animal-name">Amur Leopard</h3>
							<div class="animal-description">
								<div class="habitat">
									<strong>Habitat</strong> - Mixed Forests
								</div>
								<p>In the Russian Far East, a rare subspecies of leopard has
									adapted to life in the temperate forests that make up the
									northern-most part of the species’ range. They live for 10-15
									years in the wild and weight between 70 to 105 pounds. The Amur
									leopard is also known as the Far East leopard, the Manchurian
									leopard or the Korean leopard.</p>
							</div>
						</div>
					</div>
				</article>
				<article id="black-rhino" class="animal-article shaded">
					<div class="content">
						<div>
							<a href="#top"><i class="fas fa-leaf home-page-leaf"></i></a>
						</div>
						<picture>
							<source media="(max-width: 506px)" srcset="images/animals/black-rhino/black-rhino-400x150.jpg">
							<source media="(max-width: 900px)" srcset="images/animals/black-rhino/black-rhino-800x300.jpg">
							<source media="(max-width: 1600px)" srcset="images/animals/black-rhino/black-rhino-1120x420.jpg">
							<img src="images/animals/black-rhino/black-rhino.jpg" alt="Black Rhino">
						</picture>
						<div class="description-container">
							<h3 class="animal-name">Black Rhino</h3>
							<div class="animal-description">
								<div class="habitat">
									<strong>Habitat</strong> - Semi-Desert Savannah
								</div>
								<p>Black rhinos are the smaller of the two African rhino
									species. The most notable difference between white and black
									rhinos are their hooked upper lip. Their pointed lip helps them
									feed on leaves from bushes and trees. They have two horns, and
									occasionally a third, small posterior horn.</p>
							</div>
						</div>
					</div>
				</article>
				<article id="hawksbill-turtle" class="animal-article">
					<div class="content">
						<div>
							<a href="#top"><i class="fas fa-leaf home-page-leaf"></i></a>
						</div>
						<picture>
							<source media="(max-width: 506px)" srcset="images/animals/hawksbill-turtle/hawksbill-turtle-400x150.jpg">
							<source media="(max-width: 900px)" srcset="images/animals/hawksbill-turtle/hawksbill-turtle-800x300.jpg">
							<source media="(max-width: 1600px)" srcset="images/animals/hawksbill-turtle/hawksbill-turtle-1120x420.jpg">
							<img src="images/animals/hawksbill-turtle/hawksbill-turtle.jpg" alt="Hawksbill Turtle">
						</picture>
						<div class="description-container">
							<h3 class="animal-name">Hawksbill Turtle</h3>
							<div class="animal-description">
								<div class="habitat">
									<strong>Habitat</strong> - Oceans
								</div>
								<p>Hawksbills are named for their narrow, pointed beak. They
									also have a distinctive pattern of overlapping scales on their
									shells that form a serrated-look on the edges. These shells make
									them highly-valuable and commonly sold as "tortoiseshell" in
									markets. They feed mainly on sponges by using their beaks to
									extract them from crevices on the reef, but also eat sea anemones
									and jellyfish.</p>
							</div>
						</div>
					</div>
				</article>
				<article id="orangutan" class="animal-article shaded">
					<div class="content">
						<div>
							<a href="#top"><i class="fas fa-leaf home-page-leaf"></i></a>
						</div>
						<picture>
							<source media="(max-width: 506px)" srcset="images/animals/orangutan/orangutan-400x150.jpg">
							<source media="(max-width: 900px)" srcset="images/animals/orangutan/orangutan-800x300.jpg">
							<source media="(max-width: 1600px)" srcset="images/animals/orangutan/orangutan-1120x420.jpg">
							<img src="images/animals/orangutan/orangutan.jpg" alt="Orangutan">
						</picture>
						<div class="description-container">
							<h3 class="animal-name">Orangutan</h3>
							<div class="animal-description">
								<div class="habitat">
									<strong>Habitat</strong> - Forests
								</div>
								<p>In the lowland forests in which they reside, orangutans live
									solitary existences. They feast on wild fruits like lychees,
									mangosteens, and figs, and slurp water from holes in trees. They
									make nests in trees of vegetation to sleep at night and rest
									during the day.</p>
							</div>
						</div>
					</div>
				</article>
				<article id="sunda-tiger" class="animal-article">
					<div class="content">
						<div>
							<a href="#top"><i class="fas fa-leaf home-page-leaf"></i></a>
						</div>
						<picture>
							<source media="(max-width: 506px)" srcset="images/animals/sunda-tiger/sunda-tiger-400x150.jpg">
							<source media="(max-width: 900px)" srcset="images/animals/sunda-tiger/sunda-tiger-800x300.jpg">
							<source media="(max-width: 1600px)" srcset="images/animals/sunda-tiger/sunda-tiger-1120x420.jpg">
							<img src="images/animals/sunda-tiger/sunda-tiger.jpg" alt="Sunda Tiger">
						</picture>
						<div class="description-container">
							<h3 class="animal-name">Sunda Tiger</h3>
							<div class="animal-description">
								<div class="habitat">
									<strong>Habitat</strong> - Tropical Forests
								</div>
								<p>Sunda tigers are distinguished by heavy black stripes on
									their orange coats. The last of the Sunda island tigers—estimated
									to be fewer than 400 today—are holding on for survival in the
									remaining patches of forest on the island of Sumatra. Accelerating
									deforestation and rampant poaching mean this noble creature could
									end up extinct like its Javan and Balinese counterparts.</p>
							</div>
						</div>
					</div>
				</article>
				<article id="vaquita" class="animal-article shaded">
					<div class="content">
						<div>
							<a href="#top"><i class="fas fa-leaf home-page-leaf"></i></a>
						</div>
						<picture>
							<source media="(max-width: 506px)" srcset="images/animals/vaquita/vaquita-400x150.jpg">
							<source media="(max-width: 900px)" srcset="images/animals/vaquita/vaquita-800x300.jpg">
							<source media="(max-width: 1600px)" srcset="images/animals/vaquita/vaquita-1120x420.jpg">
							<img src="images/animals/vaquita/vaquita.jpg" alt="Vaquita">
						</picture>
						<div class="description-container">
							<h3 class="animal-name">Vaquita</h3>
							<div class="animal-description">
								<div class="habitat">
									<strong>Habitat</strong> - Gulf of California
								</div>
								<p>The vaquita has a large dark ring around its eyes and dark
									patches on its lips that form a thin line from the mouth to the
									pectoral fins. Its top—the dorsal surface—is dark gray, its sides
									are pale gray, and its underside—the ventral surface—is white with
									long, light gray markings.</p>
							</div>
						</div>
					</div>
				</article>
				<article id="bluefin-tuna" class="animal-article">
					<div class="content">
						<div>
							<a href="#top"><i class="fas fa-leaf home-page-leaf"></i></a>
						</div>
						<picture>
							<source media="(max-width: 506px)" srcset="images/animals/bluefin-tuna/bluefin-tuna-400x150.jpg">
							<source media="(max-width: 900px)" srcset="images/animals/bluefin-tuna/bluefin-tuna-800x300.jpg">
							<source media="(max-width: 1600px)" srcset="images/animals/bluefin-tuna/bluefin-tuna-1120x420.jpg">
							<img src="images/animals/bluefin-tuna/bluefin-tuna.jpg" alt="Bluefin Tuna">
						</picture>
						<div class="description-container">
							<h3 class="animal-name">Bluefin Tuna</h3>
							<div class="animal-description">
								<div class="habitat">
									<strong>Habitat</strong> - Oceans
								</div>
								<p>Bluefin are the largest tunas and can live up to 40 years.
									They migrate across all oceans and can dive deeper than 3,000
									feet. Bluefin tuna are made for speed: built like torpedoes, have
									retractable fins and their eyes are set flush to their body.</p>
							</div>
						</div>
					</div>
				</article>
				<article id="galapagos-penguin" class="animal-article shaded">
					<div class="content">
						<div>
							<a href="#top"><i class="fas fa-leaf home-page-leaf"></i></a>
						</div>
						<picture>
							<source media="(max-width: 506px)" srcset="images/animals/galapagos-penguin/galapagos-penguin-400x150.jpg">
							<source media="(max-width: 900px)" srcset="images/animals/galapagos-penguin/galapagos-penguin-800x300.jpg">
							<source media="(max-width: 1600px)" srcset="images/animals/galapagos-penguin/galapagos-penguin-1120x420.jpg">
							<img src="images/animals/galapagos-penguin/galapagos-penguin.jpg" alt="Galapagos Penguin">
						</picture>
						<div class="description-container">
							<h3 class="animal-name">Galapagos Penguin</h3>
							<div class="animal-description">
								<div class="habitat">
									<strong>Habitat</strong> - The Galapagos
								</div>
								<p>This is the only penguin species found north of the equator
									and in the Galápagos.</p>
							</div>
						</div>
					</div>
				</article>
				<article id="sea-lion" class="animal-article last-article">
					<div class="content">
						<div>
							<a href="#top"><i class="fas fa-leaf home-page-leaf"></i></a>
						</div>
						<picture>
							<source media="(max-width: 506px)" srcset="images/animals/sea-lion/sea-lion-400x150.jpg">
							<source media="(max-width: 900px)" srcset="images/animals/sea-lion/sea-lion-800x300.jpg">
							<source media="(max-width: 1600px)" srcset="images/animals/sea-lion/sea-lion-1120x420.jpg">
							<img src="images/animals/sea-lion/sea-lion.jpg" alt="Sea Lion">
						</picture>
						<div class="description-container">
							<h3 class="animal-name">Sea Lion</h3>
							<div class="animal-description">
								<div class="habitat">
									<strong>Habitat</strong> - Oceans
								</div>
								<p>Sea lions haul out in large colonies on rocks and sandy
									shores on the Islands. They move into the water to feed and cool
									off as needed.</p>
							</div>
						</div>
					</div>
				</article>
				<div class="button-container shaded">
					<form class="button" action="javaGuessingGameServlet" method="get">
						<input type="hidden" name="command" value="start">
						<input class="link" type="submit" value="START GAME">
					</form>
				</div>
			</section>
			<footer>
				<div class="disclaimer">
					The information about these animals was taken from 
					<a class="wwf-link" href="https://www.worldwildlife.org/species/directory?direction=desc&sort=extinction_status" target="_blank">WWF's species directory</a>.
				</div>
				<div class="contacts">
					<a class="contact-link" href="https://www.linkedin.com/home"><i class="fab fa-linkedin"></i></a>
					<a class="contact-link" href="https://github.com/Jrz5220/animal-guessing-game"><i class="fab fa-github"></i></a>
					<a class="contact-link" href="${pageContext.request.contextPath}/contact.jsp"><i class="fas fa-envelope"></i></a>
				</div>
			</footer>
		</div>	<!-- blur-content end -->
	</body>
</html>
