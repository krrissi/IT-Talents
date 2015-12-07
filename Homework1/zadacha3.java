import java.util.Scanner;
//Въведете 2 различни числа от конзолата и разменете стойността им.
//Разпечатайте новите стойности

public class zadacha3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a;
		
		System.out.print(a=b);
		System.out.println (b=c);
		

	}

}
