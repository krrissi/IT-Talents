import java.util.Scanner;
//Да се състави програма, която чете от конзолата 2 естествени
//двуцифрени числа a,b.
//Програмата да изведе в конзолата дали последната цифра от
//произведението на двете числа е четна, както и самата цифра.
//Входни данни: a,b - естествени числа от интервала [10..99].

public class zadacha9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = (a*b);
		
		System.out.println(c = a*b);
				
		if (c%2==0) {
			System.out.println("even number");
		}
		if (c%2!=0) {
			System.out.println("odd number");
		}

	}

}
