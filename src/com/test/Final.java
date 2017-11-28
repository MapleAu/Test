package com.test;

public class Final {
	public static void main(String[] args) {
		tes a=new tes();
	}
}
class tes{
	protected void Finalize() {
		System.out.println("hello");
	}
}