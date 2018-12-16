package com.him;

public class IStringFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringFormatter stf = (a,b)-> a + "-" +b;
		
		System.out.println(stf.format("Lambda", "Expression"));
	}

}
