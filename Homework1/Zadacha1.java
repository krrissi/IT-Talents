import java.util.Scanner;
//�� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
//������������ A � B (���� �� �� � ������� ������� � double).
//����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
//�� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.


public class Zadacha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("�������� �");
		double a = sc.nextDouble();
		System.out.println("�������� b");
		double b = sc.nextDouble();
		System.out.println("�������� c");		
		double c = sc.nextDouble();
		
	
		if ((a<c)&&(b>c)){
		System.out.println ("�������"+c+"e"+"�����" +a+ "�"+b);
		}else {
		System.out.println ("������� �� � ����� �����");
		
		}
		
		
	}

}
