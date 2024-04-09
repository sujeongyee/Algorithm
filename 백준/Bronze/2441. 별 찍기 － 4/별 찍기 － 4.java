import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 0 ; i < n ; i++) {
				System.out.println(" ".repeat(i)+"*".repeat(n-i));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	
}