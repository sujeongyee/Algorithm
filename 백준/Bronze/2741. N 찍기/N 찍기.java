import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i = 1; i <= n ; i++) {
				System.out.println(i);				
			}
			
		} catch (Exception e) {			
		}						
	}
}
