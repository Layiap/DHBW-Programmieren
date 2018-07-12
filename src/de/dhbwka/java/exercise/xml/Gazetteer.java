package de.dhbwka.java.exercise.xml;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class Gazetteer {

    public static void main(String[] args) {

        String url = "http://liyap.de/xml.xml";

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = factory.newDocumentBuilder();

            Document doc = parser.parse(url);

            // Gibt Root Element aus
            //System.out.println(doc.getDocumentElement().getNodeName());

            System.out.println(doc.getElementsByTagName("formatted_address").item(0).getTextContent());
            System.out.println(doc.getElementsByTagName("long_name").item(0).getTextContent());
            System.out.println("Location: " + doc.getElementsByTagName("location").item(0).getTextContent());

            Element el = doc.getDocumentElement();
            NodeList bounds = el.getElementsByTagName("bounds");

            System.out.println("Southwest: " + bounds.item(0).getAttributes().getLength());
            //System.out.println("Northeast: " + bounds.item(1).getTextContent());



            //String bounds_s = doc.getElementsByTagName("bounds").item(0).getChildNodes().item(0).getTextContent();
            //System.out.println(bounds_s);

            //String bound_n = doc.getElementsByTagName("northeast").item(0).getTextContent();
            //System.out.println(bound_n);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
