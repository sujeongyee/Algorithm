import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[3];
			for(int i = 0 ; i < arr.length ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			System.out.println(arr[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}