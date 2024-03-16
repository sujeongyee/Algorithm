class Solution {
    public int solution(int a, int b) {
        int answer = Math.max(2*a*b,Integer.parseInt(a+""+b));
        return answer;
    }
}