import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cnt = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[cnt];
			for(int i = 0 ; i < cnt; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			int sum = 0;
			int sum2 = 0;
			for(int i : arr) {
				sum=sum+i;
				sum2+=sum;
			}
			System.out.println(sum2);
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}	
}
