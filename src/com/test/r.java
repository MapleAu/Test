package com.test;

import java.util.*;

public class r {
	public static void main(String[] args) {
		Random ran = new Random();
		for(int i=0;i<10;i++) {
			int a = ran.nextInt(10);
			System.out.println(a);
		}
	}
}
