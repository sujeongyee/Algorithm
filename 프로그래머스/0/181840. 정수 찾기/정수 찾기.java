class Solution {
    public int solution(int[] num_list, int n) {
        int answer = -1;
		for(int i = 0 ; i < num_list.length ; i++) {
			if(num_list[i]==n) {
				answer = i;
				break;
			}
		}
        return answer>=0?1:0;
    }
}