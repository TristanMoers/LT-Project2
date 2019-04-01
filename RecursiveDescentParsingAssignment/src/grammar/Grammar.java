package grammar;

/**
 * DO NOT MODIFY
 */
public class Grammar {
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

	public final static String UNION = "u";
	public final static String INTERSECTION = "n";
	public final static String SUBSTRACTION = "-";
	public final static String COMPLEMENT = "c";
	public final static String LEFTPAR = "(";
	public final static String RIGHTPAR = ")";
	public final static String SETID = "id";

}
