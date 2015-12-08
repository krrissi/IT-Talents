package lesson3;

import java.util.Scanner;

public class zadacha13 {

	public static void main(String[] args) {
//		 Да се състави програма, която извежда всички
//		 естествени трицифрени числа, които имат сбор на цифрите равен
//		 на дадено число.

		
		Scanner sc = new Scanner (System.in);
		int n;
		 do {
	            System.out.print("Enter int variable : ");
	            n = sc.nextInt();
	        } while (n < 2 || n > 27);
	        int a, b, c;

	        for (int i = 0; i <= 999; i++) {
	            a = i / 100;
	            b = i / 10 % 10;
	            c = i % 10;
	            if (a + b + c == n) {
	                System.out.print(i);

	                System.out.print(" ");
		
		}
	
		}
			
	}

}
