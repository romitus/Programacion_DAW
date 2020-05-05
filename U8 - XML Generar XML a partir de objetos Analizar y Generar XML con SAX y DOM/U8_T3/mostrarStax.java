package com.company;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mostrarStax {
    public static void main(String[] args) {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("hangar.xml"));

            while (xmlReader.hasNext()) {

                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {

                    StartElement startTag = xmlEvent.asStartElement();

                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName) {
                        case "avion":
                            System.out.print("  " + "<" + startTag.getName().getLocalPart());
                            Attribute id = startTag.getAttributeByName(new QName("id"));
                            System.out.println(" " + id + ">");
                            break;
                        case "hangar":
                            System.out.println("<" + startTag.getName().getLocalPart() + ">");
                            break;
                        default:
                            System.out.print("      " + "<" + startTag.getName().getLocalPart());
                            System.out.print(">");
                            break;
                    }
                }else if (xmlEvent.isEndElement()) {

                        EndElement endtag = xmlEvent.asEndElement();
                        System.out.println("<\\" + endtag.getName().getLocalPart() + ">");

                    } else if (xmlEvent.isStartDocument()) {
                        System.out.println("Comienzo del parseado del documento");

                    } else if (xmlEvent.isEndDocument()) {
                        System.out.println("Fin del parseado del documento");

                    } else if (xmlEvent.isCharacters()) {

                        Characters texto = xmlEvent.asCharacters();


                        if (!texto.getData().contains("\n")) {
                            System.out.print(texto.getData());
                        }
                    }

                }
            }catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }
}
