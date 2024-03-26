import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {    
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {            
            int cnt = Integer.parseInt(br.readLine());
            Set<String> wordSet = new HashSet<>();

            for (int i = 0; i < cnt; i++) {
                wordSet.add(br.readLine());
            }
            
            List<String> words = new ArrayList<>(wordSet);
            Collections.sort(words, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    if (a.length() == b.length()) {
                        return a.compareTo(b);
                    } else {
                        return Integer.compare(a.length(), b.length());
                    }
                }
            });

            for (String word : words) {
                System.out.println(word);
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }                        
    }        
}
