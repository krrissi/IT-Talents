package lesson3;

import java.util.Scanner;

public class zadacha9 {

	public static void main(String[] args) {
//		�� �� �������� 2 ����� �� ������������ � � �.
//		�� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
//		�������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
//		������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
//		������������) ����� ��-������ �� 200, �� �� �������� �����������.

		Scanner sc = new Scanner (System.in);
		
		 System.out.print("Enter int variable : ");
	        int a = sc.nextInt();
	        System.out.print("Enter int variable : ");
	        int b = sc.nextInt();

	        //swap
	        if (a > b) {
	            int c = a;
	            a = b;
	            b = c;
	        }

	        for (int i = a; i <= b; i++) {
	            if (i !=  b) {
	                if (i % 3 == 0) {
	                    System.out.print("skip");
	                    System.out.print(i);
	                    System.out.print(" , ");
	                } else {
	                    System.out.print(i * i);
	                    System.out.print(" , ");
	                }
	            }else{
	                if (i % 3 == 0) {
	                    System.out.print("skip");
	                    System.out.print(i);
	                } else {
	                    System.out.print(i * i);
	                }
			}
			
		}
	
				
	}

}
