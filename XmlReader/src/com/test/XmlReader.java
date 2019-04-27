package com.test;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlReader {

	public static void main(String[] args) {
		try {
			String filepath = "D:\\Sts_Workspace\\XmlReader\\Resource\\comapny.xml";
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);
           
			NodeList list = doc.getElementsByTagName("staff");
			
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				System.out.println(list.item(i).getNodeName());
			}
			System.out.println("Total of elements : " + list.getLength());

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (SAXException sae) {
			sae.printStackTrace();
		}
	  }

	}


