package lesson3;

import java.util.Scanner;

public class zadacha25 {

	public static void main(String[] args) {
//		Да се направи програма, която по дадено число N, да изчислява
//		N!, т.е. 1*2*3*4...*N.

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		long num=1;
			
		do {
			num*=n;
			n--;
		}
		while (n>0);
		System.out.println(+num);
	}
	
}
