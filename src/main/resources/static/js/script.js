

$(document).ready(function () {
	$(".keyboard-box").click(function (e) {
		const button = e.target;
		const letter = button.textContent
		console.log(letter);
		$.post("/check-guess?="+letter,
			{
				guess: letter,

				success:function (response) {
					alert("Yay is went")
				},
				error: function (response) {
					alert("Error: ")
				}
			}
		);
	});
});
