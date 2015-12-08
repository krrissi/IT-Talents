package lesson3;

import java.util.Scanner;

public class zadacha21 {

	public static void main(String[] args) {
//		Дадено е наредено тесте карти.
//		Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
//		Поп, Асо.
//		Наредбата по цвят на картите е: спатия, каро, купа, пика.
//		Да се създаде програма, чрез която се въвежда N - число от
//		интервала [1..51] и се извеждат въведения номер карта и
//		останалите по-големи карти от тестето. 

		Scanner sc =  new Scanner (System.in);
		
		int cards = sc.nextInt();
		
		while (cards<=52) {
		switch (cards) {
			default:
				System.out.println("Няма такава карта");
				break;
			case 1:
				System.out.println("Двойка спатия");
				break;
			case 2:
				System.out.println("Двойка каро");
				break;
			case 3:
				System.out.println("Двойка купа");
				break;
			case 4:
				System.out.println("Двойка пика");
				break;
			case 5:
				System.out.println("Тройка спатия");
				break;
			case 6:
				System.out.println("Тройка каро");
				break;
			case 7:
				System.out.println("Тройка купа");
				break;
			case 8:
				System.out.println("Тройка пика");
				break;
			case 9:
				System.out.println("Четворка спатия");
				break;
			case 10:
				System.out.println("Четворка каро");
				break;
			case 11:
				System.out.println("Четворка купа");
				break;
			case 12:
				System.out.println("Четворка пика");
				break;
			case 13:
				System.out.println("Петица спатия");
				break;
			case 14:
				System.out.println("Петица каро");
				break;
			case 15:
				System.out.println("Петица купа");
				break;
			case 16:
				System.out.println("Петица пика");
				break;
			case 17:
				System.out.println("Шестица спатия");
				break;
			case 18:
				System.out.println("Шестица каро");
				break;
			case 19:
				System.out.println("Шестица купа");
				break;
			case 20:
				System.out.println("Шестица пика");
				break;	
			case 21:
				System.out.println("Седмица спатия");
				break;
			case 22:
				System.out.println("Седмица каро");
				break;
			case 23:
				System.out.println("Седмица купа");
				break;
			case 24:
				System.out.println("Седмица пика");
				break;
			case 25:
				System.out.println("Осмица спатия");
				break;
			case 26:
				System.out.println("Осмица каро");
				break;
			case 27:
				System.out.println("Осмица купа");
				break;
			case 28:
				System.out.println("Осмица пика");
				break;
			case 29:
				System.out.println("Девятка спатия");
				break;
			case 30:
				System.out.println("Девятка каро");
				break;
			case 31:
				System.out.println("Девятка купа");
				break;
			case 32:
				System.out.println("Девятка пика");
				break;
			case 33:
				System.out.println("Десятка спатия");
				break;
			case 34:
				System.out.println("Десятка каро");
				break;
			case 35:
				System.out.println("Десятка купа");
				break;
			case 36:
				System.out.println("Десятка пика");
				break;
			case 37:
				System.out.println("Вале спатия");
				break;
			case 38:
				System.out.println("Вале каро");
				break;
			case 39:
				System.out.println("Вале купа");
				break;
			case 40:
				System.out.println("Вале пика");
				break;
			case 41:
				System.out.println("Дама спатия");
				break;
			case 42:
				System.out.println("Дама каро");
				break;
			case 43:
				System.out.println("Дама купа");
				break;
			case 44:
				System.out.println("Дама пика");
				break;
			case 45:
				System.out.println("Поп спатия");
				break;
			case 46:
				System.out.println("Поп каро");
				break;
			case 47:
				System.out.println("Поп купа");
				break;
			case 48:
				System.out.println("Поп пика");
				break;
			case 49:
				System.out.println("Асо спатия");
				break;
			case 50:
				System.out.println("Асо каро");
				break;
			case 51:
				System.out.println("Асо купа");
				break;
			case 52:
				System.out.println("Асо пика");
				break;
		
		}
			
		
			System.out.println(cards);
			cards++;
		}
	}

}
