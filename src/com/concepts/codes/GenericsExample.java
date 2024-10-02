package com.concepts.codes;

public class GenericsExample {
	
	public static void main(String[] args) {
		
		Printer<Integer> i = new Printer<>(23);
		i.print();
		
		Printer<Double> d = new Printer<>(23.3);
		d.print();
		
		Printer<String> str = new Printer<>("Hello World");
		str.print();

	}

}
