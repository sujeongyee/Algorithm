import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			int standard = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[cnt];
			
			for(int i = 0 ; i < arr.length ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}		
			int max = 0;
			for(int i = 0 ; i < arr.length -2 ; i++) {
				for(int j = i+1 ; j < arr.length -1 ; j++) {
					for(int k = j+1 ; k < arr.length ; k++) {
						int sum = arr[i] + arr[j] + arr[k];
						if(sum > max && sum <=standard) max = sum;
					}
				}
			}
			System.out.println(max);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	
}