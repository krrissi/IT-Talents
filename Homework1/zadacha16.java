import java.util.Scanner;


public class zadacha16 {

	public static void main(String[] args) {
//		�������� � ���������� ���������� ����� �� ���� abc.
//		������ �� �� ������� ����:
//		��� a = b = c - �����: ������� �� �����;
//		��� a>b>c - �����: ������� �� ��� �������� ���;
//		��� a<b<c ������� �� � �������� ���;
//		� �����: ������� �� ����������, �� ����������� ������.
//		�� �� ������� ��������, ����� ������� ��������� �� ���������� ��
//		������� �� ������� � �������.
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int a = (num%10);
		
		int temp1 = (num/10);
		
		int b = (temp1%10);
		
		int temp2 = (temp1/10);
		
		int c = (temp2%10);
		
		int temp3 = (temp2/10);
		 
		if ((a>b)&&(b>c)) {
			System.out.println("Vazhodiast red");
		} else 
			if ((a==b)&&(b==c)) {
				System.out.println("Ravni");
			} else
		if ((a<b)&&(b<c)) {
			System.out.println("Nizhodiast red");
		} else {
			System.out.println("Nenaredeni");
		}
			
	}

}
