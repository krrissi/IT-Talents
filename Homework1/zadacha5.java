import java.util.Scanner;
//�������� 3 �������� ����� �� ��������� � �� ������������ � ��������
//���.


public class zadacha5 {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ((a >= b) && (a >= c))
        {
            if (b >= c)
            {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
            else
            {
            	System.out.println(a);
            	System.out.println(c);
            	System.out.println(b);
            }
        }
        else if ((b >= a) && (b >= c))
        {
            if (a >= c)
            {
            	System.out.println(b);
            	System.out.println(a);
            	System.out.println(c);
            }
            else
            {
            	System.out.println(b);
            	System.out.println(c);
            	System.out.println(a);
            }
        }
        else if ((c >= b) && (c >= a))
        {
            if (b >= a)
            {
            	System.out.println(c);
            	System.out.println(b);
            	System.out.println(a);
            }
            else
            {
            	System.out.println(c);
            	System.out.println(a);
            	System.out.println(b);
	}

}
	}
	
	
}
