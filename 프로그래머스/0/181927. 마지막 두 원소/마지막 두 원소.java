import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOfRange(num_list, 0, num_list.length+1);
		int a = num_list[num_list.length-1];
		int b = num_list[num_list.length-2];
		answer[answer.length-1] = a>b? a-b:a*2;
        return answer;
    }
}