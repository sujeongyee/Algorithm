import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = 0 ; 
			while(st.hasMoreTokens()) {
				sum+= Math.pow(Integer.parseInt(st.nextToken()), 2);
			}
			System.out.println(sum%10);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
