import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());			
			int[] arr = new int[n];
			
			for(int i = 1; i <= n ; i++) {
				arr[i-1] = i;
			}
			
			for(int i = 0 ; i < m ; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st2.nextToken()) - 1;
                int end = Integer.parseInt(st2.nextToken());
                int[] arr2 = Arrays.copyOfRange(arr, start, end);
                
                int cnt = arr2.length-1;
                for(int j  = start ; j< end ; j++) {
                	arr[j] = arr2[cnt];
                	cnt--;
                }
               
			}
			StringBuilder answer = new StringBuilder();
			for(int i = 0 ; i < arr.length ; i++) {
				answer.append(arr[i]);
				if(i!=arr.length-1) answer.append(" ");
			}
			System.out.println(answer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}