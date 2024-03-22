class Solution {
    public int solution(int hp) {
        int answer = hp/5;
		int a = (hp-answer*5)/3;
		int b = (hp-answer*5-a*3)/1;	
		answer+=a+b;
        return answer;
    }
}