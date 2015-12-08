package lesson3;

import java.util.Scanner;

public class zadacha11 {

	public static void main(String[] args) {
//		 Въведете число N чрез конзолата и изкарайте като
//		 резултат следния триъгълник с височина N:
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n ; i++){
            for(int j = n - i; j >= 1  ; j--){
               System.out.print(" ");
           }
           for(int k = 1; k <= i*2-1  ; k++){
               System.out.print("*");
           }
           System.out.println();
		}

	}

}
