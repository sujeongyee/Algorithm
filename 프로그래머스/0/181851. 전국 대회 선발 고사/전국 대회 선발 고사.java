import java.util.Map;
import java.util.TreeMap;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
		
		for(int i = 0 ; i < rank.length ; i++) {
			if(attendance[i]) map.put(rank[i], i);
		}
		int[] arr = new int[3];
		int count = 0;
		for(int a:map.keySet()) {
			if(count>2) break;
			arr[count] = map.get(a);
			count++;
		}
		int answer = 10000*arr[0]+100*arr[1]+arr[2];
        return answer;
    }
}