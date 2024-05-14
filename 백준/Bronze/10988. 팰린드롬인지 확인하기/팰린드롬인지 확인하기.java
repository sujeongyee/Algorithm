import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder sb = new StringBuilder(br.readLine());
			
			String s = sb.toString();
			
			if(s.equals(sb.reverse().toString())) System.out.println(1);
			else System.out.println(0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}