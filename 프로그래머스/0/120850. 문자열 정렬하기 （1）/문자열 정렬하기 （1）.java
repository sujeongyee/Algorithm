import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
		for(char a : my_string.toCharArray()) {
			if(a+0>=48 && a+0<=57) list.add(a-48);
		}
		int[] answer = list.stream().sorted().mapToInt(i->i).toArray();
        return answer;
    }
}