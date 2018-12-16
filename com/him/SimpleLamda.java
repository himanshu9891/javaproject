package com.him;

import java.util.function.Function;

public class SimpleLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, String> a = (x)->"Hello Mr. "+x;
			
			System.out.println(a.apply("Abhishek"));
	}

}
