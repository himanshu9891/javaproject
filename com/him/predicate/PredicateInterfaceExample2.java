package com.him.predicate;
// Java program to illustrate Predicate Chaining 

import java.util.function.IntPredicate;
import java.util.function.Predicate; 
public class PredicateInterfaceExample2 { 
	public static void main(String[] args) 
	{ 
		IntPredicate greaterThanTen = (i) -> i > 10; 

		// Creating predicate 
		IntPredicate lowerThanTwenty = (i) -> i < 20; 
		IntPredicate intPredicate = (IntPredicate) greaterThanTen.and(lowerThanTwenty);
		//boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
		boolean result = intPredicate.test(15);
		System.out.println(result); 

		// Calling Predicate method 
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
		System.out.println(result2); 
	} 
} 
