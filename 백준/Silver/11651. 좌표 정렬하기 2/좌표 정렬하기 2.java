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
		try {
			int cases = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer("");
			Map<Integer, Set<Integer>> map = new TreeMap<Integer, Set<Integer>>();
			for(int i = 0 ; i < cases ; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if(map.containsKey(b)) {
					Set<Integer> set = map.get(b);
					set.add(a);
					map.put(b, set);
				}else {
					Set<Integer> set = new TreeSet<Integer>();
					set.add(a);
					map.put(b, set);
				}
			}
			
			for(int n : map.keySet()) {
				Set<Integer> set =  map.get(n);
				for(int x : set) {
					System.out.println(x+" "+n);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
