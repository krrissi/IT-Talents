package lesson3;

import java.util.Scanner;

public class zadacha7 {

	public static void main(String[] args) {
//		Започвайки от 3, да се изведат на екрана първите n
//		числа които се делят на 3. Числата да са разделени със запетая.

		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		
		
		for (int num = 3; num <n; num++) {
			
			if (num %3 ==0) {
				System.out.print(num+",");
			}
			
		}
	
	}

}
