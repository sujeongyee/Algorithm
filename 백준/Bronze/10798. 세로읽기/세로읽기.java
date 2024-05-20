import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception  {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] arr = new String[5][15];
		for(int i = 0 ; i < 5 ; i++) {
			String s = br.readLine();
			String[] st = s.split("");
			for(int j = 0 ; j < st.length ; j++) {
				arr[i][j] = st[j];
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < arr[0].length ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				if(arr[j][i]!=null) sb.append(arr[j][i]);
			}
		}
		System.out.println(sb.toString());		
		
	}	
}