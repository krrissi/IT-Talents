package lesson3;

import java.util.Scanner;

public class zadacha7 {

	public static void main(String[] args) {
//		���������� �� 3, �� �� ������� �� ������ ������� n
//		����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.

		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		
		
		for (int num = 3; num <n; num++) {
			
			if (num %3 ==0) {
				System.out.print(num+",");
			}
			
		}
	
	}

}
