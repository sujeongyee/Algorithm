import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] array, int height) {
        List<Integer> al = Arrays.stream(array).boxed().collect(Collectors.toList());
		al.add(height);
		int[] arr2 = al.stream().sorted().mapToInt(i->i).toArray();		
		int answer = 0;		
		for(int i = 0 ; i < arr2.length; i++) {
			if(arr2[i] == height) {
				answer = (arr2.length-1) - i ;
			}
		}
        return answer;
    }
}