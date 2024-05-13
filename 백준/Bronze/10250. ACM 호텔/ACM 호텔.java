import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {				
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cases = Integer.parseInt(br.readLine());			
			
			for(int i = 0 ; i < cases ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int h = Integer.parseInt(st.nextToken());
				int w = Integer.parseInt(st.nextToken());
				int n = Integer.parseInt(st.nextToken());
				int sum = 0;
				sum += n%h==0? h*100 : (n%h)*100;
				sum += n%h==0? n/h : n/h+1;
				System.out.println(sum);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}