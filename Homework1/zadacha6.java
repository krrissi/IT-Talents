import java.util.Scanner;

//Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
//им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
//а3 да има старата стойност на а1.

public class zadacha6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		
		int temp = a1;
		int temp2 = a2;
		int temp3 = a3;
				
		System.out.println(temp2);
		System.out.println(temp3);
		System.out.println(temp);
		
	}

}
