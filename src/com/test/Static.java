package com.test;
//static:静态  直接为特定域分配单一存储空间。
public class Static {
	public static void main(String[] args) {
		statictext int1 = new statictext();
		statictext int2 = new statictext();
		int1.i++;
		System.out.println(int2.i);
	}
}
class statictext{
	 static int i=20;
}
