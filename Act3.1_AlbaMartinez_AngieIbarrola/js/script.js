/* Cada elemento identificador con aX es un div vacío.
	Esta función cambia el título y añade las respuestas con la función
	de JS document.getElementbyId('aX') y .innerHTML para agregar el texto */
function showAnswer() {
	document.getElementById('a1').innerHTML="b. !EL ROJO!<br>Es la longitud de onda visible con menos energía";
	document.getElementById('a2').innerHTML="c. !SABORES!<br>Los físicos a veces no saben cómo nombrar a las cosas y ponen nombres aleatorios";
	document.getElementById('a3').innerHTML="d. !TODOS!<br>Hay 300.000Km entre la Tierra y la Luna. Júpiter, siendo el más grande, ocuparia menos de la mitad y en total sobrarían hasta 4.000Km.";
	document.getElementById("think").innerHTML="Estas son las respuestas:"

	/* Aquí usamos el mismo método para que escriba dicho texto, en este caso con el Id catCat
		el cual es un <a href> vacío por lo que nos generará un link */
	document.getElementById("catCat").innerHTML="Clicka para ver un pan";
}

/* Con la función document.querySelectorAll(Tag)[num], donde T son las etiquetas a las que
	queremos referironos, y num la posición que ocupan en la página, cambiamos las imágenes
	que aparecían en las preguntas, por la de las respuestas modificando su fuente .src */
function changeImage(){
	document.querySelectorAll("img")[0].src="imagenes/respuesta1.jpeg";
	document.querySelectorAll("img")[1].src="imagenes/respuesta2.jpeg";
	document.querySelectorAll("img")[2].src="imagenes/respuesta3.jpeg";
}