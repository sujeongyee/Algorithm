class Solution {
    public int solution(int a, int b) {
        for(int i = Math.min(a, b) ; i>=2 ; i--) { 
			if(a%i==0 && b%i==0) {
				a/=i;
				b/=i;
				break;
			}
		}		
		boolean answer = true;
		for(int i = 2 ; i <= b ; i++) {
			if(b%i==0) {
				if(sosu(i) && i!= 2 && i!= 5) {
					answer = false;
				} 
			}
		}
        return answer?1:2;
    }
    
    public boolean sosu(int n) {
		int cnt = 0;
		for(int i = 1 ; i <= Math.sqrt(n) ; i++) {
			if(n%i==0) cnt++;
			if(cnt>1) return false;
		}
		return true;
	}
}