import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
			StringTokenizer st = new StringTokenizer(br.readLine());
			Double answer = Double.parseDouble(st.nextToken())/Double.parseDouble(st.nextToken());
			System.out.println(answer);
		} catch (Exception e) {
			
		}
					
	}
}