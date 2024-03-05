class Solution {
    public int[] solution(int n, int m) {
        int a = n>m? n:m;
		for(int i = a ; i <= n*m ; i+=a) {
			if(i%n==0&&i%m==0) {
				a= i;
				break;
			}
		}
		int b = n>m? n:m;
		for(int i = b; b>=1; i--) {
			if(n%i==0&&m%i==0) {
				b= i;
				break;
			}
		}
		int[] answer = {b,a};
        return answer;
    }
}