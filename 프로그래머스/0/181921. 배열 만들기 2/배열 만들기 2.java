import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        Set<Integer> set = new TreeSet<Integer>();
		for(int i = l ; i<=r ; i++) {
			if(i%5!=0) continue;
			else {
				int len = String.valueOf(i).replace("0", "").replace("5", "").length();
				if(len==0) set.add(i);		
			}			
		}
		
		if(set.size()==0) return new int[]{-1};
		else {
			int idx = 0;
			int[] answer = new int[set.size()];
			for(int a : set) {
				answer[idx] = a;
				idx++;
			}
            return answer;
		}        
    }
}
