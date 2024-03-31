import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] arr1 = before.split("");
		String[] arr2 = after.split("");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int answer = 1;
		for(int i = 0 ; i < arr1.length ; i++) {
			if(!arr1[i].equals(arr2[i])) {
				answer = 0;
				break;
			}
		}
        return answer;
    }
}