package lesson3;

import java.util.Scanner;

public class zadacha15 {

	public static void main(String[] args) {
//		Да се състави програма, която да изчисли сумата на
//		всички числа от 1 до въведено число N.

		Scanner sc = new Scanner (System.in);
		
		int a=0;
		int n = sc.nextInt();
		int sum=0;
		do {
			sum+=n;
			n--;
					}
		while (a<=n);
		System.out.println(sum);
			
	}

}
