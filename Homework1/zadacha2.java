import java.util.Locale;
import java.util.Scanner;

//Въведете 2 различни целочислени числа от конзолата. Запишете
//тяхната сума, разлика, произведение, остатък от деление и
//целочислено деление в отделни променливи и разпечатайте тези
//резултати в конзолата. Опитайте същото с числа с плаваща запетая.

public class zadacha2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.US);
	

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		System.out.println (a+b);
		System.out.println (a-b);
		System.out.println (a*b);
		System.out.println (a/b);
		System.out.println (a%b);
		
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		System.out.println (c+d);
		System.out.println (c-d);
		System.out.println (c*d);
		System.out.println (c/d);
		System.out.println (c%d);
		

	}

}
