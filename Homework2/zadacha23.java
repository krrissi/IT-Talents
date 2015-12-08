package lesson3;

import java.util.Scanner;

public class zadacha23 {

	public static void main(String[] args) {
//		Да се състави програма, която чрез цикъл while извежда
//		таблицата за умножение, но без повторение.
//		Т.е. ако е изведено 4*5 не се извежда 5*4. 

		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		 
		int b = 1;
		
		while (a<=10) {
	    	 a++; 
		while (b<=9) {
	         System.out.println(a+"*"+b+" = "+(a*b));
	         b++; 
	         if (a==b) {
	        	 break;
	         }
	      
	      }
	      }

	}

}
