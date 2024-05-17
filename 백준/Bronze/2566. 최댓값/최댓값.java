import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int max = -1;
			int maxC = 0;
			int maxR = 0;
			for(int i = 0 ; i < 9 ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j< 9; j++) {
					int n = Integer.parseInt(st.nextToken());
					if(max<n) {
						max = n;
						maxC = i+1;
						maxR = j+1;
					}
				}
			}
			System.out.println(max);
			System.out.println(maxC+" "+maxR);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
