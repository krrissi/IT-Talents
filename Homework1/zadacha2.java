import java.util.Locale;
import java.util.Scanner;

//�������� 2 �������� ����������� ����� �� ���������. ��������
//������� ����, �������, ������������, ������� �� ������� �
//����������� ������� � ������� ���������� � ������������ ����
//��������� � ���������. �������� ������ � ����� � ������� �������.

public class zadacha2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.US);
	

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		System.out.println (a+b);
		System.out.println (a-b);
		System.out.println (a*b);
		System.out.println (a/b);
		System.out.println (a%b);
		
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		System.out.println (c+d);
		System.out.println (c-d);
		System.out.println (c*d);
		System.out.println (c/d);
		System.out.println (c%d);
		

	}

}
