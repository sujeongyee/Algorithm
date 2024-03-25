import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {			
			int cnt = Integer.parseInt(br.readLine());
			for(int i = cnt ; i >=1 ; i--) {
				System.out.println("*".repeat(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}	
}