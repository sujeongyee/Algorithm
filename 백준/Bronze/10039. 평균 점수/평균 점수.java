import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int sum = 0;
			for(int i = 0 ; i < 5 ; i++) {
				int n = Integer.parseInt(br.readLine());
				sum+=n>=40?n:40;
			}
			System.out.println(sum/5);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}