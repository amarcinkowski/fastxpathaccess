package io.github.amarcinkowski.fastxpathaccess;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.nio.file.Paths;

import org.junit.Test;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'amarcinkowski' at '22.10.16 16:31' with Gradle 2.10
 *
 * @author amarcinkowski, @date 22.10.16 16:31
 */
public class LibraryTest {

	private final static String TEST_XML = "src/test/resources/bookstore.xml";
	private final static String XPATH_AUTOR = "/bookstore/book[1]/author";
	private final static String XPATH_TITLE = "/bookstore/book[1]/title";
	private final static String XPATH_LANG = "/bookstore/book[1]/title/@lang";
	private final static String XPATH_BOOKS_LANG = "//book/@category";
	private final static String XPATH_BOOKS_TITLES = "//book/title";

	@Test
	public void testSingleNode() throws IOException {
		String[] result = Library.someLibraryMethod(Paths.get(TEST_XML), XPATH_AUTOR);
		String[] expected = new String[] { "Giada De Laurentiis" };
		assertArrayEquals(expected, result);
		result = Library.someLibraryMethod(Paths.get(TEST_XML), XPATH_TITLE);
		expected = new String[] { "Everyday Italian" };
		assertArrayEquals(expected, result);
	}
	@Test
	public void testManyNodes() throws IOException {
		String[] result = Library.someLibraryMethod(Paths.get(TEST_XML), XPATH_BOOKS_TITLES);
		String[] expected = new String[] { "Everyday Italian", "Harry Potter", "XQuery Kick Start", "Learning XML" };
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testSingleAttribute() throws IOException {
		String[] result = Library.someLibraryMethod(Paths.get(TEST_XML), XPATH_LANG);
		String[] expected = new String[] { "en" };
		assertArrayEquals(expected, result);
	}

	@Test
	public void testManyAttributes() throws IOException {
		String[] result = Library.someLibraryMethod(Paths.get(TEST_XML), XPATH_BOOKS_LANG);
		String[] expected = new String[] { "cooking", "children", "web", "web" };
		assertArrayEquals(expected, result);
	}
}
