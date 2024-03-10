import java.util.*;
class Solution {
    public int[] solution(int n) {
	
        List<Integer> al = new ArrayList<>();
	for(int i = 1; i<=n ; i+=2) {
		al.add(i);
	}
	int[] answer = al.stream().mapToInt(i->i).toArray();
	return answer;

	    
	//////////// 위에 풀이가 생각보다 효율성이 좋지 않아서 수정 한 코드 ->
	int length = n%2==0? n/2:n/2+1;
	int[] answer2 = new int[length];
	int index = 0;
	for(int i = 1; i<=n ; i+=2) {
		answer2[index] = i;
		index++;
	}
	//return answer2
        
    }
}
