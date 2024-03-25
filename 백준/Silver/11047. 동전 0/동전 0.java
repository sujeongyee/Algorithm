import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			int price = Integer.parseInt(st.nextToken());
			int[] arr = new int[cnt];
			
			for(int i = 0 ; i < arr.length ; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(arr);
			int cnt2 = 0;
			for(int i = arr.length-1 ; i >=0 ; i--) {
				if(arr[i]>price) continue;
				else {
					cnt2 += price/arr[i];
					price -= (price/arr[i])*arr[i];
				}
			}
			System.out.println(cnt2);
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}	
}