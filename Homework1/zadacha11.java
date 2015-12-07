import java.util.Scanner;


public class zadacha11 {

	public static void main(String[] args) {
//		//Съставете програма, която по дадено трицифренo число проверява
//		дали числото се дели на всяка своя цифра. Във въведеното число да
//		няма цифра 0.

		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int c = (num%10);
		
		int temp1 = (num/10);
		
		int b = (temp1%10);
		
		int temp2 = (temp1/10);
		
		int a = (temp2%10);
		
		int temp3 = (temp2/10);
		 
		while ((a!=0)&&(b!=0)&&(c!=0)) {		
		if (num%a==0) {
			System.out.println("deli se na parvoto");
			
		}
		
		if (num%b==0) {
			System.out.println("deli se vtoroto");
			
		}
		
		if (num%c==0) {
			System.out.println("deli se na tretoto");
			break;
		}
		
		
		}
		

	}

}
