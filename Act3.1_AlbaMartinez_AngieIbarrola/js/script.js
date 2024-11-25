function showAnswer() {
	document.getElementById('a1').innerHTML="b. !EL ROJO!<br>Es la longitud de onda visible con menos energía";
	document.getElementById('a2').innerHTML="c. !SABORES!<br>Los físicos a veces no saben cómo nombrar a las cosas y ponen nombres aleatorios";
	document.getElementById('a3').innerHTML="d. !TODOS!<br>Hay 300.000Km entre la Tierra y la Luna. Júpiter, siendo el más grande, ocuparia menos de la mitad y en total sobrarían hasta 4.000Km.";
}

function changeImage(){
	document.querySelectorAll("img")[0].src="imagenes/respuesta1.jpeg";
	document.querySelectorAll("img")[1].src="imagenes/respuesta2.jpeg";
	document.querySelectorAll("img")[2].src="imagenes/respuesta3.jpeg";
}