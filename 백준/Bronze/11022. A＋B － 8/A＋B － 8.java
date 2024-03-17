import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int a = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < a ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				System.out.println("Case #"+(i+1)+": "+b+" + "+c+" = "+(b+c));
			}				
		} catch (Exception e) {			
		}						
	}
}