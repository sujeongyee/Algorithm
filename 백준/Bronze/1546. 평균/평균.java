import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int len = Integer.parseInt(br.readLine());
			String s = br.readLine();
			int [] arr = new int[len];
			int idx = 0;
			String[] arr2 = s.split(" ");
			for(String s2 : arr2) {
				arr[idx] = Integer.parseInt(s2);
				idx++;
			}
			Arrays.sort(arr);
			int max = arr[arr.length-1];
			float sum = 0;
			for(int i = 0 ; i < arr.length ; i++) {				
				float f = (float)arr[i]/(float)max*100;
				sum+=f;			
			}		
			System.out.println(sum/len);
						
		} catch (Exception e) {
		}						
	}
}