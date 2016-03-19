package com.numberguesser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGuesser {
	
	private BufferedReader  bufferedReader = null;
	
	/**
	 * To find the guessed number using binray search
	 * @param lower is a starting number
	 * @param higher is a ending number range
	 * @throws IOException
	 */
	public void findGuessedNumber(int start, int end)throws NumberGuesserException{
		
		try{
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
					
			while(true){
				int mid = (start + end)/2;	
				
				System.out.println("Is guessed number is " + mid +" ? " + "type 'yes' if ture otherwise type [lower or higher] to continue");
				
				//Read userResponse from console
				String userResponse = bufferedReader.readLine();
				
				if(userResponse.equalsIgnoreCase(NumberGuesserConstatnts.LOWER)){
					end = mid; 
				}
				else if(userResponse.equalsIgnoreCase(NumberGuesserConstatnts.HIGHER)){
					start = mid;
				}
				else if(userResponse.equalsIgnoreCase(NumberGuesserConstatnts.YES)){
					System.out.println("Found the guessed number, it is " + mid);
					break;
				}
				else if(userResponse.equalsIgnoreCase(NumberGuesserConstatnts.END)){
					System.out.println("Ended by user, quitting now !!!");
					break;
				}
				else{
					System.out.println("Invalid input, acceptable inputs are only 'lower', 'higher' and 'yes'");
					break;
				}
			}
		}catch(Exception e){
			throw new NumberGuesserException("Exception occurred while finding the guessed number");
		}
	}
}
