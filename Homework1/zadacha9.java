import java.util.Scanner;
//�� �� ������� ��������, ����� ���� �� ��������� 2 ����������
//���������� ����� a,b.
//���������� �� ������ � ��������� ���� ���������� ����� ��
//�������������� �� ����� ����� � �����, ����� � ������ �����.
//������ �����: a,b - ���������� ����� �� ��������� [10..99].

public class zadacha9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = (a*b);
		
		System.out.println(c = a*b);
				
		if (c%2==0) {
			System.out.println("even number");
		}
		if (c%2!=0) {
			System.out.println("odd number");
		}

	}

}
