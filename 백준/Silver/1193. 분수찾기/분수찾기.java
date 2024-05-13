import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		// 1 1, 2 2, 3 2, 4 3, 5 3, 6 3, 7 4, 8 4
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {					
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			int idx = 0;
			int ck = 0;
			for(int i = 1 ; i <= n ; i++) {
				ck = sum;
				sum+=i;
				if(sum>=n) {
					idx = i;
					break;
				}
			}
			if(idx%2==0) {
				System.out.println((n-ck)+"/"+(idx+1-(n-ck)));
			}else{
				System.out.println((idx+1-(n-ck))+"/"+(n-ck));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
