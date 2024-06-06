import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long l = Long.parseLong(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			String s = Long.toString(l, n);
			System.out.println(s.toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
