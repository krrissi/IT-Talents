package lesson3;

import java.util.Scanner;

public class zadacha19 {

	public static void main(String[] args) {
//		 �� �� ������� ��������, ���� ����� �� ��������
//		 ���������� ����� �� ��������� [10..99] �� ������� ��������
//		 �����, ��� �������� �� �������� ����������:
//		 1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
//		 2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
//		 ����������� ���������� ������ �� �� ������ �������� 1.

			Scanner sc = new Scanner (System.in);
			
			int a = sc.nextInt();
			
			for (a=10; a<=99; a++) {
				if (a%2==0) {
					System.out.println(0.5*a);
					
				}
				if (a%2!=0) {
					System.out.println(3*a+1);
				}
				if (a==1) {
					break;
				}
			}
	}

}
