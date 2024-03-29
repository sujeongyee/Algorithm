import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int[] arr = new int[9];
			int sum = 0;
			for(int i = 0 ; i < 9 ; i++) {
				arr[i] = Integer.parseInt(br.readLine());
				sum+=arr[i];
			}
			int two = sum-100;
			Arrays.sort(arr);
			
			for(int i = 0 ; i < arr.length ; i++) {
				int index = Arrays.binarySearch(arr, two-arr[i]);
				if(index>=0) {
					arr[i] = 0;
					arr[index] = 0;
					break;
				}
			}
			for(int a : arr) {
				if(a!=0) System.out.println(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
						
	}		
}
