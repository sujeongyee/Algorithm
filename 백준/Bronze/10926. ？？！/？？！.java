import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder sb = new StringBuilder(br.readLine());
			sb.append("??!");
			System.out.println(sb.toString());
						
		} catch (Exception e) {
		}						
	}
}