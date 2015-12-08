package lesson3;

public class zadacha20 {

	public static void main(String[] args) {
//		Да се състави програма, чрез която се извежда квадрат от
//		цифри. Сумите от елементите на произволен ред или стълб са
//		равни на 45.

		int a;
		int b;
		
		for (a=0;a<=9;a++){
			for (b=a;b<=9; b++){
				System.out.print(b+" ");
			}
			for (b=1;b==a-1; b++){
				System.out.print(b+" ");
			}
			
			System.out.println();
		}
		
	}

}
