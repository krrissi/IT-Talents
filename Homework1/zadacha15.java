import java.util.Scanner;


public class zadacha15 {

	public static void main(String[] args) {
//		Да се състави програма, която въвежда естествено число от интервала
//		[0..24].
//		Програмата да изведе съответстващо съобщение съобразно въведения
//		час.
//		Периодите са:
//		[18..4] - Добър вечер;
//		[4..9] - Добро утро;
//		[9..18] - Добър ден

		Scanner sc = new Scanner (System.in);
		
		int chas = sc.nextInt();
		
		 	switch (chas) {
		 case 18: 
		 case 19:
		 case 20: 
		 case 21:
		 case 22: 
		 case 23:
		 case 24: 
		 case 1:
		 case 2: 
		 case 3:
		 case 4: 
			 System.out.println("Dobar vecher");
			 break;
		 case 5: 
		 case 6:
		 case 7: 
		 case 8:
		 case 9: 
			 System.out.println("Dobar vecher");
			 break;
		  
		 case 10:
		 case 11: 
		 case 12:
		 case 13: 
		 case 14:
		 case 15: 
		 case 16:
		 case 17:  
			 System.out.println("Dobar den");
			 break;
		 default: 
			 System.out.println();
			 
		 }
		
	}

}
