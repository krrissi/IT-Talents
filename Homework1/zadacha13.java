import java.util.Scanner;


public class zadacha13 {

	public static void main(String[] args) {
//		�� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
//		���������� ����������� t � ������ ������.
//		�������������� ��������� ��:
//		��� -20 ������ �������;
//		����� 0 � -20 - �������;
//		����� 15 � 0 - ������;
//		����� 25 � 15 - �����;
//		��� 25 � ������.
//		������ �����: ���� ����� �� ��������� [-100..100].
//		������: 12
//		�����: ������

		Scanner sc = new Scanner (System.in);
		
		int t = sc.nextInt();
	    
		
		if (t<-20) {
			System.out.println("Ledeno studeno");
		} else 
		if ((t<0)&&(t>-20)) {
			System.out.println("Studeno");
		} else 
		if((t>0)&&(t<15)) {
			System.out.println("Xladno");
		} else 	
		if ((t<25)&&(t>15)) {
			System.out.println("Toplo");
		} else {
			if (t>25) {
			System.out.println("Goresto");
			}
		}
	}
}

		
	
	
		
		
	
	

