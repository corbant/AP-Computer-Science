package ch5Labs;

import java.util.Arrays;

public class Compare3 {
	
	public static Comparable largest(Comparable c1, Comparable c2, Comparable c3) {
		Comparable[] comps = {c1, c2, c3};
		Arrays.sort(comps);
		return comps[comps.length-1];
	}

}
