import java.util.Scanner;
//������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
//3 ����� � �� �������� ������������.
//�� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
//��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
//������. ������ �� ����� �� �� ������� � �������� ���������� ����.
//������ �����: ���������� ����� �� ��������� [10..9999].


public class zadacha10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int obem = sc.nextInt();
		
		int kofa1 = 2;
		int kofa2 = 3;
	
		int x=obem/kofa1;
		int y=obem/kofa2;	
		
		if((obem>=10)&&(obem<=9999)) {
			if (x+y==obem){
			
			}
			System.out.println(x+","+y);
	}
	}
}
