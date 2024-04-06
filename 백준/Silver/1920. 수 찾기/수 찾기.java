import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		try {
			br.readLine();
			String s = br.readLine();
			String[] arr = s.split(" ");		
			br.readLine();
			String s2 = br.readLine();
			String[] arr2 = s2.split(" ");
			
			Arrays.sort(arr);
						
			for(int i = 0 ; i < arr2.length ; i++) {
				if(Arrays.binarySearch(arr, arr2[i])>-1) System.out.println(1);
				else System.out.println(0);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
