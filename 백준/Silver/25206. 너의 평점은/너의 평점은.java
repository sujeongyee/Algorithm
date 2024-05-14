import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			double sum = 0;
			double sum2 = 0;
			for(int i = 0 ; i < 20 ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				double score = Double.parseDouble(st.nextToken().substring(0, 1));
				String grade = st.nextToken();
				if(grade.equals("P")) continue;
				else {
					sum2+=score;
					switch(grade) {
					case "A+" : sum+= score*4.5;
						break;
					case "A0" : sum+= score*4.0;
					break;
					case "B+" : sum+= score*3.5;
					break;
					case "B0" : sum+= score*3.0;
					break;
					case "C+" : sum+= score*2.5;
					break;
					case "C0" : sum+= score*2.0;
					break;
					case "D+" : sum+= score*1.5;
					break;
					case "D0" : sum+= score*1.0;
					break;
					case "F" : sum+= 0;
					break;
					
					}
				}
			}
			System.out.println(sum/sum2);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}