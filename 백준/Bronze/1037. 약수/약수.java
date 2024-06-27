import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {    
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        
        try {
        	int cases = Integer.parseInt(br.readLine());
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int max = 0;
            int min = 1000000;
            
            for(int i = 0; i < cases; i++) {     
                int n = Integer.parseInt(st.nextToken());
                if(n > max) max = n;
                if(n < min) min = n;
            }
        	
        	System.out.println(max * min);
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
