import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int sum = Integer.parseInt(br.readLine());
			int cnt = Integer.parseInt(br.readLine());
			int sum2 = 0;
			for(int i = 0 ; i < cnt ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				sum2 += Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
			}
			System.out.println(sum==sum2 ? "Yes" : "No");
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}	
}