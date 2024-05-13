import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {					
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); // 4인조가 가진 돈
			int s = Integer.parseInt(st.nextToken()); // 후안의 공격력
			boolean ips = false;
			for(int i = 0 ; i < n ; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st2.nextToken()); // 가격
				int p = Integer.parseInt(st2.nextToken()); // 공격력
				if(c<=x && p>s) ips=true;
			}
			System.out.println(ips?"YES":"NO");
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}