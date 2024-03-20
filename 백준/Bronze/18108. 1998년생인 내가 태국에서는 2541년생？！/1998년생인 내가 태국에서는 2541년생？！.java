import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			int n = Integer.parseInt(br.readLine());
			System.out.println(n-543);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}