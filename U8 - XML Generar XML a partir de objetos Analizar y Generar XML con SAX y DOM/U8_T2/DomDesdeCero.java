package com.company;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import java.io.File;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Element;
import javax.xml.transform.stream.StreamResult;


public class DomDesdeCero {
    public static void main(String[] args) {
        //Array list con objetos avion
        ArrayList<Avion> aviones = new ArrayList<>();
        Avion a1 = new Avion(1, "Boeing 747", 1969, "Boeing");
        Avion a2 = new Avion(2, "A380", 2007, "Airbus");
        Avion a3 = new Avion(3, "MAX 737", 2016, "Boeing");
        Avion a4 = new Avion(4, "37 Viggen", 1971, "Saab");
        Avion a5 = new Avion(5, "Eurofighter Typhoon", 2003, "Eurofighter Gmbh");
        Avion a6 = new Avion(6, "Lockheed Martin F-22 Raptor", 2005, "Lockheed Martin Aeronautics");
        Avion a7 = new Avion(7, "P-51 Mustang", 1942, "North American Aviation");
        Avion a8 = new Avion(8, "McDonnell Douglas F/A-18 Hornet", 1978, "Northrop");
        Avion a9 = new Avion(9, "Learjet 60", 1993, "Bombardier Aerospace");
        Avion a10 = new Avion(10, "Cessna Citation Sovereign+", 2004, "Cessna");
        //Añado los aviones al array
        aviones.add(a1);
        aviones.add(a2);
        aviones.add(a3);
        aviones.add(a4);
        aviones.add(a5);
        aviones.add(a6);
        aviones.add(a7);
        aviones.add(a8);
        aviones.add(a9);
        aviones.add(a10);

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            Element root = doc.createElement("hangar");
            //for each para añadir cada etiqueta avion que proceden del arraylist
            for (Avion a : aviones) {
                Element avion = doc.createElement("avion");
                avion.setAttribute("id", Integer.toString(a.getId()));
                Element modelo = doc.createElement("modelo");
                modelo.setTextContent(a.getModelo());
                Element year = doc.createElement("year");
                year.setTextContent(Integer.toString(a.getYear()));
                Element manufacturer = doc.createElement("manufacturer");
                manufacturer.setTextContent(a.getManufacturer());

                avion.appendChild(modelo);
                avion.appendChild(year);
                avion.appendChild(manufacturer);

                root.appendChild(avion);
            }
            //Transformador
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/sxlt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);
            //Archivo creado desde cero
            File generarHangar = new File("cero.xml");
            StreamResult destino = new StreamResult(generarHangar);

            transformer.transform(origenDOM, destino);
        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }

    }
}
