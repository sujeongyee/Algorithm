import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			long n = Long.parseLong(br.readLine());
			
			System.out.println(n*4);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}