import java.util.Set;
import java.util.TreeSet;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> ts = new TreeSet<Integer>();
		for(int i = 0 ; i < numbers.length ; i++) {
			for(int j = 0; j < numbers.length ; j++) {
				if(i!=j) ts.add(numbers[i]+numbers[j]);
			}
		}
		int[] answer = ts.stream().mapToInt(i->i).toArray();
        return answer;
    }
}