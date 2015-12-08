package lesson3;

import java.util.Scanner;

public class zadacha17 {

	public static void main(String[] args) {
//		Да се състави програма, която извежда квадрат, чийто страни са
//		оформени със знака *, а вътрешността е запълнена със въведен
//		знак.
//		Входни данни b - дължина на страната число от интервала
//		[3..20], c - желан знак.
//		Програмата да използва цикъл for. 
		
		
		Scanner sc = new Scanner (System.in);
		
		int b = sc.nextInt();
		
		
		for (b = 3; b < 20; b++) {
			for (int row=0; row<=b; row++) {
				for (int col=0; col<=b; col++){
					System.out.print(""+"*"+" ");

				}
				System.out.println();
				}
			break;
	        }

		}

}
