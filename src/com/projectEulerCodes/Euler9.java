package com.projectEulerCodes;
/**
 * This codes solves Project Euler Problem9.
 * Problem Name: Pythagorean triplet
 * @author Preeti Parna Sahoo
 * Solution description:
 * So after mathematical calculation between a, b, c, the relationship came as:
 * ab = 500000c - 1000c^2
 * so considering a <= 1000/3
 * and b <= 1000/2 and preparing the code problem
 *
 */
public class Euler9 {

	public static void main(String[] args) {
		int x = 1000/3;
		int y = 1000/2;
		int c;
		double zd;
		int zi;
		Long past = System.currentTimeMillis();
		for( int a = 1 ; a <= x; a++ ) {
			for(int b = a + 1 ; b <= y ;b++ ) {
				zd = (5000000 - 1000 * (Math.sqrt((a * a) + (b * b)))) / (a * b);
				zi = (int)(5000000 - 1000 * (Math.sqrt((a * a) + (b * b)))) / (a * b);
				if(zd == (double)zi) {
					c = (int) Math.sqrt((a * a) + (b * b));
					if ( (a + b + c) == 1000) {
						System.out.println(a + " " + b + " " + c + " " + zi);
						System.out.println(a*b*c);
					}
				}
			}
		}
		Long present = System.currentTimeMillis();
		System.out.println("Time Taken:" + (present - past) / 1000);

	}

}
