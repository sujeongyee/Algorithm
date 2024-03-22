import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==b && a==c) {
				System.out.println(10000+a*1000);
			}else if (a!=b && a!=c && b!=c) {
				System.out.println(Math.max(Math.max(a, b),c)*100);
			}else {
				int same = a==b?a:a==c?a:b;
				System.out.println(1000+same*100);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}
}
