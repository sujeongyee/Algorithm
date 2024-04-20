import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][2];			
			for(int i = 0 ; i < arr.length ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			String answer = "";
			for(int i = 0 ; i < arr.length ; i++) {
				int cnt = 0;
				for(int j = 0 ; j < arr.length ; j++) {
					if(i!=j && arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
						cnt++;
					}
				}
				answer+= i==arr.length-1?(cnt+1):(cnt+1)+" ";
			}
			System.out.println(answer);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}