package com.felix.JavaGuessingGame;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaGuessingGameServlet
 */
@WebServlet("/javaGuessingGameServlet")
public class JavaGuessingGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private boolean containsSession = false;
	private int questionNumber = 0;
	private DecisionTree gameTree;
	private HashMap<String, LinkedList<String>> animalsMap;
	private LinkedList<Character> userAnswers;				// keeps track of the user's answers to game questions
	
	/* Method inherited from GenericServlet (superclass of HTTPServlet).
	 * The server calls this method when this servlet is first initialized.
	 */
    @Override
    public void init() {
    	createGameTree();
    	createAnimalsMap();
    	userAnswers = new LinkedList<>();
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JavaGuessingGameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /* Creates the Binary Decision Tree containing all game questions. */
	private void createGameTree() {
    	gameTree = new DecisionTree("Does the animal spend most of its life in the sea?");		// root node containing game's first question.
    	
    	gameTree.setResponses("Is it a carnivore?", "Does it have fins?");
		gameTree.advanceToNo();
		gameTree.setResponses("Does it live in a forest habitat?", "Is its fur covered in spots?");
		gameTree.advanceToNo();
		gameTree.setResponses("Is it the Black Rhino?", "Is it an omnivore?");
		gameTree.advanceToNo();
		gameTree.setResponses("Not Black Rhino", "Black Rhino");
		
		gameTree.resetCurrentNode();
		
		gameTree.advanceToNo();
		gameTree.advanceToNo();
		gameTree.advanceToYes();		// current node at "Is it an omnivore?"
		gameTree.setResponses("Is it the Sumatran Elephant?", "Is it the Orangutan?");
		gameTree.advanceToNo();
		gameTree.setResponses("Not Sumatran Elephant", "Sumatran Elephant");
		
		gameTree.resetCurrentNode();
		
		gameTree.advanceToNo();
		gameTree.advanceToNo();
		gameTree.advanceToYes();
		gameTree.advanceToYes();		// Is it an Orangutan?
		gameTree.setResponses("Not Orangutan", "Orangutan");
		
		gameTree.resetCurrentNode();
		
		gameTree.advanceToNo();
		gameTree.advanceToYes();		// Does it have spots?
		gameTree.setResponses("Is it the Sunda Tiger?", "Is it the Amur Leopard?");
		gameTree.advanceToNo();
		gameTree.setResponses("Not Sunda Tiger", "Sunda Tiger");
		
		gameTree.resetCurrentNode();
		
		gameTree.advanceToNo();
		gameTree.advanceToYes();
		gameTree.advanceToYes();		// Is it the Amur Leopard?
		gameTree.setResponses("Not Amur Leopard", "Amur Leopard");
		
		gameTree.resetCurrentNode();
		
		gameTree.advanceToYes();
		gameTree.setResponses("Is it a carnivore?", "Is it a mammal?");
		gameTree.advanceToNo();
		gameTree.setResponses("Is it the Hawksbill Turtle?", "Does it have wings?");
		gameTree.advanceToNo();
		gameTree.setResponses("Not Hawksbill Turtle", "Hawksbill Turtle");
		
		gameTree.resetCurrentNode();
		
		gameTree.advanceToYes();
		gameTree.advanceToNo();
		gameTree.advanceToYes();
		gameTree.setResponses("Is it the Sea Lion?", "Is it the Galapagos Penguin?");
		gameTree.advanceToNo();
		gameTree.setResponses("Not Sea Lion", "Sea Lion");
		
		gameTree.resetCurrentNode();
		
		gameTree.advanceToYes();
		gameTree.advanceToNo();
		gameTree.advanceToYes();
		gameTree.advanceToYes();		// Is it the penguin?
		gameTree.setResponses("Not Galapagos Penguin", "Galapagos Penguin");
		
		gameTree.resetCurrentNode();
		
		gameTree.advanceToYes();
		gameTree.advanceToYes();
		gameTree.setResponses("Is it the Bluefin Tuna?", "Is it the Vaquita?");
		gameTree.advanceToNo();
		gameTree.setResponses("Not Bluefin Tuna", "Bluefin Tuna");
		
		gameTree.resetCurrentNode();
		
		gameTree.advanceToYes();
		gameTree.advanceToYes();
		gameTree.advanceToYes();		// Is it the Vaquita?
		gameTree.setResponses("Not Vaquita", "Vaquita");
		
		gameTree.resetCurrentNode();
    }
	
	 private void createAnimalsMap() {
		animalsMap = new HashMap<>();
		/* HashMap ( key: the animal , value: LinkedList containing animals image path and 'Why They Matter' description ) */
		animalsMap.put("leopard", new LinkedList<>(Arrays.asList("images/animals/amur-leopard/amur-leopard", "Conservation of its habitat benefits other species, including Amur tigers and prey species like deer. With the right conservation efforts, we can bring them back and ensure long-term conservation of the region.")));
		animalsMap.put("rhino", new LinkedList<>(Arrays.asList("images/animals/black-rhino/black-rhino", "Rhinos are one of the oldest groups of mammals, virtually living fossils. They play an important role in their habitats and in countries like Namibia, rhinos are an important source of income from ecotourism. The protection of black rhinos creates large blocks of land for conservation purposes. This benefits many other species, including elephants.")));
		animalsMap.put("turtle", new LinkedList<>(Arrays.asList("images/animals/hawksbill-turtle/hawksbill-turtle", "Hawksbills help maintain the health of coral reefs. As they remove prey such as sponges from the reef's surface, they provide better access for reef fish to feed.  They also have cultural significance and tourism value.  For example, for local residents in the Coral Triangle, the flow of visitors who come to admire turtles is a vital source of income.")));
		animalsMap.put("orangutan", new LinkedList<>(Arrays.asList("images/animals/orangutan/orangutan", "Orangutans are \"gardeners\" of the forest, playing a vital role in seed dispersal in their habitats. They live in tropical forests and prefer forest in river valleys and floodplains of their respective islands. Orangutans' extremely low reproductive rate makes their populations highly vulnerable. Females give birth to one infant at a time about every 3-5 years, so these species can take a long time to recover from population declines. With human pressure only increasing, orangutans face an increasing risk of extinction.")));
		animalsMap.put("elephant", new LinkedList<>(Arrays.asList("images/animals/sumatran-elephant/sumatran-elephant", "Sumatran elephants feed on a variety of plants and deposit seeds wherever they go, contributing to a healthy forest ecosystem.")));
		animalsMap.put("tiger", new LinkedList<>(Arrays.asList("images/animals/sunda-tiger/sunda-tiger", "The island of Sumatra is the only place where tigers, rhinos, orangutans, and elephants live together in the wild. The presence of the Sunda tiger is an important indicator of a forest's health and biodiversity. Protecting tigers and their habitat means many other species benefit—including people.")));
		animalsMap.put("vaquita", new LinkedList<>(Arrays.asList("images/animals/vaquita/vaquita", "The vaquita is the most endangered cetacean in the world. With as few as around 10 left, the species will become extinct without a fully enforced gillnet ban throughout their entire habitat. WWF is urgently working to ensure they can live and thrive in their natural habitat.")));
		animalsMap.put("tuna", new LinkedList<>(Arrays.asList("images/animals/bluefin-tuna/bluefin-tuna", "The Atlantic bluefin is a highly sought-after delicacy for sushi and sashimi in Asia—a single fish has sold for over $1.75 million! Driven by such high prices, fishermen use even more refined techniques to catch tuna. And the fish are disappearing as a result. Although tuna do provide food and livelihoods for people, they are more than just seafood. Tuna are a top predator in the marine food chain, maintaining a balance in the ocean environment.")));
		animalsMap.put("penguin", new LinkedList<>(Arrays.asList("images/animals/galapagos-penguin/galapagos-penguin", "This is the only penguin species found north of the equator and in the Galápagos.")));
		animalsMap.put("sea-lion", new LinkedList<>(Arrays.asList("images/animals/sea-lion/sea-lion", "The sea lion is the most common mammal in the Galápagos.")));
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String theCommand = request.getParameter("command");
		switch(theCommand) {
			case "start":
				startGame(request, response);
				break;
			case "next":
				nextQuestion(request, response);
				break;
			case "answer":
				checkAnswer(request, response);
				break;
			default:
				startGame(request, response);
		}
	}
	
	private void startGame(HttpServletRequest request, HttpServletResponse response) throws IOException {
		if(containsSession) {
			request.getSession().invalidate();
			containsSession = false;
		}
		if(!userAnswers.isEmpty())
			userAnswers.clear();
		gameTree.resetCurrentNode();
		questionNumber = 1;
		containsSession = true;
		request.getSession().setAttribute("questionNumber", questionNumber);
		request.getSession().setAttribute("question", gameTree.getCurrentData());
		response.sendRedirect("game-questions.jsp");
	}
	
	private void nextQuestion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			questionNumber++;
			if(request.getParameter("answer").equals("YES")) {
				userAnswers.add('y');
				gameTree.advanceToYes();
				// check if the user answered the final question
				if(gameTree.isAnswer()) {
					// the game guessed correctly; redirect to result.jsp with the correct animal data.
					String animalAnswer = gameTree.getCurrentData();
					loadCorrectAnimalPage(request, response, animalAnswer, "Great! I got it right!");
				} else {
					// load next question
					request.getSession().setAttribute("questionNumber", questionNumber);
					request.getSession().setAttribute("question", gameTree.getCurrentData());
					response.sendRedirect("game-questions.jsp");
				}
			}
			else if(request.getParameter("answer").equals("NO")) {
				userAnswers.add('n');
				gameTree.advanceToNo();
				// check if the user answered the final question
				if(gameTree.isAnswer()) {
					// the game guessed incorrectly
					response.sendRedirect("wrong-guess.jsp");
				} else {
					// load next question.
					request.getSession().setAttribute("questionNumber", questionNumber);
					request.getSession().setAttribute("question", gameTree.getCurrentData());
					response.sendRedirect("game-questions.jsp");
				}
			}
		} catch(NullPointerException e) {
			// current node in the game tree references null; forward to home page
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	private void checkAnswer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String userAnimal = request.getParameter("user-animal");		// the animal the user was thinking of
		String reasonForIncorrectGuess = "Great! I got it right!";
		switch(userAnimal) {
			case "Amur Leopard":
				LinkedList<Character> leopardAnswers = new LinkedList<>(Arrays.asList('n', 'y', 'y', 'y'));
				for(int i = 0; i < leopardAnswers.size(); i++) {
					if(userAnswers.get(i) != leopardAnswers.get(i)) {
						if(i == 0)
							reasonForIncorrectGuess = "Sorry, but the Amur Leopard does NOT spend most of its life in the sea.";
						else if(i == 1)
							reasonForIncorrectGuess = "Sorry, but the Amur Leopard IS a carnivore.";
						else if(i == 2)
							reasonForIncorrectGuess = "Sorry, but the Amur Leopard's fur IS covered in spots.";
						break;
					}
				}
				break;
			case "Black Rhino":
				LinkedList<Character> rhinoAnswers = new LinkedList<>(Arrays.asList('n', 'n', 'n', 'y'));
				for(int i = 0; i < rhinoAnswers.size(); i++) {
					if(userAnswers.get(i) != rhinoAnswers.get(i)) {
						if(i == 0)
							reasonForIncorrectGuess = "Sorry, but the Black Rhino does NOT spend most of its life in the sea.";
						else if(i == 1)
							reasonForIncorrectGuess = "Sorry, but the Black Rhino is not a carnivore.";
						else if(i == 2)
							reasonForIncorrectGuess = "Sorry, but the Black Rhino does NOT live in a forest habitat.";
						break;
					}
				}
				break;
			case "Hawksbill Turtle":
				LinkedList<Character> turtleAnswers = new LinkedList<>(Arrays.asList('y', 'n', 'n', 'y'));
				for(int i = 0; i < turtleAnswers.size(); i++) {
					if(userAnswers.get(i) != turtleAnswers.get(i)) {
						if(i == 0)
							reasonForIncorrectGuess = "Sorry, but the Hawksbill Turtle DOES spend most of its life in the sea.";
						else if(i == 1)
							reasonForIncorrectGuess = "Sorry, but the Hawksbill Turtle does NOT have fins.";
						else if(i == 2)
							reasonForIncorrectGuess = "Sorry, but the Hawksbill Turtle is NOT a carnivore.";
						break;
					}
				}
				break;
			case "Orangutan":
				LinkedList<Character> orangutanAnswers = new LinkedList<>(Arrays.asList('n', 'n', 'y', 'y', 'y'));
				for(int i = 0; i < orangutanAnswers.size(); i++) {
					if(userAnswers.get(i) != orangutanAnswers.get(i)) {
						if(i == 0)
							reasonForIncorrectGuess = "Sorry, but the Orangutan does NOT spend most of its life in the sea.";
						else if(i == 1)
							reasonForIncorrectGuess = "Sorry, but the Orangutan is NOT a carnivore.";
						else if(i == 2)
							reasonForIncorrectGuess = "Sorry, but the Orangutan DOES live in a forest habitat.";
						else if(i == 3)
							reasonForIncorrectGuess = "Sorry, but the Orangutan IS an omnivore.";
						break;
					}
				}
				break;
			case "Sumatran Elephant":
				LinkedList<Character> elephantAnswers = new LinkedList<>(Arrays.asList('n', 'n', 'y', 'n', 'y'));
				for(int i = 0; i < elephantAnswers.size(); i++) {
					if(userAnswers.get(i) != elephantAnswers.get(i)) {
						if(i == 0)
							reasonForIncorrectGuess = "Sorry, but the Sumatran Elephant does NOT spend most of its life in the sea.";
						else if(i == 1)
							reasonForIncorrectGuess = "Sorry, but the Sumatran Elephant is NOT a carnivore.";
						else if(i == 2)
							reasonForIncorrectGuess = "Sorry, but the Sumatran Elephant DOES live in a forest habitat.";
						else if(i == 3)
							reasonForIncorrectGuess = "Sorry, but the Sumatran Elephant is NOT an omnivore.";
						break;
					}
				}
				break;
			case "Sunda Tiger":
				LinkedList<Character> tigerAnswers = new LinkedList<>(Arrays.asList('n', 'y', 'n', 'y'));
				for(int i = 0; i < tigerAnswers.size(); i++) {
					if(userAnswers.get(i) != tigerAnswers.get(i)) {
						if(i == 0)
							reasonForIncorrectGuess = "Sorry, but the Sunda Tiger does NOT spend most of its life in the sea.";
						else if(i == 1)
							reasonForIncorrectGuess = "Sorry, but the Sunda Tiger IS a carnivore.";
						else if(i == 2)
							reasonForIncorrectGuess = "Sorry, but the Sunda Tiger's fur is NOT covered in spots.";
						break;
					}
				}
				break;
			case "Vaquita":
				LinkedList<Character> vaquitaAnswers = new LinkedList<>(Arrays.asList('y', 'y', 'y', 'y'));
				for(int i = 0; i < vaquitaAnswers.size(); i++) {
					if(userAnswers.get(i) != vaquitaAnswers.get(i)) {
						if(i == 0)
							reasonForIncorrectGuess = "Sorry, but the Vaquita DOES spend most of its life in the sea.";
						else if(i == 1)
							reasonForIncorrectGuess = "Sorry, but the Vaquita DOES have fins.";
						else if(i == 2)
							reasonForIncorrectGuess = "Sorry, but the Vaquita IS a mammal.";
						break;
					}
				}
				break;
			case "Bluefin Tuna":
				LinkedList<Character> tunaAnswers = new LinkedList<>(Arrays.asList('y', 'y', 'n', 'y'));
				for(int i = 0; i < tunaAnswers.size(); i++) {
					if(userAnswers.get(i) != tunaAnswers.get(i)) {
						if(i == 0)
							reasonForIncorrectGuess = "Sorry, but the Bluefin Tuna DOES spend most of its life in the sea.";
						else if(i == 1)
							reasonForIncorrectGuess = "Sorry, but the Bluefin Tuna DOES have fins.";
						else if(i == 2)
							reasonForIncorrectGuess = "Sorry, but the Bluefin Tuna is NOT a mammal.";
						break;
					}
				}
				break;
			case "Galapagos Penguin":
				LinkedList<Character> penguinAnswers = new LinkedList<>(Arrays.asList('y', 'n', 'y', 'y', 'y'));
				for(int i = 0; i < penguinAnswers.size(); i++) {
					if(userAnswers.get(i) != penguinAnswers.get(i)) {
						if(i == 0)
							reasonForIncorrectGuess = "Sorry, but the Galapagos Penguin DOES spend most of its life in the sea.";
						else if(i == 1)
							reasonForIncorrectGuess = "Sorry, but the Galapagos Penguin does NOT have fins.";
						else if(i == 2)
							reasonForIncorrectGuess = "Sorry, but the Galapagos Penguin IS a carnivore.";
						else if(i == 3)
							reasonForIncorrectGuess = "Sorry, but the Galapagos Penguin DOES have wings.";
						break;
					}
				}
				break;
			case "Sea Lion":
				LinkedList<Character> sealionAnswers = new LinkedList<>(Arrays.asList('y', 'n', 'y', 'n', 'y'));
				for(int i = 0; i < sealionAnswers.size(); i++) {
					if(userAnswers.get(i) != sealionAnswers.get(i)) {
						if(i == 0)
							reasonForIncorrectGuess = "Sorry, but the Sea Lion DOES spend most of its life in the sea.";
						else if(i == 1)
							reasonForIncorrectGuess = "Sorry, but the Sea Lion does NOT have fins.";
						else if(i == 2)
							reasonForIncorrectGuess = "Sorry, but the Sea Lion IS a carnivore.";
						else if(i == 3)
							reasonForIncorrectGuess = "Sorry, but the Sea Lion does NOT have wings.";
						break;
					}
				}
				break;
			default:
				response.sendRedirect("wrong-guess.jsp");
		}
		loadCorrectAnimalPage(request, response, userAnimal, reasonForIncorrectGuess);
	}
	
	private void loadCorrectAnimalPage(HttpServletRequest request, HttpServletResponse response, String animal, String resultMessage) throws ServletException, IOException {
		switch(animal) {
			case "Amur Leopard":
				request.getSession().setAttribute("imagePath", animalsMap.get("leopard").get(0));
				request.getSession().setAttribute("whyTheyMatter", animalsMap.get("leopard").get(1));
				break;
			case "Black Rhino":
				request.getSession().setAttribute("imagePath", animalsMap.get("rhino").get(0));
				request.getSession().setAttribute("whyTheyMatter", animalsMap.get("rhino").get(1));
				break;
			case "Hawksbill Turtle":
				request.getSession().setAttribute("imagePath", animalsMap.get("turtle").get(0));
				request.getSession().setAttribute("whyTheyMatter", animalsMap.get("turtle").get(1));
				break;
			case "Orangutan":
				request.getSession().setAttribute("imagePath", animalsMap.get("orangutan").get(0));
				request.getSession().setAttribute("whyTheyMatter", animalsMap.get("orangutan").get(1));
				break;
			case "Sumatran Elephant":
				request.getSession().setAttribute("imagePath", animalsMap.get("elephant").get(0));
				request.getSession().setAttribute("whyTheyMatter", animalsMap.get("elephant").get(1));
				break;
			case "Sunda Tiger":
				request.getSession().setAttribute("imagePath", animalsMap.get("tiger").get(0));
				request.getSession().setAttribute("whyTheyMatter", animalsMap.get("tiger").get(1));
				break;
			case "Vaquita":
				request.getSession().setAttribute("imagePath", animalsMap.get("vaquita").get(0));
				request.getSession().setAttribute("whyTheyMatter", animalsMap.get("vaquita").get(1));
				break;
			case "Bluefin Tuna":
				request.getSession().setAttribute("imagePath", animalsMap.get("tuna").get(0));
				request.getSession().setAttribute("whyTheyMatter", animalsMap.get("tuna").get(1));
				break;
			case "Galapagos Penguin":
				request.getSession().setAttribute("imagePath", animalsMap.get("penguin").get(0));
				request.getSession().setAttribute("whyTheyMatter", animalsMap.get("penguin").get(1));
				break;
			case "Sea Lion":
				request.getSession().setAttribute("imagePath", animalsMap.get("sea-lion").get(0));
				request.getSession().setAttribute("whyTheyMatter", animalsMap.get("sea-lion").get(1));
				break;
			default:
				request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		request.getSession().setAttribute("resultMessage", resultMessage);
		request.getSession().setAttribute("animalName", animal);
		response.sendRedirect("result.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
