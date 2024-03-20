import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			int n = Integer.parseInt(br.readLine());
			n = n<10?n*10:n;
			int correct = n;
			int cnt = 0;
			while(true) {				
				int a = n/10;
				int b = n%10;
				n = b*10+(a+b)%10;
				cnt++;
				if(n==correct) break;
			}
			System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}