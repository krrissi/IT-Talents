package lesson3;

import java.util.Scanner;

public class zadacha23 {

	public static void main(String[] args) {
//		�� �� ������� ��������, ����� ���� ����� while �������
//		��������� �� ���������, �� ��� ����������.
//		�.�. ��� � �������� 4*5 �� �� ������� 5*4. 

		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		 
		int b = 1;
		
		while (a<=10) {
	    	 a++; 
		while (b<=9) {
	         System.out.println(a+"*"+b+" = "+(a*b));
	         b++; 
	         if (a==b) {
	        	 break;
	         }
	      
	      }
	      }

	}

}
