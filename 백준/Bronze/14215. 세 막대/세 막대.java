import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			

			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int[] arr = {a,b,c};
			Arrays.sort(arr);

			if(a==b&& a==c) System.out.println(a+b+c);
			else if(arr[0]+arr[1]<=arr[2]) {
				System.out.println(arr[0]+arr[1]+(arr[0]+arr[1]-1));
			}else {
				System.out.println(a+b+c);
			}	
					
						
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
