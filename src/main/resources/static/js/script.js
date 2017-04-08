
$('.random').click(function(){
var divs = $('div[id^="content-"]').hide(),
    i = 0;

(function cycle() {

    divs.eq(i).show(0)
              .delay(200)
              .hide(0, cycle);

    i = ++i % divs.length;

})();
  });

$(".keyboard-box").click(function(e) {
    e.preventDefault();
    const button = e.target;
    const letter = button.textContent;
    const div = button.parentNode;
	if(div.className.includes('used')){
        alert('You have already pushed this button!')
	}else{
		div.className = "used";
		$.post('http://requestb.in/12fc42b1',
            {
                guess: letter,

            }
        );
    }






});

