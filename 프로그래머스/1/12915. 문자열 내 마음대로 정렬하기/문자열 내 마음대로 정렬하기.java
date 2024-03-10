import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Map<String, Set<String>> tm = new TreeMap<>();
		
		for(String a : strings) {
			String key = Character.toString(a.charAt(n));
			if(tm.containsKey(key)) {
				tm.get(key).add(a);
			}else {
				Set<String> list = new TreeSet<>();
				list.add(a);
				tm.put(key, list);
			}				
		}
		String[] answer = new String[strings.length];
		int count = 0;
		for(String key : tm.keySet()) {
			Set<String> value = tm.get(key);
			Iterator<String> s = value.iterator();
			while(s.hasNext()) {
				answer[count]= s.next();
				count++;
			}			
		}
        return answer;
    }
}