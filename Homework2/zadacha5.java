package lesson3;

import java.util.Scanner;

public class zadacha5 {

	public static void main(String[] args) {
//		Да се въведат от потребителя 2 числа. И да се
//		изведат на екрана всички числа от по-малкото до по-голямото.

		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int num = a; num <=b; num++) {
			
			System.out.println(num);
			
		}
		for (int num = b; num <=a; num++) {
			
			System.out.println(num);
			
		}
	}

}
