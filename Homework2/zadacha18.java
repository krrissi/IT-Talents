package lesson3;

import java.util.Scanner;

public class zadacha18 {

	public static void main(String[] args) {
//		Да се състави програма, чрез която се въвежда две числа от
//		интервала [1..9].
//		Програмата да извежда таблицата за умножение.
//		Максималната стойност на множителите е определена от 2-те
//		числа.
		
		Scanner sc = new Scanner(System.in);
		
		 int a = sc.nextInt();
		 
		int b;
		
	      
	      for ( b = 1 ; b <= 10 ; b++ ) {
	         System.out.println(a+"*"+b+" = "+(a*b));
	      }



	}

}
