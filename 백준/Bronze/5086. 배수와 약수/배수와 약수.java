import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if(a == 0 && b == 0) break;
				else {
					if(b % a == 0) System.out.println("factor");
					else if (a % b == 0) System.out.println("multiple");
					else System.out.println("neither");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}