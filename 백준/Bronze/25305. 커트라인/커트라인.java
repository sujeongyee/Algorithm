import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int len = Integer.parseInt(st.nextToken());
			int get = Integer.parseInt(st.nextToken());
			int[] arr = new int[len];
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0 ; i < len; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			System.out.println(arr[len-get]);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
