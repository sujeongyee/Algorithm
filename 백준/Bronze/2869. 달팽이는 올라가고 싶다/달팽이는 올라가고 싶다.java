import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); //5
			int b = Integer.parseInt(st.nextToken()); //1
			int v = Integer.parseInt(st.nextToken()); //6
			if((v-b)%(a-b)==0) {
				System.out.println((v-b)/(a-b));
			}else {
				System.out.println((v-b)/(a-b)+1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}	
}