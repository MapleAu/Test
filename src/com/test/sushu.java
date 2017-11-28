package com.test;

public class sushu {
	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<200;i++) {
			for(int a=1;a<=i;a++) {
				if((i%a)==0) {
					num++;
				}
			}
			if(num==2) {
				System.out.println(i);
				
			}
			num=0;
		}
	}
}
