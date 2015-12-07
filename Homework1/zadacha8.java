import java.util.Scanner;
//Да се състави програма, която чете от конзолата 4-цифренo
//естествено число от интервала [1000.. 9999]. От това число се
//формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
//и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
//3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
//ново число e по-малко <, равно = или по-голямо от 2-то число.

public class zadacha8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int num = sc.nextInt();
		
				
		int d = (num%10);
		int temp1 = (num/10);
		
		int c = (temp1%10);
		int temp2 = (temp1/10);
		
		int b = (temp2%10);
		int temp3 = (temp2/10);
		 
		int a = (temp3%10);
		
		int obsto = (a*10+d);
		int obsto1 = (b*10+c);
		
		if (obsto<obsto1){
			System.out.println(obsto+"e po-malko"+obsto1);
		}
		
		if (obsto>obsto1){
			System.out.println(obsto+"e po-goljamo ot"+obsto1);
		}
		
		if (obsto==obsto1){
			System.out.println(obsto+"e ravno"+obsto1);
		}
		
	
		

	}

}
