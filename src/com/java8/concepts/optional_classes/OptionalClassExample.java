package com.java8.concepts.optional_classes;

import java.util.Optional;

public class OptionalClassExample {
	/*
	 * https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Suman";
		str = null;

		if (str == null)
			System.out.println("String is null");
		else
			System.out.println(str.length());

		/*
		 * Using Optional Class for implementing the above null Check
		 */

		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional.isPresent());
//		System.out.println(optional.get());
		System.out.println(optional.orElse("No value in the object"));
		Optional<String> name = getName();// name returned is not a String rather its an optional
		System.out.println(name.orElse("null returned"));

	}

	public static Optional<String> getName() {
		String name = "Shekhar";
		return Optional.ofNullable(name);
	}
}
