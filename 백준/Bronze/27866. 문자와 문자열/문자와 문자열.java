import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			int n = Integer.parseInt(br.readLine());
			System.out.println(s.charAt(n-1));
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
