package io.github.amarcinkowski.fastxpathaccess;

import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'amarcinkowski' at '22.10.16 16:31' with Gradle 2.10
 *
 * @author amarcinkowski, @date 22.10.16 16:31
 */
public class Xpath {

	private static XPathFactory xpathFactory = XPathFactory.newInstance();
	private static XPath xpath = xpathFactory.newXPath();

	private static String fileToString(Path path) throws UnsupportedEncodingException, IOException {
		return new String(Files.readAllBytes(path), "UTF-8");
	}

	private static InputSource stringToInputSource(String xml) throws UnsupportedEncodingException, IOException {
		return new InputSource(new StringReader(xml));
	}

	private static List<String> nodeList2Strings(NodeList nodes) {
		List<String> attributeValues = new ArrayList<>();
		for (int i = 0; i < nodes.getLength(); i++) {
			attributeValues.add(nodes.item(i).getTextContent());
		}
		return attributeValues;
	}

	public static String[] find(String xml, String xpathString)
			throws XPathExpressionException, UnsupportedEncodingException, IOException {
		InputSource source = stringToInputSource(xml);
		NodeList nodes = (NodeList) xpath.evaluate(xpathString, source, XPathConstants.NODESET);
		return nodeList2Strings(nodes).toArray(new String[] {});
	}

	public static String[] find(Path filepath, String xpathString) throws IOException, XPathExpressionException {
		String xml = fileToString(filepath);
		return find(xml, xpathString);
	}

}
