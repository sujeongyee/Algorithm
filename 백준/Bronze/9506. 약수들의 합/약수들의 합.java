import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = "";
			while(true) {
				s= br.readLine();
				if(s.equals("-1")) break;
				int n = Integer.parseInt(s);
				List<Integer> list = new ArrayList<>();
				int sum = 0;
				for(int i = 1; i < n ; i++) {
					if(n%i==0) {
						list.add(i);
						sum+=i;
					} 
				}
				StringBuilder sb = new StringBuilder();
				if(sum==n) {
					sb.append(sum).append(" = ");
					for(int i =0 ; i < list.size() ; i++) {
						if(i != 0) sb.append(" + ").append(list.get(i));
						else sb.append(list.get(i));
					}
				}else {
					sb.append(n).append(" is NOT perfect.");
				}
				System.out.println(sb.toString());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
