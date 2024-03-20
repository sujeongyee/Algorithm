import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			String s = br.readLine();
			int plus = Integer.parseInt(br.readLine());
			StringTokenizer s2 = new StringTokenizer(s);
			int hour  = Integer.parseInt(s2.nextToken());
			int min = Integer.parseInt(s2.nextToken());
			
			int sum = hour*60+min+plus;
			sum = sum>=1440?sum-1440:sum;
			System.out.println(sum/60+ " "+sum%60);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}