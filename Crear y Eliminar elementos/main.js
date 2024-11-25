function createParagraph(){
	/*
	* definimos una constante para crear un elemento en el documento
	* con document.createElement('etiqueta a crear');
	* llamo a esa constante, le digo que dentro del html me inserte un párrafo en este caso
	* con constName.innerHTML = 'nuevo párrafo';
	*/
	const newParagraph = document.createElement('p');
	newParagraph.innerHTML = 'Párrafo nuevo creado';
	/*
	* con getElementById, selecciono el elemento que será el "padre" del newParagraph.
	* con appendChild, lo inserto en el elemento padre
	*/
	document.getElementById('container').appendChild(newParagraph);
}
function removeParagraph(){
	//primero el Id.removeChild -bc antes era appendChild
	//y como argumentos, el Id.firstElementChild
	container.removeChild(container.firstElementChild);
}