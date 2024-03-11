class Solution {
    public int solution(int a, int b, int n) {
        int answer = cola(a,b,n);
        return answer;
    }
    public int cola (int a, int b, int n) {
		if(n<a) {
			return 0;
		}else {
			int sum = n/a*b;
			return sum+cola(a,b,n%a+sum);
		}
	}
}