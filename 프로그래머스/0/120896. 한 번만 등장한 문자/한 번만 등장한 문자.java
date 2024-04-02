import java.util.*;
class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
		List<String> list = new ArrayList<>();
		for(int i = 0 ; i < c.length ; i++) {
			boolean b = true;
			for(int j = 0 ; j < c.length ; j++) {				
				if(i!=j && c[i]==c[j]) {
					b=false;
				}				
			}
			if(b) list.add(String.valueOf(c[i]));
		}
		StringBuilder answer = new StringBuilder();
		list.stream().sorted().forEach(ss-> answer.append(ss));
        return answer.toString();
    }
}