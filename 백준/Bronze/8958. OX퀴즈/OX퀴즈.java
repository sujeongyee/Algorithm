import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			int cas = Integer.parseInt(br.readLine());
			int cnt = 0;
			int sum = 0;
			for(int i = 0 ; i < cas ; i++) {
				String s = br.readLine();
				for(int j = 0 ; j < s.length() ; j++) {
					if(s.charAt(j)== 'O') {
						cnt++;
						sum+=cnt;
					}else {
						cnt = 0;
						sum+=0;
					}
				}
				System.out.println(sum);
				cnt = 0; sum = 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}