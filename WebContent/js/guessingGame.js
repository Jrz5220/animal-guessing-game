const toggleButton = document.getElementsByClassName("toggle-button")[0];
const navbarLinks = document.getElementsByClassName("navbar-links")[0];
const animalsToggle = document.getElementsByClassName("toggle-animals")[0];
const animalsList = document.getElementsByClassName("animals-list")[0];
const animalItems = document.getElementsByClassName("animal-item");
const helpSection = document.getElementById("help");
const helpButton = document.getElementById("help-btn");
const blur = document.getElementById("blur-content");

function slideOut() {
  helpSection.classList.remove("slide-in");
  helpSection.classList.add("slide-out");
  blur.classList.remove("blur");
  blur.classList.add("remove-blur");
}

function showHelp() {
  helpSection.classList.remove("slide-out");
  helpSection.classList.add("slide-in");
  blur.classList.remove("remove-blur");
  blur.classList.add("blur");
}

for(var i = 0; i < animalItems.length; i++) {
  animalItems[i].addEventListener("click", () => {
    animalsList.classList.toggle("display");
  });
}

toggleButton.addEventListener("click", () => {
	navbarLinks.classList.toggle("active");
});

animalsToggle.addEventListener("click", () => {
	animalsList.classList.toggle("display");
});

helpSection.addEventListener("click", slideOut);
helpButton.addEventListener("click", showHelp);