package lesson3;

import java.util.Scanner;

public class zadacha19 {

	public static void main(String[] args) {
//		 Да се състави програма, чрез която по въведено
//		 естествено число от интервала [10..99] се извежда поредица
//		 числа, при спазване на следните изисквания:
//		 1) ако предходното число е четно се извежда 0.5*числото;
//		 2) ако предходното число е нечетно се извежда 3*числото +1.
//		 Извеждането продължава докато не се получи стойност 1.

			Scanner sc = new Scanner (System.in);
			
			int a = sc.nextInt();
			
			for (a=10; a<=99; a++) {
				if (a%2==0) {
					System.out.println(0.5*a);
					
				}
				if (a%2!=0) {
					System.out.println(3*a+1);
				}
				if (a==1) {
					break;
				}
			}
	}

}
