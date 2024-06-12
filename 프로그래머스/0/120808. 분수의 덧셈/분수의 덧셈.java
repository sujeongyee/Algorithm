class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		for(int i = Math.max(denom1, denom2) ; i<= denom1*denom2 ; i++) {
			if(i%denom1==0 && i%denom2==0) {
				answer[1] = i;
				answer[0] = (i/denom1*numer1)+(i/denom2*numer2);
				break;
			}
		}
        for(int i = Math.min(answer[0], answer[1]) ; i>=2 ; i--) {
			if(answer[0]%i==0 && answer[1]%i==0)	{
				answer[0]/=i;
				answer[1]/=i;
                break;
			}	
		}
        return answer;
    }
}