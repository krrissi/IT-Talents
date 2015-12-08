
package lesson3;

import java.util.Scanner;

public class zadacha8 {

	public static void main(String[] args) {
//		 ѕо зададено число n, да се изведе на екрана таблица:

		Scanner sc= new Scanner (System.in);
		
			
		
		int n;
		
		 do {
			 System.out.print("Vavedete n");
	         n = sc.nextInt();
	        } while (n < 1 );

	        int printValue = n-1;
	        for(int i = 1; i <= n; i++){
	            for(int j = 1; j <= n; j++){
	                System.out.print(printValue );
	            }
	            printValue += 2;

	            System.out.println();
	}
	}
}
