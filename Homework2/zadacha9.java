package lesson3;

import java.util.Scanner;

public class zadacha9 {

	public static void main(String[] args) {
//		Да се прочетат 2 числа от клавиатурата А и В.
//		Да се изведат всички числа от А до В на степен 2(разделени с
//		запетая).Ако някое число е кратно на 3, да се изведе съобщение че
//		числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
//		пропуснатите) стане по-голяма от 200, да се прекрати извеждането.

		Scanner sc = new Scanner (System.in);
		
		 System.out.print("Enter int variable : ");
	        int a = sc.nextInt();
	        System.out.print("Enter int variable : ");
	        int b = sc.nextInt();

	        //swap
	        if (a > b) {
	            int c = a;
	            a = b;
	            b = c;
	        }

	        for (int i = a; i <= b; i++) {
	            if (i !=  b) {
	                if (i % 3 == 0) {
	                    System.out.print("skip");
	                    System.out.print(i);
	                    System.out.print(" , ");
	                } else {
	                    System.out.print(i * i);
	                    System.out.print(" , ");
	                }
	            }else{
	                if (i % 3 == 0) {
	                    System.out.print("skip");
	                    System.out.print(i);
	                } else {
	                    System.out.print(i * i);
	                }
			}
			
		}
	
				
	}

}
