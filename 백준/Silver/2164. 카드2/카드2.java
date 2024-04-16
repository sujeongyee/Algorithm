import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int m = Integer.parseInt(br.readLine());
			Queue<Integer> queue = new LinkedList<Integer>();
			for(int i = 1; i <=m ; i++) {
				queue.add(i);
			}
			while(queue.size()>1) {
				queue.poll();				
				int n = queue.poll();
				queue.add(n);
			}
			int answer = queue.poll();
			System.out.println(answer);

			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
