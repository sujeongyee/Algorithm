import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {    
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nosee = Integer.parseInt(st.nextToken());
            int nohear = Integer.parseInt(st.nextToken());
            Set<String> noseeSet = new HashSet<>();
            Set<String> resultSet = new TreeSet<>();
            for(int i = 0 ; i < nosee ; i++) {
                String name = br.readLine();
                noseeSet.add(name);
            }
            for(int i = 0 ; i < nohear ; i++) {
                String name = br.readLine();
                if(noseeSet.contains(name)) {
                    resultSet.add(name);
                }
            }
            System.out.println(resultSet.size());
            for(String s : resultSet) {
                System.out.println(s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
