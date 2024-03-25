import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = {1,1,2,2,2,8};
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i < 6 ; i++) {
				sb.append(arr[i]-Integer.parseInt(st.nextToken()));
				if(i!=5) sb.append(" ");
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}		
}
