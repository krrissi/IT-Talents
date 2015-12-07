import java.util.Scanner;


public class zadacha16 {

	public static void main(String[] args) {
//		Въведено е трицифрено естествено число от вида abc.
//		Трябва да се провери дали:
//		ако a = b = c - Изход: цифрите са равни;
//		ако a>b>c - Изход: цифрите са във възходящ ред;
//		ако a<b<c цифрите са в низходящ ред;
//		и изход: цифрите са ненаредени, за неописаните случаи.
//		Да се състави програма, която извежда резултата от проверката за
//		наредба на цифрите в числото.
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int a = (num%10);
		
		int temp1 = (num/10);
		
		int b = (temp1%10);
		
		int temp2 = (temp1/10);
		
		int c = (temp2%10);
		
		int temp3 = (temp2/10);
		 
		if ((a>b)&&(b>c)) {
			System.out.println("Vazhodiast red");
		} else 
			if ((a==b)&&(b==c)) {
				System.out.println("Ravni");
			} else
		if ((a<b)&&(b<c)) {
			System.out.println("Nizhodiast red");
		} else {
			System.out.println("Nenaredeni");
		}
			
	}

}
