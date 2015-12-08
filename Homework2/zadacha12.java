package lesson3;

public class zadacha12 {

	public static void main(String[] args) {
//		Да се състави програма, която извежда всички
//		естествени трицифрени числа, които нямат еднакви цифри т.е.
//		100,101, 606 и т.н. не се извеждат. 

	
		 int a, b, c;

	        int broi = 0;
	        for (int i = 101; i <= 999; i++) {
	            a = i / 100;
	            b = i / 10 % 10;
	            c = i % 10;
	            
	            int num = 0;
	            if (a != b && b != c && a != c) {

	                for (int j = 2; j < i; j++) {
	                    if (i % j == 0) {
	                        num = 1;

	                    }
	                }

	                if (num == 0) {
	                    System.out.print(i);

	                        System.out.print(", ");
	                }
	               }
	            }
}
	}
