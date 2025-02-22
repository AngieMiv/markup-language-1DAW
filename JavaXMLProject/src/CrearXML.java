import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Attr;
import org.w3c.dom.Text;
import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class CrearXML {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			Element elementLibro = document.createElement("libro");
			Element elementTitulo = document.createElement("titulo");
			Text textTitulo = document.createTextNode("LENGUAJES DE MARCAS Y SISTEMAS DE GESTIÓN");
			elementTitulo.appendChild(textTitulo);
			elementLibro.setAttribute("disponibleDigital", "true");
			Attr attributeDisponible = document.createAttribute("disponiblePapel");
			attributeDisponible.setValue("true");
			elementLibro.setAttributeNode(attributeDisponible);
			elementLibro.appendChild(elementTitulo);
			document.appendChild(elementLibro);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(new File("libro.xml"));
			transformer.transform(source, result);
			System.out.println("XML creado con éxito en 'libro.xml'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}