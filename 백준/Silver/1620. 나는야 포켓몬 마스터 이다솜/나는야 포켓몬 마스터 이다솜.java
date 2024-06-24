import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			Map<String, Integer> map = new HashMap<>();
			Map<Integer, String> map2 =  new HashMap<>();
			for(int i = 0 ; i < n ; i++) {
				String monster = br.readLine();
				map.put(monster, i+1);
				map2.put(i+1, monster);
			}
			for(int i = 0 ; i < m ; i++) {
				String q = br.readLine();
				int a = q.length();
				String q2=q.replaceAll("[0-9]", "");
				int b = q2.length();
				if(a==b) System.out.println(map.get(q));
				else System.out.println(map2.get(Integer.parseInt(q)));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
