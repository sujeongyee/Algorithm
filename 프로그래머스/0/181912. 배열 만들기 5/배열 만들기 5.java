import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < intStrs.length ; i++) {
			
			int sub = Integer.parseInt(intStrs[i].substring(s, s+l));
			if(sub>k) {
				list.add(sub);
			}
		}
		int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}