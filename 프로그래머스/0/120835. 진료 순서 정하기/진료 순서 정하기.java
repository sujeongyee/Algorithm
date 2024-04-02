import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = Arrays.copyOf(emergency, emergency.length);
		int[] arr = Arrays.copyOf(emergency, emergency.length);
		
		Arrays.sort(arr);
		int rank = 1;
		for(int i = arr.length-1 ; i>=0 ; i--) {
			for(int j = 0 ; j < emergency.length ; j++) {
				if(arr[i] == emergency[j]) {
					answer[j] = rank;
					break;
				} 				
			}
			rank++;
		}
        return answer;
    }
}