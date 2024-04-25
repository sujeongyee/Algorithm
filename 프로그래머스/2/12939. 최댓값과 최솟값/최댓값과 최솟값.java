import java.util.Arrays;
import java.util.StringTokenizer;
class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
		
		int min = 100000000;
		int max = -10000000;
		String s2 = "";
		while(st.hasMoreTokens()) {
			s2 = st.nextToken();
			int n = Integer.parseInt(s2);
			if(n>max) max=n;
			if(n<min) min=n;
		}
		String answer =min+ " "+ max;
        return answer;
    }
}