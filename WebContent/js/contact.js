const form = document.getElementById("contact-form");

function validateForm(event) {
	const re = /\S+@\S+\.\S+/;			// equivalent Java regex: \\S+\\@\\S+\\.\\S+
	const email = document.getElementById("email").value;
	const subject = document.getElementById("subject").value;
	const message = document.getElementById("message").value;
	
	/* email test */
	if(re.test(email)) {
		document.getElementById("email-invalid").style.display="none";
	} else {
		document.getElementById("email-invalid").style.display="block";
		event.preventDefault();
	}
	
	/* subject test */
	if(subject.length >= 1 && subject.length <= 50) {
		document.getElementById("subject-invalid").style.display="none";
	} else {
		document.getElementById("subject-invalid").style.display="block";
		event.preventDefault();
		console.log("subject length not >= 1 and not <= 50");
	}
	
	/* message test */
	if(message.length >= 1 && message.length <= 800) {
		document.getElementById("message-invalid").style.display="none";
	} else {
		document.getElementById("message-invalid").style.display="block";
		event.preventDefault();
		console.log("message length not >= 1 and not <= 800");
	}
}

/* EventTarget method will be called when the submit button is pressed. The listener param recieves the event. */
form.addEventListener("submit", validateForm);