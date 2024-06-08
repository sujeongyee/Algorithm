import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		try {
			int cases = Integer.parseInt(br.readLine());
			int[] arr = new int[cases];
			int[] arr2 = new int[cases];
			
			for(int i = 0 ; i < cases; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[i] = Integer.parseInt(st.nextToken());
				arr2[i] = Integer.parseInt(st.nextToken());
			}
			if(cases<2) System.out.println(0);
			else {
				Arrays.sort(arr);
				Arrays.sort(arr2);
				int answer = (arr[arr.length-1]-arr[0])*(arr2[arr2.length-1]-arr2[0]);
				System.out.println(Math.abs(answer));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
