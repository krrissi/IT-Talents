package lesson3;

import java.util.Scanner;

public class zadacha16 {

	public static void main(String[] args) {
//		�� �� ������� ��������, ���� ����� �� �������� 2 ����������
//		����� N, M �� ��������� [10..5555].
//		����������, ���� ����� for, �� ������� ������ ����� ��
//		���������, ����� �� ������ �� 50 � �������� ���.

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n > m){
            int temp = n;
            n = m;
            m = temp;
      
		for (n=1; n<=m; n++) {
			if (n%50==0) {
				System.out.println(n);
	}
			
		}			
		}
	}

}
