import java.util.Scanner;


public class zadacha12 {

	public static void main(String[] args) {
//		Високосни години са всички години кратни на 4 с изключения
//		столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
//		но 1600 и 2000 са високосни.
//		Съставете програма, която по дадени ден, месец, година отпечатва
//		следващата дата.
//		Входни данни: три числа за ден, месец, година.
//		Пример: 28, 2, 2000
//		Изход: 1,3,2000

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
