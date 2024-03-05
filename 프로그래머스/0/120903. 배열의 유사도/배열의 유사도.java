import java.util.Arrays;
class Solution {
    public int solution(String[] s1, String[] s2) {
        Arrays.sort(s2);
		int answer = 0;
		for(int i = 0 ; i < s1.length; i++) {
			answer+=Arrays.binarySearch(s2, s1[i])>=0?1:0;
		}
        return answer;
    }
}