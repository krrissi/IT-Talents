package lesson3;

import java.util.Scanner;

public class zadacha6 {

	public static void main(String[] args) {
//		 �� �� ������� ����� �� ������(���������) � �� ��
//		 ������ ����� �� ������ ����� ����� 1 � ���������� �����.


		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		
		int num = 1;
		int sum = 1;
		
		while (num<a) {
			num++; sum+=num;
		}
		System.out.println(sum);
		
		
	}

}
