package lesson3;

import java.util.Scanner;

public class zadacha18 {

	public static void main(String[] args) {
//		�� �� ������� ��������, ���� ����� �� ������� ��� ����� ��
//		��������� [1..9].
//		���������� �� ������� ��������� �� ���������.
//		������������ �������� �� ����������� � ���������� �� 2-��
//		�����.
		
		Scanner sc = new Scanner(System.in);
		
		 int a = sc.nextInt();
		 
		int b;
		
	      
	      for ( b = 1 ; b <= 10 ; b++ ) {
	         System.out.println(a+"*"+b+" = "+(a*b));
	      }



	}

}
