import java.util.Scanner;


public class zadacha12 {

	public static void main(String[] args) {
//		��������� ������ �� ������ ������ ������ �� 4 � ����������
//		����������, �� ��� �������� ������ �� 400, �.�. 1900 �� � ���������,
//		�� 1600 � 2000 �� ���������.
//		��������� ��������, ����� �� ������ ���, �����, ������ ���������
//		���������� ����.
//		������ �����: ��� ����� �� ���, �����, ������.
//		������: 28, 2, 2000
//		�����: 1,3,2000

		Scanner sc = new Scanner (System.in);
		
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		
		d++; 
		int days = 0;
		
		switch (m) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: days=31;
				break;

		case 2:
			days=28; 
			if ((y%4==0)&&(y%100!=0)||(y%400==0)) {
				days=29;
			}
			break;
			
		case 4:	
		case 6:
		case 9:
		case 11:
			days=30;
			break;
			default:
				
		if (d>days) {
		d=1;
		m++;
							}
		}
		
		
		if (m>12) {
			d=1; m=1; y++;
					}
		
		System.out.println(d+""+m+""+y);
		
	}

}
