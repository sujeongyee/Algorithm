import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.toLowerCase().split("");
		Arrays.sort(arr);
		String answer = "";
		for(String s: arr) answer+=s;
        return answer;
    }
}