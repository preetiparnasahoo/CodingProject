package practice;

import java.util.HashMap;
import java.util.Map;

public class LastDigitFactorial {
	
	public static Map<Long,Long> fact = new HashMap<>();
	
	public static void main(String args[]) {
		
		fact.put(0L,1L);
		fact.put(1L,1L);
		Long key = Long.parseLong(args[0]);
		Long factorial =  findFactorial(key);
		System.out.println(factorial);
		Long ans = factorial % 10L;
		while(ans == 0L) {
			factorial =  factorial / 10L;
			ans = factorial % 10L;
		}
		System.out.println("Last digit:"+ans);

		
	}

	private static long findFactorial(Long key) {
		if(fact.containsKey(key))
			return fact.get(key);
		else {
			fact.put(key,key * findFactorial(key-1L));
			return fact.get(key);
		}
	}
}
