import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {    
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Set<Integer> aSet = new HashSet<>();
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < a ; i++) {
               aSet.add(Integer.parseInt(st2.nextToken()));
            }
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int cnt = 0;
            for(int i = 0 ; i < b ; i++) {
                if(aSet.contains(Integer.parseInt(st3.nextToken()))) {
                    cnt++;
                }
            }
            System.out.println(a+b-(cnt*2));
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}