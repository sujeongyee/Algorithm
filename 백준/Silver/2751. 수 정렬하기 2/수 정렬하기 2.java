import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			int cnt = Integer.parseInt(br.readLine());
			List<Integer> list = new ArrayList<>();
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i < cnt ; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			list.stream().sorted().forEach(i-> sb.append(i).append("\n"));
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	
}