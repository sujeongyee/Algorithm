import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int cases = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < cases ; i++) {
				int k = Integer.parseInt(br.readLine());
				int n = Integer.parseInt(br.readLine());
				System.out.println(apart(k,n));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	public static int apart(int k , int n) {
		int[][] arr = new int[k+1][n+1];
		for(int i = 1; i <=n ; i++) {
			arr[0][i] = i;
		}
		for(int i = 1; i <=k ; i++) {
			for(int j = 1 ; j <=n ; j++) {
				int sum = 0;
				for(int l = 1; l <=j ; l++) {
					sum+=arr[i-1][l];
				}
				arr[i][j] = sum;
			}
		}
		return arr[k][n];
	}
}