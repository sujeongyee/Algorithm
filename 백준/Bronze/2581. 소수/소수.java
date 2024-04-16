import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int m = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			List<Integer> list = new ArrayList<Integer>();
			int sum = 0;
			for(int i = m ; i <=n ; i++) {
				int cnt = 0;
				for(int j = 1; j<=Math.sqrt(i); j++) {
					if(i%j==0) {
						cnt++;
						if(cnt>1) break;
					}
				}
				if(cnt==1&&i!=1) {
					list.add(i);
					sum+=i;
				}
				
			}
			if(list.size()>0) {
				System.out.println(sum);
				System.out.println(list.get(0));
			}else {
				System.out.println(-1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}