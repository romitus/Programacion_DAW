package com.company;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("hangar.xml"));

            Node root = doc.getDocumentElement();

            //Comentario DOM

            Comment comentario = doc.createComment("COMENTARIO AÑADIDO DESDE DOM");
            NodeList nl1 = doc.getElementsByTagName("avion");
            for (int i = 0; i <= nl1.getLength(); i++) {
                Element avion = (Element) nl1.item(i);
                root.insertBefore(comentario.cloneNode(false),avion);
            }

            //Etiqueta hija adicional
            Element avion = doc.createElement("avion");
            avion.setAttribute("id", "4");
            Element modelo = doc.createElement("modelo");
            modelo.setTextContent("Cessna Citation Sovereign+");
            Element year = doc.createElement("year");
            year.setTextContent("2004");
            Element manufacturador = doc.createElement("manufacturador");
            manufacturador.setTextContent("Cessna");

            avion.appendChild(modelo);
            avion.appendChild(year);
            avion.appendChild(manufacturador);

            root.appendChild(avion);

            //Nodo que modifica la primera entrada
            Element avionMod2 = doc.createElement("avion");
            avionMod2.setAttribute("id", "5");
            Element modeloMod2 = doc.createElement("modelo");
            modeloMod2.setTextContent("Learjet 60");
            Element yearMod2 = doc.createElement("year");
            yearMod2.setTextContent("1993");
            Element manufacturadorMod2 = doc.createElement("manufacturador");
            manufacturadorMod2.setTextContent("Bombardier Aerospace");

            avionMod2.appendChild(modeloMod2);
            avionMod2.appendChild(yearMod2);
            avionMod2.appendChild(manufacturadorMod2);

            Element primerAvion = (Element) doc.getElementsByTagName("avion").item(0);
            root.replaceChild(avionMod2, primerAvion);

            //Transformador
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/sxlt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);
            //Archivo Hangar Modificado
            File hangarModificado = new File("hangarModificado.xml");
            StreamResult destino = new StreamResult(hangarModificado);

            transformer.transform(origenDOM, destino);
        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
