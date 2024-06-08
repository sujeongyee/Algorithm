
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cases = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			Map<Integer, List<Integer>> map = new TreeMap<>();
			int[] answer = new int[cases];
			for(int i = 0 ; i < cases ; i++) {
				int a = Integer.parseInt(st.nextToken());
				if(map.containsKey(a)) {
					List<Integer> list = map.get(a);
					list.add(i);
					map.put(a, list);
				}else {
					List<Integer> list = new ArrayList<>();
					list.add(i);
					map.put(a, list);
				}
			}
			int idx = 0;
			for(int b : map.keySet()) {
				List<Integer> list = map.get(b);
				for(int c : list) {
					answer[c] = idx;
				}
				idx++;
			}
			StringBuilder sb =  new StringBuilder();
			
			for(int i = 0 ; i < answer.length ; i++) {
				sb.append(answer[i]);
				if(i!=answer.length-1) sb.append(" ");
			}
			System.out.println(sb.toString());			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
