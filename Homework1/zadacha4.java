import java.util.Scanner;
//Въведете 2 различни числа от конзолата и ги разпечатайте в
//нарастващ ред.

public class zadacha4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a>b) {
				System.out.println(b);
				System.out.println(a);
			}
		if (b>a) {
				System.out.println(a);
				System.out.println(b);
					}
		
	}

}
