import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {	
	static int[] times;
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			for(int i = 1 ; i <= n ; i++) {
				if(n%i==0) {
					cnt++;
					if(cnt==k) System.out.println(i);
				}
			}
			if(cnt<k) System.out.println(0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}