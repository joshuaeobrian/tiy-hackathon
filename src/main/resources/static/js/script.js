// let container = document.getElementById('content');
// const color = ['green','blue','red','grey'];
//
//
// document.getElementById('rand').addEventListener('click',function() {
//   x();
// });
//
// const x = () =>{
//    for(let i = 0; i < 1;i++){
//     console.log(color[(Math.random() * color.length)]);
//     setTimeout(1000);
//     container.style.background = "";
//     container.style.background =                    color[Math.floor(Math.random()*color.length)];
//   }
// };

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
    const button = e.target;
    const letter = button.textContent;
    const div = button.parentNode;
    div.className = "used";
    console.log(div);
});
