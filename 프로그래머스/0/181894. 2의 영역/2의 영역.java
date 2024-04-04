import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int first = -1;
		int last = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]==2 && first==-1) {
				first = i;
			}
			if(arr[i]==2) last = i;
		}
		if(first == -1 && last == 0) {
			return new int[] {-1};
		}else if (first == last) {
			return new int[] {2};
		}else {
			return Arrays.copyOfRange(arr, first, last+1);
		}
    }
}