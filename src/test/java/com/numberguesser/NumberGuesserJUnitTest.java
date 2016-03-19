package com.numberguesser;

import org.junit.Test;

public class NumberGuesserJUnitTest {
	/**
	 * JUnit Test class for Number Guesser
	 * @param args
	 */
	@Test
	public void test() {
		try {
			NumberGuesser numberGuesser = new NumberGuesser();
			numberGuesser.findGuessedNumber(NumberGuesserConstatnts.MIN, NumberGuesserConstatnts.MAX);
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
