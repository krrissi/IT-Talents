import java.util.Scanner;

//�������� 3 ���������� �� ������������ � ��� (���������� ���), ����
//���� (����� � ������� �������), ���� ��� ����� � ����� ���.
//��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
//������� �����:
// - ��� ��� �����, ���� �� �������
// - ��� ���� ����, �� �� ���� ���������
// - ��� ����� � �� ���� ����� � �� ��� ���
// - ��� ��� �����, �� ����� �� ���� � ��������
// - ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
//���������� ������� �������� ���� ��������� � ���������.

public class zadacha7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hour = sc.nextInt();
		double money = sc.nextDouble();
		boolean healthy = true;
		
		if (healthy == false) {
			System.out.println("not out");
		}
		if (money>0) {
			System.out.println("will buy drugs");
		}
		if (money<=0) {
			System.out.println("I'll stay home and drink tea");
		}
		if (healthy == true) {
			System.out.println("I go to the movies with friends");
		}
		if (money<=10) {
			System.out.println("will go to the coffee");
		}
		

	}

}
