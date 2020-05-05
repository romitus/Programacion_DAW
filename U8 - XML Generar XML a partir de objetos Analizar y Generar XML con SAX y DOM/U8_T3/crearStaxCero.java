package com.company;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class crearStaxCero {
    public static void main(String[] args) {
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
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("stax.xml"));

            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);

            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoDeLinea);

            StartElement hangarStartElement = eventFactory.createStartElement("","","hangar");
            xmlWriter.add(hangarStartElement);
            xmlWriter.add(saltoDeLineaTab);

            int longitud = 0;

            for (Avion p : aviones) {

                //Creo todas las etiquetas de apertura  que va a tener cada uno de los pedidos
                StartElement avionStart = eventFactory.createStartElement("","","avion");
                StartElement modeloStart = eventFactory.createStartElement("","","modelo");
                StartElement yearStart = eventFactory.createStartElement("","","year");

                Attribute id = eventFactory.createAttribute("id",Integer.toString(p.getId()));

                EndElement avionEnd = eventFactory.createEndElement("","","avion");
                EndElement modeloEnd = eventFactory.createEndElement("","","modelo");
                EndElement yearEnd = eventFactory.createEndElement("","","year");

                Characters modelo = eventFactory.createCharacters(p.getModelo());
                Characters year  = eventFactory.createCharacters(Integer.toString(p.getYear()));

                xmlWriter.add(avionStart);


                xmlWriter.add(id);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);


                xmlWriter.add(avionStart);
                xmlWriter.add(modelo);
                xmlWriter.add(modeloEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(yearStart);
                xmlWriter.add(year);
                xmlWriter.add(yearEnd);
                xmlWriter.add(saltoDeLineaTab);


                xmlWriter.add(avionEnd);


                if (longitud == aviones.size() - 1) {
                    xmlWriter.add(saltoDeLinea);
                } else {
                    xmlWriter.add(saltoDeLineaTab);
                }
                longitud++;
            }

            EndElement avionEndElement = eventFactory.createEndElement("","","avion");
            xmlWriter.add(avionEndElement);
            xmlWriter.add(saltoDeLinea);

            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);

        }catch (XMLStreamException | FileNotFoundException e){
            System.out.println(e.getStackTrace());
        }
    }
}
