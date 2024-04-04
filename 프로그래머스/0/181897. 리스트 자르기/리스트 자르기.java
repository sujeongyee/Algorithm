import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = null ;
		switch(n) {
			case(1) : answer = Arrays.copyOfRange(num_list, 0, slicer[1]+1);
				break;
			case(2) : answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
				break;
			case(3) : answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
				break;
			case(4) : 
				int length = (slicer[1]-slicer[0])/slicer[2]+1;
				answer = new int[length];
				int cnt = 0;
				for(int i = slicer[0] ; i <= slicer[1] ; i+=slicer[2]) {
					answer[cnt] = num_list[i];
					cnt++;
				}
				break;
		}
        return answer;
    }
}