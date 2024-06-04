import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			int n = Integer.parseInt(br.readLine());
			int b = (int)Math.pow(2, n)+1;
			System.out.println(b*b);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
