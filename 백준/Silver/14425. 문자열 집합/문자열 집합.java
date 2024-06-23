
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int answer = 0;
			List<String> list = new ArrayList<String>();
			
			for(int i = 0 ; i < a ; i++) {
				list.add(br.readLine());
			}
			
			for(int i = 0 ; i < b ; i++) {
				String s = br.readLine();
				if(list.contains(s)) answer++;
			}
			
			System.out.println(answer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
