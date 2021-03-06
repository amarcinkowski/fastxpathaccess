package io.github.amarcinkowski.fastxpathaccess;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.nio.file.Paths;

import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;

/**
 * The Class XpathTest.
 */
/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'amarcinkowski' at '22.10.16 16:31' with Gradle 2.10
 *
 * @author amarcinkowski, @date 22.10.16 16:31
 */
public class XpathTest {

	/** The Constant TEST_XML. */
	private final static String TEST_XML = "src/test/resources/bookstore.xml";
	
	/** The Constant XPATH_AUTOR. */
	private final static String XPATH_AUTOR = "/bookstore/book[1]/author";
	
	/** The Constant XPATH_TITLE. */
	private final static String XPATH_TITLE = "/bookstore/book[1]/title";
	
	/** The Constant XPATH_LANG. */
	private final static String XPATH_LANG = "/bookstore/book[1]/title/@lang";
	
	/** The Constant XPATH_BOOKS_LANG. */
	private final static String XPATH_BOOKS_LANG = "//book/@category";
	
	/** The Constant XPATH_BOOKS_TITLES. */
	private final static String XPATH_BOOKS_TITLES = "//book/title";

	/**
	 * Test single node.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws XPathExpressionException the x path expression exception
	 */
	@Test
	public void testSingleNode() throws IOException, XPathExpressionException {
		String[] result = Xpath.find(Paths.get(TEST_XML), XPATH_AUTOR);
		String[] expected = new String[] { "Giada De Laurentiis" };
		assertArrayEquals(expected, result);
		result = Xpath.find(Paths.get(TEST_XML), XPATH_TITLE);
		expected = new String[] { "Everyday Italian" };
		assertArrayEquals(expected, result);
	}

	/**
	 * Test many nodes.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws XPathExpressionException the x path expression exception
	 */
	@Test
	public void testManyNodes() throws IOException, XPathExpressionException {
		String[] result = Xpath.find(Paths.get(TEST_XML), XPATH_BOOKS_TITLES);
		String[] expected = new String[] { "Everyday Italian", "Harry Potter", "XQuery Kick Start", "Learning XML" };
		assertArrayEquals(expected, result);
	}

	/**
	 * Test single attribute.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws XPathExpressionException the x path expression exception
	 */
	@Test
	public void testSingleAttribute() throws IOException, XPathExpressionException {
		String[] result = Xpath.find(Paths.get(TEST_XML), XPATH_LANG);
		String[] expected = new String[] { "en" };
		assertArrayEquals(expected, result);
	}

	/**
	 * Test many attributes.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws XPathExpressionException the x path expression exception
	 */
	@Test
	public void testManyAttributes() throws IOException, XPathExpressionException {
		String[] result = Xpath.find(Paths.get(TEST_XML), XPATH_BOOKS_LANG);
		String[] expected = new String[] { "cooking", "children", "web", "web" };
		assertArrayEquals(expected, result);
	}
}
