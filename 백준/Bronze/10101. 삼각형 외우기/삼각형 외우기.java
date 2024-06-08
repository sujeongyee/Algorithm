import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		try {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			int sum = a+ b+c;
			if(c==60 && a==60 && b==60) {
				System.out.println("Equilateral");
			}else if(sum!=180) {
				System.out.println("Error");
			}else if(sum==180) {
				if(a==b || a==c || b==c) System.out.println("Isosceles");
				else System.out.println("Scalene");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
