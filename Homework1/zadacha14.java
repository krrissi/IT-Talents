import java.util.Scanner;


public class zadacha14 {

	public static void main(String[] args) {
//		�� �� ������� ��������, ����� �� �������� ���������� �� 2 �������
//		�� ���������� ����� ������� ������� ���� �� �������� � ������� ���
//		�������� ����. 

		Scanner sc = new Scanner (System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
	
		int sum1 = x1+y1;
		int sum2 = x2+y2;
		
		boolean different1 = (sum1%2==0)&&(sum2%2!=0);
		boolean different2 = (sum1%2!=0)&&(sum2%2==0);

		if (different1||different2){
			System.out.println("�������� ����");
		}else {
			System.out.println("������� ����");
		}
	}
		

}
