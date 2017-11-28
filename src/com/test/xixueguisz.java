package com.test;


public class xixueguisz {
	public static void main(String[] args) {
		int[] a=new int[4];
		//a=part.partto(1251);
		//System.out.println(a[0]);
		for(int i=1000;i<10000;i++) {
			if(i%100==0)
				continue;
			a=part.partto(i);
			
			}
		}
}

class part {
	static int[] partto(int x) {
		int[] a=new int[4];
		a[0]=x/1000;
		a[1]=(x-a[0]*1000)/100;
		a[2]=(x-a[0]*1000-a[1]*100)/10;
		a[3]=x-a[0]*1000-a[1]*100-a[2]*10;
		return a;
	}
	static boolean get(int[] x) {
		int m,n;
		
		return true;
	}
}
