import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int prev = 0;
		int now = 1;
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i = 1 ; i <= n ; i++) {
				int temp = now;
				now = prev+now;
				prev = temp;
			}
			System.out.println(prev);			
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}	
}