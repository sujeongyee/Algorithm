import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			while(true) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				int[] arr = {a,b,c};
				Arrays.sort(arr);
				if(a==0 && b==0 && c==0) break;
				else if(arr[0]+arr[1]<=arr[2]) {
					System.out.println("Invalid");
				}else if(a==b&&a==c) {
					System.out.println("Equilateral ");
				}else if(a==b||a==c||b==c) {
					System.out.println("Isosceles");
				}else if(a!=b && a!=c && b!=c) {
					System.out.println("Scalene");
				}
			}
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}