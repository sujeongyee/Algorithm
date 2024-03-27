import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
		String[] answer2 = Arrays.stream(answer).sorted().filter(s->!s.equals("")).toArray(String[]::new);
        return answer2;
    }
}