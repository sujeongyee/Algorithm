import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("[abc]");
		
		String[] answer = Arrays.stream(arr).filter(s -> !s.equals("")).toArray(String[] :: new);
        return answer.length==0? new String[]{"EMPTY"} : answer;
    }
}