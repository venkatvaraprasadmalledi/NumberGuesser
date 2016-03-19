package com.numberguesser;
/**
 * Test class for NumberGuesser
 * @author Venkat Varaprasad
 *
 */
public class NumberGuesserTest {

	public static void main(String[] args) {
		try {
			NumberGuesser numberGuesser = new NumberGuesser();
			numberGuesser.findGuessedNumber(NumberGuesserConstatnts.MIN, NumberGuesserConstatnts.MAX);
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
