import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> al = new ArrayList<>();
		for(int i = 1; i<=n ; i+=2) {
			al.add(i);
		}
		int[] answer = al.stream().mapToInt(i->i).toArray();
        return answer;
    }
}