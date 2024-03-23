import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cnt = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < cnt ; i++) {
				double a = average(new StringTokenizer(br.readLine()));
				String formattedNumber = String.format("%.2f", Math.round(a*1000)/1000.0);
				System.out.println(formattedNumber+"%");
			}
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}
	
	public static double average(StringTokenizer st) {
		int cnt = Integer.parseInt(st.nextToken());
		int sum = 0;
		int[] scores = new int[cnt];
		for(int i = 0 ; i < cnt ; i++) {
			int score = Integer.parseInt(st.nextToken());
			sum += score;
			scores[i] = score;
		}
		double avg = (double)sum/(double)cnt;
		int up = 0;
		for(int a : scores) {
			if((double)a>avg) up++;
		}
		return ((double) up / cnt) * 100;
	}
}