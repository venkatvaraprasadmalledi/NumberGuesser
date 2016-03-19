package com.numberguesser;
/**
 * Exception class for NumberGuesser
 * @author Venkat Varaprasad
 *
 */
public class NumberGuesserException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return super.getMessage();
	}
	/**
	 * To hold customized exception messages
	 * @param message
	 */
	public NumberGuesserException(String message) {
		super(message);
	}
}
