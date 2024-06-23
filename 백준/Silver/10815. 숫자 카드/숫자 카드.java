
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		try {
			int haveCards = Integer.parseInt(br.readLine());
			Map<String, Boolean> map = new HashMap<String, Boolean>(); 
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0 ; i < haveCards ; i++) {
				String s = st.nextToken();
				map.put(s, true);
			}
			int checkCards = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			for(int i = 0 ; i < checkCards ; i++) {
				String s = st.nextToken();
				if(map.containsKey(s)) {
					sb.append("1");
				}else sb.append("0");
				if(i!=checkCards-1) sb.append(" ");
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
