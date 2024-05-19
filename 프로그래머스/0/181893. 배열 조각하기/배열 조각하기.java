import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        Deque<Integer> deque = new ArrayDeque<>();
		for(int n : arr) deque.add(n);
		
		for(int i = 0 ; i < query.length ; i++) {
			int len = deque.size()-1;
			if(i%2==0) {
				for(int j = 0 ; j < len-query[i] ; j++) deque.removeLast();
			}else {
				for(int j = 0 ; j < query[i]-0 ; j++) deque.removeFirst();
			}
			
		}
		
		int[] answer = deque.stream().mapToInt(i->i).toArray();
        return answer;
    }
}