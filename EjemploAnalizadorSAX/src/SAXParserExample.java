import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserExample {
	public static void main(String[] args) {
		try {
			// Nombre del archivo XML (asegúrate de que existe en el directorio correcto)
			String nombreFichero = "../libros.xml";
			SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			SAXParser saxParser = saxParserFactory.newSAXParser();
			DefaultHandler handler = new XMLSAXManager();
			File file = new File(nombreFichero);
			// Procesar el archivo XML
			saxParser.parse(file, handler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class XMLSAXManager extends DefaultHandler {
	private StringBuilder sb;

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Inicio del documento");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		if (qName.equals("titulo")) {
			sb = new StringBuilder();
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (sb != null) {
			sb.append(new String(ch, start, length)); // ← Corrección aquí
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("titulo")) {
			System.out.println("Título: " + sb.toString());
		}
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("Final del documento");
	}
}