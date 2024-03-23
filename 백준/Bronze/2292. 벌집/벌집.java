import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			int num = Integer.parseInt(br.readLine()); //58
			int sum = 1;
			int cnt = 1;
			while(sum<num) {
				sum+=6*cnt;
				cnt++;
			}
			System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}