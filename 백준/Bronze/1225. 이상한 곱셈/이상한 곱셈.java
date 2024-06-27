import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {    
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        
        try {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String s2 = st.nextToken();
            long answer = 0 ;
            for(int i = 0 ; i < s.length() ; i++) {
            	for(int j = 0 ; j < s2.length() ; j++) {
            		answer += (s.charAt(i)-48) * (s2.charAt(j)-48);
            	}
            }
            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
