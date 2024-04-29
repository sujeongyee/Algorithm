import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {	
	static int[] times;
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cases = Integer.parseInt(br.readLine());
			times = new int[cases+1];
			
			times[0] = 0;
			times[1] = 0;
			for(int i = 2 ; i <= cases; i++) {
				times[i] = getTimes(i);
			}
			System.out.println(times[cases]);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static int getTimes(int n) {
		if(n==2 || n==3) {
			return 1;
		}
		if(n%6==0) {
			return Math.min(times[n/2]+1,times[n/3]+1);
		}else if(n%3==0) {
			return Math.min(times[n/3]+1, times[n-1]+1);
		}else if(n%2==0) {
			return Math.min(times[n/2]+1, times[n-1]+1);
		}else {
			return times[n-1]+1;
		}
	}
}
