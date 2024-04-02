class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a = i ; a <= j ; a++) { 
        	int l = a;
        	while(true) {
        		if(l%10 == k) answer++;
        		if(l<10) break;
        		l/=10;
        	}
        }
        return answer;
    }
}