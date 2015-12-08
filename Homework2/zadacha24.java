package lesson3;

import java.util.Scanner;

public class zadacha24 {

	public static void main(String[] args) {
//		Едно число X е палиндром, aко се чете еднакво отпред назад и
//		отзад напред.
//		Да се състави програма, която проверява дали въведено число е
//		палиндром.
//		Входни данни: N - естествено число от интервала [10 .. 30000].
		
		Scanner sc = new Scanner (System.in);
		
	    int n;
        int a; 
        int b;
        boolean result = true;

        do {
            System.out.print("Enter int variable between 10 and 30000 : ");
            n = sc.nextInt();
        } while (n < 10 || n > 30000);

        int k = n;
        int sum = 0;

        while (k > 0) {
            k = k / 10;
            sum++;
        }

      
        int c = 1;
        for(int i = 1 ; i < sum; i++){
            c *= 10;
        }


        int newN = n;
         for(int i = 1 ; i <= sum; i++){
            a = n/c%10;
            c /= 10;
       

            b = newN % 10;
            newN = newN/10;
         

            if(a != b){
                result = false;
                break;
            }
        }


        if(result){
            System.out.println("Palindron");
        }else{
           System.out.println("Ne e palindron");
        }
	}

}
