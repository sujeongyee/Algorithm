class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int a = dot[0];
        int b = dot[1];
        answer =(a>0&&b>0)? 1 :(a<0&&b>0)? 2 : (a<0&&b<0)? 3 : (a>0&&b<0)? 4 :0 ;
        return answer;
    }
}