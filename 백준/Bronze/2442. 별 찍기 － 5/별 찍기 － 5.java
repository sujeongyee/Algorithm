import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {	
	static int[] times;
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cases = Integer.parseInt(br.readLine());
			
			for(int i = 1 ; i <= cases ; i++) {
				System.out.println(" ".repeat((2*cases-1-(i*2-1))/2)+"*".repeat(i*2-1));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}