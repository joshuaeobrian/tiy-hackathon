

const x = () =>{

};

const  c = {
	remove: () =>{

	},
	add: () =>{

	},
	edit: () =>{

	},

};

c[buttonText]();




$(document).ready(function () {

	$(".keyboard-box").click(function (e) {
		const button = e.target;
		const letter = button.textContent;
		const div = button.parentNode;

		console.log(letter)

		if(div.className.includes('used')){
			alert("No!!");
		}else{
			button.className = 'used';
		}



		//$.post("/check-guess?="+letter,
		//	{
		//		guess: letter,
		//
		//		success:function (response) {
		//			alert("Yay is went")
		//		},
		//		error: function (response) {
		//			alert("Error: ")
		//		}
		//	}
		//);
	});
});
