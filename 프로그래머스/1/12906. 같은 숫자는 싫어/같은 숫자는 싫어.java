import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> arr2 = new ArrayList<>();
		int a = -1;
		for(int i = 0 ; i < arr.length ; i++) {
			if(a!=arr[i]) {
				a = arr[i];
				arr2.add(arr[i]);
			}
		}		
		int[] answer = arr2.stream().mapToInt(i->i).toArray();

        return answer;
    }
}