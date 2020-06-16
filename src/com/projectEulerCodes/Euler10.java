package com.projectEulerCodes;

/**
 * This codes solves Project Euler Problem10. Problem Name: Summation of primes
 * @author Preeti Parna Sahoo
 *
 */
public class Euler10 {

	public static void main(String[] args) {
		long sum = 0;

		for (long i = 2; i <= 2000000; i++)
			if (isPrime(i)) {
				sum = sum + i;
			}
		System.out.println(sum);
	}

	private static boolean isPrime(long x) {
		long n = (long) Math.sqrt(x);
		for (long i = 2; i <= n; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}
