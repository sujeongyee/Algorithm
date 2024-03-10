import java.util.*;
class Solution {
    public int[] solution(int n) {
	
        List<Integer> al = new ArrayList<>();
	for(int i = 1; i<=n ; i+=2) {
		al.add(i);
	}
	int[] answer = al.stream().mapToInt(i->i).toArray();
	return answer;
//		테스트 1 〉	통과 (2.67ms, 74.8MB)
//		테스트 2 〉	통과 (3.03ms, 77.9MB)
//		테스트 3 〉	통과 (2.45ms, 74.8MB)
//		테스트 4 〉	통과 (2.83ms, 72.9MB)
//		테스트 5 〉	통과 (1.95ms, 73.5MB)
//		테스트 6 〉	통과 (1.95ms, 77.6MB)
//		테스트 7 〉	통과 (2.67ms, 70.5MB)
//		테스트 8 〉	통과 (2.24ms, 74.8MB)
	    
	//////////// 위에 풀이가 생각보다 효율성이 좋지 않아서 수정 한 코드 ->

	    
	int length = n%2==0? n/2:n/2+1;
	int[] answer2 = new int[length];
	int index = 0;
	for(int i = 1; i<=n ; i+=2) {
		answer2[index] = i;
		index++;
	}
	//return answer2
//		테스트 1 〉	통과 (0.02ms, 74.9MB)
//		테스트 2 〉	통과 (0.02ms, 74.6MB)
//		테스트 3 〉	통과 (0.03ms, 73.5MB)
//		테스트 4 〉	통과 (0.01ms, 76.8MB)
//		테스트 5 〉	통과 (0.01ms, 77.5MB)
//		테스트 6 〉	통과 (0.03ms, 78.1MB)
//		테스트 7 〉	통과 (0.02ms, 75MB)
//		테스트 8 〉	통과 (0.02ms, 66.4MB)
        
    }
}
