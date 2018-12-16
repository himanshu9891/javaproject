package com.him;

public class C implements A, B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		A.super.m1();
	//	System.out.println(m3);
		}

}
