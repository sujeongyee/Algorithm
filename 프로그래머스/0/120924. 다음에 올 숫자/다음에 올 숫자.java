class Solution {
    public int solution(int[] common) {
        int last = common[common.length-1];
		int prev = common[common.length-2];
		int prev2 = common[common.length-3];
		int answer = 0;
		if(last-prev== prev-prev2) answer=last+(last-prev);
		else answer = last*(last/prev);
        return answer;
    }
}