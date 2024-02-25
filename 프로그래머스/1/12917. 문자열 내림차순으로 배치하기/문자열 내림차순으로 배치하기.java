import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] wordArr = s.split("");
        Arrays.sort(wordArr);
        for(String word : wordArr) {
            answer = word+answer;
        }
        return answer;
    }
}