
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			long sum = 0;
			char[] c = s.toCharArray();
			long a = 1;
			for(int i = c.length-1 ; i >= 0 ; i--) {
				int num = c[i]-0;
				if(num>=48 && num<= 57) {
					sum+=(c[i]-48)*a;
					a*=n;
				}else {
					sum+=(c[i]-55)*a;
					a*=n;
				}		
			}
			
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
