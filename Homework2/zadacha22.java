package lesson3;

import java.util.Scanner;

public class zadacha22 {

	public static void main(String[] args) {
//		Да се състави програма, която извежда първите 10 най-малки
//		числа, които се делят на 2, 3 или на 5 и които са по-големи от
//		въведено естествено число.
//		Числата се извеждат, заедно с техния пореден номер.
//		Входни данни: число от интервала [1..999]

		Scanner sc = new Scanner (System.in);
		
		int n;
		
		 do {
	            System.out.print("Enter int variable between 1 and 999 : ");
	            n = sc.nextInt();
	        } while (n < 1 || n > 999);

	        int result = n + 1;
	        int count = 0;
	        while(count < 10){
	            if((result % 2 ==0) || (result % 3 ==0) || (result % 5 ==0)){
	                count++;
	                System.out.print(count+""+result);
	                
	                if(count < 10){
	                    System.out.print(", ");
	                }
	                
	            }
	            result++;
	        }
	}

}
