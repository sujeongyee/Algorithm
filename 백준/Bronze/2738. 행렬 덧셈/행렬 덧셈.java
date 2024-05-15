import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); //3 줄 2
			int m = Integer.parseInt(st.nextToken()); //3 개 4
			int[] arr = new int[n*2*m];
			for(int i = 0 ; i < n*2 ; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				int tk = st2.countTokens();
				for(int j = 0; j< tk ; j++) {
					arr[i*m+j] = Integer.parseInt(st2.nextToken());
				}				
			}
			for(int i = 0 ; i < m*n ; i++) {
				bw.write(String.valueOf(arr[i]+arr[i+(n*m)]));
				if(i!=(m*n-1)&& i%m==m-1) bw.write("\n");
				else if(i!=(m*n-1)) bw.write(" ");
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}