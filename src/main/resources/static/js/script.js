$(document).ready(function () {
	//Grabs all divs with class of letters to check against
	let letters = document.getElementsByClassName('letter');
	const spinButton = document.getElementById('rand');
	$('.container').hide();

	const spinWheel = () =>{
		$('.keyboard').hide();
		$('.container').show();
	}

//work out toggle function
	const bottomPanel = {
		spinWheel: () =>{

		},
		keyboard: () =>{
			$('.keyboard').show();
			$('.container').hide();
		}
	};
	//toggles user section
	$(".title-bar").click(function () {
		$(".player-bar").toggle("slow");
	});
	//handles post request and gets data from server
	$(".keyboard-box").click(function(e) {
		e.preventDefault();
		const button = e.target;
		const letter = button.textContent;
		const div = button.parentNode;
		const phraseID = $("#phrase-id").val();
		//Prevents user from hitting button twice
		if(div.className.includes('used')){
			alert('You have already pushed this button!')
		}else {
			let phrase = new Object();
			phrase.phraseID = phraseID;
			phrase.phraseChar = letter;
			div.className = "used";
			//post request to server

			$.post("/check-letter",{
					phraseID: phraseID,
					phraseChar: letter
				},
				//gets data back from server
				function (data) {
					//parses string to json
					let x = jQuery.parseJSON( data );
					//spinWheel();
					//if letter is in phrase run for loop
					if(x.isInPhrase){
						//iterates through array of the class letters to find the right div
						for(let i = 0; i < letters.length;i++){
							if(letters[i].textContent===letter){
								letters[i].style.display="block";
							}
						}

					}// if word is correct then reloads
					if(x.isGameOver){

						window.location.reload(true);
						alert("Game Over!")
					}
					console.log("Response: "+data);

				});
		}
	});

	//spinButton.addEventListener("click", (e) =>{
	//	const button = e.target;
	//	console.log(button.textContent);
	//
	//	let divs = $('div[id^="content-"]').hide(),
	//	    i = 0;
	//	let toStop = false;
	//	const action = {
	//		Spin: () => {
	//			console.log(button.textContent);
	//			//button.textContent = 'Stop';
	//			(function cycle() {
	//				if(toStop === false) {
	//					divs.eq(i).show(0)
	//						.delay(200)
	//						.hide(0, action[button.textContent]);
	//
	//					i = ++i % divs.length;
	//				}else{
	//
	//				}
	//
	//			})();
	//		},
	//		Stop: () =>{
	//			console.log(button.textContent);
	//			//button.textContent = 'Spin';
	//			toStop = true;
	//		}
	//	};
	//	action[button.textContent]();
	//});

});