package lesson3;

import java.util.Scanner;

public class zadacha10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		for (int delitel = 2; delitel <= num / 2; delitel++) {
			if (num % delitel == 0) {
				System.out.println("Not prime");
				isPrime = false;
				break;
			}
		}
		
		if (isPrime == true) {
			System.out.println("It's prime");
		}
		

	}

}
