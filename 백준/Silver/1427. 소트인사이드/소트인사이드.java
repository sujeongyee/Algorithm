import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			String[] arr = s.split("");
			
			Arrays.sort(arr);
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = arr.length-1 ; i >= 0 ; i--) {
				sb.append(arr[i]);
			}
			
			int n = Integer.parseInt(sb.toString());
			
			System.out.println(n);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
