import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int cnt = Integer.parseInt(br.readLine());
			Map<Integer,List<String>> map = new TreeMap<Integer, List<String>>();
			for(int i = 0 ; i < cnt ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int key = Integer.parseInt(st.nextToken());
				if(map.containsKey(key)) {
					List<String> list = map.get(key);
					list.add(st.nextToken());
					map.put(key, list);
				}else {
					List<String> list = new ArrayList<String>();
					list.add(st.nextToken());
					map.put(key, list);
				}
			}
			for(Entry<Integer, List<String>> list :map.entrySet()) {
				int a = list.getKey();
				List<String> b = list.getValue();
				for(String c : b) {
					bw.write(a+" "+c+"\n");
				}
			}
            bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}