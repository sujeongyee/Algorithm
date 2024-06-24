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
			
			Map<String, Boolean> map = new TreeMap<>();
			
			for(int i = 0 ; i < cases ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String check = st.nextToken();
				if(map.containsKey(name)) {
					if(check.equals("leave")) map.put(name, false);
					else if (check.equals("enter"))map.put(name, true);
				}else {
					if(check.equals("leave")) map.put(name, false);
					else if (check.equals("enter"))map.put(name, true);
				}
			}
			List<String> list = new ArrayList<>();
			for(String s : map.keySet()) {
				if(map.get(s)) {
					list.add(0, s);			
				}				
			}
			for(String s : list) {
				System.out.println(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}