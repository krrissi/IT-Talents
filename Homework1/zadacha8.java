import java.util.Scanner;
//�� �� ������� ��������, ����� ���� �� ��������� 4-������o
//���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
//�������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
//� 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
//3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
//���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.

public class zadacha8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int num = sc.nextInt();
		
				
		int d = (num%10);
		int temp1 = (num/10);
		
		int c = (temp1%10);
		int temp2 = (temp1/10);
		
		int b = (temp2%10);
		int temp3 = (temp2/10);
		 
		int a = (temp3%10);
		
		int obsto = (a*10+d);
		int obsto1 = (b*10+c);
		
		if (obsto<obsto1){
			System.out.println(obsto+"e po-malko"+obsto1);
		}
		
		if (obsto>obsto1){
			System.out.println(obsto+"e po-goljamo ot"+obsto1);
		}
		
		if (obsto==obsto1){
			System.out.println(obsto+"e ravno"+obsto1);
		}
		
	
		

	}

}
