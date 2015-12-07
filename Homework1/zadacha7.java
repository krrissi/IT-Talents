import java.util.Scanner;

//Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
//пари (число с плаваща запетая), дали съм здрав – булев тип.
//Съставете програма, която взема решения на базата на тези данни по
//следния начин:
// - ако съм болен, няма да излизам
// - ако имам пари, ще си купя лекарства
// - ако нямам – ще стоя вкъщи и ще пия чай
// - ако съм здрав, ще отида на кино с приятели
// - ако имам по-малко от 10 лв, ще отида на кафе.
//Полученото решение покажете като съобщение в конзолата.

public class zadacha7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hour = sc.nextInt();
		double money = sc.nextDouble();
		boolean healthy = true;
		
		if (healthy == false) {
			System.out.println("not out");
		}
		if (money>0) {
			System.out.println("will buy drugs");
		}
		if (money<=0) {
			System.out.println("I'll stay home and drink tea");
		}
		if (healthy == true) {
			System.out.println("I go to the movies with friends");
		}
		if (money<=10) {
			System.out.println("will go to the coffee");
		}
		

	}

}
