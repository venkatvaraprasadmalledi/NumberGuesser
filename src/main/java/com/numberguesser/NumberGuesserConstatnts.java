package com.numberguesser;
/**
 * Constants for NumberGuesser
 * @author Venkat Varaprasad
 *
 */
public interface NumberGuesserConstatnts {
	//user key-in these two values if it is lower or higher
	public static final String HIGHER = "higher";
	public static final String LOWER = "lower";
	
	//user key in yes if guess number is matched
	public static final String YES = "yes";
	//user key in 'end' value if user wants to end/quit program 
	public static final String END = "end"; 
	
	//numbers range starting
	public int MIN = 0;
	//numbers range ending
	public int MAX = 50;
}
