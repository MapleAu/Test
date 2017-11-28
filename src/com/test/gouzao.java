package com.test;

public class gouzao {
	public static void main(String[] args) {
		//new prin();
		//new test("!");
			dog n = new dog();
			int x=1;
			n.bark(x);
			char y='m';
			n.bark(y);
			long z = 2;
			n.bark(z);

	}
}
class prin{
	prin(){
		System.out.println("helloworld");
	}
}
class test{
	test(String x){
		System.out.println("helloworld"+x);
	}
}
class dog{
	void bark(int x){
		System.out.println("barking");
		}
	void bark(char x) {
		System.out.println("howling");
	}
	void bark(long x) {
		System.out.println("etc");
	}
}

