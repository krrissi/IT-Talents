import java.util.Scanner;


public class zadacha13 {

	public static void main(String[] args) {
//		Да се състави програма, която да отгатне колко е студено/топло по
//		въведената температура t в градус Целзий.
//		Температурните интервали са:
//		под -20 ледено студено;
//		между 0 и -20 - студено;
//		между 15 и 0 - хладно;
//		между 25 и 15 - топло;
//		над 25 – горещо.
//		Входни данни: цяло число от интервала [-100..100].
//		Пример: 12
//		Изход: хладно

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

		
	
	
		
		
	
	

