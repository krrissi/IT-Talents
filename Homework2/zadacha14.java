package lesson3;

import java.util.Scanner;

public class zadacha14 {

	public static void main(String[] args) {
//		�� �� ������� ��������, ����� �� ��������
//		���������� ����� N �� ��������� [10..200] ������� � �������
//		��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.

		Scanner sc = new Scanner (System.in);
		
		int n;
		
		 do{
	            System.out.print("Enter int variable : ");
	            n = sc.nextInt();
	        }while(n < 10 || n > 200 );

	        for(int i = n; i >= 1; i--){
	            if(i % 7 == 0){
	                System.out.println(i);
	            }
		}
	}

}
