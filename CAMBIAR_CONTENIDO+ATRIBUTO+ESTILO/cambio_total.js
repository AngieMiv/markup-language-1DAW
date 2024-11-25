function cambio() {

    document.getElementById('encabezado').innerHTML="Esta es mi imágen nueva:";
/*
 *getElementById = ponemos el Id del elemento que queremos cambiar.
 * .innerHTML = para textos (?)
*/
    document.getElementById('miImagen').src="uneuro.png";

    document.querySelectorAll("img")[0].style.padding = "20px";
/*
 *querySelectorAll = todos los elementos que sean, en este caso= "img"
 * y además, a la imagen que esta en la posición [0]
 * .src = le cambio el source
 * .style.padding = le cambio el style(css), el padding, lo cambia
 */
    document.querySelectorAll("img")[0].style.border = "20px solid red ";


}