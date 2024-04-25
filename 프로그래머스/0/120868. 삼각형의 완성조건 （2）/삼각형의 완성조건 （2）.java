import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] sides) {
        int max = sides[0]>sides[1]?sides[0]:sides[1];
		int min = sides[0]>sides[1]?sides[1]:sides[0]; 
		Set<Integer> list = new HashSet<Integer>();
		for(int i = max-min+1 ; i <= max ; i++) { 
			list.add(i);
		}
		
		for(int i = max; i <max+min ; i++) {
			list.add(i);
		}
        return list.size();
    }
}