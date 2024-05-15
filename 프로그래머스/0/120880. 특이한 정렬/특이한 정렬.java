import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
		Map<Integer, Set<Integer>> map = new TreeMap<>();
		for(int i = 0 ; i < numlist.length ; i++) {
			int a = Math.abs(numlist[i]-n);
			if(!map.containsKey(a)) {
				Set<Integer> s = new TreeSet<Integer>();
				s.add(numlist[i]);
				map.put(a,s );
			}else {
				Set<Integer> s = map.get(a);
				s.add(numlist[i]);
				map.put(a, s);
			}
		}
		int idx = 0;
		for(int m : map.keySet()) {
			Set<Integer> set = map.get(m);
			int[] arr = set.stream().mapToInt(i->i).toArray();
			for(int i = arr.length-1 ; i>=0 ; i--) {
				answer[idx] = arr[i];
				idx++;
			}
		}
        return answer;
    }
}