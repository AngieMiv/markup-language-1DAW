import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class AnalizadorXML {
	public static void main(String[] args) {
		try {
			// Cargar el archivo XML
			File fXmlFile = new File("../libros.xml"); // Asegúrate de que está en la misma carpeta
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.parse(fXmlFile);
			// Normalizar el documento XML
			document.getDocumentElement().normalize();
			// Obtener la lista de libros
			NodeList listaLibros = document.getElementsByTagName("libro");
			System.out.println("Libros digitales:");
			// Recorrer la lista de libros
			for (int i = 0; i < listaLibros.getLength(); i++) {
				Node libroActual = listaLibros.item(i);
				if (libroActual.getNodeType() == Node.ELEMENT_NODE) {
					Element elementLibroActual = (Element) libroActual;

					// Verificar si el libro es digital
					boolean esDigital = Boolean.parseBoolean(elementLibroActual.getAttribute("digital"));

					if (esDigital) {
						String titulo = elementLibroActual.getElementsByTagName("titulo").item(0).getTextContent();
						System.out.println("- " + titulo);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}