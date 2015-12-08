package lesson3;

import java.util.Scanner;

public class zadacha16 {

	public static void main(String[] args) {
//		Да се състави програма, чрез която се въвеждат 2 естествени
//		числа N, M от интервала [10..5555].
//		Програмата, чрез цикъл for, да извежда всички числа от
//		интервала, които са кратни на 50 в низходящ ред.

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n > m){
            int temp = n;
            n = m;
            m = temp;
      
		for (n=1; n<=m; n++) {
			if (n%50==0) {
				System.out.println(n);
	}
			
		}			
		}
	}

}
