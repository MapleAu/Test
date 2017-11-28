package com.test;

public class useofthis {
	/*int i=0;
	useofthis increment() {
		i++;
		return this;
	}
	void print() {
		System.out.println("i="+i);
	}
	public static void main(String[] args) {
		useofthis x= new useofthis();
		x.increment().increment().increment().print();
	}*/
	
	
	/*void one(){
		this.two();
		useofthis i= new useofthis();
		i.two();
	}
	void two(){
		System.out.println("hello");
	}
	public static void main(String[] args) {
		useofthis n = new useofthis();
		n.one();
	}*/
	
	
	public static void main(String[] args) {
		new Apple("hi");
	}
}
class Apple{
	Apple(int x){
		System.out.println("yo");
	}
	Apple(String x){
		this(10);
	}
}
