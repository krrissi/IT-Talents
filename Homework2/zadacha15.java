package lesson3;

import java.util.Scanner;

public class zadacha15 {

	public static void main(String[] args) {
//		�� �� ������� ��������, ����� �� ������� ������ ��
//		������ ����� �� 1 �� �������� ����� N.

		Scanner sc = new Scanner (System.in);
		
		int a=0;
		int n = sc.nextInt();
		int sum=0;
		do {
			sum+=n;
			n--;
					}
		while (a<=n);
		System.out.println(sum);
			
	}

}
