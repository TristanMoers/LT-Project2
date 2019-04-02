
package grammar;

import java.util.Arrays;

public class Parser {
	
	private int i;
	
	/**
	 * Grammar 
	 * E -> T
	 * E -> T u T 
	 * E -> T n T
	 * E -> T - T
	 * T -> S
	 * T -> T c
	 * T -> ( E ) 
	 * S -> id
	 */
	
	// Remve left recursion
	/** 
	* E  ->	T E'
	* E' -> u T
	* E' -> n T
	* E' -> - T 
	* E' -> ε
	* T  -> S T'
	* T  -> ( E ) T' 
	* T' -> c T'
	* T' -> ε
	* S  -> id 
	*/


	public boolean parse(String[] input) {
		i = 0;
		return parseE(input) && i == input.length;
	}


	private boolean parseE(String[] input) {
		if(i >= input.length) 
			return false;
		return parseT(input) && parseEPrime(input);
	}


	private boolean parseT(String[] input) {
		boolean temp = false;
		if (i >= input.length) 
			return false;
		if(input[i].equals(Grammar.LEFTPAR)) {
			i++;
			if(parseE(input)) {
				if (i >= input.length) 
					return false;
				if (input[i].equals(Grammar.RIGHTPAR)) {
					i++;
					temp = true;
				}
			}
		} 
		else
			temp = parseS(input);
		return temp && parseTPrime(input);
	}


	private boolean parseEPrime(String[] input) {
		if(i > input.length) 
			return false;
		else if(i == input.length)
			return true;
		if(input[i].equals(Grammar.UNION) || input[i].equals(Grammar.INTERSECTION) || input[i].equals(Grammar.SUBSTRACTION)) {
			i++;
			return parseT(input);
		}
		return true;
	}


	private boolean parseTPrime(String[] input) {
		if (i > input.length) 
			return false;
		else if(i == input.length)
			return true;
		if(input[i].equals(Grammar.COMPLEMENT)) {
			i++;
			return parseTPrime(input);
		}
		return true;
	}


	private boolean parseS(String[] input) {
		if (i >= input.length) 
			return false;
		if (input[i].equals(Grammar.SETID)) {
			i++;
			return true;
		}
		return false;
	}
} 
