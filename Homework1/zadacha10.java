import java.util.Scanner;
//Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
//3 литра и ги ползвате едновременно.
//Да се състави програма, която по даден обем извежда как ще прелеете
//течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
//кофите. Кофите не могат да се ползват с частично количество вода.
//Входни данни: естествено число от интервала [10..9999].


public class zadacha10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int obem = sc.nextInt();
		
		int kofa1 = 2;
		int kofa2 = 3;
	
		int x=obem/kofa1;
		int y=obem/kofa2;	
		
		if((obem>=10)&&(obem<=9999)) {
			if (x+y==obem){
			
			}
			System.out.println(x+","+y);
	}
	}
}
