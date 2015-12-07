import java.util.Scanner;
//Да се изведат съобщения към потребителя и да се прочетат 2 числа от
//клавиатурата A и B (може да са с плаваща запетая – double).
//После да се прочете 3-то число C и да се провери дали то е м/у A и B.
//Да се изведе подходящо съобщение за това дали C е между A и B.


public class Zadacha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Въведете а");
		double a = sc.nextDouble();
		System.out.println("Въведете b");
		double b = sc.nextDouble();
		System.out.println("Въведете c");		
		double c = sc.nextDouble();
		
	
		if ((a<c)&&(b>c)){
		System.out.println ("Числото"+c+"e"+"между" +a+ "и"+b);
		}else {
		System.out.println ("Числото не е между двете");
		
		}
		
		
	}

}
