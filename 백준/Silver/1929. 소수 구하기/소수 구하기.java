import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			for(int i = m ; i <=n ; i++) {
				if(check(i)) System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}	
	public static boolean check(int a) {
		if(a==1) return false;
		for(int i = 2; i<=Math.sqrt(a) ; i++) {
			if(a%i==0) return false;
		}
		return true;
	}
}