package com.him;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "abcdefghijk";
		System.out.println(value.substring(3));
		System.out.println(value.substring(3,6));
		String str = "Testing";
		System.out.println(str.toString());
		System.out.println(str.hashCode());
		//System.out.println(str.clone());
		if(str instanceof Object){
		System.out.println("I extend Object");//Will be printed
		}
		Animal animal2 = new Dog();
		System.out.println(
				animal2.shout());
		//animal2.run();
		for (int i = 0,j = 0; i < 10; i++,j--) {
			System.out.print(j);
			}
	}

}
