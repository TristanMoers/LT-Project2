package grammar;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static grammar.Grammar.*;

/**
 * Random generation of a valid derivation
 * DO NOT MODIFY
 */
public class Generator {
	
	private int seed;
	private final Random rand;
	
	public Generator(int seed) {
		this.seed = seed;
		rand = new Random(seed);
	}
	
	
	
	public  String[] generate(int maxDepth) {
		List<String> res = new LinkedList<String>();
		generateE(res, maxDepth, 0);
		return res.toArray((new String[res.size()]));
	}
	
	public void generateE(List<String> output, int maxDepth, int currentDepth) {
		// E -> T | T u T | T n T | T - T
		if(currentDepth > maxDepth) { //prevent from exploding memory
			generateT(output, maxDepth, currentDepth + 1);
		}
		else {
			
			int i = rand.nextInt(4);
			switch(i) {
				case 0 : {
					generateT(output, maxDepth, currentDepth + 1);
					output.add(UNION);
					generateT(output, maxDepth, currentDepth + 1);
					break;
				} 
				case 1 : {
					generateT(output, maxDepth, currentDepth + 1);
					output.add(INTERSECTION);
					generateT(output, maxDepth, currentDepth + 1);
					break;
				}
				case 2 : {
					generateT(output, maxDepth, currentDepth + 1);
					output.add(SUBSTRACTION);
					generateT(output, maxDepth, currentDepth + 1);
					break;
				}
				case 3 : {
					generateT(output, maxDepth, currentDepth + 1);
					break;
				}
			}
		}
		
	}
	
	public void generateT(List<String> output, int maxDepth, int currentDepth) {
		// T -> S | T c | ( E ) 
		if(currentDepth > maxDepth) { //prevent from exploding memory
			generateS(output, maxDepth, currentDepth + 1);
		}
		else {
			int i = rand.nextInt(3);
			switch(i) {
				case 0: {
					generateS(output, maxDepth, currentDepth + 1);
					break;
				} 
				case 1: {
					generateT(output, maxDepth, currentDepth + 1);
					output.add(COMPLEMENT);
					break;
				}
				case 2: {
					output.add(LEFTPAR);
					generateE(output, maxDepth, currentDepth + 1);
					output.add(RIGHTPAR);
					break;
				}
			}
		}
	}
	
		
	public void generateS(List<String> output, int maxDepth, int currentDepth) {
		// S -> id
		output.add(SETID);
	}
	
}
