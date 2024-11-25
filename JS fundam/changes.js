function toBunny(){
	document.getElementById('bear').src='bunny.jpg';
	document.getElementById('bear').id='bunny';
}
function changeH1(){
	document.querySelectorAll('h1')[0].innerHTML="Cute bunny";
}

function toBear(){
	document.getElementById('bunny').src='bear.jpg';
	document.getElementById('bunny').id='bear';
}
function changeH2(){
	document.querySelectorAll('h1')[0].innerHTML="Cute bear";
}