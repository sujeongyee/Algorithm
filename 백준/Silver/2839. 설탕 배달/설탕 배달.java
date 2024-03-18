import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int del = scan.nextInt(); //18 16 배달해야 할 kg
		int five = 0;
		int three = 0;
		if(del % 5 == 0) {
			five = del / 5 ;
		} else {
			for(int i = del/5 ; i>=0 ; i--) {
				if((del-(5*i))%3==0) {					
					five = i;
					three = (del-(five*5))/3;
					break;
				}
			}
		}
		if(five==0&&three==0) {
			System.out.println(-1);
		}else {
			System.out.println(five+three);
		}
	}
}