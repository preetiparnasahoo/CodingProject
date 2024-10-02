package com.concepts.codes;

public class GenericExampleMethod {

	public static void main(String[] args) {
		shout(1);
		shout("Hey");
	}
	
	public static <T> void shout(T thingToShout) {
		System.out.println(thingToShout);
	}
}
