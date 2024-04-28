import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {				
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Set<Integer>> map = new TreeMap<>();
		try {
			int cases = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < cases ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int k = Integer.parseInt(st.nextToken());
				int n = Integer.parseInt(st.nextToken());
				if(map.containsKey(k)) {
					Set<Integer> s = map.get(k);
					s.add(n);
					map.put(k,s);
				}else {
					Set<Integer> s = new TreeSet<>();
					s.add(n);
					map.put(k, s);
				}
			}
			
			for(int a:map.keySet()) {
				Set<Integer> s = map.get(a);
				s.forEach(l-> System.out.println(a+" "+l));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}